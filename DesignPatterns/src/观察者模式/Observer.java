/**
 * 
 */
package 观察者模式;

/**
 * @author CSH 2015-2-16下午5:37:56
 */
public abstract class Observer {
	protected String name;
	protected ISubject sub;

	/**
	 * @param name
	 * @param sub抽象的通知者接口对象
	 */
	public Observer(String name, ISubject sub) {
		this.name = name;
		this.sub = sub;
	}

	public abstract void Update();

}
