/**
 * 
 */
package 职责链模式;

/**
 * @author CSH 2015-2-20下午12:00:07
 */
public class Request {
	// 申请类别
	private String requestType;
	// 申请内容
	private String requestContent;
	// 数量
	private int number;

	/**
	 * @return the requestType
	 */
	public String getRequestType() {
		return requestType;
	}

	/**
	 * @param requestType
	 *            the requestType to set
	 */
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	/**
	 * @return the requestContent
	 */
	public String getRequestContent() {
		return requestContent;
	}

	/**
	 * @param requestContent
	 *            the requestContent to set
	 */
	public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

}
