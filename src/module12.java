class Mobile3{
    String brand;
    int price;
    static String name; // by making it static, we make it common for all the objects

    // constructor here(Details later)
    public Mobile3(){
        brand = "";
        price = 200;
    }
    static{
        name = "Phone"; // this will be initialised only once :)
        // it is called with constructor(just before constructor to be precise)
    }
    public void show(){
        System.out.println(brand + " : "+price+" : "+name);
    }
}

public class module12 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Mobile3"); // this is used to load the class and execute the static block

        System.out.println(Mobile3.name); // should work :)
    }
}
