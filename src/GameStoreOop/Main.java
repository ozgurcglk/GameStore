package GameStoreOop;

import GameStoreOop.adapters.concretes.MernisServiceAdapter;
import GameStoreOop.business.concretes.DiscountInfoManager;
import GameStoreOop.business.concretes.DiscountedSalesManager;
import GameStoreOop.business.concretes.GameInfoManager;
import GameStoreOop.business.concretes.NormalSalesManager;
import GameStoreOop.business.concretes.UserInfoManager;
import GameStoreOop.core.loggers.abstracts.DiscountedSalesLogger;
import GameStoreOop.core.loggers.abstracts.NormalSalesLogger;
import GameStoreOop.core.loggers.abstracts.UserInfoLogger;
import GameStoreOop.core.loggers.concretes.DBLogger.DiscountedSalesDBLogger;
import GameStoreOop.core.loggers.concretes.DBLogger.NormalSalesDBLogger;
import GameStoreOop.core.loggers.concretes.DBLogger.UserInfoDBLogger;
import GameStoreOop.dataAccess.concretes.hibernateimpls.DiscountInfoHibernateDao;
import GameStoreOop.dataAccess.concretes.hibernateimpls.DiscountedSalesHibernateDao;
import GameStoreOop.dataAccess.concretes.hibernateimpls.GameInfoHibernateDao;
import GameStoreOop.dataAccess.concretes.hibernateimpls.NormalSalesHibernateDao;
import GameStoreOop.dataAccess.concretes.hibernateimpls.UserInfoHibernateDao;
import GameStoreOop.entities.concretes.DiscountInfo;
import GameStoreOop.entities.concretes.DiscountedSales;
import GameStoreOop.entities.concretes.GameInfo;
import GameStoreOop.entities.concretes.NormalSales;
import GameStoreOop.entities.concretes.UserInfo;

public class Main {

	public static void main(String[] args) {
		UserInfo userInfo1 = new UserInfo(1, "Özgür Berke", "Çaðlak",1900,"123123");
		UserInfoManager userInfoManager = new UserInfoManager(new UserInfoHibernateDao(), new MernisServiceAdapter());
		
		userInfoManager.add(userInfo1);
		System.out.println(" ");
		
		DiscountInfo discountInfo = new DiscountInfo(1, "20$ discount", 20);
		DiscountInfoManager discountInfoManager = new DiscountInfoManager(new DiscountInfoHibernateDao());
		
		discountInfoManager.add(discountInfo);
		System.out.println(" ");
		
		GameInfo gameInfo = new GameInfo(1, "FIFA 22", 2022, 60);
		GameInfoManager gameInfoManager = new GameInfoManager(new GameInfoHibernateDao());
		
		gameInfoManager.add(gameInfo);
		System.out.println(" ");
		
		NormalSales normalSales1 = new NormalSales(1, gameInfo, userInfo1);
		NormalSalesManager normalSalesManager1 = new NormalSalesManager(new NormalSalesHibernateDao());
		NormalSalesLogger normalSalesLogger = new NormalSalesDBLogger();
		
		
		normalSalesManager1.add(normalSales1);
		normalSalesLogger.add(normalSales1);
		System.out.println("Game bought for "+ normalSales1.getPrice() +"$");
		System.out.println(" ");
		
		DiscountedSales discountedSales1 = new DiscountedSales(1, gameInfo, userInfo1, discountInfo);
		DiscountedSalesManager discountedSalesManager1 = new DiscountedSalesManager(new DiscountedSalesHibernateDao());
		DiscountedSalesLogger discountedSalesLogger = new DiscountedSalesDBLogger();
		
		discountedSalesManager1.add(discountedSales1);
		discountedSalesLogger.add(discountedSales1);
		System.out.println("Game bought for discounted "+discountedSales1.getPrice()+"$");
		System.out.println(" ");
	}

}
