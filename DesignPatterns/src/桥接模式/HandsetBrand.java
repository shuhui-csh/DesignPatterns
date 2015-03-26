/**
 * 
 */
package 桥接模式;

/**
 * @author CSH 2015-2-19下午2:37:45手机品牌抽象类
 */
public abstract class HandsetBrand {
	protected HandsetSoft soft;

	/**
	 * @param soft手机软件
	 *            设置手机软件，品牌需要关注软件，所以可在机器中安装软件
	 */
	public void setHandsetSoft(HandsetSoft soft) {
		this.soft = soft;
	}

	public abstract void Run();
}
