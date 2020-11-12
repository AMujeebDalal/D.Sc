import java.awt.*;
import java.awt.event.*;
//class First 
class First extends Frame implements ActionListener   
{
	private static final long serialVersionUID = 1L;
	//Frame f;
	Button b;
	First(String st)
	{
		//f=new Frame("First");
		super(st);
		setSize(400,500);
		setVisible(true);
		b=new Button("Close");
		add(b);
		setLayout(new FlowLayout());
		setBounds(800,200,300,400);
		b.addActionListener(this);
	}
		//addwindowListener(new First1());
	public void actionPerformed(ActionEvent ae)
	{
		/**addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});*/
		System.exit(0);
		repaint();
		
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.cyan);
		g.fillOval(150, 200, 40, 50);
		g.drawLine(500,500, 100,100);
		Font f=new Font("Arial",Font.BOLD,30);
		g.setFont(f);
		g.drawString("Hello", 100, 100);
		setBackground(Color.blue);
	}
	public static void main(String[] args)
	{
		First x=new First("First");
		
	}
}