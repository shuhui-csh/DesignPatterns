/**
 * 
 */
package 策略模式;

/**
 * @author CSH 2015-2-13下午3:27:26
 */
public class CashRebate extends CashSuper {
	private double priceRebate = 1.0;

	/**
	 * @param priceRebate
	 *            折扣率
	 */
	public CashRebate(double priceRebate) {
		super();
		this.priceRebate = priceRebate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 策略模式.CashSuper#acceptCash(double)
	 */
	@Override
	public double acceptCash(double money) {
		// 返回打折后的当前总价格
		return money * priceRebate;
	}

}
