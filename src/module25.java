interface Comp{
    void code();
}

class Developer{
    public void devApp(Comp cum){
        cum.code();
    }
}

class Laptop implements Comp{
    public void code(){
        System.out.println("Coding..");
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

    }
}
