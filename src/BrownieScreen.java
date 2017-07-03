import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class BrownieScreen {

	public static BufferedImage BlueImg;
	public static BufferedImage StoreImg;
	
	BrownieManager manager;
	int Y=20;
	int Z=120;
	BrownieScreen(BrownieManager manager){
		this.manager = manager;
	
	}

	void draw(Graphics g) {

		try {
			BlueImg = ImageIO.read(this.getClass().getResourceAsStream("Blue Background.png"));
			StoreImg = ImageIO.read(this.getClass().getResourceAsStream("Shop Background.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		// background
		g.drawImage(this.BlueImg, 0, 0, BrownieTapperLauncher.WIDTH + 500, BrownieTapperLauncher.HEIGHT + 20, null);

		// storeShopBackground
		g.drawImage(this.StoreImg, (BrownieTapperLauncher.WIDTH / 3) * 2, 0, (BrownieTapperLauncher.WIDTH / 3) + 1,
				BrownieTapperLauncher.HEIGHT, null);
		
		for (int i = 20; i < 920; i+=100) {
			g.setColor(Color.GRAY);
			g.fillRect((BrownieTapperLauncher.WIDTH / 3) * 2 + 20, i, (BrownieTapperLauncher.WIDTH / 3 + 1) - 40, 80);
			}
		//use brownie Produion array
		if(manager.store.producePrice<=manager.brownieNum){
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect((BrownieTapperLauncher.WIDTH / 3) * 2 + 20, Y, (BrownieTapperLauncher.WIDTH / 3 + 1) - 40, 80);
		
		}
		
		if(Y>=BrownieTapperLauncher.HEIGHT){
			Y=20;
		}

	}

	void update() {

	}
}