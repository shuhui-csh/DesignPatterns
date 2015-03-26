/**
 * 
 */
package 状态模式;

/**
 * @author CSH 2015-2-17下午4:42:38
 */
public class ForenoonState extends State {

	/*
	 * (non-Javadoc)
	 * 
	 * @see 状态模式.State#WriteProgram(状态模式.Work)
	 */
	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
		if (w.getHour() < 12) {
			System.out.println("当前时间：" + w.getHour() + " 上午工作，精神百倍");
		}else{
			w.setCurrent_state(new NoonState());w.WriteProgram();
		}
	}

}
