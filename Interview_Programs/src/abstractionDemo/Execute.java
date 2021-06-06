package abstractionDemo;

public class Execute {

	public static void main(String[] args) {
		
		Commercial cebill=new Commercial();
		cebill.getRate(100);
		cebill.calculate(100);
	    DomesticPlan debill=new DomesticPlan();
	    debill.getRate(100);
		debill.calculate(100);
		
		//for Abstract class not able to create object why?
		//ElectricityPlan ep=new ElectricityPlan();
	}

}
