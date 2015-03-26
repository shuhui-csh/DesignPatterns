/**
 * 
 */
package 原型模式;

/**
 * @author CSH 2015-2-15上午10:42:20
 */
public class WorkExperience implements Cloneable {
	private String workDate;
	private String company;

	/**
	 * @return the workDate
	 */
	public String getWorkDate() {
		return workDate;
	}

	/**
	 * @param workDate
	 *            the workDate to set
	 */
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company
	 *            the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
