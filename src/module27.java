class AAA{
    public void show(){
        System.out.println("In A Show");
    }
}
class BBB extends AAA{

    @Override // this is an annotation, it helps in debugging and it acts as supplement to the compiler
    public void show(){
        System.out.println("In B Show");
    }
}
public class module27 {
    public static void main(String[] args) {
        BBB obj = new BBB();
        obj.show();
    }
}
