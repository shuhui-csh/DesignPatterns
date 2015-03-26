/**
 * 
 */
package 备忘录模式;

/**
 * @author CSH 2015-2-18上午11:53:26
 */
public class GameRole {
	// 生命力
	private int vit;
	// 攻击力
	private int atk;
	// 防御力
	private int def;

	/**
	 * @return the vit
	 */
	public int getVit() {
		return vit;
	}

	/**
	 * @param vit
	 *            the vit to set
	 */
	public void setVit(int vit) {
		this.vit = vit;
	}

	/**
	 * @return the atk
	 */
	public int getAtk() {
		return atk;
	}

	/**
	 * @param atk
	 *            the atk to set
	 */
	public void setAtk(int atk) {
		this.atk = atk;
	}

	/**
	 * @return the def
	 */
	public int getDef() {
		return def;
	}

	/**
	 * @param def
	 *            the def to set
	 */
	public void setDef(int def) {
		this.def = def;
	}

	/**
	 * 状态显示
	 */
	public void StateDispaly() {
		System.out.println("角色当前状态");
		System.out.println("生命力：" + vit);
		System.out.println("攻击力：" + atk);
		System.out.println("防御力：" + def);
	}

	/**
	 * 获得初始状态
	 */
	public void GetInitState() {
		this.vit = 100;
		this.atk = 100;
		this.def = 100;
	}

	/**
	 * 战斗
	 */
	public void Fight() {
		this.vit = 0;
		this.atk = 0;
		this.def = 0;
	}

	/**
	 * @return保存角色状态
	 */
	public RoleStateMemento saveState() {
		return new RoleStateMemento(vit, atk, def);

	}

	/**
	 * @param memento角色状态存储对象
	 *            恢复角色状态方法，可将外部的"角色状态存储箱"中状态值恢复给游戏角色
	 */
	public void RecoveryState(RoleStateMemento memento) {
		this.vit = memento.getVit();
		this.atk = memento.getAtk();
		this.def = memento.getDef();
	}
}
