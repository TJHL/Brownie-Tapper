import java.awt.Color;
import java.awt.Graphics;

public class BrownieScreen {

	BrownieStore store;

	void draw(Graphics g) {

		// background
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, (BrownieTapperLauncher.WIDTH / 3) * 2, BrownieTapperLauncher.HEIGHT);

		// storeShopBackground
		g.setColor(new Color(125, 89, 54));
		g.fillRect((BrownieTapperLauncher.WIDTH / 3) * 2, 0, BrownieTapperLauncher.WIDTH / 3 + 1,
				BrownieTapperLauncher.HEIGHT);
	}

	void update() {

	}
}