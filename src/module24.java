class Mouse{
    // class inside class is inner class
    class TrackBall{
        public void config(){
            System.out.println("in config");
        }
    }

    static class StaticInnerClass{
        public void show(){
            System.out.println("in static inner class");
        }
    }
    public void show(){
        System.out.println("in show");
    }
}


public class module24 {
    public static void main(String[] args) {
        // Inner class in Java
        Mouse mice1 = new Mouse();
        mice1.show();

        Mouse.TrackBall ball1 = mice1.new TrackBall(); // proper syntax of making an inner class
        ball1.config();

        // syntax for making static class
        Mouse.StaticInnerClass c = new Mouse.StaticInnerClass();
        c.show();


        // anonymous inner class
        Mouse mice2 = new Mouse(){
            public void show(){
                System.out.println("In new show");
                System.out.println("YAY I just updated the show method");
            }
        };
        // this is called an anonymous(no name) inner class
        mice2.show();
    }
}
