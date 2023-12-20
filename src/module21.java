final class Device{
    public void show(){
        System.out.println("In Device Show");
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
}
// final classes cant be inherited
// class QuantumDevice extends Device{}

class Cal{
    final public void show(){
        System.out.println("In Cal Show");
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
}

class AdvCal extends Cal{

    // final methods prevent method overriding
    // public void show(){}
}
public class module21 {
    public static void main(String[] args) {
        final int num = 8; // making constant variable with final keyword
        // num = 9; <-- returns an error
        System.out.println(num);

        Device d1 = new Device();
        d1.show();
        d1.add(6, 7);
    }
}
