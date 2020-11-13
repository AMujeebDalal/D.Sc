class Enforloop{
	public static void main(String[] args)
	{
		int some[]={1,4,7,3,88};
		change(some);
		for(int y:some)
		{
			System.out.println(y);
		}
		
	}
	public static void change(int x[])
	{
		for(int i=0;i<x.length;i++)
		{
		x[i]+=5;
		}
	}
}