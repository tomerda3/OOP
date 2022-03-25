package q2;

import q1.MyDate;
/**
 * A Location Class that save name and containe Mydate obj
 * we use deffrent calculation to present the mesurment or the avrage of them.
 * @version 1.0 25 Mar 2022
 * @author  Tomer Damti, Nave Sfunim
 * @see     MyDate
 */
public class Temperature {
    private double scale ;
    private MyDate scale_date;

    /**
     * Builder that build the object. it get the next value : (double scale, int d, int m, int y),
     * it insert the scale and also operate the Mydate builder.
     * @param d m y scale
     * @see MyDate
     */
    public Temperature(double scale, int d, int m, int y) {
        this.scale = scale;
        scale_date = new MyDate(d,m,y);
    }
    /**
     * Builder that build the object. it get the value :scale,
     * it insert the scale and also operate the Mydate builder.
     * @param scale
     */
    public Temperature(double scale) {
        this.scale = scale;
    }
    /**
     * Copy constructor
     * copy the values of the other obj from the same type.
     * @param other
     * @see MyDate
     */
    public Temperature(Temperature other) {
        this.scale = other.scale;
        scale_date = new MyDate(other.scale_date);
    }
// Function that return the scale fuild of the object.
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
    /**
     * object function that return a String of the Temperature.
     * it check if the scale is correct.
     *
     * @return String of the objects
     *
     */
    @Override
    public String toString() {
        if (scale > 0)
            return "+" + scale + "°C " + scale_date.toString();
        return scale + "°C " + scale_date.toString();
    }
// set scale function boolean to return tre is it succed to set it.
    public boolean setScale_date(MyDate scale_date) {
        this.scale_date = scale_date;
        return true;
    }
    /**
     * object function that print the te,puture in specific format.
     *
     */
    public void printTemp() {
        if (scale > 0)
            System.out.println("+" + scale + "°C");
        else
            System.out.println(scale + "°C" );
    }
    /**
     * object function that print the Temperature.
     * @see // printTempFull
     */
    public void printTempFull() {
        System.out.println(this);
    }

    /**
     * object function that compare to other function and return object of the biggest scale in the object.
     * @return Temperature.
     * @param other
     */
    public Temperature compareTemp(Temperature other) {
        if (other.scale > scale)
            return other;
        return this;
    }
    /**
     * object function that compare with other same obj Temperature and return true if they are the same.
     * @return true if they equal false if they not.
     * @param temperature
     */
    public boolean equals(Temperature temperature) {
        if (this == temperature)
            return true;
        if (temperature == null || getClass() != temperature.getClass())
            return false;
        return scale == temperature.getScale() && scale_date.equals(temperature.scale_date);
    }

}
