package GameStoreOop.business.abstracts;

import GameStoreOop.entities.concretes.GameInfo;

public interface GameInfoService {
	void add(GameInfo gameInfo);
	void update(GameInfo gameInfo);
	void delete(GameInfo gameInfo);
}
