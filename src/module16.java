class Text{
    String data;
    public Text(){
        this.data = "Default";
        System.out.println("Object created");
    }
    public void show(){
        System.out.println(data);
    }
}
public class module16 {
    public static void main(String[] args) {
        /*
        NAMING CONVENTIONS

        class/interface: FullCapital
        variables/methods: small or camelCase
        constants: ALL_CAPITAL

         */

        new Text(); // object created lol(only in heap memory, not in stacc memory)
        // these type of object are called anonymous object

        new Text().show(); // anonymous object's method called
    }
}
