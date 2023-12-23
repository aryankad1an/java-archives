@FunctionalInterface
interface I1{
    void show();
    // functional interfaces are those interfaces with only one function
}
class A1 implements I1{
    public void show(){
        System.out.println("In show");
    }
}

public class module28 {
    public static void main(String[] args) {
        A1 a1 = new A1();
        a1.show();
    }
}
