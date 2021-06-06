package abstractionDemo;

public class DomesticPlan extends ElectricityPlan{

	@Override
	public void getRate(int units) {
		if(units<100)
		rate=1;	
		else
	   rate=2;	
	}

}
