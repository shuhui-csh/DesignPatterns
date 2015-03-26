/**
 * 
 */
package 适配器模式结构;

/**
 * @author CSH 2015-2-17下午10:21:42这是客户所期待的接口，目标可以是具体的或 抽象的类，也可以是接口
 */
public class Target {
	public void Request() {
		System.out.println("普通请求");
	}
}
