package q3;

public class Fish extends Swimmable {

    private int DISTANCE_EAT;
    private int size;
    private int col;
    private int eatCount;
    private int x_front, y_front, x_dir, y_dir;

    public Fish(int distance_eat, int size, int col, int x_front, int y_front) {
        DISTANCE_EAT = distance_eat;
        this.size = size;
        this.col = col;
        this.eatCount = 0;
        this.x_front = x_front;
        this.y_front = y_front;
        this.x_dir = 1;
        this.y_dir = 1;
    }

    public String getAnimalName() {
        return "Fish";
    }

    public int getDISTANCE_EAT() {
        return DISTANCE_EAT;
    }

    @Override
    public int getSize() {
        return size;
    }

    public String getColor() {
        String[] colors = {"Black", "Red", "Blue", "Green", "Cyan", "Orange", "Yellow", "Magenta", "Pink"};
        return colors[col-1];
    }

    @Override
    public int getEatCount() {
        return eatCount;
    }

    public void eatInc() {
        eatCount++;
        if (eatCount > DISTANCE_EAT) {
            eatCount = 0;
            size++;
        }
    }

    public void changeFish(int size) {
        this.size = size;
    }

    public void changeColor() {
        col++;
        if(col == 10)
            col = 1;
    }


}
