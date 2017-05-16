import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, MouseListener {
	Timer clock;
	JLabel brownieCounter = new JLabel("0 Brownies");
	JLabel productionCounter = new JLabel("Brownies Per Second:");
	BrownieScreen brwSrn;
	BrownieManager manager;
	ArrayList<BrownieStore> stores;
	Iterator<BrownieStore> brownieProductionIterator;
	int buttonX = (BrownieTapperLauncher.WIDTH / 3) * 2 + 20;
	int buttonY = 220;
	int frameSegment = BrownieTapperLauncher.WIDTH / 3;
	Font shop = new Font("Arial", Font.PLAIN, 24);
	Font score = new Font("Arial", Font.BOLD, 24);
	Font bps = new Font("Arial", Font.BOLD, 12);

	JButton brownie;

	GamePanel() {

		clock = new Timer(1000 / 60, (ActionListener) this);
		brwSrn = new BrownieScreen();
		manager = new BrownieManager();
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
		brwSrn.store = manager.store;
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
		button.setText(storeName);
		button.setName(storeName);
		button.setBorderPainted(false);
		button.setOpaque(true);
		button.setBackground(Color.GRAY);
		button.setBounds(buttonX, buttonY, (frameSegment + 1) - 40, 80);
		this.add(button);
		/*
		 * JLabel label = new JLabel("da;hfo;UG;I"); label.setName(storeName);
		 * label.setBounds(buttonX + 250, buttonY, 50, 80);
		 * label.setOpaque(false); label.setVisible(true); this.add(label);
		 */
	}

	void brownieButton() {
		brownie = new JButton();
		brownie.addMouseListener(this);
		brownie.setBorderPainted(false);
		brownie.setOpaque(true);
		brownie.setBackground(new Color(125, 89, 54));
		brownie.setBounds(frameSegment - 125, 156, 250, 250);
		this.add(brownie);

	}

	public void paintComponent(Graphics g) {
		brwSrn.draw(g);
	}

	public void actionPerformed(ActionEvent e) {
		manager.update(brownieCounter);
		manager.update(productionCounter);
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

	public void mouseClicked(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}
}