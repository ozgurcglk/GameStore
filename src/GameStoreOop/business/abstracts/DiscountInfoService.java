package GameStoreOop.business.abstracts;

import GameStoreOop.entities.concretes.DiscountInfo;

public interface DiscountInfoService {
	
	void add(DiscountInfo discountInfo);
	void update(DiscountInfo discountInfo);
	void delete(DiscountInfo discountInfo);
}
