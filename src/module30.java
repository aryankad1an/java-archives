class C1{
    public void show() throws ClassNotFoundException{
        Class.forName("neega");
        // this means that show() will not handle this exception thus the responsibility is shifted to main function
    }
}
public class module30 {

    public static void main(String[] args) throws ClassNotFoundException{
        C1 obj = new C1();
        obj.show();
        // when main function also uses throws, the exception's responsibility is transferred to JVM which just stops the execution

    }
}
