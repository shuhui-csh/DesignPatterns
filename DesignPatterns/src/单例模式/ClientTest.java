/**
 * 
 */
package 单例模式;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Single;

/**
 * @author CSH 2015-2-19下午12:30:36
 */
public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		if (s1.equals(s2)) {
			System.out.println("s1,s2两个对象是同一实例");
		} else {
			System.out.println("s1,s2两个对象不是同一实例");
		}

		// TODO Auto-generated method stub
		StaticInnerSingleton s3 = StaticInnerSingleton.getInstance();
		StaticInnerSingleton s4 = StaticInnerSingleton.getInstance();
		if (s4.equals(s3)) {
			System.out.println(" s3, s4两个对象是同一实例");
		} else {
			System.out.println(" s3,s4两个对象不是同一实例");
		}

		SingletonEnum s5 = SingletonEnum.getInstance();
		SingletonEnum s6 = SingletonEnum.getInstance();
		if (s5.equals(s6)) {
			System.out.println(" s5, s6两个对象是同一实例");
		} else {
			System.out.println(" s5,s6两个对象不是同一实例");
		}
		
		s5.setAge(23);
		s5.setName("nihao");
		
		System.out.println("s5的信息"+s5.getAge()+s5.getName());
		System.out.println("s6的信息"+s6.getAge()+s6.getName());
	}

}
