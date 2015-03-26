/**
 * 
 */
package 装饰模式;

/**
 * @author CSH 2015-2-14上午9:17:08 (concreteComponent)
 */
public class Person {
	private String name;

	/**
	 * 默认构造方法
	 */
	public Person() {
	}

	/**
	 * @param name
	 */
	public Person(String name) {
		super();
		this.name = name;
	}

	/**
	 * 
	 */
	public void Show() {
		System.out.println(name + "正在打扮");
	}

}
