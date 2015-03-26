/**
 * 
 */
package 建造者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CSH 2015-2-16下午1:59:09产品类，由多个部件组成
 */
public class Product {
	List<String> parts = new ArrayList<String>();

	/**
	 * 添加产品部件
	 */
	public void Add(String part) {
		parts.add(part);
	}

	/**
	 * 列举出该产品的所有部件
	 */
	public void Show() {
		System.out.println("该产品由以下几部分部件构成：");
		for (String p : parts) {
			System.out.println(p);
		}
	}
}
