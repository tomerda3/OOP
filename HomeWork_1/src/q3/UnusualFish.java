package q3;

public class UnusualFish extends Fish {

    private int factor ;

    public UnusualFish(int horSpeed, int verSpeed, int distance_eat, int size, int col, int x_front, int y_front, int factor) {
        super(horSpeed, verSpeed, distance_eat, size, col, x_front, y_front);
        this.factor = factor;
    }

    public int getSize() {
        return factor * super.getSize();
    }

    public int getFactor() {
        return factor;
    }

    public void setFactor(int factor) {
        this.factor = factor;
    }

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
        if (!super.equals(unusualFish))
            return false;
        return factor == unusualFish.factor;
    }
}
