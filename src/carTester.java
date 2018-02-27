
public class carTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		carPurchase tester = new carPurchase(35000, 0, 60, 0.10);
		System.out.println(tester.calculatePayment());
		System.out.println(tester.totalInterest());
	}

}
