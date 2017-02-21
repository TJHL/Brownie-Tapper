import javax.swing.JLabel;

public class BrownieManager {
	int ClickMultiplier = 1;
	long BrownieNum = 0;
	double CounterDisplay = 0;
	
	int Produce1=1;
	int Produce2;
	int Produce3;
	int Produce4;
	int Produce5;
	int Produce6;
	int Produce7;
	
	int ProduceRate1;
	
	int ProducePrice1;
	int ProducePrice2;
	int ProducePrice3;
	int ProducePrice4;
	int ProducePrice5;
	int ProducePrice6;
	int ProducePrice7;
	
	int ProducerAmount1;
	int ProducerAmount2;
	int ProducerAmount3;
	int ProducerAmount4;
	int ProducerAmount5;
	int ProducerAmount6;
	int ProducerAmount7;

	int ProduceMultiplyer1 = 1;
	int ProduceMultiplyer2 = 1;
	int ProduceMultiplyer3 = 1;
	int ProduceMultiplyer4 = 1;
	int ProduceMultiplyer5 = 1;
	int ProduceMultiplyer6 = 1;
	int ProduceMultiplyer7 = 1;

	int ProduceOutput1;
	int ProduceOutput2;
	int ProduceOutput3;
	int ProduceOutput4;
	int ProduceOutput5;
	int ProduceOutput6;
	int ProduceOutput7;

	void update(JLabel counter) {
		brownieProduce();
		setCounter(counter);
		produce1();
	}

	void brownieClick() {

		BrownieNum = BrownieNum + (1 * ClickMultiplier);

	}

	void brownieProduce() {
		BrownieNum = BrownieNum + ProduceOutput1 + ProduceOutput2 + ProduceOutput3 + ProduceOutput4 + ProduceOutput5
				+ ProduceOutput6 + ProduceOutput7 ;
	}

	void Purchace() {
		if(BrownieNum>=10){
		ProducerAmount1=ProducerAmount1+1;
		BrownieNum=BrownieNum -10;
		
	}
		}

	void produce1() {
		System.out.println(ProduceRate1);
		ProduceRate1=ProduceRate1+1;
		if(ProduceRate1>=600){
		ProduceRate1=0;
		ProduceOutput1 = ((Produce1 * ProduceMultiplyer1)*ProducerAmount1);
		}
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

		if (BrownieNum >= 1000 && BrownieNum <= 999999) {
			CounterDisplay = BrownieNum;
			CounterDisplay = CounterDisplay / 1000;
			counter.setText("" + CounterDisplay + " Thousand Brownies");

		}

		if (BrownieNum >= 1000000) {
			CounterDisplay = BrownieNum;
			CounterDisplay = CounterDisplay / 1000000;
			counter.setText("" + CounterDisplay + " Million Brownies");

		}

	}

}