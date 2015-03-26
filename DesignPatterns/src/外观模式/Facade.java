/**
 * 
 */
package 外观模式;

/**
 * @author CSH 2015-2-15下午4:08:40 外观类
 */
public class Facade {
	private SubsystemOne one;
	private SubsystemTwo two;
	private SubsystemThree three;
	private SubsystemFour four;

	/**
	 * 外观类，它需要了解所有的子系统的方法或属性，进行组合，以备外界调用
	 */
	public Facade() {
		one = new SubsystemOne();
		two = new SubsystemTwo();
		three = new SubsystemThree();
		four = new SubsystemFour();
	}

	public void MethodA() {
		System.out.println("方法组A的组合");

		one.MethodOne();
		two.MethodTwo();
		four.MethodFour();
	}

	public void MethodB() {
		System.out.println("方法组B的组合");
		two.MethodTwo();
		four.MethodFour();
	}
}
