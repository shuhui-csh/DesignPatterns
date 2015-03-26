/**
 * 
 */
package 组合模式;

/**
 * @author CSH 2015-2-18下午2:56:00公司类，抽象类或接口
 */

public abstract class Company {

	protected String name;

	/**
	 * @param name
	 */
	public Company(String name) {
		super();
		this.name = name;
	}

	public abstract void Add(Company c);// 添加

	public abstract void Remove(Company c);// 移除

	public abstract void Display(int depth);// 显示

	/**
	 * 增加一“履行职责”方法，不同的部门需要履行不同的职责
	 */
	public abstract void LineOfDuty();// 履行职责

}
