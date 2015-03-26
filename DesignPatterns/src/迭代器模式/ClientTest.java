/**
 * 
 */
package 迭代器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CSH 2015-2-18下午5:34:13
 */
public class ClientTest {
	private static List<Object> items = new ArrayList<Object>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		items.add("大熊");
		items.add("树辉");
		items.add("小妹");
		items.add("生活");
		ConcreteAggregats a = new ConcreteAggregats(items);
		Iterator i = a.CreateIterator();
		Object item = i.First();
		while (!i.IsDone()) {
			System.out.println(i.Next() + " 买票");
		}
	}

}
