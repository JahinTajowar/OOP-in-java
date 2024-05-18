package meaningfulPackage;
class fib
{
	public int i,a,b,c;
	fib()
	{
		a=0;
		b=1;
		System.out.print(a+" "+b+" ");
	}	
	void print()
	{
		for(i=1;i<=5;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		
		}
	}
}

public class meaningful {
	  public static void main(String[] args) {
//	    System.out.print("test");
	    fib obj = new fib();
	  	obj.print();
	  }
	}
