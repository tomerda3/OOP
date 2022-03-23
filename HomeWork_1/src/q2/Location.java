package q2;

import java.time.LocalDate;

public class Location {

    String name;
    Temperature[] temp;

    public Location(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printLocation() {
        System.out.print(name + "temperature measurements: ");
        if (temp != null)
            for (Temperature temperature : temp)
                System.out.print(temperature + "|");
        else
            System.out.print("no temperature measurements available.");
        System.out.println();
    }

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

    public double getAverage() {
        double count =0;
        if (temp == null)
            return 0;
        for (Temperature temperature : temp)
            count += temperature.getScale();
        return count/temp.length;
    }

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

    public void addTemp(double scale) {
        LocalDate date = LocalDate.now();
        addTemp(scale, date.getDayOfMonth(), date.getMonthValue(), date.getYear());
    }

    public Temperature getMax() {
        if (temp == null)
            return null;
        Temperature max = new Temperature(temp[0]);
        for (int i = 1; i < temp.length; i++)
            if (max.getScale() < temp[i].getScale())
                max = new Temperature(temp[i]);
        return max;
    }
}
