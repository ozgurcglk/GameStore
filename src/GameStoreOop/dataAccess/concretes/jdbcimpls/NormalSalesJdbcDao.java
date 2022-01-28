package GameStoreOop.dataAccess.concretes.jdbcimpls;

import GameStoreOop.dataAccess.abstracts.NormalSalesDao;
import GameStoreOop.entities.concretes.NormalSales;

public class NormalSalesJdbcDao implements NormalSalesDao {

	@Override
	public void add(NormalSales normalSales) {
		System.out.println("Normal sale of user "+ normalSales.getUserInfo().getId() +" added via JDBC");
		
	}

	@Override
	public void update(NormalSales normalSales) {
		System.out.println("Normal sale of user "+ normalSales.getUserInfo().getId() +" updated via JDBC");
		
	}

	@Override
	public void delete(NormalSales normalSales) {
		System.out.println("Normal sale of user "+ normalSales.getUserInfo().getId() +" updated via JDBC");
		
	}

}
