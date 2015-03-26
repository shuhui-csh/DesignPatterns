/**
 * 
 */
package 原型模式;

/**
 * @author CSH 2015-2-15上午10:29:51
 */
public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Resume2 a = new Resume2("陈树辉");
		a.SetPersonalInfo("男", "21");
		a.SetWorkExperience("2016-2020", "华为");

		try {
			Resume2 b = (Resume2) a.clone();
			b.SetWorkExperience("2016-2018", "腾讯");
			b.Display();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a.Display();
	}

}
