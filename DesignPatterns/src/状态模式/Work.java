/**
 * 
 */
package 状态模式;

/**
 * @author CSH 2015-2-17下午4:40:49工作类
 */
public class Work {
	private State current_state;
	private double hour;
	private boolean finish = false;

	/**
	 * 工作初始化为上午工作状态，即上午9:00开始工作
	 */
	public Work() {
		current_state = new ForenoonState();
	}

	/**
	 * @return the current_state
	 */
	public State getCurrent_state() {
		return current_state;
	}

	/**
	 * @param current_state
	 *            the current_state to set
	 */
	public void setCurrent_state(State current_state) {
		this.current_state = current_state;
	}

	/**
	 * @return the hour
	 */
	public double getHour() {
		return hour;
	}

	/**
	 * @param hour
	 *            the hour to set
	 */
	public void setHour(double hour) {
		this.hour = hour;
	}

	/**
	 * @return the finish
	 */
	public boolean isFinish() {
		return finish;
	}

	/**
	 * @param finish
	 *            the finish to set
	 */
	public void setFinish(boolean finish) {
		this.finish = finish;
	}

	public void WriteProgram() {
		current_state.WriteProgram(this);
	}
}
