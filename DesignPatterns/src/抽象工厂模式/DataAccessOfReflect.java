package 抽象工厂模式;

/**
 * @author CSH 2015-2-17下午12:38:24利用反射技术，在运行时创建对象
 */
public class DataAccessOfReflect {
	private static final String baseClassName = "抽象工厂模式.MySql";
	// private static final String baseClassName = "抽象工厂模式.SqlServer";
	private static String className;

	public static IUser CreateUser() throws ClassNotFoundException,
			InstantiationException, IllegalAccessException {
		className = baseClassName + "User";
		IUser iuser = null;
		// 利用反射，根据类名创建一个对象实例
		iuser = (IUser) Class.forName(className).newInstance();
		return iuser;
	}

	public static IDepartment CreateDepartment() throws InstantiationException,
			IllegalAccessException, ClassNotFoundException {
		className = baseClassName + "Department";
		IDepartment idep = null;
		// 利用反射，根据类名创建一个对象实例
		idep = (IDepartment) Class.forName(className).newInstance();
		return idep;
	}
}
