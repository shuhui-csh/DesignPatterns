/**
 * 
 */
package 抽象工厂模式;

/**
 * @author CSH 2015-2-17上午10:03:15
 */
public class SqlServerUser implements IUser {

	/*
	 * (non-Javadoc)
	 * 
	 * @see 抽象工厂模式.IUser#Insert(抽象工厂模式.User)
	 */
	@Override
	public void Insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("在sqlserver中给Usser表增加一条记录");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 抽象工厂模式.IUser#GetUser(int)
	 */
	@Override
	public User GetUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("在SQL Server中根据ID得到User表一条记录");
		return null;
	}

}
