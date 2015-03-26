/**
 * 
 */
package 访问者模式;

/**
 * @author CSH 2015-2-20下午11:25:51
 */
public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectStructure o = new ObjectStructure();
		// 在对象结构中加入要对比的”男人“和”女人“
		o.attach(new Man());
		o.attach(new Woman());

		Success a1 = new Success();
		o.display(a1);

		Failing a2 = new Failing();
		o.display(a2);
	}
}
