package start;

import q1.MyDate;
import q2.Location;
import q3.Swimmable;

import java.util.Random;


/**
 * A Utility Class that run diffrent assaigment in aquarioum and Mydate
 * we use deffrent calculation to preform diffrent things within the class.
 * @version 1.0 25 Mar 2022
 * @author  Tomer Damti, Nave Sfunim
 * @see     MyDate Swimmable Location
 */
public class Utility {



    /**
     * Static function
     * Named threeDates which receives as a parameter an array of dates and searches for and returns the date for which in the array there are two
     * Additional dates that make up a series of three consecutive dates. If there is no such date the function returns the date
     * Current
     */
    public static MyDate threeDates(MyDate [] dates) {
        MyDate temp1, temp2;
        int count;
        for (MyDate date : dates) {
            count = 0;
            temp1 = date.nextDate();
            temp2 = temp1.nextDate();
            for (MyDate myDate : dates)
                if (myDate.equals(temp1))
                    count++;
            for (MyDate myDate : dates)
                if (myDate.equals(temp2))
                    count++;
            if (count == 2)
                return date;
        }
        return new MyDate();
    }
    /**
     * Static function which receives as a parameter an array of locations with
     * Temperature measurements and returns an index in an array of location with the maximum average temperature.
     */
    public static int getMaxTemp(Location [] arr) {
        if (arr.length == 0)
            return -1;
        double max = arr[0].getAverage();
        int index = 0;
        for (int i = 0; i < arr.length; i++)
            if (max < arr[i].getAverage()) {
                max = arr[i].getAverage();
                index = i;
            }
        return index;
    }
    /**
     * Static function which receives as a parameter an array of sea creatures in the aquarium and prints them.
     */
    public static void printAquarium(Swimmable[] arr) {
        if (arr == null)
            System.out.println("Empty array!");
        else {
            System.out.println("Aquarium[type/color/actual size/eat count]:");
            for (Swimmable swimmable : arr) {
                System.out.print(swimmable.getAnimalName() + "\t");
                if (swimmable.getAnimalName().equals("Fish"))
                    System.out.print("\t");
                if (!swimmable.getAnimalName().equals("MultiColorFish"))
                    System.out.print("\t");
                System.out.print(swimmable.getColor() + "\t");
                if (swimmable.getAnimalName().equals("MultiColorFish") && swimmable.getColor().equals("Red"))
                    System.out.print("\t");
                System.out.print(swimmable.getSize() + "\t");
                System.out.print(swimmable.getEatCount() + "\t\n");
            }
            System.out.println();
        }
    }
    /**
     * Static function which receives as parameters an array of sea creatures in the aquarium and the amount of food and feeds sea creatures
     * In the aquarium at random.
     */
    public static void feedAquaticAnimal(Swimmable[] arr, int feed) {
        Random rand = new Random();
        for(int i=0; i < feed; i++){
            int rand1 = rand.nextInt(arr.length);
            arr[rand1].eatInc();
        }
    }
    /**
     * Static function which receives as a parameter an array of sea creatures in the aquarium and returns the amount of small sea creatures
     * The size of the first sea creature in the array.
     */
    public static int countAquaticAnimal(Swimmable[] arr) {
        int count = 0;
        for (Swimmable swimmable : arr)
            if (arr[0].getSize() < swimmable.getSize())
                count++;
        return count;
    }
    /**
     * Static function which receives as an parameter an array of sea creatures in the aquarium and sorts an array according to the size of sea creatures
     * In descending order.
     */
    public static void sortAquaticAnimal(Swimmable[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            Swimmable temp = arr[i];
            int j =i;
            while (j > 0 && arr[j-1].getSize() < temp.getSize()){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }

}
