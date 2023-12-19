class A{
    public A(){
        /*
        ** EVERY CLASS IN JAVA EXTENDS Object CLASS, thus the parent of A class is Object class
         */
        super();
        System.out.println("Inside constructor of a");
    }
    public A(int n){
        super();
        System.out.println("Inside constructor of a with int passed");
    }
}

// inheritance used(in detail later)
class B extends A{
    public B(){
        super(); // constructor of parent class called
        // every constructor has a super() by default lol
        System.out.println("Inside constructor of b");
    }
    public B(int n){
        this();    // it will call the constructor of same class
        System.out.println("Inside constructor of b with passed integer");
    }
    public B(String a){
        super(5);
    }
}
public class module15 {
    public static void main(String[] args) {
        B b = new B(); // calls constructor of A also
        B bb = new B(4); // calls constructor of A also, but not "int" one
        B bbb = new B("ok"); // calls constructor of A with int passed(due to super keyword)
    }
}
