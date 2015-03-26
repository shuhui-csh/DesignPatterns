package 模板方法;

/**
 * 
 */

/**
 * @author CSH 2015-2-15下午2:48:40
 */
public abstract class AbstractClass {
	/**
	 * 一些抽象行为，放到子类去实现
	 */
	public abstract void PrimitiveOperation1();

	public abstract void PrimitiveOperation2();

	/**
	 * 模板方法，给出了逻辑的骨架，而逻辑的组成是一些相应的的抽象操作，他们都推迟到子类实现
	 */
	public void TemplateMethod() {
		PrimitiveOperation1();
		PrimitiveOperation2();
		System.out.println("");
	}
}
