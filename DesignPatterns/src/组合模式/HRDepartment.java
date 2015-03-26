/**
 * 
 */
package 组合模式;

/**
 * @author CSH 2015-2-18下午3:34:09人力资源部类 树叶结点
 */
public class HRDepartment extends Company {

	/**
	 * @param name
	 */
	public HRDepartment(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 组合模式.Company#Add(组合模式.Company)
	 */
	@Override
	public void Add(Company c) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 组合模式.Company#Remove(组合模式.Company)
	 */
	@Override
	public void Remove(Company c) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 组合模式.Company#Display(int)
	 */
	@Override
	public void Display(int depth) {
		// TODO Auto-generated method stub
		String line = "";
		for (int i = 1; i <= depth; i++) {
			line = line + "-";
		}
		System.out.println(line + name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 组合模式.Company#LineOfDuty()
	 */
	@Override
	public void LineOfDuty() {
		// TODO Auto-generated method stub
		System.out.println(name + " 员工招聘培训管理");
	}

}
