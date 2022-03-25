package q3;

/**
 * A class representing special fish whose size is presented as a product of their size multiplied by a factor.
 * @see Swimmable
 * @see Fish
 */
public class UnusualFish extends Fish {

    /**
     * factor - Size multiplication factor.
     */
    private int factor ;

    /**
     * A constructor who gets the following data of the fish : size, color and factor.
     * It also sets the amount of food the fish can eat and also the amount of food the fish ate to 0.
     * The constructor sends all the inputs to the master class constructor to define the data
     * except for the factor it defines itself.
     * @param size - Represents the size of the "MultiColorFish".
     * @param x_front
     * @param y_front
     * @param horSpeed
     * @param verSpeed
     * @param col - Represents the color of the "MultiColorFish".
     * @param factor - Represents the size multiplication factor.
     */
    public UnusualFish(int size, int x_front, int y_front, int horSpeed, int verSpeed, int col, int factor) {
        super(size,horSpeed, verSpeed, x_front, y_front, col);
        this.factor = factor;
    }

    /**
     * A function that returns the class name "UnusualFish".
     * @return the name "UnusualFish" in String.
     */
    public String getAnimalName() {
        return "UnusualFish";
    }

    /**
     * A function that returns the size of the "UnusualFish" double the factor.
     * @return the size double the factor in int.
     */
    public int getSize() {
        return factor * super.getSize();
    }

    /**
     * A function that returns the factor of the "UnusualFish".
     * @return the factor in int.
     */
    public int getFactor() {
        return factor;
    }

    /**
     * A function that receives a number and changes the factor to be the number received.
     * @param factor in int.
     */
    public void setFactor(int factor) {
        this.factor = factor;
    }

    /**
     * A function that returns a string with all class fields and their values from the master class and the factor.
     * @return String.
     */
    @Override
    public String toString() {
        return super.toString() + "UnusualFish{" +
                "factor=" + factor +
                '}';
    }

    public boolean equals(UnusualFish unusualFish) {
        if (this == unusualFish)
            return true;
        if (unusualFish == null || getClass() != unusualFish.getClass())
            return false;
        return factor == unusualFish.factor;
    }
}
