/**
 * 
 */
package 抽象工厂模式;

/**
 * @author CSH 2015-2-17上午10:10:37定义一个创建访问User表对象的抽象的工厂接口
 */
public interface IFactory {
	public IUser CreateUser();

	IDepartment CreatDepartment();
}
