/**
 * 
 */
package 迭代器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CSH 2015-2-18下午4:52:55
 */
public class ConcreteAggregats extends Aggregate {
	private List<Object> items = new ArrayList<Object>();
	
	/**
	 * @param items
	 */
	public ConcreteAggregats(List<Object> items) {
		super();
		this.items = items;
	}

	// 聚集总个数
	private int count;

	/*
	 * (non-Javadoc)
	 * 
	 * @see 迭代器模式.Aggregate#CreateIterator()
	 */
	@Override
	public Iterator CreateIterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator(items);
	}

	/**
	 * @return返回聚集总个数
	 */
	public int getCount() {
		count = items.size();
		return count;
	}
	
	
}
