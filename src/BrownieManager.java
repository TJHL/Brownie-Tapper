import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JLabel;

public class BrownieManager {
	int ClickMultiplier = 1;
	double brownieNum = 90;
	double CounterDisplay = 0;
	BrownieStore store;
	BrownieStore store2;
	BrownieStore store3;
	BrownieStore store4;
	BrownieStore store5;
	BrownieStore store6;
	BrownieStore store7;
	BrownieStore store8;
	BrownieStore store9;

	float browniesPerSecond;
	float browniesPerTick;

	GamePanel panel;
	ArrayList<BrownieStore> brownieProduction = new ArrayList<BrownieStore>();

	BrownieManager() {
		store = new BrownieStore("Baking Club", (float) .1, 10);
		store2 = new BrownieStore("Desert Shop", 1, 100);
		store3 = new BrownieStore("Farm", 15, 1000);
		store4 = new BrownieStore("Factory", 50, 10000);
		store5 = new BrownieStore("Baking Cult", 200, 500000);
		store6 = new BrownieStore("Planet", 5000, 5000000);
		store7 = new BrownieStore("World Monopoly", 10000, 25000000);
		store8 = new BrownieStore("Science Beam", 1000000, 500000000);
		store9 = new BrownieStore("Universal Monopoly", 0, 2147483647);
		brownieProduction.add(store);
		brownieProduction.add(store2);
		brownieProduction.add(store3);
		brownieProduction.add(store4);
		brownieProduction.add(store5);
		brownieProduction.add(store6);
		brownieProduction.add(store7);
		brownieProduction.add(store8);
		brownieProduction.add(store9);

	}

	ArrayList<BrownieStore> getStores() {
		return brownieProduction;
	}

	void update(JLabel counter) {

		setCounter(counter);

		if (store9.producerAmount < 1) {
			produce2();
		}

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

	void produce2() {

		browniesPerSecond = (store.produceAmount * store.producerAmount)
				+ (store2.produceAmount * store2.producerAmount) + (store3.produceAmount * store3.producerAmount)
				+ (store4.produceAmount * store4.producerAmount) + (store5.produceAmount * store5.producerAmount)
				+ (store6.produceAmount * store6.producerAmount) + (store7.produceAmount * store7.producerAmount)
				+ (store8.produceAmount * store8.producerAmount);

		browniesPerTick = browniesPerSecond / 15;

		brownieNum = (float) brownieNum + browniesPerTick;

	}

	void setProducingCounter(JLabel label) {
		// String hi = shortString(Double.toString(browniesPerSecond), 2);
		DecimalFormat brownieFormat= new DecimalFormat(".0");
		label.setText("Brownies Per Second " + brownieFormat.format(browniesPerSecond));
	}

	private String shortString(String longString, int deciPlace) {
		String shortString = "";
		int stop = longString.length();
		int point = longString.indexOf('.');
		for (int i = 0; i < stop; i++) {
			if (point >= 0 && i > point + deciPlace) {
				break;
			}
			shortString = shortString + longString.charAt(i);
		}

		// System.out.println(longString);
		// System.out.println(shortString);
		return shortString;
	}

	void setCounter(JLabel counter) {
		CounterDisplay = brownieNum;
		String counterMessage = "";
		String hi = shortString(Double.toString(CounterDisplay), 0);

		if (brownieNum <= 999) {
			if (brownieNum >= 2 || brownieNum == 0) {

				counterMessage = counterMessage + hi + " Brownies";

			} else if (brownieNum == 1) {

				counterMessage = counterMessage + hi + " Brownie";
			}
		}

		else if (brownieNum >= 1000 && brownieNum <= 999999) {

			CounterDisplay = CounterDisplay / 1000;
			hi = shortString(Double.toString(CounterDisplay), 3);
			counterMessage = counterMessage + hi + " Thousand Brownies";

		}

		else if (brownieNum >= 1000000) {
			CounterDisplay = brownieNum;
			CounterDisplay = CounterDisplay / 1000000;
			hi = shortString(Double.toString(CounterDisplay), 2);
			counterMessage = counterMessage + hi + " Million Brownies";
		}

		else if (brownieNum >= 1000000000) {
			CounterDisplay = brownieNum;
			CounterDisplay = CounterDisplay / 1000000000;
			hi = shortString(Double.toString(CounterDisplay), 2);
			counterMessage = counterMessage + hi + " Billion Brownies";
		}

		else if (brownieNum >= 1000000000) {
			CounterDisplay = brownieNum;
			CounterDisplay = CounterDisplay / 1000000000;
			hi = shortString(Double.toString(CounterDisplay), 4);
			counterMessage = counterMessage + hi + " Trillion Brownies";
		}
		counter.setText(counterMessage);
	}
}