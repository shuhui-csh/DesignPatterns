/**
 * 
 */
package 建造者模式;

/**
 * @author CSH 2015-2-16下午2:24:50 客户端代码，客户不需知道具体的构造过程
 */
public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Director director = new Director();
		ConcreteBuilder1 b1 = new ConcreteBuilder1();
		ConcreteBuilder2 b2 = new ConcreteBuilder2();
		// 指挥者用concretebuilder1的方法来建造产品
		director.Construct(b1);
		Product p1 = b1.getResult();
		p1.Show();

		director.Construct(b2);
		Product p2 = b1.getResult();
		p2.Show();
	}

}
