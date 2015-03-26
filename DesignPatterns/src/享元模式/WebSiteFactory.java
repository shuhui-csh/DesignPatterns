/**
 * 
 */
package 享元模式;

import java.util.HashMap;
import java.util.Map;

/**
 * @author CSH 2015-2-20下午9:11:57网站工厂类
 */
public class WebSiteFactory {
	private Map<String, WebSite> flyweights = new HashMap<>();

	/**
	 * @param key
	 * @return返回分类网站
	 */
	public WebSite getWebSiteCategory(String key) {
		if (!flyweights.containsKey(key)) {
			flyweights.put(key, new ConcreteWebSite(key));
		}
		return flyweights.get(key);
	}

	public int getWebSiteCount() {
		return flyweights.size();
	}
}
