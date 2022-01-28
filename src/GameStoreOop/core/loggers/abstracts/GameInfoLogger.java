package GameStoreOop.core.loggers.abstracts;

import GameStoreOop.entities.concretes.GameInfo;

public interface GameInfoLogger {
	void add(GameInfo gameInfo);
	void update(GameInfo gameInfo);
	void delete(GameInfo gameInfo);
}
