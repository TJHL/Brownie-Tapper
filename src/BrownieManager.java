import javax.swing.JLabel;

public class BrownieManager {
	int ClickMultiplier=1 ;
	int BrownieNum=0;
	
	void update(){
		brownieProduce();
	}
		void brownieClick(JLabel label){
			BrownieNum=BrownieNum+(1*ClickMultiplier);
			System.out.println(BrownieNum);
			label.setText(""+BrownieNum+" Brownies");
			
		}
	
			void brownieProduce(){
				BrownieNum=BrownieNum+10;
				//label.setText(""+BrownieNum);
			}
			void Purchace(){
				
			}
			void setCounter(JLabel label){
				if(BrownieNum>= 2 && BrownieNum==0 ){
					
					label.setText(""+BrownieNum+" Brownies");
				}
				else{
					label.setText(""+BrownieNum+" Brownie");
				}
				
			}
		
}