/**
 * 
 */
package 适配器模式例子;

/**
 * @author CSH 2015-2-17下午10:33:51球员抽象类
 */
public abstract class Player {
	protected String name;

	/**
	 * @param name
	 */
	public Player(String name) {
		super();
		this.name = name;
	}

	/**
	 * 进攻和防守的方法
	 */
	public abstract void Attack();

	public abstract void Defense();
}
