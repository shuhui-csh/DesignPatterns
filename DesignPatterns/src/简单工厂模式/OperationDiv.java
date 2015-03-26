/**
 * 
 */
package 简单工厂模式;

/**
 * @author CSH 2015-2-13下午2:05:07
 */
public class OperationDiv extends Operation {

	/*
	 * (non-Javadoc)
	 * 
	 * @see 简单工厂模式.Operation#getResult()
	 */
	@Override
	public double getResult() {
		double result = 0;
		if (getNumber_B() == 0) {
			try {
				System.out.println("除数不能为0");
				throw new Exception("除数不能为0");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result = getNumber_A() / getNumber_A();
	}

}
