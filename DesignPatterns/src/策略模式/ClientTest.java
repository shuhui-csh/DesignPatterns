/**
 * 
 */
package 策略模式;

/**
 * @author CSH 2015-2-13下午3:55:26
 */
public class ClientTest {
	private static double total = 0.0;
	private static double totalPrice = 0.0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CashContext csuper = new CashContext("满300减100");
		double price = 50;
		double num = 8;
		totalPrice = csuper.getResult(price * num);
		System.out.println(totalPrice);
	}

}
