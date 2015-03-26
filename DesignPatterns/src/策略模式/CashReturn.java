/**
 * 
 */
package 策略模式;

/**
 * @author CSH 2015-2-13下午3:32:38
 */
public class CashReturn extends CashSuper {
	private double moneyCondition = 0.0;
	private double moneyReturn = 0.0;

	/**
	 * @param moneyCondition
	 *            满返的额度
	 * @param moneyReturn
	 *            返多少的额度
	 */
	public CashReturn(double moneyCondition, double moneyReturn) {
		super();
		this.moneyCondition = moneyCondition;
		this.moneyReturn = moneyReturn;
	}

	@Override
	public double acceptCash(double money) {
		double result = money;
		if (money > moneyCondition) {
			result = money - Math.floor(money / moneyCondition) * moneyReturn;
		}
		return result;
	}

}
