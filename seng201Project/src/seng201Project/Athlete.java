package seng201Project;

public class Athlete {
	public int attack;
	public int defense;
	public double health;
	public double price;
	public int stamina = 100;
	public String name;
	
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
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	

}
