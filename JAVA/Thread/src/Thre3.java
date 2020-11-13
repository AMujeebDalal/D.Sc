class Thre3 implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
		try
			{
			System.out.println(i);
			Thread.sleep(1200);
			}
		catch(Exception e)
			{
			e.printStackTrace();
		}	}
	}
	public static void main(String[] args)
	{
		Thre3 t1=new Thre3();
		Thre3 t2=new Thre3();
		Thread obj1=new Thread(t1);
		Thread obj2=new Thread(t2);
		//obj1.run();
		obj1.start();
		/**try	//to make obj1 thread run first
		{
			obj1.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}*/
		obj2.start();
	}
}