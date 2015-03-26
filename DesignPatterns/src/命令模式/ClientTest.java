/**
 * 
 */
package 命令模式;

/**
 * @author CSH 2015-2-19下午5:31:23
 */
public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 开店前的准备
		Barbecuer boy = new Barbecuer();
		Command command1 = new BakeMuttonCommand(boy);
		Command command2 = new BakeMuttonCommand(boy);
		Command command3 = new BakeChickenWingCommand(boy);
		Waiter girl = new Waiter();

		// 开店营业，顾客点菜
		girl.setOrder(command3);
		girl.setOrder(command2);
		girl.setOrder(command1);
		girl.setOrder(command1);
		girl.setOrder(command1);

		girl.cancleOrder(command2);

		girl.notifyall();
	}

}
