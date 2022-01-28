package GameStoreOop.core.loggers.abstracts;

import GameStoreOop.entities.concretes.DiscountedSales;

public interface DiscountedSalesLogger {

	void add(DiscountedSales discountedSales);
	void update(DiscountedSales discountedSales);
	void delete(DiscountedSales discountedSales);
	
}
