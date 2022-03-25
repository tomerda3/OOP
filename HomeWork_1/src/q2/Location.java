package q2;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * A Location Class that save name and containe Temperature obj
 * we use deffrent calculation to present the mesurment or the avrage of them.
 * @version 1.0 25 Mar 2022
 * @author  Tomer Damti, Nave Sfunim
 * @see     Temperature
 */
public class Location {

    String name;
    Temperature[] temp;

    /**
     * Builder build the object it get String name and build the Location object.
     * it insert to the filds the name.
     *
     * @see Location
     */
    public Location(String name) {
        this.name = name;
    }
// function that return the name
    public String getName() {
        return name;
    }
// function that return the name fuild of the object Location
    public void setName(String name) {
        this.name = name;
    }

    /**
     * object function that return a String of the Location.
     * it check if there is no measurement.
     *
     * @return String of the objects
     *
     */
    @Override
    public String toString() {
        String s = name + "temperature measurements: ";
        if (temp != null)
            for (Temperature temperature : temp)
                s += temperature + "|";
        else
            s += "no temperature measurements available.";
        return s;
    }
    /**
     * object function that print the Location.
     * using the tostring func
     *
     *@see  //toString that return string of the Location and then we print it.
     *
     */
    public void printLocation() {
        System.out.println(this);
    }
    /**
     * object function that print the Location by avarge.
     * using the tostring func and it get double parameter to calculate
     *
     *@see  //toString that return string of the Location and then we print it.
     *
     */
    public void printLocation(double n) {
        System.out.print(name + "temperature measurements: ");
        if (temp != null)
            for (Temperature temperature : temp) {
                if (temperature.getScale() >= Math.abs(n - getAverage()) && temperature.getScale() <= n + getAverage())
                    System.out.print(temperature + "|");
            }
        else
            System.out.print("no temperature measurements available.");
        System.out.println();
    }
    /**
     * object function send back the avarge.
     * to calculate we cherck if there is any measurement.
     */
    public double getAverage() {
        double count =0;
        if (temp == null)
            return 0;
        for (Temperature temperature : temp)
            count += temperature.getScale();
        return count/temp.length;
    }
    /**
     * object function that add Temperature measurement into array of Temperature it.
     * it get value for builder date:(int d, int m, int y), and scale of degree.
     * void function no return in here.
     */
    public void addTemp(double scale, int d, int m, int y) {
        Temperature temp = new Temperature(scale, d, m, y);
        Temperature [] arr;
        if (this.temp == null)
            arr = new Temperature[1];
        else
            arr = new Temperature[this.temp.length+1];
        int i;
        for (i = 0; i < arr.length-1; i++)
            arr[i] = this.temp[i];
        arr[i] = temp;
        this.temp = arr;
    }
    /**
     * object function that add Temperature measurement into array of Temperature it.
     * it get value for builder date: scale of degree, and use Mydate builder.
     * void function no return in here.
     */
    public void addTemp(double scale) {
        LocalDate date = LocalDate.now();
        addTemp(scale, date.getDayOfMonth(), date.getMonthValue(), date.getYear());
    }
    /**
     * object function send back the max temp measurement.
     * to calculate we check if there is any measurement.
     */
    public Temperature getMax() {
        if (temp == null)
            return null;
        Temperature max = new Temperature(temp[0]);
        for (int i = 1; i < temp.length; i++)
            if (max.getScale() < temp[i].getScale())
                max = new Temperature(temp[i]);
        return max;
    }
    /**
     * object function send back the avarge.
     * to calculate we check if there is any measurement.
     */
    public boolean equals(Location location) {
        if (this == location)
            return true;
        if (location == null || getClass() != location.getClass())
            return false;
        return name.equals(location.name) && Arrays.equals(temp, location.temp);
    }
}
