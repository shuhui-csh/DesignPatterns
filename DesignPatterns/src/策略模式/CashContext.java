/**
 * 
 */
package 策略模式;

/**
 * @author CSH 2015-2-13下午3:42:08
 */
public class CashContext {

	private CashSuper cs;

	/**
	 * @param type
	 *            表示收费类型 
	 *            将实例化具体策略的过程由客户端转移到context类中。简单工厂的应用
	 */
	public CashContext(String type) {
		switch (type) {
		case "正常收费":
			cs = new CashNormal();
			break;
		case "满300减100":
			cs = new CashReturn(300, 100);
			break;
		case "打8折":
			cs = new CashRebate(0.8);
			break;
		}
	}

	/**
	 * @param money
	 * @return
	 */
	public double getResult(double money) {
		return cs.acceptCash(money);
	}

}
