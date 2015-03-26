/**
 * 
 */
package 享元模式;

/**
 * @author CSH 2015-2-20下午9:20:06
 */
public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebSiteFactory f = new WebSiteFactory();
		WebSite fx = f.getWebSiteCategory("产品展示");
		fx.Use(new User("小菜"));

		WebSite fy = f.getWebSiteCategory("产品展示");
		fy.Use(new User("小辉"));

		WebSite fz = f.getWebSiteCategory("产品展示");
		fz.Use(new User("小妹"));

		WebSite fa = f.getWebSiteCategory("主页");
		fa.Use(new User("树辉"));

		WebSite fb = f.getWebSiteCategory("主页");
		fb.Use(new User("小妹"));
		System.out.println("得到网站的分类总数为：" + f.getWebSiteCount());
	}
}
