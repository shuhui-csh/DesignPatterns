package 代理模式;
/**
 * @author CSH 2015-2-14下午1:35:14
 */
public class ClientTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SchoolGirl mm = new SchoolGirl();
		mm.setName("男生、女生");
		Proxy EMS = new Proxy(mm);
		EMS.GiveCongratution();
	}
}
