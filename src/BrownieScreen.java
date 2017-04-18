import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class BrownieScreen {

	Font Shop = new Font("Arial", Font.PLAIN, 24);
	BrownieStore store;

	void draw(Graphics g) {

		// background
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, (BrownieTapperLauncher.WIDTH / 3) * 2, BrownieTapperLauncher.HEIGHT);

		// upgradeBoxBackGround
		g.setColor(Color.BLACK);
		g.fillRect((BrownieTapperLauncher.WIDTH / 3) * 2, 0, BrownieTapperLauncher.WIDTH / 3 + 1, 200);

		// storeShopBackground
		g.setColor(new Color(125, 89, 54));
		g.fillRect((BrownieTapperLauncher.WIDTH / 3) * 2, 200, BrownieTapperLauncher.WIDTH / 3 + 1, BrownieTapperLauncher.HEIGHT - 200);

	}

	void update() {

	}
}