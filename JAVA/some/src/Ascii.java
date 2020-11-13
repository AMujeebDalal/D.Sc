class Ascii
{
	char[] x={'a','b','c','d','e','f'};
	int a;
	Ascii()
	{
		for(int i:x)
		{
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args)
	{
		Ascii obj=new Ascii();
	}
}