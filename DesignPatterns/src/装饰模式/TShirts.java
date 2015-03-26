/**
 * 
 */
package 装饰模式;

/**
 * @author CSH 2015-2-14上午9:32:40
 */
public class TShirts extends Finery {

	/*
	 * (non-Javadoc)
	 * 
	 * @see 装饰模式.Finery#Show()
	 */
	@Override
	public void Show() {
		System.out.println("大T恤");
		component.Show();
	}

}
