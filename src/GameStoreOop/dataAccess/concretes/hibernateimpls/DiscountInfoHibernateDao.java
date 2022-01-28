package GameStoreOop.dataAccess.concretes.hibernateimpls;

import GameStoreOop.dataAccess.abstracts.DiscountInfoDao;
import GameStoreOop.entities.concretes.DiscountInfo;

public class DiscountInfoHibernateDao implements DiscountInfoDao{

	@Override
	public void add(DiscountInfo discountInfo) {
		System.out.println("Discount: "+ discountInfo.getCatchline() +" added via Hibernate");
	}

	@Override
	public void update(DiscountInfo discountInfo) {
		System.out.println("Discount: "+ discountInfo.getCatchline() +" updated via Hibernate");
		
	}

	@Override
	public void delete(DiscountInfo discountInfo) {
		System.out.println("Discount: "+ discountInfo.getCatchline() +" deleted via Hibernate");
		
	}

}
