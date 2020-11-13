class Static
{
	private String first;
	private String last;
	private static int member;
	public Static(String fn,String ln)
	{
		first=fn;
		last=ln;
		member++;
		System.out.printf("For %s %s members in club = %d\n",first,last,member);
	}
	public String getFirst()
	{
		return first;
	}
	public String getLast()
	{
		return last;
	}
	public static int getMember()
	{
		return member;
	}
	public static void main(String[] args)
	{
		Static obj1=new Static("Shahid"," Afridi");
		Static obj2=new Static("Shoib"," Akhter");
		Static obj3=new Static("Sachin"," Tendulkar");
		Static obj4=new Static("Hashim"," Amla");
		System.out.print("\n"+obj1.getFirst());
		System.out.print(obj1.getLast());
		System.out.print("\t"+Static.getMember());
	}
}