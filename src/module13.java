class Human{
    private int age;
    private String name;

    public int getAge(){
        // getter
        return age;
    }
    public String getName(){
        // getter
        return name;
    }
    public void setAge(int a){
        // setter
        age = a;
    }
    public void setName(String nme) {
        // setter
        name = nme;
    }
}
public class module13 {
    public static void main(String[] args){
        // this procedure is called "Encapsulation"
        Human aryan = new Human();
        aryan.setAge(16);
        aryan.setName("Aryan");
        System.out.println(aryan.getAge());
        System.out.println(aryan.getName());
    }
}
