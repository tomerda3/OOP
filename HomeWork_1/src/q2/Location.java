package q2;

public class Location {

    String name;
    Temperature[] temp;

    public Location(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printLocation(){
        System.out.println(name);
        if (temp.length > 0)
            for (int i=0 ; i < temp.length; i++)
                System.out.println(temp[i]);
        else System.out.println("no temperature measurements available");
    }
    public double getAverage(){

        double count =0;

        if (temp.length ==0)
            return 0;

        for (int i=0; i < temp.length; i++){
            count += temp[i].getScale();
        }
        return count/temp.length;
    }

//    public void addTemp(double scale,  ) {
//
//    }
//    public void addTemp(double scale,  ) {
//
//    }
}
