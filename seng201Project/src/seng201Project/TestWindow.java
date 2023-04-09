package seng201Project;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class TestWindow {

	private JFrame frame;
	/*ting is whatever */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestWindow window = new TestWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		PlayerClub Shitspurs = new PlayerClub(0, "Shitspurs");
		Athlete pessi = new Athlete(1, 1, 1, 1, "Pionel Pessi");
		Athlete penaldo = new Athlete(1, 1, 1, 1, "Pisstiano Penaldo");
		Shitspurs.addPlayer(pessi);
		Shitspurs.addPlayer(penaldo);
		ClubGUI ting = new ClubGUI(Shitspurs);
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(ting);
	}

}
