/**
 * 
 */
package 工厂模式;

/**
 * @author CSH 2015-2-14下午5:31:47
 */
public class Volunteer extends LeiFeng {

	/*
	 * (non-Javadoc)
	 * 
	 * @see 工厂模式.LeiFeng#Sweep()
	 */
	@Override
	public void Sweep() {
		System.out.println("自愿者：扫地");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 工厂模式.LeiFeng#Wash()
	 */
	@Override
	public void Wash() {
		System.out.println("自愿者：洗衣");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 工厂模式.LeiFeng#BuySomething()
	 */
	@Override
	public void BuySomething() {
		System.out.println("自愿者：买东西");
	}

}
