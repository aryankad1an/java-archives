class Mobile{
    String brand;
    int price;
    static String name; // by making it static, we make it common for all the objects

    public void show(){
        System.out.println(brand + " : "+price+" : "+name);
    }
}

public class module10 {
    public static void main(String[] args){
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        obj2.name = "SmartPhone";

        obj1.show();
        obj2.show();

        obj1.name = "foldable";
        obj1.show();
        obj2.show(); // note that its name also changed

        Mobile.name = "invisible"; // <-- a better way to change static variables

    }
}
