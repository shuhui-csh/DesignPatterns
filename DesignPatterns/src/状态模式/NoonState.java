/**
 * 
 */
package 状态模式;

/**
 * @author CSH 2015-2-17下午5:08:21
 */
public class NoonState extends State {

	/*
	 * (non-Javadoc)
	 * 
	 * @see 状态模式.State#WriteProgram(状态模式.Work)
	 */
	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
		if (w.getHour() < 13) {
			System.out.println("当前时间：" + w.getHour() + " 饿了，午饭；犯困，午休");
		}else{
			w.setCurrent_state(new AfternoonState());
			w.WriteProgram();
		}
	}

}
