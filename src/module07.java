class ExampleClass{
    int num = 5; // this is instance variable
}

public class module07 {
    public static void main(String[] a){
        /*
        STACK AND HEAP IN JAVA
         */
        // Stack memory follow LastInFirstOut principle
        // Every Method will have its own stack
        // A stack will have key: value pairs for storing variables
        // Whenever a method is called, its own new stack is created

        ExampleClass _reference = new ExampleClass();
        // here _reference is stored in stack, where key is _reference and value is an address
        // new ExampleClass() forms an object in heap memory, and its address is stored in reference variable
        // that object has everything about it, including all the instance variables and methods :)
        ExampleClass _reference_2 = new ExampleClass();

        _reference.num = 69;
        System.out.println(_reference.num);
        System.out.println(_reference_2.num); // unaffected by the change(pretty obvious)

    }
}
