public class Arrt
{
	public static void main(String[] args)
	{
		System.out.println("Index\tValue");
		int some[]={34,53,26,48,28,449,477,100};
		int sum=0;
		for(int i=0;i<some.length;i++)
		{
			System.out.println(i+"\t"+some[i]);
			sum=sum+some[i];
		}
		System.out.println("Sum: "+sum);
	}
}