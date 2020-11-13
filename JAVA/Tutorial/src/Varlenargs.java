
class Varlenargs
{
	public static void main(String[] args)
	{
		System.out.println(average(23,45,36,12,9,3,4));	
	}
	public static int average(int...numbers)
	{
		int total=0;
		for(int x:numbers)
		{
			total=total+x;
		}
		return total/numbers.length;
	}
	
}