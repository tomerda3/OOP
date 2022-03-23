package q3;

public class MultiColorFish extends Fish{

    public MultiColorFish(int distance_eat, int size, int col, int x_front, int y_front){
        super(distance_eat, size, col, x_front, y_front);
    }

    @Override
    public void eatInc() {
        int max;
        max= super.getEatCount();
        super.eatInc();
        if (super.getEatCount() < max)
            super.changeColor();
    }

}
