package start;

import q1.MyDate;

public class Utility {

    public static MyDate threeDates(MyDate [] dates) {

        MyDate temp1 ;
        MyDate temp2 ;
        int count =0;
        for (int i =0; i< dates.length ; i++){

            count =0;
            temp1= dates[i].nextDate();
            temp2= dates[i].nextDate().nextDate();
            for (int j=0;j<dates.length; j++){

                if (dates[j].equals(temp1) )
                    count ++;
            }
            for (int k=0; k<dates.length; k++){
                if (dates[k].equals(temp2))
                    count ++;

            }

            if (count ==2){
                return dates[i];
            }
        }
        return new MyDate();
    }
}
