/**
 * 
 */
package 桥接模式;

/**
 * @author CSH 2015-2-19下午2:42:14手机品牌n具体类
 */
public class HandsetBrandN extends HandsetBrand {

	/*
	 * (non-Javadoc)
	 * 
	 * @see 桥接模式.HandsetBrand#Run()
	 */
	@Override
	public void Run() {
		// soft继承自父类
		System.out.println("手机品牌n：");
		soft.Run();
	}

}
