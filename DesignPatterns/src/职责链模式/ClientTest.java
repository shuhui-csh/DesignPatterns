/**
 * 
 */
package 职责链模式;

/**
 * @author CSH 2015-2-20下午12:19:53
 */
public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeneralManager csh = new GeneralManager("树辉");
		Majordomo lxm = new Majordomo("小妹");
		CommonManager lm = new CommonManager("李妙");

		// 设置上级，完全可以根据实际需求来更改设置
		lm.SetSuperior(lxm);
		lxm.SetSuperior(csh);

		Request request1 = new Request();
		request1.setRequestType("请假");
		request1.setRequestContent("小朋友病了，需要请个假");
		request1.setNumber(2);
		lm.RequestApplicatons(request1);

		Request request2 = new Request();
		request2.setRequestType("请假");
		request2.setRequestContent("小朋友病了，需要请个假");
		request2.setNumber(4);
		lm.RequestApplicatons(request2);

		Request request3 = new Request();
		request3.setRequestType("加薪");
		request3.setRequestContent("我那么辛苦，需要给我加薪");
		request3.setNumber(500);
		lm.RequestApplicatons(request3);

		Request request4 = new Request();
		request4.setRequestType("加薪");
		request4.setRequestContent("我那么辛苦，需要给我加薪");
		request4.setNumber(600);
		lm.RequestApplicatons(request4);
	}
}
