package GameStoreOop.dataAccess.concretes.jdbcimpls;

import GameStoreOop.dataAccess.abstracts.DiscountedSalesDao;
import GameStoreOop.entities.concretes.DiscountedSales;

public class DiscountedSalesJdbcDao implements DiscountedSalesDao{
	
	@Override
	public void add(DiscountedSales discountedSales) {
		System.out.println("Discounted sale with :"+ discountedSales.getDiscountInfo().getCatchline() +" discount added via JDBC");
	}

	@Override
	public void update(DiscountedSales discountedSales) {
		System.out.println("Discounted sale with :"+ discountedSales.getDiscountInfo().getCatchline() +" discount updated via JDBC");		
	}

	@Override
	public void delete(DiscountedSales discountedSales) {
		System.out.println("Discounted sale with :"+ discountedSales.getDiscountInfo().getCatchline() +" discount deleted via JDBC");		
	}


}
