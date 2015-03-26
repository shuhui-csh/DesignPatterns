/**
 * 
 */
package 抽象工厂模式;

/**
 * @author CSH 2015-2-17上午9:56:34 IUser接口，用于客户端访问，解除与具体数据库访问的耦合
 */
public interface IUser {
	public void Insert(User user);

	public User GetUser(int id);
}
