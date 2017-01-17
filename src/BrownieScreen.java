import java.awt.Color;
import java.awt.Graphics;

public class BrownieScreen {
	
	
	void draw(Graphics g){
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, BrownieTapperLauncher.WIDTH/2, BrownieTapperLauncher.HEIGHT);
		g.setColor(new Color(125, 89, 54));
		g.fillRect(125, 125, 250, 250);
	}
		
		
		void update(){
		
		}
		
}
