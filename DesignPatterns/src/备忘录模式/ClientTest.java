/**
 * 
 */
package 备忘录模式;

/**
 * @author CSH 2015-2-18下午1:55:53
 */
public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("大战Boss前");
		GameRole limiao = new GameRole();
		limiao.GetInitState();
		limiao.StateDispaly();

		System.out.println("先保存进度");
		// 由于封装在Memento中，因此我们并不知道保存了哪些具体的角色数据
		RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
		stateAdmin.setMemento(limiao.saveState());
		System.out.println("打Boss,三项指标数据都下降很多，非常糟糕，gameover");
		limiao.Fight();
		limiao.StateDispaly();
		System.out.println("于是我恢复打Boss之前的状态");
		limiao.RecoveryState(stateAdmin.getMemento());
		limiao.StateDispaly();
	}

}
