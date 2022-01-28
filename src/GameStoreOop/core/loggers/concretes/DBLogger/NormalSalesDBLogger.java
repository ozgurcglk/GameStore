package GameStoreOop.core.loggers.concretes.DBLogger;

import GameStoreOop.core.loggers.abstracts.NormalSalesLogger;
import GameStoreOop.entities.concretes.NormalSales;

public class NormalSalesDBLogger implements NormalSalesLogger {

	@Override
	public void add(NormalSales normalSales) {
		System.out.println("Added normal sale of user "+ normalSales.getUserInfo().getId() +" logged to DB");
	}

	@Override
	public void update(NormalSales normalSales) {
		System.out.println("Updated normal sale of user "+ normalSales.getUserInfo().getId() +" logged to DB");
		
	}

	@Override
	public void delete(NormalSales normalSales) {
		System.out.println("Deleted normal sale of user "+ normalSales.getUserInfo().getId() +" logged to DB");
		
	}

}
