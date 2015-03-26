/**
 * 
 */
package 状态模式;

/**
 * @author CSH 2015-2-17下午5:20:12
 */
public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Work work = new Work();
		work.setHour(9);
		work.WriteProgram();
		
		work.setHour(10);
		work.WriteProgram();
		
		work.setHour(12);
		work.WriteProgram();
		
		work.setHour(13);
		work.WriteProgram();
		
		work.setHour(14);
		work.WriteProgram();
		
		work.setHour(17);
		work.WriteProgram();
		
		//work.setFinish(true);
		work.setFinish(false);
		//work.WriteProgram();
		
		work.setHour(19);
		work.WriteProgram();
		
		work.setHour(22);
		work.WriteProgram();
	}

}
