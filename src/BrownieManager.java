import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JLabel;

public class BrownieManager {
	int ClickMultiplier = 1;
	long BrownieNum = 0;
	double CounterDisplay = 0;
	BrownieStore store;
	BrownieStore store2;
	
	ArrayList<BrownieStore> brownieProduction = new ArrayList<BrownieStore>();
	
	BrownieManager(){
		store= new BrownieStore("Desert Shop",0,1,10);
		store2 = new BrownieStore("Hi",0,20,20);
		brownieProduction.add(store);
		
	}
	ArrayList<BrownieStore> getStores(){
	return brownieProduction;	
	}

	void update(JLabel counter) {
		
		setCounter(counter);
		produce1();
		storePurchace();
	}
	
	void devAutoPurchase(){
		
	}
	
	void devAddBrownies(){
		
	}

	void brownieClick() {

		BrownieNum = BrownieNum + (1 * ClickMultiplier);

	}

	

	void storePurchace() {
		if(BrownieNum>=10){
		store.producerAmount=store.producerAmount+1;
		BrownieNum=BrownieNum -store.producePrice;
		
	}
		}

	void produce1() {
		if(store.producerAmount >= 1){
			
			store.produceRate=store.produceRate+1;
		
			if(store.produceRate>=600){
		
				store.produceRate=0;
				store.produceOutput = ((store.produce * store.produceMultiplyer)*store.producerAmount);
				BrownieNum = BrownieNum + store.produceOutput;
			}
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