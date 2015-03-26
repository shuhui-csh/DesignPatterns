/**
 * 
 */
package 访问者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CSH 2015-2-20下午11:18:19对象结构
 */
public class ObjectStructure {
	private List<Person> elements = new ArrayList<Person>();

	public void attach(Person p) {
		elements.add(p);
	}

	public void detach(Person p) {
		elements.remove(p);
	}

	/**
	 * @param visitor
	 *            最重要的遍历算法
	 */
	public void display(Action visitor) {
		for (Person e : elements) {
			e.accept(visitor);
		}
	}
}
