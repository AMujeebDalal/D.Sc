import java.lang.Exception;
class Try2
{
	public static void main(String[] args)
	{
		try{
			try{
				System.out.println("divide");
				int b=98/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			try{
				int a[]=new int[5];
				a[5]=4;
			}catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			System.out.println("OTHR");
		}
		catch(Exception e)
		{
			System.out.println("handled");
		}
		System.out.println("flow");
	}
}