/**
 * 
 */
package 工厂模式;

/**
 * @author CSH 2015-2-14下午2:44:45
 */
public class Undergraduate extends LeiFeng {

	/**
	 * 
	 */
	public Undergraduate() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 工厂模式.LeiFeng#Sweep()
	 */
	@Override
	public void Sweep() {
		System.out.println("学雷锋的大学生：扫地");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 工厂模式.LeiFeng#Wash()
	 */
	@Override
	public void Wash() {
		System.out.println("学雷锋的大学生：洗衣");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 工厂模式.LeiFeng#BuySomething()
	 */
	@Override
	public void BuySomething() {
		System.out.println("学雷锋的大学生：买东西");
	}

}
