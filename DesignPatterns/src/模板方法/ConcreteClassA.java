/**
 * 
 */
package 模板方法;

/**
 * @author CSH 2015-2-15下午2:57:37
 */
public class ConcreteClassA extends AbstractClass {

	/*
	 * (non-Javadoc)
	 * 
	 * @see 模板方法.AbstractClass#PrimitiveOperation1()
	 */
	@Override
	public void PrimitiveOperation1() {
		// TODO Auto-generated method stub
		System.out.println("具体类A方法1的实现");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 模板方法.AbstractClass#PrimitiveOperation2()
	 */
	@Override
	public void PrimitiveOperation2() {
		// TODO Auto-generated method stub
		System.out.println("具体类A方法2的实现");
	}

}
