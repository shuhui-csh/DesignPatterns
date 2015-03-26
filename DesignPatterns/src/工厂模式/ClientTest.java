/**
 * 
 */
package 工厂模式;

/**
 * @author CSH 2015-2-14下午5:42:44
 */
public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UndergraduateFactory factory = new UndergraduateFactory();
		LeiFeng student = factory.CreatLeiFeng();
		student.BuySomething();
		student.Sweep();
		student.Wash();
	}

}
