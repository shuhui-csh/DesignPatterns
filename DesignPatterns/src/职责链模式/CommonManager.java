/**
 * 
 */
package 职责链模式;

/**
 * @author CSH 2015-2-20下午12:03:15
 */
public class CommonManager extends Manager {

	/**
	 * @param name
	 */
	public CommonManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 职责链模式.Manager#RequestApplicatons(职责链模式.Request)
	 */
	public void RequestApplicatons(Request request) {
		// 经理所能有的权限就是可准许下属两天内的假期
		if (request.getRequestType() == "请假" && request.getNumber() <= 2) {
			System.out.println(name + request.getRequestType()
					+ request.getNumber() + "被批准");
		} else {
			// 其余的申请都需转到上级
			if (superior != null) {
				superior.RequestApplicatons(request);
			}
		}
	}
}
