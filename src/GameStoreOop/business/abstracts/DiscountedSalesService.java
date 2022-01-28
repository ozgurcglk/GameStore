package GameStoreOop.business.abstracts;

import GameStoreOop.entities.concretes.DiscountedSales;

public interface DiscountedSalesService {
	void add(DiscountedSales discountedSales);
	void update(DiscountedSales discountedSales);
	void delete(DiscountedSales discountedSales);
}
