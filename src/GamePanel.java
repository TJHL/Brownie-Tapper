import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, MouseListener {
	Timer clock;
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	JLabel counter = new JLabel("0 Brownies");
	BrownieScreen BrwSrn;
	BrownieManager manager;


	GamePanel(){
	
		clock = new Timer(1000 / 60,(ActionListener) this);
		BrwSrn = new BrownieScreen();
		manager = new BrownieManager();
		frame.add(panel);
		add(counter);
		addMouseListener(this);
			
		
	}

	void startGame() {
		clock.start();

	}

	public void paintComponent(Graphics g) {
		BrwSrn.draw(g);
		
		
	}

	public void actionPerformed(ActionEvent e) {
		repaint();
		manager.update(counter);
		

	}

	
	
	public void mouseReleased(MouseEvent e) {
		if(e.getButton()==MouseEvent.BUTTON1){
			if(e.getX()>125&& e.getX()<375 && e.getY()>125&& e.getY()<375){
				manager.brownieClick();
			}
			if(e.getX()>(BrownieTapperLauncher.WIDTH/3)*2&& e.getX()<375 && e.getY()>125&& e.getY()<375){
			
			}
		}	
	}
	public void mouseClicked(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	
	
}