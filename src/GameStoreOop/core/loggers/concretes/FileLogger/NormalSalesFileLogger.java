package GameStoreOop.core.loggers.concretes.FileLogger;

import GameStoreOop.core.loggers.abstracts.NormalSalesLogger;
import GameStoreOop.entities.concretes.NormalSales;

public class NormalSalesFileLogger implements NormalSalesLogger{
	@Override
	public void add(NormalSales normalSales) {
		System.out.println("Added normal sale of user "+ normalSales.getUserInfo().getId() +" logged to file");
	}

	@Override
	public void update(NormalSales normalSales) {
		System.out.println("Updated normal sale of user "+ normalSales.getUserInfo().getId() +" logged to file");
		
	}

	@Override
	public void delete(NormalSales normalSales) {
		System.out.println("Deleted normal sale of user "+ normalSales.getUserInfo().getId() +" logged to file");
		
	}
}
