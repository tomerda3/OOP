package q3;

public class Fish extends Swimmable {

    private int DISTANCE_EAT;
    private int size;
    private int col;
    private int eatCount;
    private int x_front;
    private int y_front;
    private int x_dir;
    private int y_dir;

    public Fish(int horSpeed, int verSpeed, int distance_eat, int size, int col, int x_front, int y_front) {
        super(horSpeed, verSpeed);
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

    @Override
    public String toString() {
        return super.toString() + "Fish{" +
                "DISTANCE_EAT=" + DISTANCE_EAT +
                ", size=" + size +
                ", col=" + col +
                ", eatCount=" + eatCount +
                ", x_front=" + x_front +
                ", y_front=" + y_front +
                ", x_dir=" + x_dir +
                ", y_dir=" + y_dir +
                '}';
    }

    public boolean equals(Fish fish) {
        if (this == fish)
            return true;
        if (fish == null || getClass() != fish.getClass())
            return false;
        if (!super.equals(fish))
            return false;
        return DISTANCE_EAT == fish.DISTANCE_EAT && size == fish.size && col == fish.col && eatCount == fish.eatCount && x_front == fish.x_front && y_front == fish.y_front && x_dir == fish.x_dir && y_dir == fish.y_dir;
    }
}
