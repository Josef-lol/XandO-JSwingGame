package xoGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {

	private JButton[] buttons = new JButton[9];
	private Boolean turn;
	
	ButtonPanel(GameMechanic gM)
	{
		gM
		addButtons();
	}
	
	private void addButtons()
	{
		
		for (int i = 0; i < 9; i++) 
		{
			buttons[i] = new JButton();
			buttons[i].addActionListener(new ActionListener()
					{
				
						@Override
						public void actionPerformed(ActionEvent e) {
							
							JButton button = (JButton) e.getSource();
							button.setEnabled(false);
						}
					});
			
			add(buttons[i]);
		}
	}
}
