/**
 * 
 */
package 访问者模式;

/**
 * @author CSH 2015-2-20下午10:51:06
 */
public abstract class Person {
	public abstract void accept(Action visitor);
}
