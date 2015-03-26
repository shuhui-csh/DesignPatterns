/**
 * 
 */
package 享元模式;

/**
 * @author CSH 2015-2-20下午9:02:09用户类，用于网站的客户账号，是"网站"类的外部状态
 */
public class User {
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public User(String name) {
		super();
		this.name = name;
	}

}
