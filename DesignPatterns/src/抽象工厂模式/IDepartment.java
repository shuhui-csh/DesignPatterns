/**
 * 
 */
package 抽象工厂模式;

/**
 * @author CSH 2015-2-17上午10:25:44
 */
public interface IDepartment {
	void Insert(Department department);

	Department GetDepartment(int id);
}
