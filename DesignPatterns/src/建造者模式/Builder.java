/**
 * 
 */
package 建造者模式;

/**
 * @author CSH
 *         2015-2-16下午2:06:12抽象建造者类，确定产品有两个部件PartA和PartB组成，并声明一个得到产品建造后结果的方法getResult
 */
public abstract class Builder {
	public abstract void BuildPartA();

	public abstract void BuildPartB();

	public abstract Product getResult();
}
