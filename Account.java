//Account Create (Eligiblity Age=18 or more)
import java.util.*;
class Account
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Age:");
		int a=s.nextInt();
		if(a>=18)
		{
			System.out.println("Account Created");
		}
		else
		{
			System.out.println("Sorry Kid");
		}
	}
}