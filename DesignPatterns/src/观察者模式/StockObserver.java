/**
 * 
 */
package 观察者模式;

/**
 * @author CSH 2015-2-16下午5:48:18具体观察者
 */
public class StockObserver extends Observer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see 观察者模式.Observer#Update()
	 */
	@Override
	public void Update() {
		System.out.println(sub.getState() + "  " + name + "  "
				+ "关闭股票行情，继续工作");

	}

	/**
	 * @param name观察者姓名
	 * @param sub
	 */
	public StockObserver(String name, ISubject sub) {
		super(name, sub);
	}

}
