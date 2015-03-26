/**
 * 
 */
package 迭代器模式;

import java.util.List;

/**
 * @author CSH 2015-2-18下午4:49:40具体迭代器类，继承Iterator
 */
public class ConcreteIterator extends Iterator {
	private ConcreteAggregats aggregats;
	private List<Object> items;
	private int currenIndex = 0;

	/**
	 * @param aggregats
	 */
	public ConcreteIterator(ConcreteAggregats aggregats) {
		super();
		this.aggregats = aggregats;
	}

	/**
	 * @param items
	 */
	public ConcreteIterator(List<Object> items) {
		// TODO Auto-generated constructor stub
		this.items = items;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 迭代器模式.Iterator#First()
	 */
	@Override
	public Object First() {
		// TODO Auto-generated method stub
		currenIndex = 0;
		return items.get(currenIndex);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 迭代器模式.Iterator#Next()
	 */
	@Override
	public Object Next() {
		// TODO Auto-generated method stub

		return items.get(currenIndex++);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 迭代器模式.Iterator#IsDone()
	 */
	@Override
	public boolean IsDone() {
		if (currenIndex > items.size() - 1) {
			return true;
		} else {
			return false;
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 迭代器模式.Iterator#CurrentItem()
	 */
	@Override
	public Object CurrentItem() {
		// TODO Auto-generated method stub
		return items.get(currenIndex);
	}

}
