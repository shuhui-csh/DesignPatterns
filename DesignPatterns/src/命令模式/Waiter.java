/**
 * 
 */
package 命令模式;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.print.attribute.standard.DateTimeAtCompleted;

/**
 * @author CSH 2015-2-19下午5:17:52服务员类
 */
public class Waiter {
	private List<Command> orders = new ArrayList<Command>();

	/**
	 * @param command订单
	 *            设置订单
	 */
	public void setOrder(Command command) {
		if (command.toString().startsWith("命令模式.BakeChickenWingCommand")) {
			System.out.println("服务员：鸡翅没有了，请点别的烧烤。");
		} else {
			orders.add(command);
			System.out.println("增加订单：" + command.toString() + "时间：");
		}
	}

	/**
	 * @param command订单
	 *            取消订单
	 */
	public void cancleOrder(Command command) {
		orders.remove(command);
		System.out.println("取消订单：" + command.toString() + "时间：");
	}

	public void notifyall() {
		for (Command c : orders) {
			c.ExcuteCommand();
		}
	}
}
