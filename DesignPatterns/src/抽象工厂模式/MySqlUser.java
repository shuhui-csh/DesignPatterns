/**
 * 
 */
package 抽象工厂模式;

/**
 * @author CSH 2015-2-17上午10:06:21 用于访问SQL Server的User
 */
public class MySqlUser implements IUser {

	/*
	 * (non-Javadoc)
	 * 
	 * @see 抽象工厂模式.IUser#Insert(抽象工厂模式.User)
	 */
	@Override
	public void Insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("在mysql中给user表增加一条记录");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 抽象工厂模式.IUser#GetUser(int)
	 */
	@Override
	public User GetUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("在mysql中根据id得到user表一条记录");
		return null;
	}

}
