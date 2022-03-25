package q3;

/**
 * A class showing Jellyfish with the option of feeding and changing color.
 * @see Swimmable
 */
public class Jellyfish extends Swimmable {

    /**
     * DISTANCE_EAT - Represents how much jellyfish can eat.
     * size - Represents the size of the jellyfish.
     * col - Represents the color of the jellyfish.
     * eatCount - Represents the amount of food the jellyfish ate.
     */
    private int DISTANCE_EAT;
    private int size;
    private int col;
    private int eatCount;
    private int x_front;
    private int y_front;
    private int x_dir;
    private int y_dir;

    /**
     * A constructor who gets the following data of the jellyfish: size, and color.
     * It also sets the amount of food the jellyfish can eat and also the amount of food the jellyfish ate to 0.
     * @param size - Represents the size of the jellyfish.
     * @param x_front
     * @param y_front
     * @param horSpeed
     * @param verSpeed
     * @param col - Represents the color of the jellyfish.
     */
    public Jellyfish(int size, int x_front, int y_front, int horSpeed, int verSpeed, int col) {
        super(horSpeed, verSpeed);
        DISTANCE_EAT = 4;
        this.size = size;
        this.col = col;
        this.eatCount = 0;
        this.x_front = x_front;
        this.y_front = y_front;
        this.x_dir = 1;
        this.y_dir = 1;
    }

    /**
     * A function that returns the class name "Jellyfish".
     * @return the name "Jellyfish" in String.
     */
    public String getAnimalName() {
        return "Jellyfish";
    }

    /**
     * A function that returns the amount of food.
     * @return the constant DISTANCE_EAT in int.
     */
    public int getDISTANCE_EAT() {
        return DISTANCE_EAT;
    }

    /**
     * A function that returns the size of the jellyfish.
     * @return the size in int.
     */
    @Override
    public int getSize() {
        return size;
    }

    /**
     * A function that returns the color of the jellyfish according to an array of colors.
     * @return the color in string.
     */
    public String getColor() {
        String[] colors = {"Black", "Red", "Blue", "Green", "Cyan", "Orange", "Yellow", "Magenta", "Pink"};
        return colors[col-1];
    }

    /**
     * A function that returns the amount of food the jellyfish ate.
     * @return the amount of food in int.
     */
    @Override
    public int getEatCount() {
        return eatCount;
    }

    /**
     * A function that increases the amount of food the jellyfish ate,
     * if the jellyfish ate an amount equal to its capacity then it increased by one and the amount of food it ate is zero.
     */
    public void eatInc() {
        eatCount++;
        if (eatCount >= DISTANCE_EAT) {
            eatCount = 0;
            size++;
        }
    }

    /**
     * A function that receives an integer and changes the size of the jellyfish to the input number.
     * @param size
     */
    public void changeJellyfish(int size) {
        this.size = size;
    }

    /**
     * A function that returns a string with all class fields and their values.
     * @return String.
     */
    @Override
    public String toString() {
        return super.toString() + "Jellyfish{" +
                "DISTANCE_EAT=" + DISTANCE_EAT +
                ", size=" + size +
                ", col=" + col +
                ", eatCount=" + eatCount +
                ", x_front=" + x_front +
                ", y_front=" + y_front +
                ", x_dir=" + x_dir +
                ", y_dir=" + y_dir +
                '}';
    }

    /**
     * A function that compares instances of Jellyfish,
     * first if the input object is the same instance then if it is empty or not Jellyfish then compares all the fields.
     * @param jellyfish - Appearance of the "Jellyfish" department for comparison.
     * @return True if the instances are the same otherwise false.
     */
    public boolean equals(Jellyfish jellyfish) {
        if (this == jellyfish)
            return true;
        if (jellyfish == null || getClass() != jellyfish.getClass())
            return false;
        return DISTANCE_EAT == jellyfish.DISTANCE_EAT && size == jellyfish.size && col == jellyfish.col && eatCount == jellyfish.eatCount && x_front == jellyfish.x_front && y_front == jellyfish.y_front && x_dir == jellyfish.x_dir && y_dir == jellyfish.y_dir;
    }
}
