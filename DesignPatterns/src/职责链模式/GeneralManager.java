/**
 * 
 */
package 职责链模式;

/**
 * @author CSH 2015-2-20下午12:13:23总经理的权限就是全部都需要处理
 */
public class GeneralManager extends Manager {

	/**
	 * @param name
	 */
	public GeneralManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 职责链模式.Manager#RequestApplicatons(职责链模式.Request)
	 */
	@Override
	public void RequestApplicatons(Request request) {
		// 总经理所能有的权限就是可准许下属任意天的假期
		if (request.getRequestType() == "请假") {
			System.out.println(name + request.getRequestType()
					+ request.getNumber() + "被批准");
		} else if (request.getRequestType() == "加薪"
				&& request.getNumber() <= 500) {
			System.out.println(name + request.getRequestContent()
					+ request.getNumber() + "被批准");
		} else if (request.getRequestType() == "加薪"
				&& request.getNumber() > 500) {
			System.out.println(name + request.getRequestContent()
					+ request.getNumber() + "再说吧！！");
		}
	}
}
