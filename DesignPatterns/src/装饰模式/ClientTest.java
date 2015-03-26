/**
 * 
 */
package 装饰模式;

/**
 * @author CSH 2015-2-14上午9:41:48
 */
public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("张帅");
		System.out.println("第一种装扮");
		BigTrouser big = new BigTrouser();
		Shue shue = new Shue();
		TShirts tshirts = new TShirts();
		// 装扮过程
		big.Decorate(p);
		shue.Decorate(big);
		tshirts.Decorate(shue);
		tshirts.Show();
	}

}
