import javax.swing.JFrame;

public class BrownieTapperLauncher {
	
	static final int WIDTH=1000;
	static final int HEIGHT=1000;
	static JFrame frame;
	static GamePanel panel;

	public static void main(String[] args) {
		
		BrownieTapperLauncher a = new BrownieTapperLauncher();
	}
		
		BrownieTapperLauncher(){
			
			frame = new JFrame();
			setup();
			panel = new GamePanel();
			
		}
		
			void setup(){
				frame.setSize(WIDTH, HEIGHT);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				}
}