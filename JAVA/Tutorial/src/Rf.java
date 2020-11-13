import java.util.Random; 
class Rf{
	public static void main(String[] args)
	{
		Random rn=new Random();
		int freq[]=new int[7];
		for(int roll=1;roll<1000;roll++)
		{
			++freq[1+rn.nextInt(6)];
		}
			System.out.println("Face\tFrequency");
			for(int i=1;i<freq.length;i++)
			{
				System.out.println(i+"\t"+freq[i]);
			}
		
	}
}