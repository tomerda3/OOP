package q2;

import q1.MyDate;

public class Temperature {
    private double scale ;
    private MyDate scale_date;

    public Temperature(double scale, int d, int m, int y) {
        this.scale = scale;
        scale_date = new MyDate(d,m,y);
    }

    public Temperature(double scale) {
        this.scale = scale;
    }

    public Temperature(Temperature other) {
        this.scale = other.scale;
        scale_date = new MyDate(other.scale_date);
    }

    public double getScale() {
        return scale;
    }

    public MyDate getScale_date() {
        return scale_date;
    }

    public boolean setScale(double scale) {
        this.scale = scale;
        return true;
    }

    @Override
    public String toString() {
        if (scale > 0)
            return "+" + scale + "°C " + scale_date.toString();
        return scale + "°C " + scale_date.toString();
    }

    public boolean setScale_date(MyDate scale_date) {
        this.scale_date = scale_date;
        return true;
    }

    public void printTemp() {
        if (scale > 0)
            System.out.println("+" + scale + "°C");
        else
            System.out.println(scale + "°C" );
    }

    public void printTempFull() {
        System.out.println(this);
    }

    public Temperature compareTemp(Temperature other) {
        if (other.scale > scale)
            return other;
        return this;
    }

    public boolean equals(Temperature temperature) {
        if (this == temperature)
            return true;
        if (temperature == null || getClass() != temperature.getClass())
            return false;
        return scale == temperature.getScale() && scale_date.equals(temperature.scale_date);
    }

}
