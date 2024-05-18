package chkprime;

class fibo
{
	
	int n,i,flag = 1;
	fibo()
	{
	n=4;	
	}
	void Print()
	{
	for(i=2; i<n; i++)
	{
		if(n%i==0)
		{
			flag = 0;
			break;
		}
		
	}
	
	if(flag == 1)
	{
		System.out.print("prime");
	}
	else
		System.out.print("Not Prime");
	}
}

public class fibb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	fibo obj = new fibo();
	obj.Print();
	}

}
