package q3;

public class Jellyfish extends Swimmable {

    private int DISTANCE_EAT;
    private int size;
    private int col;
    private int eatCount;
    private int x_front;
    private int y_front;
    private int x_dir;
    private int y_dir;

    public Jellyfish(int horSpeed, int verSpeed, int distance_eat, int size, int col, int x_front, int y_front) {
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
        return "Jellyfish";
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

    public void changeJellyfish(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + "Jellyfish{" +
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

    public boolean equals(Jellyfish jellyfish) {
        if (this == jellyfish)
            return true;
        if (jellyfish == null || getClass() != jellyfish.getClass())
            return false;
        if (!super.equals(jellyfish))
            return false;
        return DISTANCE_EAT == jellyfish.DISTANCE_EAT && size == jellyfish.size && col == jellyfish.col && eatCount == jellyfish.eatCount && x_front == jellyfish.x_front && y_front == jellyfish.y_front && x_dir == jellyfish.x_dir && y_dir == jellyfish.y_dir;
    }
}
