abstract class Pramod
{
	public abstract void add();
}
class Inercls
{
	public static void main(String[] args)
	{
		Pramod obj=new Pramod()
		{
			public void add()
			{
				System.out.print("hi");
			}
		};
		obj.add();
	}
}