/**
 * 
 */
package 访问者模式;

/**
 * @author CSH 2015-2-20下午10:47:03
 */
public abstract class Action {
	// 得到男人结论或反应
	public abstract void getManConclusion(Man man);

	// 得到女人的结论或反应
	public abstract void getWomanConclusion(Woman womam);
}
