package GameStoreOop.dataAccess.abstracts;

import GameStoreOop.entities.concretes.NormalSales;

public interface NormalSalesDao {
	void add(NormalSales normalSales);
	void update(NormalSales normalSales);
	void delete(NormalSales normalSales);
}
