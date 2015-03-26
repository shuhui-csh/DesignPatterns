/**
 * 
 */
package 备忘录模式;

/**
 * @author CSH 2015-2-18下午1:54:19角色你状态管理者
 */
public class RoleStateCaretaker {
	private RoleStateMemento memento;

	/**
	 * @return the memento
	 */
	public RoleStateMemento getMemento() {
		return memento;
	}

	/**
	 * @param memento
	 *            the memento to set
	 */
	public void setMemento(RoleStateMemento memento) {
		this.memento = memento;
	}

}
