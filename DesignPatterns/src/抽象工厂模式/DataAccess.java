/**
 * 
 */
package 抽象工厂模式;

/**
 * @author CSH 2015-2-17下午12:22:43去除IFactory、SqlServerFactory、
 *         MySqlFactory三个工厂类，用简单工厂模式改造抽象工厂模式的调度类
 */
public class DataAccess {
	private static final String db = "SqlServer";

	// private static final String db = "MySql";

	public static IUser CreateUser() {
		IUser iuser = null;
		switch (db) {
		case "SqlServer":
			iuser = new SqlServerUser();
			break;
		case "MySql":
			iuser = new MySqlUser();
			break;
		}
		return iuser;
	}

	public static IDepartment CreateDepartment() {
		IDepartment ide = null;
		switch (db) {
		case "SqlServer":
			ide = new SqlServerDepartment();
			break;
		case "MySql":
			ide = new MySqlDepartment();
			break;
		}
		return ide;

	}
}
