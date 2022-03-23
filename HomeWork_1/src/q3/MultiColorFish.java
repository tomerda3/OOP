package q3;

public class MultiColorFish extends Fish {

    public MultiColorFish(int horSpeed, int verSpeed,int distance_eat, int size, int col, int x_front, int y_front){
        super(horSpeed, verSpeed, distance_eat, size, col, x_front, y_front);
    }

    @Override
    public void eatInc() {
        int size = super.getEatCount();
        super.eatInc();
        if (super.getEatCount() < size)
            super.changeColor();
    }

}
