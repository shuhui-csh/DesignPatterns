/**
 * 
 */
package 装饰模式;

/**
 * @author CSH 2015-2-14上午9:35:17 具体实现的装饰的服饰类(ConcreteDecorator)
 */
public class BigTrouser extends Finery {

	/*
	 * (non-Javadoc)
	 * 
	 * @see 装饰模式.Finery#Show()
	 */
	@Override
	public void Show() {
		System.out.println("垮裤");
		component.Show();
	}
}
