/**
 * 
 */
package 命令模式;

/**
 * @author CSH 2015-2-19下午5:13:47具体烤鸡翅命令
 */
public class BakeChickenWingCommand extends Command {

	/**
	 * @param receive
	 */
	public BakeChickenWingCommand(Barbecuer receive) {
		super(receive);
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 命令模式.Command#ExcuteCommand()
	 */
	@Override
	public void ExcuteCommand() {
		// TODO Auto-generated method stub
		receive.BakeChickenWing();
	}

}
