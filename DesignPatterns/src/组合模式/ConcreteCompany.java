/**
 * 
 */
package 组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CSH 2015-2-18下午3:10:02
 */
public class ConcreteCompany extends Company {
	private List<Company> children = new ArrayList<Company>();

	/**
	 * @param name
	 */
	public ConcreteCompany(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 组合模式.Company#add(组合模式.Company)
	 */
	@Override
	public void Add(Company c) {
		// TODO Auto-generated method stub
		children.add(c);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 组合模式.Company#remove(组合模式.Company)
	 */
	@Override
	public void Remove(Company c) {
		// TODO Auto-generated method stub
		children.remove(c);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 组合模式.Company#Display(int)
	 */
	@Override
	public void Display(int depth) {
		String line = "";
		for (int i = 1; i <= depth; i++) {
			line = line + "-";
		}
		System.out.println(line + name);
		for (Company component : children) {
			component.Display(depth + 2);
		}
	}

	/*
	 * (non-Javadoc) 履行职责
	 * 
	 * @see 组合模式.Company#LineOfDuty()
	 */
	@Override
	public void LineOfDuty() {
		// TODO Auto-generated method stub
		for (Company compon : children) {
			compon.LineOfDuty();
		}
	}

}
