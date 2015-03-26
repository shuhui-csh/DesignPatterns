/**
 * 
 */
package 状态模式;

/**
 * @author CSH
 *2015-2-17下午5:18:22
 */
public class RestState extends State {

	/* (non-Javadoc)
	 * @see 状态模式.State#WriteProgram(状态模式.Work)
	 */
	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
System.out.println("当前时间："+w.getHour()+"  下班回家了");
	}

}
