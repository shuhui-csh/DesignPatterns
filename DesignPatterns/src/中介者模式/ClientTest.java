/**
 * 
 */
package 中介者模式;

/**
 * @author CSH 2015-2-20下午1:43:05
 */
public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnitedNationsSecurityCouncil unsc = new UnitedNationsSecurityCouncil();

		USA c1 = new USA(unsc);
		Iraq c2 = new Iraq(unsc);

		unsc.setIraq(c2);
		unsc.setUsa(c1);

		c1.Send("不准研制核武器，否则要发动战争！！");
		c2.Send("我们没有核武器，也不怕侵略");
	}
}
