import javax.swing.JLabel;

public class BrownieManager {
	int ClickMultiplier = 1;
	long BrownieNum = 0;
	double CounterDisplay = 0;
	int Produce1;
	int Produce2;
	int Produce3;
	int Produce4;
	int Produce5;
	int Produce6;
	int Produce7;

	void update(JLabel counter) {
		brownieProduce();
		setCounter(counter);
	}

	void brownieClick() {

		BrownieNum = BrownieNum + (1 * ClickMultiplier);

	}

	void brownieProduce() {
		BrownieNum = BrownieNum + Produce1 + Produce2 + Produce3 + Produce4 + Produce5 + Produce6 + Produce7;
	}

	void Purchace() {

	}

	void setCounter(JLabel counter) {

		if (BrownieNum <= 999) {
			if (BrownieNum >= 2 || BrownieNum == 0) {

				counter.setText("" + BrownieNum + " Brownies");

			}
			if (BrownieNum == 1) {
				counter.setText("" + BrownieNum + " Brownie");
			}
		}
			
			if (BrownieNum >= 1000 && BrownieNum<=999999) {
				CounterDisplay=BrownieNum;
				CounterDisplay = CounterDisplay / 1000;
				counter.setText("" + CounterDisplay + " Thousand Brownies");

			}
			
			if (BrownieNum >= 1000000) {
				CounterDisplay=BrownieNum;
				CounterDisplay = CounterDisplay / 1000000;
				counter.setText("" + CounterDisplay + " Million Brownies");

			}
		
	}

}