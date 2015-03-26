/**
 * 
 */
package 建造者模式;

import javax.rmi.PortableRemoteObject;

/**
 * @author CSH 2015-2-16下午2:11:37
 */
public class ConcreteBuilder1 extends Builder {
	private Product product = new Product();

	/*
	 * (non-Javadoc)
	 * 
	 * @see 建造者模式.Builder#BuildPartA()
	 */
	@Override
	public void BuildPartA() {
		// TODO Auto-generated method stub
		product.Add("部件A");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 建造者模式.Builder#BuildPartB()
	 */
	@Override
	public void BuildPartB() {
		product.Add("部件B");
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
