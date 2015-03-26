/**
 * 
 */
package 备忘录模式;

/**
 * @author CSH 2015-2-18下午12:50:49角色状态存储箱类
 */
public class RoleStateMemento {
	private int vit;
	private int atk;
	private int def;

	/**
	 * @param vit生命力
	 * @param atk攻击力
	 * @param def防御力
	 *            将生命力、攻击力、防御力存入状态存储箱中
	 */
	public RoleStateMemento(int vit, int atk, int def) {
		this.vit = vit;
		this.atk = atk;
		this.def = def;
	}

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

}
