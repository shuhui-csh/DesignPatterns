/**
 * 
 */
package 简单工厂模式;

/**
 * @author CSH 2015-2-13下午1:47:27
 */
public class Operation {
	private double number_A = 0;
	private double number_B = 0;

	/**
	 * @return the number_A
	 */
	public double getNumber_A() {
		return number_A;
	}

	/**
	 * @param number_A
	 *            the number_A to set
	 */
	public void setNumber_A(double number_A) {
		this.number_A = number_A;
	}

	/**
	 * @return the number_B
	 */
	public double getNumber_B() {
		return number_B;
	}

	/**
	 * @param number_B
	 *            the number_B to set
	 */
	public void setNumber_B(double number_B) {
		this.number_B = number_B;
	}

	/**
	 * @return
	 */
	public double getResult() {
		double result = 0;
		return result;

	}
}
