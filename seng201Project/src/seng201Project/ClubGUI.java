package seng201Project;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.UIManager;

public class ClubGUI extends JPanel {
	private JFrame frame;
	
	/**
	 * Create the panel.
	 */
	public ClubGUI(PlayerClub club) {
		setBackground(UIManager.getColor("Button.disabledForeground"));
		setLayout(null);
		
		JList<Playercard> list = new JList<Playercard>();
		for (Playercard card: club.getCardList()) {
			list.add(card);
		}
		
		
		
		list.setBounds(104, 46, 447, 159);
		add(list);

	}
	
	
	public static void main(String[] args) {
		
		
		 

	}

}
