class Niger {
    public String name;

    //constructor
    public Niger(String name){
        this.name = name;
    }

    // constructor overloading
    public Niger(){
        name = "unnamed_niger";
    }
    public void setName(String name){
        this.name = name; //to prevent variable conflicts, this keyword is used
    }
    public String getName(){
        return name;
    }
}

public class module14 {
    public static void main(String[] args) {
        // this keyword and constructors
        Niger dev = new Niger();
        dev.setName("dev");
        System.out.println(dev.getName());

        // using constructor
        Niger hitarth = new Niger("hitarth");
        System.out.println(hitarth.getName());

    }
}
