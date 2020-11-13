class Strbuf
{
	int flag,count;
	StringBuffer x =new StringBuffer("tat aba tat aba tat");
	void check()
	{
		for(int i=0,j=x.length()-1;i<x.length();i++,j--)
		{
		if(x.charAt(j)!=x.charAt(i))
		{
			 flag=1;
		}
		}
		if(flag==1)
		{
			System.out.println("The String is not a pallindrome");
		}
		else{
			System.out.println("The String is pallindrome");		
	}}
	int blank()
	{
		for(int i=0;i<x.length()-1;i++)
		{
			int a= x.charAt(i);
			if(a==32)
			{
			count++;
			}
		}
		return count;
	}
	public static void main(String[] args)
	{
		Strbuf obj = new Strbuf();
		obj.check();
		System.out.println("No of Blank Spaces:"+obj.blank());
	}
	
}