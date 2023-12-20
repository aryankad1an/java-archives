class Calc{
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int sub(int n1, int n2){
        return n1-n2;
    }
}

// inheritance syntax
class SuperCalc extends Calc{
    public int multi(int n1, int n2){
        return n1* n2;
    }
    public int div(int n1, int n2){
        return n1/n2;
    }
}

public class module17 {
    public static void main(String[] args) {
        /*
        NEED OF INHERITANCE:
            an object "is" some other object, in that case we use inheritance
            eg: a laptop is a computer, a human is an animal
        */
        Calc c1 = new Calc();
        System.out.println(c1.add(3, 4));
        System.out.println(c1.sub(3, 4));

        SuperCalc s1 = new SuperCalc();
        System.out.println(s1.multi(6, 9));
        System.out.println(s1.div(81, 9));
        System.out.println(s1.add(81, 9)); // these methods work :)
        System.out.println(s1.sub(81, 9));
    }
}
