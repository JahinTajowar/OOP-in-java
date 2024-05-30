
import java.util.Scanner;

public class scannerss {
    public static int add(int a, int b)
    {
       int c=a+b;
       return c;

    }
    public static void main(String[] args) {
        Scanner scannerss = new Scanner(System.in);
        System.out.print("take a number: ");
        int a=scannerss.nextInt();
        System.out.print("take a number: ");
        int b=scannerss.nextInt();

        System.out.println("output is: "+add(a,b));
    }

}
