/**
 * 
 */
package 命令模式;

/**
 * @author CSH 2015-2-19下午5:08:03抽象命令
 */
public abstract class Command {
	protected Barbecuer receive;

	/**
	 * @param receive烤肉者
	 */
	public Command(Barbecuer receive) {
		super();
		this.receive = receive;
	}

	public abstract void ExcuteCommand();
}
