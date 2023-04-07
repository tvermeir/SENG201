package seng201Project;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;

import java.awt.Dimension;


public class Athlete {
	public int attack;
	public int defense;
	public double health;
	public double price;
	public int stamina = 100;
	public String name;
	private JFrame frmPlayerDetails;
	
	public Athlete(int attack, int defense, double health, double price, String name) {
		this.name = name;
		this.attack = attack;
		this.defense = defense;
		this.health = health;
		this.price = price;
	}
	public void getAttack() {
		System.out.println(attack);
	}
	
	public void getDefense() {
		System.out.println(defense);
	}
	
	public void getName() {
		System.out.println(name);
	}
	
	public void getPrice() {
		System.out.println(price);
	}
	
	public void getHealth() {
		System.out.println(health);
	}
	
	public void getStamina() {
		System.out.println(stamina);
	}
	
	public String toString() {
		return(name);
	}
	

	/**
	 * @wbp.parser.entryPoint
	 */
	public void mainWindow() {
		frmPlayerDetails = new JFrame();
		frmPlayerDetails.setVisible(true);
		
		frmPlayerDetails.setTitle(String.valueOf(name));
		frmPlayerDetails.setBounds(500, 500, 450, 300);
		frmPlayerDetails.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPlayerDetails.getContentPane().setLayout(null);
		
		
		JLabel myText = new JLabel("I'm a label in the window");
        frmPlayerDetails.getContentPane().add(myText);
        myText.setBounds(0, -4, 94,24);
        myText.setText(String.valueOf(name));
        
        JLabel lblNewLabel = new JLabel("Attack:");
        frmPlayerDetails.getContentPane().add(lblNewLabel);
        lblNewLabel.setBounds(106, 0, 61, 16);
        lblNewLabel.setText("Attack:");
        
        JLabel displayAttack = new JLabel("New label");
        displayAttack.setBounds(179, 0, 61, 16);
        frmPlayerDetails.getContentPane().add(displayAttack);
        displayAttack.setText(String.valueOf(attack));
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PionelPessi pepsi = new PionelPessi();
		 pepsi.mainWindow();
		 

	}
	
	

}
