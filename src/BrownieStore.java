public class BrownieStore {
	String name;
	float produceAmount; // per turn
	int produceRate; // how often till turn
	double producePrice;
	int producerAmount = 0;
	double produceMultiplyer = 1;
	int produceOutput = 0;

	BrownieStore(String name, float produceAmount, double producePrice) {
		this.name = name;
		this.produceAmount = produceAmount;
		this.producePrice = producePrice;

	}

	public double purchase() {
		return producePrice;
	}
}