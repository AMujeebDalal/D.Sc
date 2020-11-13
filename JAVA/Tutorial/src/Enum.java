public enum Enum
{
	Automation("nice","95"),
	Algorithms("v.good","81"),
	Database("v.good","90"),
	Microprocessor("v.good","84"),
	COA("v.good","86");
	private final String sub;
	private final String marks;
	Enum(String subject,String mark){
		sub=subject;
		marks=mark;
		}
	public String getsub()
	{
		return sub;
	}
	public String getmark()
	{
		return marks;
	}
}