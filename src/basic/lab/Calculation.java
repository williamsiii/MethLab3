package basic.lab;

public abstract class Calculation {

	public double pnInterestRate = 0.17;
	
	float mCalcCreditValue(Customer customer, int iPeriod){
		return (float) 0;
	}
	

	public float mCalculateWithPeriod(Customer customer, int iPeriod) {
		return this.mCalcCreditValue(customer, iPeriod);
	}


}