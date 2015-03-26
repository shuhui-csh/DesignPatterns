/**
 * 
 */
package 享元模式;

/**
 * @author CSH 2015-2-20下午9:08:26具体网站类
 */
public class ConcreteWebSite extends WebSite {
	private String name;

	/**
	 * 
	 */
	public ConcreteWebSite(String name) {
		super();
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 享元模式.WebSite#Use(享元模式.User)
	 */
	@Override
	public void Use(User user) {
		System.out.println("网站分类：" + name + " 用户：" + user.getName());
	}

}
