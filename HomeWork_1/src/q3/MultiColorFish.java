package q3;

/**
 * A class that represents special fish that change color as they grow.
 * @see Swimmable
 * @see Fish
 */
public class MultiColorFish extends Fish {

    /**
     * A constructor who gets the following data of the fish : size, and color.
     * It also sets the amount of food the fish can eat and also the amount of food the fish ate to 0.
     * The builder sends all the inputs to the master class constructor to set the data.
     * @param size - Represents the size of the "MultiColorFish".
     * @param x_front
     * @param y_front
     * @param horSpeed
     * @param verSpeed
     * @param col - Represents the color of the "MultiColorFish".
     */
    public MultiColorFish(int size, int x_front, int y_front, int horSpeed, int verSpeed, int col){
        super(size,horSpeed, verSpeed, x_front, y_front, col);
    }

    /**
     * A function that returns the class name "MultiColorFish".
     * @return the name "MultiColorFish" in String.
     */
    public String getAnimalName() {
        return "MultiColorFish";
    }

    /**
     * A function keeps in the auxiliary variable the amount of food the fish ate
     * and then activates the feeding function of a fish
     * and then checks if the amount of food eaten by the fish is smaller than the auxiliary variable (i.e. zero)
     * and if so activates the discoloration function of a fish.
     */
    @Override
    public void eatInc() {
        int size = super.getEatCount();
        super.eatInc();
        if (super.getEatCount() < size)
            super.changeColor();
    }
}
