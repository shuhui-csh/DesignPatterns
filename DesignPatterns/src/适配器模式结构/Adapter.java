/**
 * 
 */
package 适配器模式结构;

/**
 * @author CSH 2015-2-17下午10:26:29通过在内部包装一个Adapter对象，把源接口转换成目标接口
 */
public class Adapter extends Target {
	private Adaptee adaptee = new Adaptee();

	/*
	 * (non-Javadoc)
	 * 
	 * @see 适配器模式结构.Target#Request()
	 */
	@Override
	public void Request() {
		adaptee.SpecificRequest();
	}

}
