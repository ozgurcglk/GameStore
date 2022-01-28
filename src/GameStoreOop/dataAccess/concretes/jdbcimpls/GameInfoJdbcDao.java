package GameStoreOop.dataAccess.concretes.jdbcimpls;

import GameStoreOop.dataAccess.abstracts.GameInfoDao;
import GameStoreOop.entities.concretes.GameInfo;

public class GameInfoJdbcDao implements GameInfoDao{

	@Override
	public void add(GameInfo gameInfo) {
		System.out.println("Game "+ gameInfo.getGameName() +" added via JDBC");
	}

	@Override
	public void update(GameInfo gameInfo) {
		System.out.println("Game "+ gameInfo.getGameName() +" updated via JDBC");
		
	}

	@Override
	public void delete(GameInfo gameInfo) {
		System.out.println("Game "+ gameInfo.getGameName() +" deleted via JDBC");
		
	}

}
