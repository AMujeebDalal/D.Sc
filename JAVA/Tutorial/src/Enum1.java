import java.util.EnumSet;
class Enum1{
	public static void main(String[] args)
	{
		for(Enum people:Enum.values())
		{
			System.out.printf("%s\t%s\t%s\n",people,people.getsub(),people.getmark());
		}
		System.out.println("\nNow For the range of constants:");
		for(Enum people:EnumSet.range(Enum.Algorithms,Enum.Microprocessor))
		{
			System.out.printf("%s\t%s\t%s\n",people,people.getsub(),people.getmark());
		}
	}
}