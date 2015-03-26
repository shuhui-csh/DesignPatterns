/**
 * 
 */
package 建造者模式;

/**
 * @author CSH 2015-2-16下午2:22:36指挥者类，用于指挥构造过程
 */
public class Director {
	public void Construct(Builder builder) {
		builder.BuildPartA();
		builder.BuildPartB();
	}
}
