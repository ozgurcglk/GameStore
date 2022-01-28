package GameStoreOop.core.loggers.abstracts;

import GameStoreOop.entities.concretes.NormalSales;

public interface NormalSalesLogger {
	
	void add(NormalSales normalSales);
	void update(NormalSales normalSales);
	void delete(NormalSales normalSales);
}
