package basic.lab;

public class Run {
	
	
	public static void main(String [ ] args)
	{
		double ret;
		
		Calculation creditAnnuit = new CreditAnnuit();
		Calculation creditDiff   = new CreditDiff();
		Customer customer = new Customer();
		
		customer.pnSummInCredit = 1000;
		customer.psName = "Ivan";
		
		boolean diff = true;
		
		if (diff){
			for (int iPeriod=0;iPeriod<customer.piTotalPeriod;iPeriod++){
				creditDiff.mCalcCreditValue(customer, iPeriod);
			}
		} else {
			creditAnnuit.mCalcCreditValue(customer, 0);
		}
	}
}
