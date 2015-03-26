/**
 * 
 */
package 中介者模式;

/**
 * @author CSH 2015-2-20下午1:31:04
 */
public class USA extends Country {

	/**
	 * @param unite
	 */
	public USA(UnitedNation unite) {
		super(unite);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 *            声明发送消息
	 */
	public void Send(String message) {
		unite.Declare(message, this);
	}

	public void getMessage(String message) {
		System.out.println("美国获得对方的消息： " + message);
	}
}
