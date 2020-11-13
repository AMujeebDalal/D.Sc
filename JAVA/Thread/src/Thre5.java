class Thre5 implements Runnable
{
	public void run()
	{
		
	}
		public static void main(String[] args)
		{
			Thre5 obj=new Thre5();
			ThreadGroup tg=new ThreadGroup("parent");
			Thread t1=new Thread(tg,obj,"1st");
			Thread t2=new Thread(tg,obj,"2nd");
			Thread t3=new Thread(tg,obj,"3rd");
			ThreadGroup tg1=tg.getParent();
			System.out.println(tg1);
			t1.setPriority(7);
			int l=tg.activeCount();
			System.out.println("priority:"+t1.getName());
			System.out.println("priority:"+t2.getName());
			System.out.println("priority:"+t3.getName());
			t1.start();
			t2.start();
			t3.start();
			
		}
		
	
}