/**
 * 
 */
package 桥接模式;

/**
 * @author CSH 2015-2-19下午2:44:40手机品牌M具体实现类
 */
public class HandsetBrandM extends HandsetBrand {

	/*
	 * (non-Javadoc)
	 * 
	 * @see 桥接模式.HandsetBrand#Run()
	 */
	@Override
	public void Run() {
		// TODO Auto-generated method stub
		System.out.println("手机品牌m:");
		soft.Run();
	}

}
