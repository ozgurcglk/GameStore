package GameStoreOop.core.loggers.concretes.DBLogger;

import GameStoreOop.core.loggers.abstracts.DiscountedSalesLogger;
import GameStoreOop.entities.concretes.DiscountedSales;

public class DiscountedSalesDBLogger implements DiscountedSalesLogger {

	@Override
	public void add(DiscountedSales discountedSales) {
		System.out.println("Added discounted sale with :"+ discountedSales.getDiscountInfo().getCatchline() +" discount logged to DB");

	}

	@Override
	public void update(DiscountedSales discountedSales) {
		System.out.println("Updated discounted sale with :"+ discountedSales.getDiscountInfo().getCatchline() +" discount logged to DB");

	}

	@Override
	public void delete(DiscountedSales discountedSales) {
		System.out.println("Deleted discounted sale with :"+ discountedSales.getDiscountInfo().getCatchline() +" discount logged to DB");

	}

}
