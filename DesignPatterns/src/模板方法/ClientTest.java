/**
 * 
 */
package 模板方法;

/**
 * @author CSH 2015-2-15下午3:02:56
 */
public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass c;
		c = new ConcreteClassA();
		c.TemplateMethod();
		c = new ConcreteClassB();
		c.TemplateMethod();
	}

}
