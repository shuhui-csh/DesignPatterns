/**
 * 
 */
package 外观模式;

/**
 * @author CSH 2015-2-15下午4:15:50 客户端调用
 */
public class ClientTest {

	/**
	 * @param args
	 *            由于Facade的作用，客户端可以根本不值四个子系统的存在
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facade facade = new Facade();
		facade.MethodA();
		facade.MethodB();
	}

}
