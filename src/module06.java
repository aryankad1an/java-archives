// method overloading

class Calculator2{
    public int add(int n1){
        return n1;
    }
    public int add(int n1, int n2){
        return n1+n2;
    }
    public double add(double n1, int n2){
        return n1+n2;
    }
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
}

public class module06 {
    public static void main(String[] args){
        Calculator2 calc = new Calculator2(); // calc is object here
        System.out.println(calc.add(1));
        System.out.println(calc.add(2,3)); // method overloaded
        System.out.println(calc.add(2.6,3)); // method overloaded
        System.out.println(calc.add(2,3,4));  // method overloaded
    }
}
