package xoGame;

import java.awt.Font;

import javax.swing.JLabel;

public class WordPanel extends JLabel{

	private JLabel turnLabel;
	private GameMechanic gameMechanic;
	
	WordPanel(GameMechanic gameMechanic)
	{
		turnLabel.setFont(new Font("Arial", Font.BOLD, 100));
		turnLabel.setLocation(133, 550);
		gameText(gameMechanic.turn());
	}

	
	private void gameText(boolean turn)
	{
		if(turn == true)
		turnLabel = new JLabel("It is player 1's turn.");
		else
		{
			turnLabel = new JLabel("It is player 2's turn.");
		}
		add(turnLabel);
	}
}
