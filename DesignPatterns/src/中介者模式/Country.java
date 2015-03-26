/**
 * 
 */
package 中介者模式;

/**
 * @author CSH 2015-2-20下午1:29:09
 */
public abstract class Country {
	protected UnitedNation unite;

	/**
	 * @param unite中介者
	 */
	public Country(UnitedNation unite) {
		super();
		this.unite = unite;
	}

}
