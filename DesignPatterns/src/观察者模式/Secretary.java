/**
 * 
 */
package 观察者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CSH 2015-2-16下午6:00:18
 */
public class Secretary implements ISubject {
	// 同事列表
	private List<Observer> observers = new ArrayList<Observer>();
	private String SubjectState;

	/*
	 * (non-Javadoc)
	 * 
	 * @see 观察者模式.ISubject#Attach(观察者模式.Observer)
	 */
	@Override
	public void Attach(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 观察者模式.ISubject#Detach(观察者模式.Observer)
	 */
	@Override
	public void Detach(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 观察者模式.ISubject#Notify()
	 */
	@Override
	public void Notify() {
		// TODO Auto-generated method stub
		for (Observer ob : observers) {
			ob.Update();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 观察者模式.ISubject#setState(java.lang.String)
	 */
	@Override
	public void setState(String SubjectState) {
		// TODO Auto-generated method stub
		this.SubjectState = SubjectState;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 观察者模式.ISubject#getState()
	 */
	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return SubjectState;
	}

}
