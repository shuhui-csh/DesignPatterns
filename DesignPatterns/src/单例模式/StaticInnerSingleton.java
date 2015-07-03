/**
 * 
 */
package 单例模式;

/**
 * @author CSH 2015-7-3下午10:29:12java机制规定，内部类StaticInnerClass只有在getInstance()
 *         方法第一次调用的时候才会被加载（实现了lazy）， 而且其加载过程是线程安全的（实现线程安全）。
 *         内部类加载的时候实例化一次instance。
 */
public class StaticInnerSingleton {

	/**
	 * 私有化默认的构造方法
	 */
	private StaticInnerSingleton() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @author CSH 2015-7-3下午10:35:31 静态内部类，当需要的时候才会加载，并且只是加载一次
	 */
	private static class StaticInnerClass {
		private static final StaticInnerSingleton instance = new StaticInnerSingleton();
	}

	public static StaticInnerSingleton getInstance() {
		return StaticInnerClass.instance;

	}

}
