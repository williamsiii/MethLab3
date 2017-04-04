package basic.lab;

public class CreditDiff extends Calculation {

	@Override
	float mCalcCreditValue(Customer customer, int iPeriod){
		float nTotalCredit;
		int iTotalPeriod = customer.piTotalPeriod;
		
		nTotalCredit = (float) customer.pnSummInCredit;
		return (float) ( (nTotalCredit*this.pnInterestRate) /( 1 - 1/Math.pow(1 + this.pnInterestRate, customer.piTotalPeriod)) );
	}
}
