public class BrownieStore {
	String name;
	float produceAmount; // per turn
	int produceRate; // how often till turn
	int producePrice;
	int producerAmount = 0;
	double produceMultiplyer = 1;
	int produceOutput = 0;

	BrownieStore(String name, int produceRate, float produceAmount, int producePrice) {
		this.name = name;
		this.produceRate = produceRate;
		this.produceAmount = produceAmount;
		this.producePrice = producePrice;

	}

	public int purchase() {
		return producePrice;
	}
}