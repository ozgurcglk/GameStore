package GameStoreOop.dataAccess.concretes.hibernateimpls;

import GameStoreOop.dataAccess.abstracts.GameInfoDao;
import GameStoreOop.entities.concretes.GameInfo;

public class GameInfoHibernateDao implements GameInfoDao {

	@Override
	public void add(GameInfo gameInfo) {
		System.out.println("Game "+ gameInfo.getGameName() +" added via Hibernate");
	}

	@Override
	public void update(GameInfo gameInfo) {
		System.out.println("Game "+ gameInfo.getGameName() +" updated via Hibernate");
		
	}

	@Override
	public void delete(GameInfo gameInfo) {
		System.out.println("Game "+ gameInfo.getGameName() +" deleted via Hibernate");
		
	}

}
