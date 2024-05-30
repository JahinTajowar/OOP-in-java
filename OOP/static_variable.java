// public class static_variable {
//     public static void main(String[] args) {
//         System.out.println(static_variable_class.a);
//     }
// }

public class static_variable {
    public static void add()
    {
        int a=10;
        int b= 20;
        int c;
        c=a+b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        static_variable.add();
    }
}