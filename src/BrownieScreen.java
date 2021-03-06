import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.imageio.ImageIO;

public class BrownieScreen {

	public static BufferedImage BlueImg;
	public static BufferedImage StoreImg;

	BrownieManager manager;
	int X = (BrownieTapperLauncher.WIDTH / 3) * 2;
	int Y = 20;
	int Z = 120;
	ArrayList<BrownieStore> price;
	Iterator<BrownieStore> browniePriceIterator;
	Font shop = new Font("Arial", Font.PLAIN, 20);

	BrownieScreen(BrownieManager manager) {
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
		g.drawImage(this.StoreImg, X, 0, (BrownieTapperLauncher.WIDTH / 3) + 1, BrownieTapperLauncher.HEIGHT, null);

		for (int i = 20; i < 920; i += 100) {
			g.setColor(Color.GRAY);
			g.fillRect(X + 20, i, (BrownieTapperLauncher.WIDTH / 3 + 1) - 40, 80);
		}

		if (manager.store.producePrice <= manager.brownieNum) {
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(X + 20, Y, (BrownieTapperLauncher.WIDTH / 3 + 1) - 40, 80);

		}
		if (manager.store2.producePrice <= manager.brownieNum) {
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(X + 20, Y + 100, (BrownieTapperLauncher.WIDTH / 3 + 1) - 40, 80);

		}
		if (manager.store3.producePrice <= manager.brownieNum) {
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(X + 20, Y + 200, (BrownieTapperLauncher.WIDTH / 3 + 1) - 40, 80);

		}
		if (manager.store4.producePrice <= manager.brownieNum) {
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(X + 20, Y + 300, (BrownieTapperLauncher.WIDTH / 3 + 1) - 40, 80);

		}
		if (manager.store5.producePrice <= manager.brownieNum) {
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(X + 20, Y + 400, (BrownieTapperLauncher.WIDTH / 3 + 1) - 40, 80);

		}
		if (manager.store6.producePrice <= manager.brownieNum) {
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(X + 20, Y + 500, (BrownieTapperLauncher.WIDTH / 3 + 1) - 40, 80);

		}
		if (manager.store7.producePrice <= manager.brownieNum) {
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(X + 20, Y + 600, (BrownieTapperLauncher.WIDTH / 3 + 1) - 40, 80);

		}
		if (manager.store8.producePrice <= manager.brownieNum) {
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(X + 20, Y + 700, (BrownieTapperLauncher.WIDTH / 3 + 1) - 40, 80);

		}
		if (manager.store9.producePrice <= manager.brownieNum) {
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(X + 20, Y + 800, (BrownieTapperLauncher.WIDTH / 3 + 1) - 40, 80);

		}
		String a = "";
		String b = "";
		String c = "";
		String d = "";
		String e = "";
		String f = "";
		String gl = "";
		String h = "";

		a = Integer.toString(manager.store.producerAmount);
		b = Integer.toString(manager.store2.producerAmount);
		c = Integer.toString(manager.store3.producerAmount);
		d = Integer.toString(manager.store4.producerAmount);
		e = Integer.toString(manager.store5.producerAmount);
		f = Integer.toString(manager.store6.producerAmount);
		gl = Integer.toString(manager.store7.producerAmount);
		h = Integer.toString(manager.store8.producerAmount);

		g.setFont(shop);
		g.setColor(Color.BLACK);
		g.drawString(a, X + 250, 66);
		g.drawString(b, X + 250, 166);
		g.drawString(c, X + 250, 266);
		g.drawString(d, X + 250, 366);
		g.drawString(e, X + 295, 466);
		g.drawString(f, X + 250, 566);
		g.drawString(gl, X + 295, Y + 646);
		g.drawString(h, X + 295, 766);

	}

	void update() {

	}
}