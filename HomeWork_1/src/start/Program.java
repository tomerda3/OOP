package start;
import q1.*;
import q2.*;
import q3.*;

/**
 * A Class that run the main.
 * in the main we create all the Class object and work with them to run he program output.
 *
 * @version 1.0 25 Mar 2022
 * @author  Tomer Damti, Nave Sfunim
 * @see     //Temperature
 */
public class Program {
    public static void main(String[] args) {

        /**
         * part 1:
         * In the start package, create a Utility class to add static functions and add a static function to it.
         * I will create class objects of Dates in static main function: MyDate class and later Other departments.
         * Named threeDates which receives as a parameter an array of dates and searches for and returns the date for which in the array there are two
         * Additional dates that make up a series of three consecutive dates. If there is no such date the function returns the date
         * Current.
         */
        //1.
        System.out.println("---------- q1 ----------\n");
        MyDate date1=new MyDate(31, 3,2022);
        MyDate date2=new MyDate(29,2,2022);
        System.out.println(date1);
        date2.printDate();System.out.println();
        date1.printMonthName();System.out.println();
        System.out.println(date1.nextDate());
        System.out.println(date1.nextDate().getMonthDay());
        MyDate date3=new MyDate(31,12,2020);
        System.out.println(date3.isLeapYear());
        System.out.println(date3.nextDate());
        date3.nextDate().printFormatDate("ddmmyy");System.out.println();
        date3.nextDate().printFormatDate("mmddyyyy");System.out.println();
        date3.printFormatDate("yyyymmdd");System.out.println();
        date3.printFormatDate("ddMMyyyy");System.out.println();
        System.out.println(date3.compareDate(date3)+" "+date3.compareDate(date1)+
                " "+date1.compareDate(date3));
        MyDate[] arr= {new MyDate(1,2,2022),new MyDate(2,3,2022),new MyDate(12,8,2020),
                new MyDate(4,3,2022),new MyDate(3,3,2022),new MyDate(14,12,2021)};
        System.out.println(Utility.threeDates(arr));
        arr[3]=new MyDate();
        System.out.println(Utility.threeDates(arr));

        /**
         * part 2:
         * In this part we build Location with a class called Temperature,Location both in package q2,
         * that allows you to store a temperature measurement measured in degrees Celsius by
         * date.
         */
        //2.
        System.out.println("\n---------- q2 ----------\n");
        Location[] arr2 = { new Location("Tel-Aviv"), new Location("London"),
                new Location("Paris"), new Location("Berlin") };
        arr2[0].addTemp(12);
        arr2[0].addTemp(14, 1, 2, 2022);
        arr2[0].addTemp(21, 28, 1, 2022);
        arr2[0].addTemp(30, 12, 3, 2022);
        arr2[1].addTemp(25, 28, 2, 2022);
        arr2[1].addTemp(10);
        arr2[1].addTemp(14, 10, 1, 2022);
        arr2[1].addTemp(17, 9, 2, 2022);
        arr2[1].addTemp(14, 31, 12, 2021);
        arr2[1].addTemp(11, 2, 3, 2022);
        arr2[2].addTemp(27, 4, 2, 2022);
        arr2[2].addTemp(25, 8, 2, 2022);
        for (Location x : arr2)
            x.printLocation();
        System.out.println("max average temp of: ");
        arr2[Utility.getMaxTemp(arr2)].printLocation();
        System.out.println("average temperature is: " +
                (int) arr2[Utility.getMaxTemp(arr2)].getAverage() + (char) 176 + "C");
        System.out.print("max temperature of " + arr2[1].getName() + ": ");
        arr2[1].getMax().printTempFull();
        System.out.println("\ntemperatures close to average: " +
                (int) arr2[1].getAverage() + (char) 176 + "C");
        arr2[1].printLocation(2);

        //3.
        /**
         * Here we writing classes that describe sea creatures in an aquarium.
         * we create an abstract class called Swimmable in a q3 package that will serve as a base class for other classes,
         * and implement an interface.
         */
        System.out.println("\n---------- q3 ----------\n");
        Swimmable[] arr3= {new Fish(20, 0, 0, 0, 0, 6),new Jellyfish(10, 0, 0, 0, 0, 8),
                new UnusualFish(15, 0, 0, 0, 0, 9,2),new MultiColorFish(20, 0, 0, 0, 0, 2),
                new Fish(18, 0, 0, 0, 0, 4),new Jellyfish(34, 0, 0, 0, 0, 7)};
        Utility.printAquarium(arr3);
        Utility.feedAquaticAnimal(arr3, 50);
        Utility.printAquarium(arr3);
        System.out.println("\ncount: "+Utility.countAquaticAnimal(arr3));
        Utility.sortAquaticAnimal(arr3);
        Utility.printAquarium(arr3);


    }
}
