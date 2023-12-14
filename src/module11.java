class Mobile2{
    String brand;
    int price;
    static String name; // by making it static, we make it common for all the objects

    public void show(){
        System.out.println(brand + " : "+price+" : "+name);
    }

    public static void staticShow(){
        System.out.println("This is a static method, something that can be called " +
                "without creation of an object");
        System.out.println("Static variable is name whose value is: "+name);
    }
}

public class module11 {
    public static void main(String[] args){
        Mobile2 obj1 = new Mobile2();
        obj1.brand = "Apple";
        obj1.price = 1500;

        Mobile2 obj2 = new Mobile2();
        obj2.brand = "Samsung";
        obj2.price = 1700;

        Mobile2.name = "Smartphone";
        Mobile2.staticShow();


        // main method is static to prevent deadlock problems
        // as if its not static we need to create an object to call it
        // and where else can we create an object except main block 💀
    }
}
