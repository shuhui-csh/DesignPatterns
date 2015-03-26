/**
 * 
 */
package 简单工厂模式;

/**
 * @author CSH 2015-2-13下午2:02:36 乘法类，继承运算类
 */
public class OperationMul extends Operation {

	/*
	 * (non-Javadoc)
	 * 
	 * @see 简单工厂模式.Operation#getResult()
	 */
	@Override
	public double getResult() {
		double result = 0;
		return result = getNumber_A() * getNumber_B();
	}

}
