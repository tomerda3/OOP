package start;

import q1.MyDate;
import q2.Location;

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


}
