import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class BrownieTapperLauncher implements MouseListener {
	
	public static void main(String[] args) {
		
		BrownieTapperLauncher a = new BrownieTapperLauncher();
	}
	
	JFrame frame;
	GamePanel panel;
	JLabel label;
	BrownieManager manager;
	static final int WIDTH=1000;
	static final int HEIGHT=1000;
	
		BrownieTapperLauncher(){
			
			frame = new JFrame();
			panel = new GamePanel();
			label = new JLabel();
			panel.add(label);
	 		panel.addMouseListener(this);
	 		
	 		manager= new BrownieManager();
	 		label.setForeground(Color.WHITE);
			
			
			setup();
		}
		
			void setup(){
				frame.add(panel);
				frame.setSize(WIDTH, HEIGHT);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				panel.startGame();
				}
			
			void update(){
				manager.setCounter(label);
			}

		
			public void mouseReleased(MouseEvent e) {
				
				if(e.getX()>125&& e.getX()<375 && e.getY()>125&& e.getY()<375){
					manager.brownieClick(label);
				}
				if(e.getX()>(BrownieTapperLauncher.WIDTH/3)*2&& e.getX()<375 && e.getY()>125&& e.getY()<375){
					
				}
				
					
			}
			
			public void mouseClicked(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
	
		
}
