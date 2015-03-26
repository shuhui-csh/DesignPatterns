package 适配器模式例子;

/**
 * @author CSH 2015-2-17下午11:08:57
 */
public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player b = new Forwards("巴蒂尔");
		Player m = new Guards("麦克格雷迪");
		Player ym = new Translator("姚明");
		m.Attack();
		b.Defense();
		ym.Attack();
		ym.Defense();
	}

}
