class Lap{
    int price;
    String model;
}

class Lap2{
    String model;
    public String toString(){
        return "Hey! i just modified the compiler lol";
    }

    // our better implementation of equals method
    public boolean equals(Lap2 that){
        return this.model == that.model;
    }
}
public class module22 {
    public static void main(String[] args) {
        Lap mac = new Lap();
        mac.model = "M2 Pro";
        mac.price = 1000;


        // as we studied earlier, every class in Java extends Object class
        // Thus the methods of Object class is available to use :)
        System.out.println(mac); // by default toString method is being called
        System.out.println(mac.toString());

        Lap2 dell = new Lap2();
        dell.model = "XPS";
        Lap2 nigg = new Lap2();
        nigg.model = "XPS";
        Lap2 mac2 = new Lap2();
        mac2.model = "m3";
        System.out.println(dell); // we just modified the toString as by default it is called
        System.out.println(nigg.equals(dell)); // true
        System.out.println(nigg.equals(mac2)); // false
    }
}
