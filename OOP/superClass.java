public class superClass {
    public static class SubClass extends superClass {
        // String s = "From sub";

        // override....
        // void print() {
        SubClass() {
            // super.print();
            super();
            // System.out.println(super.s);
            System.out.println("from sub");
        }

        void print() {
            System.out.println("sub print method");
        }
    }

    // String s = "From super";

    // void print() {
    superClass() {
        // System.out.println(s);
        System.out.println("from super");
    }

    void print() {
        System.out.println("super print method");
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.print();
    }
}
