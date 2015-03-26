/**
 * 
 */
package 状态模式;

/**
 * @author CSH
 *2015-2-17下午5:10:43
 */
public class AfternoonState extends State {

	/* (non-Javadoc)
	 * @see 状态模式.State#WriteProgram(状态模式.Work)
	 */
	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
		if (w.getHour() < 17) {
			System.out.println("当前时间：" + w.getHour() + " 下午状态还不错，继续努力");
		}else{
			w.setCurrent_state(new EveningState());
			w.WriteProgram();
		}
	}
}
