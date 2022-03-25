package q3;

/**
 * An abstract class (it has no instances) that represents objects that can swim.
 * @see Comparable
 * @see Fish
 * @see Jellyfish
 */
public abstract class Swimmable implements Comparable {

    protected int horSpeed;
    protected int verSpeed;

    public Swimmable() {}

    public Swimmable(int horSpeed, int verSpeed) {
        this.horSpeed = horSpeed;
        this.verSpeed = verSpeed;
    }

    public int getHorSpeed() {
        return horSpeed;
    }

    public boolean setHorSpeed(int horSpeed) {
        this.horSpeed = horSpeed;
        return true;
    }

    public int getVerSpeed() {
        return verSpeed;
    }

    public boolean setVerSpeed(int verSpeed) {
        this.verSpeed = verSpeed;
        return true;
    }

    /**
     * Abstract functions that any object that can swim must realize.
     */
    public abstract String getAnimalName();
    public abstract int getEatCount();
    public abstract int getSize();
    public abstract String getColor();
    public abstract void eatInc();

    /**
     * A function that returns a string with all class fields and their values.
     * @return String.
     */
    @Override
    public String toString() {
        return "Swimmable{" +
                "horSpeed=" + horSpeed +
                ", verSpeed=" + verSpeed +
                '}';
    }

    /**
     * A function that compares instances of "Swimmable",
     * first if the input object is the same instance then if it is empty or not fish then compares all the fields.
     * @param swimmable - Appearance of the "Swimmable" department for comparison.
     * @return True if the instances are the same otherwise false.
     */
    public boolean equals(Swimmable swimmable) {
        if (this == swimmable)
            return true;
        if (swimmable == null || getClass() != swimmable.getClass())
            return false;
        return horSpeed == swimmable.horSpeed && verSpeed == swimmable.verSpeed;
    }

}
