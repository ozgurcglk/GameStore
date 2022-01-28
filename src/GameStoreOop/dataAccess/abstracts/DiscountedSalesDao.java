package GameStoreOop.dataAccess.abstracts;

import GameStoreOop.entities.concretes.DiscountedSales;

public interface DiscountedSalesDao {
	void add(DiscountedSales discountedSales);
	void update(DiscountedSales discountedSales);
	void delete(DiscountedSales discountedSales);
}
