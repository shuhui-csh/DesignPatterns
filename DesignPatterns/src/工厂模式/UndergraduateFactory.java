/**
 * 
 */
package 工厂模式;

/**
 * @author CSH 2015-2-14下午5:37:50 学雷锋的大学生工厂
 */
public class UndergraduateFactory implements IFactory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see 工厂模式.IFactory#CreatLeiFeng()
	 */
	@Override
	public LeiFeng CreatLeiFeng() {
		// TODO Auto-generated method stub
		return new Undergraduate();
	}

}
