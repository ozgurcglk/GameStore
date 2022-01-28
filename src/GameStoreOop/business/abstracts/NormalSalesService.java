package GameStoreOop.business.abstracts;

import GameStoreOop.entities.concretes.NormalSales;

public interface NormalSalesService {
	
	void add(NormalSales normalSales);
	void update(NormalSales normalSales);
	void delete(NormalSales normalSales);
}
