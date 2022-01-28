package GameStoreOop.dataAccess.abstracts;

import GameStoreOop.entities.concretes.GameInfo;

public interface GameInfoDao {
	void add(GameInfo gameInfo);
	void update(GameInfo gameInfo);
	void delete(GameInfo gameInfo);
}
