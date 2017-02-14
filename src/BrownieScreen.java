import java.awt.Color;
import java.awt.Graphics;

public class BrownieScreen {
	
	
	void draw(Graphics g){
		
		g.setColor(Color.BLUE);
		 
		g.fillRect(0, 0, (BrownieTapperLauncher.WIDTH/3)*2, BrownieTapperLauncher.HEIGHT);
		
		g.setColor(new Color(125, 89, 54));
		g.fillRect(125, 125, 250, 250);
		
		g.setColor(Color.BLACK);
		g.fillRect((BrownieTapperLauncher.WIDTH/3)*2, 0, BrownieTapperLauncher.WIDTH/3+1, 500);
		
		g.setColor(new Color(125, 89, 54));
		g.fillRect((BrownieTapperLauncher.WIDTH/3)*2, 200, BrownieTapperLauncher.WIDTH/3+1, BrownieTapperLauncher.HEIGHT);
		
		g.setColor(Color.GRAY);
		g.fillRect((BrownieTapperLauncher.WIDTH/3)*2+20, 220, (BrownieTapperLauncher.WIDTH/3+1)-40, 1000);
		
		g.setColor(new Color(125, 89, 54));
		g.fillRect((BrownieTapperLauncher.WIDTH/3)*2, 300, BrownieTapperLauncher.WIDTH/3+1, 20);
		g.fillRect((BrownieTapperLauncher.WIDTH/3)*2, 400, BrownieTapperLauncher.WIDTH/3+1, 20);
		g.fillRect((BrownieTapperLauncher.WIDTH/3)*2, 500, BrownieTapperLauncher.WIDTH/3+1, 20);
		g.fillRect((BrownieTapperLauncher.WIDTH/3)*2, 600, BrownieTapperLauncher.WIDTH/3+1, 20);
		g.fillRect((BrownieTapperLauncher.WIDTH/3)*2, 700, BrownieTapperLauncher.WIDTH/3+1, 20);
		g.fillRect((BrownieTapperLauncher.WIDTH/3)*2, 800, BrownieTapperLauncher.WIDTH/3+1, 20);
		g.fillRect((BrownieTapperLauncher.WIDTH/3)*2, 900, BrownieTapperLauncher.WIDTH/3+1, 60);
		
	}
		
		
		void update(){
		
		}
		
}