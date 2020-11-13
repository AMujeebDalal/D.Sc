import java.lang.Exception;
import java.util.Random;
class Aorder
{
	public static void main(String[] args)
	{
		try
		{
			int a[]=new int[5];
			 a[5]=50/0;
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("hello");
		Random r =new Random();
		System.out.println(r.nextInt());
	}
}