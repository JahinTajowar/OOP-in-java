public class LocalVariable {

    public int ins;  // Instance variable

    public void add() {
        int a = 100;  // Local variable
        this.ins = a;  // Assign local variable 'a' to instance variable 'ins'
        int b = 200;  // Local variable
        int c = a + b;  // Local variable
        System.out.println(c);  // Print the result of the addition
    }
    public static void main(String[] args) {
        LocalVariable object = new LocalVariable();
        object.add();
        System.out.println(object.ins);
    }
}
