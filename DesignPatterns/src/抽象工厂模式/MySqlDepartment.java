/**
 * 
 */
package 抽象工厂模式;

/**
 * @author CSH 2015-2-17上午10:33:22
 */
public class MySqlDepartment implements IDepartment {

	/*
	 * (non-Javadoc)
	 * 
	 * @see 抽象工厂模式.IDepartment#Insert(抽象工厂模式.Department)
	 */
	@Override
	public void Insert(Department department) {
		// TODO Auto-generated method stub
		System.out.println("在mysql中给department表增加一条记录");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 抽象工厂模式.IDepartment#GetDepartment(int)
	 */
	@Override
	public Department GetDepartment(int id) {
		// TODO Auto-generated method stub
		System.out.println("在mysql中根据id得到department表一条记录");
		return null;
	}

}
