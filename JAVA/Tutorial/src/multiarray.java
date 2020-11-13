class multiarray
{
	public static void main(String[] args)
	{
		int firstarray[][]={{2,4,6,8},{1,3,5,7}};
		int secondarray[][]={{1,4,8},{1,3},{1,5,10,15}};
		System.out.println("This Is Your First Array:");
		display(firstarray);
		System.out.println("This Is Your Second Array:");
		display(secondarray);
	}
	public static void display(int x[][])
	{
		for(int i=0;i<x.length;i++){
		for(int j=0;j<x[i].length;j++)
		{
			System.out.print(x[i][j]+"\t");
		}
		System.out.println();
		}
	}
}