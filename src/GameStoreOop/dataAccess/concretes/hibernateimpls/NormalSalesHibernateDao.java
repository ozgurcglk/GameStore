package GameStoreOop.dataAccess.concretes.hibernateimpls;

import GameStoreOop.dataAccess.abstracts.NormalSalesDao;
import GameStoreOop.entities.concretes.NormalSales;

public class NormalSalesHibernateDao implements NormalSalesDao {

	@Override
	public void add(NormalSales normalSales) {
		System.out.println("Normal sale of user "+ normalSales.getUserInfo().getId() +" added via Hibernate");
	}

	@Override
	public void update(NormalSales normalSales) {
		System.out.println("Normal sale of user "+ normalSales.getUserInfo().getId() +" updated via Hibernate");
		
	}

	@Override
	public void delete(NormalSales normalSales) {
		System.out.println("Normal sale of user "+ normalSales.getUserInfo().getId() +" deleted via Hibernate");
		
	}

}
