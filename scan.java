//Runtime Input

import java.util.*;
class Scannerex
{
	public static void main(String ar[])
	{
		int id,age;
		String name;
		float ave;
		char c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Id:");
		id=s.nextInt();
		System.out.println("Enter the Age:");
		age=s.nextInt();
		System.out.println("Enter the Name:");
		name=s.next();
		System.out.println("Enter the Average:");
		ave=s.nextFloat();
		System.out.println("Enter the Character:");
		c=s.next().charAt(0);
		System.out.println("Id   : "+id);
		System.out.println("Name : "+name);
		System.out.println("Age  : "+age);
		System.out.println("Aver : "+ave);
		System.out.println("Char : "+c);
	}
}
		