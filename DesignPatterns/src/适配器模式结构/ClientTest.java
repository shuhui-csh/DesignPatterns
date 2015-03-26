/**
 * 
 */
package 适配器模式结构;

/**
 * @author CSH 2015-2-17下午10:29:15
 */
public class ClientTest {

	/**
	 * @param args
	 *            对客户端来说，调用的就是Target的Request()
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Target adapter = new Adapter();
		adapter.Request();
	}

}
