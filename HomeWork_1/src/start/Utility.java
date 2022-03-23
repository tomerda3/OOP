package start;

import q1.MyDate;
import q2.Location;
import q3.Swimmable;

import java.util.Random;
public class Utility {

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

    public void printAquarium(Swimmable[] arr){

        System.out.println("Aquarium[type/color/actual size/eat count]:");
        for (Swimmable swimmable : arr)
            swimmable.printSwimmable();
    }

    public void feedAquaticAnimal(Swimmable[] arr, int feed){
        Random rand = new Random();
        for(int i=0; i<feed; i++){
            int rand1 = rand.nextInt(arr.length);
            arr[rand1].eatInc();
        }
    }

    public int countAquaticAnimal(Swimmable[] arr){
        int count=0;
        for (int i=0; i<arr.length; i++ ){
            if (arr[0].getSize() < arr[i].getSize())
                count++;
        }
        return count;
    }

    public void sortAquaticAnimal(Swimmable[]arr){

        for (int i =0; i<arr.length; i++){

            for (int j = 0; j < arr.length; j++) {

            }
        }
    }
}
