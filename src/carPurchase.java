
public class carPurchase {
	
	private double carCost;
	private double downPayment;
	private double lengthOfLoans;
	private double interestRate;
	
	public carPurchase(double cc, double dp, double ll, double ir) {
		carCost = cc;
		downPayment = dp;
		lengthOfLoans = ll;
		interestRate = ir;
	}
	
	public double calculatePayment() {
		double principal = getCarCost()-getDownPayment();
		double carPayment = (getInterestRate()/12.0 * principal)/(1.0-Math.pow((1.0+getInterestRate()/12.0), (-1.0*getLengthOfLoans())));
		return carPayment;
	}
	
	public double totalInterest() {
		double totalInterest = calculatePayment() * getLengthOfLoans() - (getCarCost()-getDownPayment());
		return totalInterest;
	}

	public double getCarCost() {
		return carCost;
	}

	public void setCarCost(double carCost) {
		this.carCost = carCost;
	}

	public double getDownPayment() {
		return downPayment;
	}

	public void setDownPayment(double downPayment) {
		this.downPayment = downPayment;
	}

	public double getLengthOfLoans() {
		return lengthOfLoans;
	}

	public void setLengthOfLoans(double lengthOfLoans) {
		this.lengthOfLoans = lengthOfLoans;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	

}
