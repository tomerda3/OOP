package start;
import q1.MyDate;

public class Program {
    public static void main(String[] args) {

        MyDate date1=new MyDate(31,03,2022);
        MyDate date2=new MyDate(29,02,2022);
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


    }
}
