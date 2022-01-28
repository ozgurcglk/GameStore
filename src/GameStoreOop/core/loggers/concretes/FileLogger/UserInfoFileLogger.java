package GameStoreOop.core.loggers.concretes.FileLogger;

import GameStoreOop.core.loggers.abstracts.UserInfoLogger;
import GameStoreOop.entities.concretes.UserInfo;

public class UserInfoFileLogger implements UserInfoLogger{

	@Override
	public void add(UserInfo userInfo) {
		System.out.println("Added user with ID "+ userInfo.getId() +" logged to file");		
		
	}

	@Override
	public void update(UserInfo userInfo) {
		System.out.println("Updated user with ID "+ userInfo.getId() +" logged to file");		
		
	}

	@Override
	public void delete(UserInfo userInfo) {
		System.out.println("Deleted user with ID "+ userInfo.getId() +" logged to file");		
		
	}

}
