/**
 * 
 */
package 抽象工厂模式;

/**
 * @author CSH 2015-2-17上午10:19:39
 */
public class ClientTest {

	/**
	 * @param args
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws ClassNotFoundException,
			InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		User user = new User();
		Department department = new Department();
		
		//抽象工厂模式
		// IFactory factory = new SqlServerFactory();
		// IFactory factory = new MySqlFactory();
		// IUser iuser = factory.CreateUser();
		// IDepartment idep = factory.CreatDepartment();

		//利用简单工厂模式改造抽象工厂模式
		// IUser iuser = DataAccess.CreateUser();
		// IDepartment idep = DataAccess.CreateDepartment();

		// 采用反射技术，创建对象实例
		IUser iuser = DataAccessOfReflect.CreateUser();
		IDepartment idep = DataAccessOfReflect.CreateDepartment();

		idep.Insert(department);
		idep.GetDepartment(2);
		iuser.Insert(user);
		iuser.GetUser(1);
	}

}
