/**
 * 
 */
package 代理模式;

/**
 * @author CSH 2015-2-14下午1:00:55 代理类，在构造方法里创建代理类所代表的真实对象，用这个对象调用自己的方法
 */
public class Proxy implements IGiveGift {

	private Pursuit pursuit;

	/**
	 * 
	 */
	public Proxy(SchoolGirl mm) {
		pursuit = new Pursuit(mm);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 代理模式.IGiveGift#GiveDolls()
	 */
	@Override
	public void GiveDolls() {
		// TODO Auto-generated method stub
		pursuit.GiveDolls();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 代理模式.IGiveGift#GiveFlowers()
	 */
	@Override
	public void GiveFlowers() {
		// TODO Auto-generated method stub
		pursuit.GiveFlowers();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 代理模式.IGiveGift#GiveChocolate()
	 */
	@Override
	public void GiveChocolate() {
		// TODO Auto-generated method stub
		pursuit.GiveChocolate();
	}

	/* (non-Javadoc)
	 * @see 代理模式.IGiveGift#GiveRedPacket()
	 */
	@Override
	public void GiveRedPacket() {
		// TODO Auto-generated method stub
		pursuit.GiveRedPacket();
	}

	/* (non-Javadoc)
	 * @see 代理模式.IGiveGift#GiveCongratution()
	 */
	@Override
	public void GiveCongratution() {
		// TODO Auto-generated method stub
		pursuit.GiveCongratution();
	}

}
