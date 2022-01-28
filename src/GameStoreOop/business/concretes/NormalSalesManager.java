package GameStoreOop.business.concretes;

import GameStoreOop.business.abstracts.NormalSalesService;
import GameStoreOop.dataAccess.abstracts.NormalSalesDao;
import GameStoreOop.entities.concretes.NormalSales;

public class NormalSalesManager implements NormalSalesService {
	NormalSalesDao normalSalesDao;

	public NormalSalesManager() {
		super();
	}

	public NormalSalesManager(NormalSalesDao normalSalesDao) {
		super();
		this.normalSalesDao = normalSalesDao;
	}

	@Override
	public void add(NormalSales normalSales) {
		normalSalesDao.add(normalSales);
	}

	@Override
	public void update(NormalSales normalSales) {
		normalSalesDao.update(normalSales);
		
	}

	@Override
	public void delete(NormalSales normalSales) {
		normalSalesDao.delete(normalSales);
		
	}
	
	

}
