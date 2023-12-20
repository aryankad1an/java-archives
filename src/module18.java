class X{
    public void check(){
        System.out.println("In X");
    }

    public void check_x(){
        System.out.println("In X..somehow");
    }
}

class Y extends X{
    public void check(){ // method override :)
        System.out.println("In Y");
    }
}

public class module18 {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        x.check();
        y.check();
        y.check_x();
    }
}
