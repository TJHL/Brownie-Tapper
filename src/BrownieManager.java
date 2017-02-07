import javax.swing.JLabel;

public class BrownieManager {
	int ClickMultiplier = 1;
	int BrownieNum = 0;

	void update(JLabel counter) {
		brownieProduce();
		setCounter(counter);
	}


		void brownieClick() {
			
		BrownieNum = BrownieNum + (1 * ClickMultiplier);
		

	}

	void brownieProduce() {
	
	}

	void Purchace() {

	}

	void setCounter(JLabel counter) {
	
		if (BrownieNum >= 2 || BrownieNum == 0) {

			counter.setText("" + BrownieNum + " Brownies");
			
		}
		if(BrownieNum ==1){
			counter.setText("" + BrownieNum + " Brownie");
		}

	}

}