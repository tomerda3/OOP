package q3;

public class UnusualFish extends Fish{

    private int factor ;

    public UnusualFish(int factor, int distance_eat, int size, int col, int x_front, int y_front){
        super(distance_eat, size, col, x_front, y_front);
        this.factor = factor;
    }

    public int getSize(){
        return factor*super.getSize();
    }

    public int getFactor() {
        return factor;
    }

    public void setFactor(int factor) {
        this.factor = factor;
    }

}
