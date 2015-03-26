/**
 * 
 */
package 访问者模式;

/**
 * @author CSH 2015-2-20下午10:53:10
 */
public class Man extends Person {

	/**
	 * 双分派技术： 首先在客户程序中将具体状态作为参数传递给"男人"类完成一次分派，然后”男人“
	 * 调用作为参数的”具体状态“中的方法”男人反应“,同时将自己（this）作为参数传递进去。这便完成了第二次分派
	 */
	@Override
	public void accept(Action visitor) {
		// TODO Auto-generated method stub
		visitor.getManConclusion(this);
	}

}
