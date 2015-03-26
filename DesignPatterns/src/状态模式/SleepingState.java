/**
 * 
 */
package 状态模式;

/**
 * @author CSH 2015-2-17下午5:16:59
 */
public class SleepingState extends State {

	/*
	 * (non-Javadoc)
	 * 
	 * @see 状态模式.State#WriteProgram(状态模式.Work)
	 */
	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
		System.out.println("当前时间：" + w.getHour() + " 不行了，睡着了");
	}

}
