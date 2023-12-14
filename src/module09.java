class Student{
    int rollno;
    String name;
    int marks;
}

public class module09 {
    public static void main(String[] a){
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        // array of objects
        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // NOTE THAT STUDENT ARRAYS DOES NOT CREATE OBJECTS FROM SCRATCH
        // HOWEVER THEY ONLY STORE THE REFERENCE OF THE EXISTING OBJECTS :)

        students[0].rollno = 4;
        System.out.println(s1.rollno);


        // Strings in JAVA
        // String is a class in java

        // creating string as object lmao
        String name = new String("aryan");


        String fname = "nig";
        String sname = "nig"; // fact: the two strings are at same location in the heap memory
        // references fname and sname are refering to the same memory location
        System.out.println(name);
        System.out.println(fname);

        System.out.println(fname+"ga"); // works

        // modifying the string
        name = "arun";
        // strings are stored in "String Constant Pool" in heap memory
        // when the string is modified, the original value is not changed
        // but the reference is shifted from one place to a new object
        System.out.println(name);
    }
}
