import java.util.Scanner;
public class greatest
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter 1st no.: ");
		a=sc.nextInt();
		System.out.print("enter 2st no.: ");
		b=sc.nextInt();
		System.out.print("enter 3st no.: ");
		c=sc.nextInt();
		if(a>b && a>c)
		{ 
			System.out.println("largest number is: "+a);
		}
		else if(b>c)
		{
			System.out.println("largest number is: "+b);
		}
		else
		{
			System.out.println("largest number is: "+c);
		}
	}
}