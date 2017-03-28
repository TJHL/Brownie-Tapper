import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, MouseListener {
	Timer clock;
	//JFrame frame= new JFrame();
	//JPanel panel= new JPanel();
	JLabel counter = new JLabel("0 Brownies");
	BrownieScreen brwSrn;
	BrownieManager manager;
	ArrayList<BrownieStore> stores;
	Iterator<BrownieStore> brownieProductionIterator;
	
	GamePanel(){
	
		clock = new Timer(1000 / 60,(ActionListener) this);
		brwSrn = new BrownieScreen();
		manager = new BrownieManager();
		stores=manager.getStores();
		brownieProductionIterator=stores.iterator();
		while(brownieProductionIterator.hasNext()){
			addStoreButton();
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
	void addStoreButton(){
		JButton button= new JButton();
		button.setText(brownieProductionIterator.next().name);		
		button.setBorderPainted(false);
		button.setOpaque(true);
		button.setBackground(Color.GRAY);
		button.setBounds((BrownieTapperLauncher.WIDTH/3)*2+20, 220, BrownieTapperLauncher.WIDTH/3+1, 20);
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
			if(e.getX()>125&& e.getX()<375 && e.getY()>125&& e.getY()<375){
				manager.brownieClick();
			}
			if(e.getX()>((BrownieTapperLauncher.WIDTH/3)*2)+20 && e.getX()<BrownieTapperLauncher.WIDTH-20 && e.getY()>220&& e.getY()<300){
			manager.storePurchace();
			}
		}	
	}
	public void mouseClicked(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	
	
}