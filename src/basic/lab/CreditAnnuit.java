package basic.lab;

public class CreditAnnuit extends Calculation {

	@Override
	float mCalcCreditValue(Customer customer, int iPeriod){
		float nTotalCredit;
		int iTotalPeriod = customer.piTotalPeriod;
		
		nTotalCredit = (float) customer.pnSummInCredit;
		return (float) ( (nTotalCredit/iTotalPeriod) + nTotalCredit*(iTotalPeriod-iPeriod+1)*this.pnInterestRate/iTotalPeriod);
	}
	
}
