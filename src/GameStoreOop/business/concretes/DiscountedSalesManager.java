package GameStoreOop.business.concretes;

import GameStoreOop.business.abstracts.DiscountedSalesService;
import GameStoreOop.dataAccess.abstracts.DiscountedSalesDao;
import GameStoreOop.entities.concretes.DiscountedSales;

public class DiscountedSalesManager implements DiscountedSalesService {
	DiscountedSalesDao discountedSalesDao;

	public DiscountedSalesManager() {
		super();
	}

	public DiscountedSalesManager(DiscountedSalesDao discountedSalesDao) {
		super();
		this.discountedSalesDao = discountedSalesDao;
	}

	@Override
	public void add(DiscountedSales discountedSales) {
		discountedSalesDao.add(discountedSales);
	}

	@Override
	public void update(DiscountedSales discountedSales) {
		discountedSalesDao.update(discountedSales);
		
	}

	@Override
	public void delete(DiscountedSales discountedSales) {
		discountedSalesDao.delete(discountedSales);
		
	}
	
	
}
