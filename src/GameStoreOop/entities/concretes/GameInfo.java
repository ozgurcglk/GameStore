package GameStoreOop.entities.concretes;

import GameStoreOop.entities.abstracts.Entity;

public class GameInfo implements Entity{
	private int id;
	private String gameName;
	private int developmentYear;
	private int price;
	
	public GameInfo() {
		super();
	}

	public GameInfo(int id, String gameName, int developmentYear, int price) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.developmentYear = developmentYear;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getDevelopmentYear() {
		return developmentYear;
	}

	public void setDevelopmentYear(int developmentYear) {
		this.developmentYear = developmentYear;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
