import javax.swing.JFrame;

public class BrownieStore {
	String name;
	int produce; 			//per turn
	int produceRate;		//how often till turn
	int producePrice;
	int producerAmount=0;
	int produceMultiplyer=1;
	int produceOutput=0;

	
	BrownieStore(String name, int produceRate,int produce,int producePrice){
	this.name= name;
	this.produceRate=produceRate;
	this.produce=produce;
	this.producePrice=producePrice;
	
		
	}
}