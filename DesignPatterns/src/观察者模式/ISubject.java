/**
 * 
 */
package 观察者模式;

import javax.print.DocFlavor.STRING;

/**
 * @author CSH 2015-2-16下午5:40:06抽象通知者接口
 */
public interface ISubject {

	public void Attach(Observer observer);

	public void Detach(Observer observer);

	public void Notify();

	public void setState(String SubjectState);

	public String getState();

}
