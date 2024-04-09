package xoGame;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class MainWindow extends JFrame{

	public MainWindow()
	{
		initialise();
	}
	
	private void initialise()
	{
		WordPanel wp = new WordPanel(gameMechanic);
		
		this.setSize(500, 600);
		this.setTitle("X and O game");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		
		Container cpane = this.getContentPane();
		cpane.setBackground(Color.decode("#bec2c6"));
		this.setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.setStroke(new BasicStroke(3));
		g2D.drawLine(166, 0, 166, 500);
		g2D.drawLine(323, 0, 323, 500);
		g2D.drawLine(0, 166, 500, 166);
		g2D.drawLine(0, 323, 500, 323);
	}
	
}

