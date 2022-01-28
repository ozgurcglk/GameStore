package GameStoreOop.core.loggers.concretes.FileLogger;

import GameStoreOop.core.loggers.abstracts.GameInfoLogger;
import GameStoreOop.entities.concretes.GameInfo;

public class GameInfoFileLogger implements GameInfoLogger {
	@Override
	public void add(GameInfo gameInfo) {
		System.out.println("Added game "+ gameInfo.getGameName() +" logged to file");
	}

	@Override
	public void update(GameInfo gameInfo) {
		System.out.println("Updated game "+ gameInfo.getGameName() +" logged to file");
		
	}

	@Override
	public void delete(GameInfo gameInfo) {
		System.out.println("Deleted game "+ gameInfo.getGameName() +" logged to file");
		
	}
}
