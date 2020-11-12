import java.awt.*;
import java.awt.event.*;
class Gr extends Frame implements ActionListener
{
	TextField name,pass;
	Gr()
	{
		setLayout(new FlowLayout());
		Label n=new Label("Name:",Label.LEFT);
		Label p=new Label("Password:",Label.LEFT);
		name=new TextField(20);
		pss=new TextField(30);
		pss.setEchoChar('*');
		name.setForeground(Color.yellow);
		name.setBackground(Color.red);
		pss.setForeground(Color.yellow);
		pss.setBackground(Color.red);
		add(n);
		add(p);
		add(name);
		add(pss);
		name.addActionListener(this);
		pss.addActionListener(this);
		addWindowListener(new WindowAdapter()
				{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
				});
	}
	public void actionPerformed(ActionEvent ae)
	{
		Graphics g=this.getGraphics();
		g.drawString("name", x, y);
	}
	psvm
	{
		Gr obj=new Gr();
		obj.setVisible(true);
		obj.setSize(400,400);
		obj.setTitle("abcd");
	}
}