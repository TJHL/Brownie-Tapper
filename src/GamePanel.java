import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {
	Timer clock;
	
	GamePanel(){
	
		clock = new Timer(1000 / 60,(ActionListener) this);
	}
		void startGame(){
			clock.start();
	
		}

	
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
