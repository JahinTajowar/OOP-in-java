public class interfacee {

    interface First {
        void firstMethod();
    }

    interface secound {
        void secoundMethod();
    }

    interface third {
        void thirdMethod();
    }

    public static class NewClass implements First,secound,third {
        public void firstMethod() {
            System.out.println("My First Interface");
        }

        public void secoundMethod() {
             System.out.println("My secound Interface");
        }

        public void thirdMethod() {
             System.out.println("My third Interface");
        }
    }

    public static void main(String[] args) {
        NewClass obj = new NewClass();
        obj.firstMethod();
        obj.secoundMethod();
        obj.thirdMethod();
    }
}
