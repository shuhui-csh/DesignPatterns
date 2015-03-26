/**
 * 
 */
package 建造者模式;

/**
 * @author CSH 2015-2-16下午2:16:47 具体建造者类，按照抽象建造者的步骤，可以有细节上表现形式的不同来建造一个不同其他具体建造者类
 */
public class ConcreteBuilder2 extends Builder {
	private Product product = new Product();

	/*
	 * (non-Javadoc)
	 * 
	 * @see 建造者模式.Builder#BuildPartA()
	 */
	@Override
	public void BuildPartA() {
		// TODO Auto-generated method stub
		product.Add("部件x");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 建造者模式.Builder#BuildPartB()
	 */
	@Override
	public void BuildPartB() {
		// TODO Auto-generated method stub
		product.Add("部件Y");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 建造者模式.Builder#getResult()
	 */
	@Override
	public Product getResult() {
		// TODO Auto-generated method stub
		return product;
	}

}
