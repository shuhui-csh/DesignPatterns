/**
 * 
 */
package 迭代器模式;

/**
 * @author CSH 2015-2-18下午4:42:49迭代器抽象类,用于定义得到开始对象，得到下一个对象、判断是否到结尾、当前对象等抽象方法
 */
public abstract class Iterator {
	public abstract Object First();

	public abstract Object Next();

	public abstract boolean IsDone();

	public abstract Object CurrentItem();
}
