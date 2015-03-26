/**
 * 
 */
package 适配器模式例子;

/**
 * @author CSH 2015-2-17下午10:51:01外籍中锋类球员的姓名故意用属性而不是构造方法来区别与前三个球员类的不同
 */
public class ForeignCenter {
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 表明外籍中锋姚明只懂中文进攻
	 */
	public void 进攻() {
		System.out.println("外籍中锋 " + name + " 进攻");
	}

	public void 防守() {
		System.out.println("外籍中锋 " + name + " 防守");
	}
}
