import java.util.ArrayList;

public class Cash implements Payment{

	@Override
	public double totalPrice(ArrayList<Food> foods) {
		// TODO Auto-generated method stub
		double tp=0;
		for(Food f:foods) {
			tp+=f.getPrice();
		}
		tp+=(foods.size()*5);
		return tp;
	}

	@Override
	public double promote(ArrayList<Food> foods) {
		// TODO Auto-generated method stub
		int lob=0;
		for(Food s:foods) {
			if(s.getName().equals("lobster")) {
				lob++;
			}
			//if((s.toString().equals("lobster"))) {
				//return 50;
			//}
			//break;
		}
		if(lob>=3) {
			return 50;
		}
		else {
			return 0;
		}
	}

}
