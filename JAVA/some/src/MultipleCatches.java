class MultipleCatches
{
	public static void main(String[] args)
	{
		try{
			int a=args.length;
			System.out.println(a=8);
			int b=52/a;
			int c[]={1};
			c[42]=99;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		System.out.println("flow");
	}

}