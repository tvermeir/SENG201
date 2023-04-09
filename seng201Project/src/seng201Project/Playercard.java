package seng201Project;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;


@SuppressWarnings("serial")
public class Playercard extends JPanel {

	
	private JLabel txtName;
	private JLabel txtT;
	private JLabel txtT_1;
	public Playercard(Athlete athlete) {
		setBorder(new LineBorder(new Color(0, 0, 0), 4));
		setLayout(null);
		
		txtName = new JLabel();
		txtName.setBounds(0, 0, 200, 50);
		txtName.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		txtName.setForeground(Color.BLACK);
		txtName.setFont(new Font("Calibri", Font.BOLD, 17));
		txtName.setBackground(UIManager.getColor("Button.background"));
		txtName.setHorizontalAlignment(SwingConstants.CENTER);
		txtName.setText(athlete.getName());
		add(txtName);
		
		
		txtT = new JLabel();
		txtT.setHorizontalAlignment(SwingConstants.CENTER);
		txtT.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		txtT.setBackground(UIManager.getColor("Button.background"));
		txtT.setText("Attack: " + athlete.getAttack());
		txtT.setBounds(0, 46, 100, 50);
		add(txtT);
		
		
		txtT_1 = new JLabel();
		txtT_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtT_1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		txtT_1.setBackground(UIManager.getColor("Button.background"));
		txtT_1.setText("Defense: " + athlete.getDefense());
		txtT_1.setBounds(100, 46, 100, 50);
		add(txtT_1);
		

	}
}
