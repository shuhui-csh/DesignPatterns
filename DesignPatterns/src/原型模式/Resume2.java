/**
 * 
 */
package 原型模式;

/**
 * @author CSH 2015-2-15上午10:45:28
 */
public class Resume2 implements Cloneable {
	private String name;
	private String sex;
	private String age;
	private WorkExperience work;

	/**
	 * @return
	 */
	public WorkExperience getWork() {
		return work;
	}

	/**
	 * @param work
	 */
	public void setWork(WorkExperience work) {
		this.work = work;
	}

	/**
	 * @param name
	 */
	public Resume2(String name) {
		this.name = name;
		work = new WorkExperience();
	}

	/**
	 * @param work
	 * @throws CloneNotSupportedException
	 */
	public Resume2(WorkExperience work) throws CloneNotSupportedException {

		this.work = (WorkExperience) work.clone();
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
		work.setWorkDate(timeArea);
		work.setCompany(company);
	}

	public void Display() {
		System.out.println(name + "  " + sex + "  " + age);
		System.out.println("工作经历  " + work.getWorkDate() + "  "
				+ work.getCompany());

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() {
		// 深复制
		// Resume2 res = new Resume2(this.work);
		// res.name = this.name;
		// res.sex = this.s;
		// res.age = this.age;
		Resume2 res = null;
		try {
			res = (Resume2) super.clone();
			res.work = (WorkExperience) this.getWork().clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

}
