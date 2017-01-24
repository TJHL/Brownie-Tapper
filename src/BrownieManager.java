import javax.swing.JLabel;

public class BrownieManager {
	int ClickMultiplier=1 ;
	int BrownieNum=0;
	
	void update(){
		
	}
		void BrownieClick(JLabel label){
			BrownieNum=BrownieNum+(1*ClickMultiplier);
			System.out.println(BrownieNum);
			label.setText(""+BrownieNum);
			
		}
	
			void BrownieProduce(){
		
			}
		
}