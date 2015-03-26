/**
 * 
 */
package 适配器模式例子;

/**
 * @author CSH 2015-2-17下午10:38:50
 */
public class Forwards extends Player {

	/**
	 * @param name
	 */
	public Forwards(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 适配器模式例子.Player#Attack()
	 */
	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		System.out.println("前锋" + name + "进攻");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 适配器模式例子.Player#Defense()
	 */
	@Override
	public void Defense() {
		// TODO Auto-generated method stub
		System.out.println("前锋" + name + "防守");
	}

}
