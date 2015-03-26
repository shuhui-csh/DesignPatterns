/**
 * 
 */
package 策略模式;

/**
 * @author CSH 2015-2-13下午3:20:29 现金收取的超类，策略类，定义所有支持的算法的抽象方法acceptCash
 */
public abstract class CashSuper {
	/**
	 * @param price
	 *            商品的总原价
	 * @return 当前总价格
	 */
	public abstract double acceptCash(double money);
}
