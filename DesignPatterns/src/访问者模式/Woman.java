/**
 * 
 */
package 访问者模式;

/**
 * @author CSH 2015-2-20下午11:02:02
 */
public class Woman extends Person {

	/*
	 * (non-Javadoc)
	 * 
	 * @see 访问者模式.Person#accept(访问者模式.Action)
	 */
	@Override
	public void accept(Action visitor) {
		// TODO Auto-generated method stub
		visitor.getWomanConclusion(this);
	}

}
