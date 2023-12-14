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

    }
}
