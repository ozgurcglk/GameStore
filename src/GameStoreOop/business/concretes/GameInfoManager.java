package GameStoreOop.business.concretes;

import GameStoreOop.business.abstracts.GameInfoService;
import GameStoreOop.dataAccess.abstracts.GameInfoDao;
import GameStoreOop.entities.concretes.GameInfo;

public class GameInfoManager implements GameInfoService {
	GameInfoDao gameInfoDao;

	public GameInfoManager() {
		super();
	}

	public GameInfoManager(GameInfoDao gameInfoDao) {
		super();
		this.gameInfoDao = gameInfoDao;
	}

	@Override
	public void add(GameInfo gameInfo) {
		gameInfoDao.add(gameInfo);
	}

	@Override
	public void update(GameInfo gameInfo) {
		gameInfoDao.update(gameInfo);
		
	}

	@Override
	public void delete(GameInfo gameInfo) {
		gameInfoDao.delete(gameInfo);
		
	}
	

}
