package GameStoreOop.dataAccess.abstracts;

import GameStoreOop.entities.concretes.DiscountInfo;

public interface DiscountInfoDao {
	void add(DiscountInfo discountInfo);
	void update(DiscountInfo discountInfo);
	void delete(DiscountInfo discountInfo);
}
