public class inheritance {
    // Inner class Father
    public class Father {
        public int a = 10;
        public int b = 20;
        public int c;

        public void add() {
            this.c = this.a + this.b;
            System.out.println(this.c);
        }
    }

    // Inner class Son extending Father
    public class Son extends Father {
        // Son class inherits all fields and methods from Father
    }

    public static void main(String[] args) {
        // Create an instance of the outer class inheritance
        inheritance outer = new inheritance();
        
        // Create an instance of the inner class Son
        Son object = outer.new Son();
        
        // Call the add method inherited from Father
        object.add();
        System.out.println(object.a);

    }
}
