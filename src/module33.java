class Hi extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
        }
    }
}
class Hello extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
        }
    }
}
public class module33 {
    public static void main(String[] args) {
        // threads in java

        Hi obj1 = new Hi();
        Hello obj2 = new Hello();
        // once the class extends Thread, they are not ordinary classes, they are threads

        obj1.start(); // we use start method to "run" a thread
        obj2.start();
        // this way threads are executed parallel

    }
}
