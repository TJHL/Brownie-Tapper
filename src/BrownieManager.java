import java.util.ArrayList;

import javax.swing.JLabel;

public class BrownieManager {
	int ClickMultiplier = 1;
	long brownieNum = 0;
	double CounterDisplay = 0;
	BrownieStore store;
	BrownieStore store2;
	BrownieStore store3;
	BrownieStore store4;
	BrownieStore store5;
	BrownieStore store6;
	BrownieStore store7;

	ArrayList<BrownieStore> brownieProduction = new ArrayList<BrownieStore>();

	BrownieManager() {
		store = new BrownieStore("Baking Club", 0, 1, 10);
		store2 = new BrownieStore("Desert Shop", 0, 1, 100);
		store3 = new BrownieStore("Store 3", 0, 15, 1000);
		store4 = new BrownieStore("Store 4", 0, 50, 10000);
		store5 = new BrownieStore("Store 5", 0, 200, 1000000);
		store6 = new BrownieStore("Store 6", 0, 5000, 1000000000);
		store7 = new BrownieStore("Store 7", 0, 900000, 225000000);
		brownieProduction.add(store);
		brownieProduction.add(store2);
		brownieProduction.add(store3);
		brownieProduction.add(store4);
		brownieProduction.add(store5);
		brownieProduction.add(store6);
		brownieProduction.add(store7);

	}

	ArrayList<BrownieStore> getStores() {
		return brownieProduction;
	}

	void update(JLabel counter) {

		setCounter(counter);
		produce();
		devAddBrownies();

	}

	void devAutoPurchase() {
	}

	void devAddBrownies() {
		// brownieNum = brownieNum + 1;
	}

	void brownieClick() {

		brownieNum = brownieNum + (1 * ClickMultiplier);

	}

	public BrownieStore getStore(String storeName) {
		for (int i = 0; i < brownieProduction.size() - 1; i++) {
			if (brownieProduction.get(i).name.equals(storeName)) {

				return brownieProduction.get(i);

			}
		}

		return null;
	}

	void storePurchace(String storeName) {
		BrownieStore store = getStore(storeName);
		if (store != null) {
			if (brownieNum >= store.producePrice) {
				store.producerAmount = store.producerAmount + 1;
				brownieNum = brownieNum - store.producePrice;
			}
		}
	}

	void produce() {
		if (store.producerAmount >= 1) {

			store.produceRate = store.produceRate + 1;

			if (store.produceRate >= 600) {
				// store.produceAmount/60 ;

				store.produceRate = 0;
				store.produceOutput = ((store.produceAmount * store.produceMultiplyer) * store.producerAmount);
				brownieNum = brownieNum + store.produceOutput;
			}
		}
	}

	void setCounter(JLabel counter) {

		if (brownieNum <= 999) {
			if (brownieNum >= 2 || brownieNum == 0) {

				counter.setText("" + brownieNum + " Brownies");

			}
			if (brownieNum == 1) {
				counter.setText("" + brownieNum + " Brownie");
			}
		}

		if (brownieNum >= 1000 && brownieNum <= 999999) {
			CounterDisplay = brownieNum;
			CounterDisplay = CounterDisplay / 1000;
			counter.setText("" + CounterDisplay + " Thousand Brownies");

		}

		if (brownieNum >= 1000000) {
			CounterDisplay = brownieNum;
			CounterDisplay = CounterDisplay / 1000000;
			counter.setText("" + CounterDisplay + " Million Brownies");
		}
	}
}