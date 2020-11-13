class Pri
{
	int n[]={10,34,12,13,14,15,16,17,39,19};
	public void prime()
	{
		for(int x:n)
		{
			if(x%2!=0 && x%3!=0 && x%5!=0 && x%7!=0)
				System.out.print(x+" ");
		}
	}
	public static void main(String[] args)
	{
		Pri obj= new Pri();
		obj.prime();
	}
}