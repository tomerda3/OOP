package q1;

import java.time.LocalDate;

public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate() { //Default Constructor
        LocalDate date = LocalDate.now();
        this.day = date.getDayOfMonth();
        this.month = date.getMonthValue();
        this.year = date.getYear();
    }

    public MyDate(int d, int m, int y) { //Constructor
        LocalDate date = LocalDate.now();
        this.day = 0;
        this.month = 0;
        this.year = 0;
        if (!setYear(y))
            this.year = date.getYear();
        if (!setMonth(m))
            this.month = date.getMonthValue();
        if (!setDay(d))
            this.day = date.getDayOfMonth();
    }

    public MyDate(MyDate other) { //Copy Constructor
        this.year = other.getYear();
        this.month = other.getMonth();
        this.day = other.getDay();
    }

    public int getDay() {
        return day;
    }

    public boolean setDay(int day) {
        if ((day == 29 && month == 2 && isLeapYear()) || (1 <= day && day <= 28) || (month != 2 && (day == 29 || day == 30)) || (day == 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12))) {
            this.day = day;
            return true;
        }
        return false;
    }

    public int getMonth() {
        return month;
    }

    public boolean setMonth(int month) {
        if (day == 31 && (month == 2 || month == 4 || month == 6 || month == 9 || month == 11))
            return false;
        if (month == 2) {
            if (day == 29) {
                if (isLeapYear()) {
                    this.month = month;
                    return true;
                }
                return false;
            }
            if (day == 30)
                return false;
        }
        if (1 <= month && month <= 12) {
            this.month = month;
            return true;
        }
        return false;
    }

    public int getYear() {
        return year;
    }

    public boolean setYear(int year) {
        if (day == 29 && month == 2 && !(year % 4 == 0 && year % 100 != 0 || year % 400 == 0))
            return false;
        if (1900 <= year && year <= 2100) {
            this.year = year;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        if (day < 10 && month < 10)
            return "0" + day + "/0" + month + "/" + year;
        if (day < 10)
            return "0" + day + "/" + month + "/" + year;
        if (month < 10)
            return day + "/0" + month + "/" + year;
        return day + "/" + month + "/" + year;
    }

    public void printDate() {
        System.out.println(this);
    }

    public void printMonthName() {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        if (day < 10)
            System.out.println("0" + day + " " + months[month-1] + " " + year);
        else
            System.out.println(day + " " + months[month-1] + " " + year);
    }

    public int getMonthDay() {
        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        if (month == 2) {
            if (isLeapYear())
                return 29;
            return 28;
        }
        return 31;
    }

    public boolean isLeapYear() {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public MyDate nextDate() {
        MyDate d = new MyDate(this);
        if (day < getMonthDay())
            d.setDay(day + 1);
        else if (day == getMonthDay()) {
            if (month == 12) {
                d.setMonth(1);
                d.setYear(year + 1);
            }
            d.setDay(1);
            d.setMonth(month + 1);
        }
        return d;
    }

    public void printFormatDate(String msg) {
        String s;
        switch (msg) {
            case "ddmmyy" -> {
                if (day < 10 && month < 10 && year % 100 < 10)
                    s = "0" + day + "/0" + month + "/0" + year % 100;
                else if (day < 10 && month < 10)
                    s = "0" + day + "/0" + month + "/" + year % 100;
                else if (day < 10 && year % 100 < 10)
                    s = "0" + day + "/" + month + "/0" + year % 100;
                else if (year % 100 < 10 && month < 10)
                    s = day + "/0" + month + "/0" + year % 100;
                else if (day < 10)
                    s = "0" + day + "/" + month + "/" + year % 100;
                else if (month < 10)
                    s = day + "/0" + month + "/" + year % 100;
                else if (year % 100 < 10)
                    s = day + "/" + month + "/0" + year % 100;
                else
                    s = day + "/" + month + "/" + year % 100;
                System.out.println(s);
            }
            case "ddmmyyyy" -> System.out.println(this);
            case "mmddyyyy" -> {
                if (day < 10 && month < 10)
                    s = "0" + month + "/0" + day + "/" + year;
                else if (day < 10)
                    s = month + "/0" + day + "/" + year;
                else if (month < 10)
                    s = "0" + month + "/" + day + "/" + year;
                else
                    s = month + "/" + day + "/" + year;
                System.out.println(s);
            }
            case "yyyymmdd" -> {
                if (day < 10 && month < 10)
                    s = year + "/0" + month + "/" + day;
                else if (day < 10)
                    s = year + "/" + month + "/0" + day;
                else if (month < 10)
                    s = year + "/0" + month + "/" + day;
                else
                    s = year + "/" + month + "/" + day;
                System.out.println(s);
            }
            case "ddMMyyyy" -> printMonthName();
        }
    }

    public int compareDate(MyDate myDate) {
        if (equals(myDate))
            return 0;
        if (year > myDate.year || (year == myDate.year && month > myDate.month) || (year == myDate.year && month == myDate.month && day > myDate.day))
            return 1;
        return -1;
    }

    public boolean equals(MyDate myDate) {
        if (this == myDate)
            return true;
        if (myDate == null || getClass() != myDate.getClass())
            return false;
        return day == myDate.day && month == myDate.month && year == myDate.year;
    }
}
