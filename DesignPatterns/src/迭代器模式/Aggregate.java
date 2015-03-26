/**
 * 
 */
package 迭代器模式;

/**
 * @author CSH 2015-2-18下午4:46:57聚集抽象类，类别各种集合类
 */
public abstract class Aggregate {
	/**
	 * @return创建迭代器
	 */
	public abstract Iterator CreateIterator();
}
