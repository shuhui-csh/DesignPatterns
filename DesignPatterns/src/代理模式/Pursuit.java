/**
 * 
 */
package 代理模式;

/**
 * @author CSH 2015-2-14下午12:51:58
 */
public class Pursuit implements IGiveGift {
	private SchoolGirl mm;

	/**
	 * 
	 */
	public Pursuit(SchoolGirl mm) {
		this.mm = mm;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 代理模式.IGiveGift#GiveDolls()
	 */
	@Override
	public void GiveDolls() {
		// TODO Auto-generated method stub
		System.out.println("EMS有你：" + mm.getName()
				+ " 一份洋娃娃快递，请于2015.2.14当天到当地邮局自提");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 代理模式.IGiveGift#GiveFlowers()
	 */
	@Override
	public void GiveFlowers() {
		System.out.println("EMS有你：" + mm.getName()
				+ " 一份花儿快递，请于2015.2.14当天到当地邮局自提");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 代理模式.IGiveGift#GiveChocolate()
	 */
	@Override
	public void GiveChocolate() {
		// TODO Auto-generated method stub
		System.out.println("EMS有你：" + mm.getName()
				+ " 一份巧克力快递，请于2015.2.14当天到当地邮局自提");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 代理模式.IGiveGift#GiveRedPacket()
	 */
	@Override
	public void GiveRedPacket() {
		// TODO Auto-generated method stub
		System.out.println("EMS代发红包一个给你：" + mm.getName()
				+ " 请先往支付宝账号：13610165797支付1元钱打开红包");
	}

	/* (non-Javadoc)
	 * @see 代理模式.IGiveGift#GiveCongratution()
	 */
	@Override
	public void GiveCongratution() {
		// TODO Auto-generated method stub
		System.out.println("EMS谨代表CSH向你们：" + mm.getName()
				+ "致以2.14节日最真挚的祝福和鼓励！下一个正月十五和520，咱们不见不散！");
	}

}
