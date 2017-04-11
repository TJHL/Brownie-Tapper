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
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, MouseListener {
	Timer clock;
	JLabel counter = new JLabel("0 Brownies");
	BrownieScreen brwSrn;
	BrownieManager manager;
	ArrayList<BrownieStore> stores;
	Iterator<BrownieStore> brownieProductionIterator;
	int buttonX=(BrownieTapperLauncher.WIDTH/3)*2+20;
	int buttonY=220;
	Font shop= new Font("Arial", Font.PLAIN,24);
	
	GamePanel(){
	
		clock = new Timer(1000 / 60,(ActionListener) this);
		brwSrn = new BrownieScreen();
		manager = new BrownieManager();
		stores=manager.getStores();
		brownieProductionIterator=stores.iterator();
		while(brownieProductionIterator.hasNext()){
			addStoreButton(buttonX, buttonY);
			buttonY+=100;
		}
		setLayout(null);
		BrownieTapperLauncher.frame.add(this);
		BrownieTapperLauncher.frame.setVisible(true);
		counter.setBounds(500, 50, 200, 50);
		add(counter);
		addMouseListener(this);
		brwSrn.store=manager.store;
		
	}

	void startGame() {
		clock.start();

	}

	void addStoreButton(int buttonX, int buttonY){
		String storeName=brownieProductionIterator.next().name;
		JButton button= new JButton();
		button.setFont(shop);
		
		button.addMouseListener(this);
		button.setText(storeName);	
		button.setName(storeName);
		button.setBorderPainted(false);
		button.setOpaque(true);
		button.setBackground(Color.GRAY);
		button.setBounds(buttonX, buttonY, (BrownieTapperLauncher.WIDTH/3+1)-40, 80);
		this.add(button);
		
		
	}
	public void paintComponent(Graphics g) {
		brwSrn.draw(g);
	}

	public void actionPerformed(ActionEvent e) {
		repaint();
		manager.update(counter);
		
	}
	
	public void mouseReleased(MouseEvent e) {
		if(e.getButton()==MouseEvent.BUTTON1){
		manager.storePurchace(e.getComponent().getName());
		
		}	
	}
	public void mouseClicked(MouseEvent e) {}public void mousePressed(MouseEvent e) {}public void mouseEntered(MouseEvent e) {}public void
	mouseExited(MouseEvent e) {}
}