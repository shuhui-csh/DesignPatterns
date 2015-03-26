/**
 * 
 */
package 装饰模式;

/**
 * @author CSH 2015-2-14上午9:39:50
 * 具体实现装饰的服饰类(ConcreteDecorator)
 */
public class Shue extends Finery {

	/*
	 * (non-Javadoc)
	 * 
	 * @see 装饰模式.Finery#Show()
	 */
	@Override
	public void Show() {
		System.out.println("破球鞋");
		component.Show();
	}

}
