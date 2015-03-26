/**
 * 
 */
package 策略模式;

/**
 * @author CSH 2015-2-13下午3:25:49
 */
public class CashNormal extends CashSuper {

	/*
	 * (non-Javadoc)
	 * 
	 * @see 策略模式.CashSuper#acceptCash(double)
	 */
	@Override
	public double acceptCash(double money) {
		// 正常收费，原价返回
		return money;
	}

}
