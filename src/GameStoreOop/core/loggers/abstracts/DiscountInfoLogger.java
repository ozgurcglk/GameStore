package GameStoreOop.core.loggers.abstracts;

import GameStoreOop.entities.concretes.DiscountInfo;

public interface DiscountInfoLogger {
	
	void add(DiscountInfo discountInfo);
	void update(DiscountInfo discountInfo);
	void delete(DiscountInfo discountInfo);
}
