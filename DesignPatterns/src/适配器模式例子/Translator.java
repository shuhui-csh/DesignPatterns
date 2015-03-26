/**
 * 
 */
package 适配器模式例子;

/**
 * @author CSH 2015-2-17下午11:01:34
 */
public class Translator extends Player {
	// 申明并实例化一个内部"外籍中锋"对象，表明翻译者与外籍球员有关联
	private ForeignCenter yao = new ForeignCenter();

	/**
	 * @param name
	 */
	public Translator(String name) {
		super(name);
		yao.setName(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 适配器模式例子.Player#Attack()
	 */
	@Override
	public void Attack() {
		// 翻译者把Attack翻译成进攻，告诉外籍中锋
		yao.进攻();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 适配器模式例子.Player#Defense()
	 */
	@Override
	public void Defense() {
		// TODO Auto-generated method stub
		yao.防守();
	}

}
