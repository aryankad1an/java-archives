class Marksheet{
    int marks = 6; // default variable
    public void show(){
        System.out.println("In marksheet");
    }
}

class Grades extends Marksheet{
    public void show(){
        System.out.println("In grades");
    }
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

        // illustrating runtime polymorphism with dynamic method dispatch


        Marksheet obj = new Marksheet();

        // taking reference of parent class and object of child class
        Marksheet obj2 = new Grades(); // this works because marksheet is a grades but grades is not marksheet lol
        // Grades obj = new Marksheet(); <-- this doesnt work

        obj.show();
        obj2.show(); // this is in grade as reference is to grade

        obj = new Grades(); // object reference reassigned
        obj.show();

        // what obj.show will show is decided on runtime, thats why its runtime polymorphism
    }
}

