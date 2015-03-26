/**
 * 
 */
package 观察者模式;

/**
 * @author CSH 2015-2-16下午6:12:44
 */
public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ISubject secretary = new Secretary();
		// 看股票的同事
		Observer limiao = new StockObserver("李妙", secretary);
		// 看NBA的事
		Observer zhenyu = new NBAObserver("涂臻宇", secretary);
		secretary.Attach(limiao);
		secretary.Attach(zhenyu);
		secretary.setState("老板回来了 ");
		secretary.Notify();
	}
}
