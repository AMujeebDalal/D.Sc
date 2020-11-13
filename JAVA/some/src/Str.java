class Str
{
	String x="this is a pen";
	String z="this is a pen";
	String y="that is a pen";
	Str()
	{
		System.out.println(x.concat(y));
		System.out.println(x+y);
		System.out.println(x.charAt(2));
		if(x.equals(z))
		{
			System.out.print("yeah!");
		}
		
	}
	public static void main(String[] args)
	{
		Str o=new Str();
	}
}