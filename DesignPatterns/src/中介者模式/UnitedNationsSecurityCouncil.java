/**
 * 
 */
package 中介者模式;

/**
 * @author CSH 2015-2-20下午1:39:27
 */
public class UnitedNationsSecurityCouncil extends UnitedNation {
	private USA usa;
	private Iraq iraq;

	/**
	 * @param usa
	 *            the usa to set
	 */
	public void setUsa(USA usa) {
		this.usa = usa;
	}

	/**
	 * @param iraq
	 *            the iraq to set
	 */
	public void setIraq(Iraq iraq) {
		this.iraq = iraq;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 中介者模式.UnitedNation#Declare(java.lang.String, 中介者模式.Country)
	 */
	@Override
	public void Declare(String message, Country country) {
		// TODO Auto-generated method stub
		if (country == usa) {
			iraq.getMessage(message);

		} else {
			usa.getMessage(message);
		}
	}

}
