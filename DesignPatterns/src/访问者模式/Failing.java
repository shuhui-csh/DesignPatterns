/**
 * 
 */
package 访问者模式;

/**
 * @author CSH 2015-2-20下午11:14:16
 */
public class Failing extends Action {

	/*
	 * (non-Javadoc)
	 * 
	 * @see 访问者模式.Action#getManConclusion(访问者模式.Man)
	 */
	@Override
	public void getManConclusion(Man man) {
		// TODO Auto-generated method stub
		System.out.println(man.getClass().getName() + this.getClass().getName()
				+ " 时，背后多半有一个失败的女人");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 访问者模式.Action#getWomanConclusion(访问者模式.Woman)
	 */
	@Override
	public void getWomanConclusion(Woman womam) {
		// TODO Auto-generated method stub
		System.out.println(womam.getClass().getName()
				+ this.getClass().getName() + " 时，背后多半是一个失败的女人");
	}

}
