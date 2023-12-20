class Marksheet{
    int marks = 6; // default variable
}
public class module20 {
    public static void main(String[] args) {
        Marksheet m = new Marksheet();
        System.out.println(m.marks);

        // public variables/methods can be accessed anywhere from the package
        // default variables/methods can be accessed in same package but not outside the package
        // private variables/methods cant be accessed from anywhere except the same class
        // protected can be used in same package any class or in different package child-class


        // polymorphism: it means many behaviors

        // it is of two types: compiletime(method overloading) and runtime(method overriding)
        // polymorphism at compile time is method overloading
        // polymorphism at run time is method overriding (common sense)


    }
}

