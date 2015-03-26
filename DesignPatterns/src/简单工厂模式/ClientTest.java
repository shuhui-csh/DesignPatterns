/**
 * 
 */
package 简单工厂模式;

/**
 * @author CSH 2015-2-13下午2:17:43
 */
public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation oper = OperationFactory.creatOperation("*");
		oper.setNumber_A(8);
		oper.setNumber_B(6);
		double result = oper.getResult();
		System.out.println(result);
	}

}
