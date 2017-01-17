import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class BrownieTapperLauncher {
	
	public static void main(String[] args) {
		
		BrownieTapperLauncher a = new BrownieTapperLauncher();
	}
	
	JFrame frame;
	GamePanel panel;
	static final int WIDTH=1000;
	static final int HEIGHT=1000;
	
		BrownieTapperLauncher(){
			frame = new JFrame();
			panel = new GamePanel();
			panel.addKeyListener((KeyListener) this);
			
			setup();
		}
		
			void setup(){
				frame.add(panel);
				frame.setSize(WIDTH, HEIGHT);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				panel.startGame();
				}
	
		
}
