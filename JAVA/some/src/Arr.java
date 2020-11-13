class Arr
{
	static int arr[]=new int[10];
	Arr()
	{
		for(int i=0;i<5;i++)
		{
			arr[i]=10*i+10;
		}
		for(int j=4;j<10;j++)
		{
			arr[j]=2*j;
		}
	}
	public void min(int arr[])
	{
		int min=arr[0];
		for(int x:arr)
		{
			if(x<min)
				min=x;
		}
		System.out.print(min);
	}
	public static void main(String[] args)
	{
		Arr obj=new Arr();
		obj.min(arr);
	}
}