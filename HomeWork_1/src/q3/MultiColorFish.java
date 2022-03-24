package q3;

public class MultiColorFish extends Fish {

    public MultiColorFish(int size, int x_front, int y_front, int horSpeed, int verSpeed, int col){
        super(size,horSpeed, verSpeed, x_front, y_front, col);
    }

    public String getAnimalName() {
        return "MultiColorFish";
    }

    @Override
    public void eatInc() {
        int size = super.getEatCount();
        super.eatInc();
        if (super.getEatCount() < size)
            super.changeColor();
    }

}
