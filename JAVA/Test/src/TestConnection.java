public class TestConnection
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
			System.out.println("connected");
		}
		catch(Exception e)
		{
			System.out.println("can't connect");
		}
	}
}