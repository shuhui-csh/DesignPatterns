/**
 * 
 */
package 抽象工厂模式;

/**
 * @author CSH 2015-2-17上午10:17:12实现IFactory接口，实例化MySQLUser
 */
public class MySqlFactory implements IFactory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see 抽象工厂模式.IFactory#CreateUser()
	 */
	@Override
	public IUser CreateUser() {
		// TODO Auto-generated method stub
		return new MySqlUser();
	}

	/* (non-Javadoc)
	 * @see 抽象工厂模式.IFactory#CreatDepartment()
	 */
	@Override
	public IDepartment CreatDepartment() {
		// TODO Auto-generated method stub
		return new MySqlDepartment();
	}

}
