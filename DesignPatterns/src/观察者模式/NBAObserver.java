/**
 * 
 */
package 观察者模式;

/**
 * @author CSH 2015-2-16下午5:55:20
 */
public class NBAObserver extends Observer {

	public NBAObserver(String name, ISubject sub) {
		super(name, sub);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 观察者模式.Observer#Update()
	 */
	@Override
	public void Update() {
		// TODO Auto-generated method stub
		System.out.println(sub.getState() + name + "关闭NBA直播，继续工作");
	}

}
