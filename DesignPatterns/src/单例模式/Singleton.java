/**
 * 
 */
package 单例模式;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Single;

/**
 * @author CSH 2015-2-19下午12:20:21
 */
public class Singleton {
	private static Singleton instance;

	/**
	 * 本来public的无参数构造方法，现在显式地让其private，这就堵死了外界利用new创建此类实例的可能
	 */
	private Singleton() {
		super();
	}

	public static Singleton getInstance() {
		if (instance == null) {
			// synchronized(对象)同步语句，防止多线程下的不同步问题导致再实例化
			synchronized (Singleton.class) {
				// 再判断一次，防止同时有两个线程进入了第一重判断，一个线程完成实例化走了之后，第二个线程再实例化，这叫双重判定锁定
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
