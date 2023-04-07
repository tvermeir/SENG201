package seng201Project;

import java.util.ArrayList;

public class PlayerClub {
	float bankBalance;
	int playerCount;
	String teamName;
	ArrayList<Athlete> athleteList = new ArrayList<Athlete>();
	ArrayList<Athlete> starterList = new ArrayList<Athlete>();
	ArrayList<Athlete> reserveList = new ArrayList<Athlete>();
	ArrayList<PurchaseableItem> itemInventory;
	ArrayList<Athlete> topScorer = new ArrayList<Athlete>();
	
	public PlayerClub(float balance, String name) {
		bankBalance = balance;
		teamName = name;
	}
	
	
	public void makeReserve(Athlete athlete) {
		if (athleteList.contains(athlete)) {
			reserveList.add(athlete);
		}
		if (starterList.contains(athlete)) {
			starterList.remove(athlete);
		}
	}
	public void makeStarter(Athlete athlete) {
		if (athleteList.contains(athlete)) {
			starterList.add(athlete);
		}
		if (reserveList.contains(athlete)) {
			reserveList.remove(athlete);
		}
		
		
	}
	public float getBalance() {
		return bankBalance;
	}
	
	public boolean canPlay() {
		if (starterList.size() >= 4) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void addPlayer(Athlete athlete) {
		if (!athleteList.contains(athlete)) {
			athleteList.add(athlete);
		}
		
		
	}
	public static void main(String[] args) {
		Athlete pessi = new Athlete(1, 1, 1, 1, "Pionel Pessi");
		Athlete penaldo = new Athlete(1, 1, 1, 1, "Pisstiano Penaldo");
		PlayerClub Shitspurs = new PlayerClub(0, "Shitspurs");
		Shitspurs.addPlayer(pessi);
		Shitspurs.addPlayer(penaldo);
		System.out.println(Shitspurs.athleteList);
		
	
	}
	
}
