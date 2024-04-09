package xoGame;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class GameGraphic extends JFrame{

	GameGraphic() 
	{
		
	}
	
	public void paint(Graphics g)
	{
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.drawLine(166, 0, 166, 500);
	}
}
