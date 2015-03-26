/**
 * 
 */
package 状态模式;

/**
 * @author CSH 2015-2-17下午5:12:57
 */
public class EveningState extends State {

	/*
	 * (non-Javadoc)
	 * 
	 * @see 状态模式.State#WriteProgram(状态模式.Work)
	 */
	@Override
	public void WriteProgram(Work w) {
		if (w.isFinish()) {
			w.setCurrent_state(new RestState());
			w.WriteProgram();
		} else {
			if (w.getHour() < 21) {
				System.out.println("当前时间：" + w.getHour() + " 加班哦，疲累之极");
			} else {
				w.setCurrent_state(new SleepingState());
				w.WriteProgram();
			}
		}

	}

}
