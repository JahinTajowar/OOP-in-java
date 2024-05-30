public class MethodOverloading
{
    public void load(int a, int b)
    {
        int c = a + b;
        System.out.println(c);
    }

    // public void load(int x, int y, int z)
    public void load(double x, double y)
    {
        // int w = x + y + z;
        double w = x + y;
        System.out.println(w);
    }

    public static void main(String[] args) {
        MethodOverloading load_object = new MethodOverloading();
        load_object.load(5, 7);
        // load_object.load(8, 10, 11);
        load_object.load(8, 10 );
    }
}
