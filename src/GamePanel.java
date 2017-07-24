import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, MouseListener, KeyListener {
	Timer clock;
	JLabel brownieCounter = new JLabel("0 Brownies");
	JLabel productionCounter = new JLabel("Brownies Per Second:");
	BrownieScreen brwSrn;
	BrownieManager manager;
	ArrayList<BrownieStore> stores;
	Iterator<BrownieStore> brownieProductionIterator;
	int buttonX = (BrownieTapperLauncher.WIDTH / 3) * 2 + 20;
	int buttonY = 20;
	int frameSegment = BrownieTapperLauncher.WIDTH / 3;
	Font shop = new Font("Arial", Font.PLAIN, 20);
	Font score = new Font("Arial", Font.BOLD, 24);
	Font bps = new Font("Arial", Font.BOLD, 12);

	JButton brownie;

	GamePanel() {

		clock = new Timer(1000 / 30, (ActionListener) this);
		manager = new BrownieManager();
		brwSrn = new BrownieScreen(manager);
		stores = manager.getStores();
		brownieProductionIterator = stores.iterator();
		while (brownieProductionIterator.hasNext()) {
			addStoreButton(buttonX, buttonY);
			buttonY += 100;
		}
		brownieButton();
		brownieCounter.setFont(score);
		brownieCounter.setForeground(Color.WHITE);
		brownieCounter.setBounds(frameSegment - 63, 10, 400, 100);
		add(brownieCounter);

		productionCounter.setFont(bps);
		productionCounter.setForeground(Color.WHITE);
		productionCounter.setBounds(frameSegment - 63, 70, 20000000, 50);
		add(productionCounter);

		setLayout(null);
		BrownieTapperLauncher.frame.add(this);
		BrownieTapperLauncher.frame.setVisible(true);

		addMouseListener(this);
		addKeyListener(this);

		startGame();

	}

	void startGame() {
		clock.start();

	}

	void addStoreButton(int buttonX, int buttonY) {
		BrownieStore store = brownieProductionIterator.next();
		String storeName = store.name;
		JButton button = new JButton();
		button.setFont(shop);
		button.setHorizontalAlignment(SwingConstants.LEFT);
		button.addMouseListener(this);

		if (store.producePrice >= 1000 && store.producePrice < 1000000) {
			button.setText(storeName + " $" + (int) store.producePrice / 1000 + " Thousand");
		}

		else if (store.producePrice >= 1000000) {
			button.setText(storeName + " $" + (int) store.producePrice / 1000000 + " Million");
		}

		else {
			button.setText(storeName + " $" + (int) store.producePrice);
		}

		button.setName(storeName);
		button.setBorderPainted(false);
		button.setOpaque(false);
		button.setBounds(buttonX, buttonY, (frameSegment + 1) - 40, 80);
		this.add(button);

	}

	void brownieButton() {
		URL u = getClass().getResource("chocolate_brownies.png");
		Icon i = new ImageIcon(u);
		brownie = new JButton();
		brownie.addMouseListener(this);
		brownie.setBorderPainted(false);
		brownie.setOpaque(false);
		brownie.setIcon(i);
		brownie.setBounds(frameSegment - 125, 156, i.getIconWidth(), i.getIconHeight());
		this.add(brownie);

	}

	public void paintComponent(Graphics g) {
		brwSrn.draw(g);
	}

	public void actionPerformed(ActionEvent e) {
		manager.update(brownieCounter);
		manager.setProducingCounter(productionCounter);
		repaint();

	}
	
	public void mouseReleased(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1) {
			if (e.getSource() == brownie) {
				manager.brownieClick();
				

			}

			else {
				manager.storePurchace(e.getComponent().getName());

			}

		}

	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_NUMPAD1) {
			manager.extraBrownies1000();
		}
		if (e.getKeyCode() == KeyEvent.VK_NUMPAD2) {
			manager.extraBrownies1000000();
		}
		if (e.getKeyCode() == KeyEvent.VK_NUMPAD3) {
			manager.extraBrownies1000000000();
		}

	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void keyTyped(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
	}

}