public class Constructor {

    public class My {

        My(int a) {
            int x = a;
            System.out.println(x);
            // System.out.println("This is Constructor Method ");
        }

        My(double b) {
            double y = b;
            System.out.println(y);
        }

        // public void demo() {
        //     System.out.println("This is Normal method");
        // } 
    }

    public static void main(String[] args) {
        Constructor outer = new Constructor();

        // My obj = outer.new My();
        My objA = outer.new My(10);
        My objB = outer.new My(10.2213);
    }
}
