class AA{
    public void show1(){
        System.out.println("in a show");
    }
}

class BB extends AA{
    public void show2(){
        System.out.println("in b show");
    }
}

abstract class Car{
    public abstract void drive(); // giving an idea that this method can be executed in child class
    public void playMusic(){
        System.out.println("dingdingdingding");
    }
}

class WagonR extends Car{
    // defining drive is compulsory as its abstract method
    public void drive(){
        System.out.println("vroom vroom!");
    }
}

public class module23 {
    public static void main(String[] args) {
        AA obj = (AA) new BB(); // upcasting as we are typecasting it to a parent class
        //(refer to dynamic method dispatch)

        BB obj1 = (BB) obj; // typecasted to child class, thus called downcasting
        obj.show1();
        obj1.show2();


        // Wrapper Class in Java
        // we have a class for every primitive data type in java

        Integer num1 = 6; // autoboxing (assigning an int value to Integer class)
        System.out.println(num1.intValue());  // unboxing
        System.out.println(num1);


        String str = "12";
        int str_num = Integer.parseInt(str); // converting string to int
        System.out.println(str_num+1);


        // abstract keyword
        WagonR c = new WagonR();
        c.drive();
        c.playMusic();
    }
}
