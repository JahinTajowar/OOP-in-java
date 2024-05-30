public class abstrac {
    abstract static class NewClass {
        abstract void demo();
    }

    static class Help extends NewClass {
        @Override
        void demo() {
            System.out.println("This is my new class");
        }
    }

    public static void main(String[] args) {
        NewClass obj = new Help(); // Instantiate the subclass
        obj.demo();
    }
}
