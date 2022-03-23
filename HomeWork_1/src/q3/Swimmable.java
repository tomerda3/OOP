package q3;

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

    public abstract String getAnimalName();
    public abstract int getEatCount();
    public abstract int getSize();
    public abstract String getColor();
    public abstract void eatInc();

    public void printSwimmable(){
        System.out.println(getAnimalName() + "\t" + getColor() + "\t" + getSize() + "\t" + getEatCount());
    }

    @Override
    public String toString() {
        return "Swimmable{" +
                "horSpeed=" + horSpeed +
                ", verSpeed=" + verSpeed +
                '}';
    }

    public boolean equals(Swimmable swimmable) {
        if (this == swimmable)
            return true;
        if (swimmable == null || getClass() != swimmable.getClass())
            return false;
        return horSpeed == swimmable.horSpeed && verSpeed == swimmable.verSpeed;
    }

}
