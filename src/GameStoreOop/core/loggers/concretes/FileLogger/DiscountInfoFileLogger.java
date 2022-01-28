package GameStoreOop.core.loggers.concretes.FileLogger;

import GameStoreOop.core.loggers.abstracts.DiscountInfoLogger;
import GameStoreOop.entities.concretes.DiscountInfo;

public class DiscountInfoFileLogger implements DiscountInfoLogger {
	@Override
	public void add(DiscountInfo discountInfo) {
		System.out.println("Added discount: "+ discountInfo.getCatchline() +"logged to file");
	}

	@Override
	public void update(DiscountInfo discountInfo) {
		System.out.println("Updated discount: "+ discountInfo.getCatchline() +"logged to file");
	}

	@Override
	public void delete(DiscountInfo discountInfo) {
		System.out.println("Deleted discount: "+ discountInfo.getCatchline() +"logged to file");
	}
}
