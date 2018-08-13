import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class FaceDraw extends JFrame
{

	public FaceDraw()
	{
		setTitle("FaceDraw");
		setSize(960,960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.drawOval(250, 200, 350, 350);
		
		g.setColor(Color.BLACK);
		g.fillOval(340, 290, 50, 50);
		
		g.setColor(Color.GREEN);
		g.fillOval(355, 300, 20, 20);
		
		g.setColor(Color.BLACK);
		g.fillOval(480, 290, 50, 50);
		
		g.setColor(Color.GREEN);
		g.fillOval(495, 300, 20, 20);
		
		g.setColor(Color.RED);
		g.fillOval(360, 410, 150, 50);
		
		
		g.setColor(Color.BLACK);
		g.drawLine(430, 330, 400, 380);
		
		g.setColor(Color.BLACK);
		g.drawLine(430, 330, 460,380);
		
		g.setColor(Color.BLACK);
		g.drawLine(400,380, 460, 380);
		
		g.setColor(Color.DARK_GRAY);
		g.fillRect(290,270,120,15);
		
		g.setColor(Color.DARK_GRAY);
		g.fillRect(450,270,115,15);



		
	
		
	}
	public static void main(String[] args) 
	{
		FaceDraw f = new FaceDraw();
	}

}
