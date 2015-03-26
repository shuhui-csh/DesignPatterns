/**
 * 
 */
package 职责链模式;

/**
 * @author CSH 2015-2-20下午12:11:06总监
 */
public class Majordomo extends Manager {

	/**
	 * @param name
	 */
	public Majordomo(String name) {
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
		// 总监所能有的权限就是可准许下属一周内的假期
		if (request.getRequestType() == "请假" && request.getNumber() <= 5) {
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
