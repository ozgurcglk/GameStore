package GameStoreOop.entities.concretes;

import GameStoreOop.entities.abstracts.Entity;

public class NormalSales implements Entity {
	private int id;
	private GameInfo gameInfo;
	private UserInfo userInfo;
	private int price;

	public NormalSales() {
		super();
	}

	public NormalSales(int id, GameInfo gameInfo, UserInfo userInfo) {
		super();
		this.id = id;
		this.gameInfo = gameInfo;
		this.userInfo = userInfo;
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

	public int getPrice() {
		price = gameInfo.getPrice();
		return price;
	}
	
	
}
