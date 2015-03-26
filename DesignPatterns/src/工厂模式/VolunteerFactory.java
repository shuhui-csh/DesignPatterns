/**
 * 
 */
package 工厂模式;

/**
 * @author CSH 2015-2-14下午5:41:24 社区自愿者工厂
 */
public class VolunteerFactory implements IFactory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see 工厂模式.IFactory#CreatLeiFeng()
	 */
	@Override
	public LeiFeng CreatLeiFeng() {
		// TODO Auto-generated method stub
		return new Volunteer();
	}

}
