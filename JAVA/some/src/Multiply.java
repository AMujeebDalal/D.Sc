class Multiply
{
	int A[]={1,2,3,4,5,-1},B[]={6,7,8,9,0,10},C[][]=new int[6][6];
	Multiply()
	{
		for(int i=0;i<6;i++)
		{
		for(int j=0;j<6;j++)
		{
		 C[i][j]=A[i]*B[j];
		}
		}
	}
		void display()
		{
			for(int x[]:C)
			{
			for(int y:x)
		{
			System.out.print(" "+y+" ");
		}
			}
			System.out.println();
	}
	public static void main(String[] args)
	{
		Multiply o=new Multiply();
		o.display();
	}
}