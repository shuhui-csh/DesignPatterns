/**
 * 
 */
package 简单工厂模式;

/**
 * @author CSH 2015-2-13下午1:53:31 加法类，继承运算类operation
 */
public class OperationAdd extends Operation {

	/*
	 * (non-Javadoc)
	 * 
	 * @see 简单工厂模式.Operation#getResult()
	 */
	@Override
	public double getResult() {
		double result = 0;
		result = getNumber_A() + getNumber_A();
		return result;
	}

}
