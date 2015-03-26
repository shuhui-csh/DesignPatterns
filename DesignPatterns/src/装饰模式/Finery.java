/**
 * 
 */
package 装饰模式;

/**
 * @author CSH 2015-2-14上午9:22:20 服饰类(Decorator)
 */
public class Finery extends Person {
	protected Person component;

	/**
	 * 
	 */
	public Finery() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param component
	 *            一个父类对象 打扮功能
	 */
	public void Decorate(Person component) {
		this.component = component;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 装饰模式.Person#Show()
	 */
	@Override
	public void Show() {
		if (component != null) {
			component.Show();
		}
	}

}
