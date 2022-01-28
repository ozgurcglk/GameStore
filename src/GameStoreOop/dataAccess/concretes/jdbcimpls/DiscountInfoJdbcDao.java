package GameStoreOop.dataAccess.concretes.jdbcimpls;

import GameStoreOop.dataAccess.abstracts.DiscountInfoDao;
import GameStoreOop.entities.concretes.DiscountInfo;

public class DiscountInfoJdbcDao implements DiscountInfoDao{

	@Override
	public void add(DiscountInfo discountInfo) {
		System.out.println("Discount: "+ discountInfo.getCatchline() +"added via JDBC");

	}

	@Override
	public void update(DiscountInfo discountInfo) {
		System.out.println("Discount: "+ discountInfo.getCatchline() +"updated via JDBC");

	}

	@Override
	public void delete(DiscountInfo discountInfo) {
		System.out.println("Discount: "+ discountInfo.getCatchline() +"deleted via JDBC");

	}

}
