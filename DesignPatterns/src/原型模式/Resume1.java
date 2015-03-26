/**
 * 
 */
package 原型模式;

/**
 * @author CSH 2015-2-14下午6:22:12
 */
public class Resume1 implements Cloneable {
	private String name;
	private String sex;
	private String age;
	private String timeArea;
	private String company;

	/**
	 * 
	 */
	public Resume1(String name) {
		this.name = name;
	}

	/**
	 * 设置个人信息
	 * 
	 * @param sex性别
	 * @param age年龄
	 */
	public void SetPersonalInfo(String sex, String age) {
		this.sex = sex;
		this.age = age;
	}

	/**
	 * 设置工作经历
	 * 
	 * @param timeArea工作时间
	 * @param company工作公司
	 */
	public void SetWorkExperience(String timeArea, String company) {
		this.timeArea = timeArea;
		this.company = company;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 浅复制
		return super.clone();
	}

	public void Display() {
		System.out.println(name + "  " + sex + "  " + age);
		System.out.println("工作经历  " + timeArea + "  " + company);

	}
}
