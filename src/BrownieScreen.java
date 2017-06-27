import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class BrownieScreen {

	BrownieStore store;
	public static BufferedImage BlueImg;
	public static BufferedImage StoreImg;

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

	}

	void update() {

	}
}