package q3;

/**
 * A class showing Fish with the option of feeding and changing color.
 * @see Swimmable
 * @see MultiColorFish
 * @see UnusualFish
 */
public class Fish extends Swimmable {

    /**
     * DISTANCE_EAT - Represents how much fish can eat.
     * size - Represents the size of the fish.
     * col - Represents the color of the fish.
     * eatCount - Represents the amount of food the fish ate.
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
     * A constructor who gets the following data of the fish: size, and color.
     * It also sets the amount of food the fish can eat and also the amount of food the fish ate to 0.
     * @param size - Represents the size of the fish.
     * @param x_front
     * @param y_front
     * @param horSpeed
     * @param verSpeed
     * @param col - Represents the color of the fish.
     */
    public Fish(int size, int x_front, int y_front, int horSpeed, int verSpeed, int col) {
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
     * A function that returns the class name "Fish".
     * @return the name "Fish" in String.
     */
    public String getAnimalName() {
        return "Fish";
    }

    /**
     * A function that returns the amount of food.
     * @return the constant DISTANCE_EAT in int.
     */
    public int getDISTANCE_EAT() {
        return DISTANCE_EAT;
    }

    /**
     * A function that returns the size of the fish.
     * @return the size in int.
     */
    @Override
    public int getSize() {
        return size;
    }

    /**
     * A function that returns the color of the fish according to an array of colors.
     * @return the color in string.
     */
    public String getColor() {
        String[] colors = {"Black", "Red", "Blue", "Green", "Cyan", "Orange", "Yellow", "Magenta", "Pink"};
        return colors[col-1];
    }

    /**
     * A function that returns the amount of food the fish ate.
     * @return the amount of food in int.
     */
    @Override
    public int getEatCount() {
        return eatCount;
    }

    /**
     * A function that increases the amount of food the fish ate,
     * if the fish ate an amount equal to its capacity then it increased by one and the amount of food it ate is zero.
     */
    public void eatInc() {
        eatCount++;
        if (eatCount >= DISTANCE_EAT) {
            eatCount = 0;
            size++;
        }
    }

    /**
     * A function that receives an integer and changes the size of the fish to the input number.
     * @param size
     */
    public void changeFish(int size) {
        this.size = size;
    }

    /**
     * A function that changes the color of the fish in a circular shape according to the color array.
     * If you reach the end of the array, return to its beginning.
     */
    public void changeColor() {
        col++;
        if (col == 10)
            col = 1;
    }

    /**
     * A function that returns a string with all class fields and their values.
     * @return String.
     */
    @Override
    public String toString() {
        return super.toString() + "Fish{" +
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
     * A function that compares instances of fish,
     * first if the input object is the same instance then if it is empty or not fish then compares all the fields.
     * @param fish - Appearance of the "Fish" department for comparison.
     * @return True if the instances are the same otherwise false.
     */
    public boolean equals(Fish fish) {
        if (this == fish)
            return true;
        if (fish == null || getClass() != fish.getClass())
            return false;
        return DISTANCE_EAT == fish.DISTANCE_EAT && size == fish.size && col == fish.col && eatCount == fish.eatCount && x_front == fish.x_front && y_front == fish.y_front && x_dir == fish.x_dir && y_dir == fish.y_dir;
    }
}
