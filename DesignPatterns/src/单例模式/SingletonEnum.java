/**
 * 
 */
package 单例模式;

/**
 * @author CSH 2015-8-7上午10:02:05
 */
public enum SingletonEnum {
	/**
	 * 只有一个元素的枚举
	 */
	instance;

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static SingletonEnum getInstance() {
		return instance;

	}
}
