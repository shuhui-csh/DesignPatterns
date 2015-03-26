/**
 * 
 */
package 桥接模式;

/**
 * @author CSH 2015-2-19下午2:46:18
 */
public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandsetBrand hw;
		HandsetBrand xm;
		hw = new HandsetBrandM();
		// setHandsetSoft()是父类才有的方法
		hw.setHandsetSoft(new HandsetGame());
		hw.Run();

		hw.setHandsetSoft(new HandsetAddressList());
		hw.Run();

		xm = new HandsetBrandN();
		// setHandsetSoft()是父类才有的方法
		xm.setHandsetSoft(new HandsetGame());
		xm.Run();

		xm.setHandsetSoft(new HandsetAddressList());
		xm.Run();

	}

}
