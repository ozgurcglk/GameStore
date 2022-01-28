package GameStoreOop.dataAccess.concretes.hibernateimpls;

import GameStoreOop.dataAccess.abstracts.DiscountedSalesDao;
import GameStoreOop.entities.concretes.DiscountedSales;

public class DiscountedSalesHibernateDao implements DiscountedSalesDao{

	@Override
	public void add(DiscountedSales discountedSales) {
		System.out.println("Discounted sale with :"+ discountedSales.getDiscountInfo().getCatchline() +" discount added via Hibernate");
	}

	@Override
	public void update(DiscountedSales discountedSales) {
		System.out.println("Discounted sale with :"+ discountedSales.getDiscountInfo().getCatchline() +" discount updated via Hibernate");		
	}

	@Override
	public void delete(DiscountedSales discountedSales) {
		System.out.println("Discounted sale with :"+ discountedSales.getDiscountInfo().getCatchline() +" discount deleted via Hibernate");		
	}

}
