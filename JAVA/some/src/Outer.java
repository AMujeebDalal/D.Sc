
class Outer
{
	int a=5;
	void test()
	{
		Inner o=new Inner();
		o.display();
	}
	class Inner
	{
	 void display()
		{
			System.out.print(a);
		}
	}
	public static void main(String[] args)
	{
		Outer obj=new Outer();
		obj.test();	
	}
	
}