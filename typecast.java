//Typecasting

class typecast
{
	public static void main(String ar[])
	{
		int i=10;
		double d;
		d=i;//implicit
		System.out.println("D is:"+d);
		float f=2.5f;
		int x;
		x=(int)f;//explicit
		System.out.println("X is:"+x);
		int j=458;
		byte b;
		b=(byte)j;
		System.out.println("B is:"+b);
	}
}