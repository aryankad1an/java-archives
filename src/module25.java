interface Comp{
    int model = 44; // all the variables in interfaces are final(constant) and static
    void code();
}

interface Bluetooth{
    void connect();
}

class Developer{
    public void devApp(Comp cum){
        cum.code();
    }
}

class Laptop implements Comp, Bluetooth{
    public void code(){
        System.out.println("Coding..");
    }

    public void connect() {
        System.out.println("Connected to bluetooth");
    }
}

class Desktop implements Comp{
    public void code(){
        System.out.println("Coding Faster.. \uD83D\uDE80");
    }
}

public class module25 {
    public static void main(String[] args) {

        // making code more flexible with this
        Comp mac = new Laptop();
        Comp rog = new Desktop();
        Developer aryan = new Developer();
        aryan.devApp(mac);

        Developer n = new Developer();
        n.devApp(rog);

        // implementing multiple interfaces
        Laptop lap = new Laptop();
        lap.connect();

        // note that interface-interface inheritance can be facilitated by "extends"

    }
}
