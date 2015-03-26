/**
 * 
 */
package 职责链模式;

/**
 * @author CSH 2015-2-20上午11:55:12
 */
public abstract class Manager {
	protected String name;
	protected Manager superior;

	/**
	 * @param name
	 */
	public Manager(String name) {
		super();
		this.name = name;
	}

	/**
	 * @param superiord后继者或是上级
	 *            设置管理者的上级
	 */
	public void SetSuperior(Manager superior) {
		this.superior = superior;
	}

	public abstract void RequestApplicatons(Request request);
}
