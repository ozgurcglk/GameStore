package GameStoreOop.core.loggers.concretes.FileLogger;

import GameStoreOop.core.loggers.abstracts.DiscountedSalesLogger;
import GameStoreOop.entities.concretes.DiscountedSales;

public class DiscountedSalesFileLogger implements DiscountedSalesLogger{
	@Override
	public void add(DiscountedSales discountedSales) {
		System.out.println("Added discounted sale with :"+ discountedSales.getDiscountInfo().getCatchline() +" discount logged to file");

	}

	@Override
	public void update(DiscountedSales discountedSales) {
		System.out.println("Updated discounted sale with :"+ discountedSales.getDiscountInfo().getCatchline() +" discount logged to file");

	}

	@Override
	public void delete(DiscountedSales discountedSales) {
		System.out.println("Deleted discounted sale with :"+ discountedSales.getDiscountInfo().getCatchline() +" discount logged to file");

	}
}
