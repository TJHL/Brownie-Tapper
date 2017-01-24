import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {
	Timer clock;
	BrownieScreen BrwSrn;

	GamePanel(){
	
		clock = new Timer(1000 / 60,(ActionListener) this);
		BrwSrn = new BrownieScreen();
		
	}

	void startGame() {
		clock.start();

	}

	public void paintComponent(Graphics g) {
		BrwSrn.draw(g);
		
		
	}

	public void actionPerformed(ActionEvent e) {
		repaint();

	}
	
	
}