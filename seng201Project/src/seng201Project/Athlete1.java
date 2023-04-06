package seng201Project;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



public class Athlete1 {
	public int attack;
	public int defense;
	public double health;
	public double price;
	public int stamina = 100;
	public String name;
	
	public Athlete1(int attack, int defense, double health, double price, String name) {
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
	
	public void mainWindow() {
		JFrame myFrame = new JFrame("Test GUI");
        myFrame.setVisible(true);
        myFrame.setBounds(300, 200, 700, 400);
        JLabel myText = new JLabel("I'm a label in the window",
                SwingConstants.CENTER);
        myFrame.getContentPane().add(myText);
        myText.setText(String.valueOf(name));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PionelPessi pepsi = new PionelPessi();
		 pepsi.mainWindow();
		 

	}
	
	

}
