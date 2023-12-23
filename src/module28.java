@FunctionalInterface
interface I1{
    void show(int i);
    // functional interfaces are those interfaces with only one function
}
class A1 implements I1{
    public void show(int i){
        System.out.println("In show");
        System.out.println(i);
    }
}

public class module28 {
    public static void main(String[] args) {
        A1 a1 = new A1();
        a1.show(69);

        // lambda expression in Java
        I1 obj = (i) -> {
            System.out.println("in show(lambda way)");
            System.out.println(i);
        };
        obj.show(70);
    }
}
