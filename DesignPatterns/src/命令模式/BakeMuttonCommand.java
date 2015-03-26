/**
 * 
 */
package 命令模式;

/**
 * @author CSH 2015-2-19下午5:11:26具体烤羊肉串命令
 */
public class BakeMuttonCommand extends Command {

	/**
	 * @param receive
	 */
	public BakeMuttonCommand(Barbecuer receive) {
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
		receive.BakeMutton();
	}

}
