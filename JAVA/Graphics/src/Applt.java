import java.awt.*;
import java.applet.*;
/*<applet code="SimpleApplet" width=200 height=60>*/
public class Applt extends Applet
{
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g)
	{
		g.drawString("A Simple Applet", 20, 20);
	}
}