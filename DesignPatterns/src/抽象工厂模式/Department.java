/**
 * 
 */
package 抽象工厂模式;

/**
 * @author CSH 2015-2-17上午10:26:33
 */
public class Department {
	private int id;
	private String dept_name;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the dept_name
	 */
	public String getDept_name() {
		return dept_name;
	}

	/**
	 * @param dept_name
	 *            the dept_name to set
	 */
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

}
