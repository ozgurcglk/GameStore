package GameStoreOop.entities.concretes;

import GameStoreOop.entities.abstracts.Entity;

public class DiscountedSales implements Entity{
	private int id;
	private GameInfo gameInfo;
	private UserInfo userInfo;
	private DiscountInfo discountInfo;
	private int price;
	
	public DiscountedSales() {
		super();
	}

	public DiscountedSales(int id, GameInfo gameInfo, UserInfo userInfo, DiscountInfo discountInfo) {
		super();
		this.id = id;
		this.gameInfo = gameInfo;
		this.userInfo = userInfo;
		this.discountInfo = discountInfo;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public GameInfo getGameInfo() {
		return gameInfo;
	}

	public void setGameInfo(GameInfo gameInfo) {
		this.gameInfo = gameInfo;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public DiscountInfo getDiscountInfo() {
		return discountInfo;
	}

	public void setDiscountInfo(DiscountInfo discountInfo) {
		this.discountInfo = discountInfo;
	}

	public int getPrice() {
		price = gameInfo.getPrice() - discountInfo.getDiscount();
		return price;
	}
	
	
	
}
