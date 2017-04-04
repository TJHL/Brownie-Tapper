import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JLabel;

public class BrownieManager {
	int ClickMultiplier = 1;
	long BrownieNum = 0;
	double CounterDisplay = 0;
	BrownieStore store;
	BrownieStore store2;
	BrownieStore store3;
	BrownieStore store4;
	BrownieStore store5;
	BrownieStore store6;
	BrownieStore store7;
	
	ArrayList<BrownieStore> brownieProduction = new ArrayList<BrownieStore>();
	
	BrownieManager(){
		store= new BrownieStore("Baking Club",0,1,10);
		store2 = new BrownieStore("Desert Shop",0,1,100);
		store3 = new BrownieStore("Store 3",0,15,1000);
		store4 = new BrownieStore("Store 4",0,50,10000);
		store5 = new BrownieStore("Store 5",0,200,1000000);
		store6 = new BrownieStore("Store 6",0,5000,1000000000);
		store7 = new BrownieStore("Store 7",0,900000,0);
		brownieProduction.add(store);
		brownieProduction.add(store2);
		brownieProduction.add(store3);
		brownieProduction.add(store4);
		brownieProduction.add(store5);
		brownieProduction.add(store6);
		brownieProduction.add(store7);
		
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