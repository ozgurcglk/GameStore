package GameStoreOop.business.concretes;

import GameStoreOop.business.abstracts.DiscountInfoService;
import GameStoreOop.dataAccess.abstracts.DiscountInfoDao;
import GameStoreOop.entities.concretes.DiscountInfo;

public class DiscountInfoManager implements DiscountInfoService{
	DiscountInfoDao discountInfoDao;

	public DiscountInfoManager() {
		super();
	}

	public DiscountInfoManager(DiscountInfoDao discountInfoDao) {
		super();
		this.discountInfoDao = discountInfoDao;
	}

	@Override
	public void add(DiscountInfo discountInfo) {
		discountInfoDao.add(discountInfo);
	}

	@Override
	public void update(DiscountInfo discountInfo) {
		discountInfoDao.update(discountInfo);
		
	}

	@Override
	public void delete(DiscountInfo discountInfo) {
		discountInfoDao.delete(discountInfo);
		
	}
	
}
