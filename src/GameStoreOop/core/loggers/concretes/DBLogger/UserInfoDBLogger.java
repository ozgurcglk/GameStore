package GameStoreOop.core.loggers.concretes.DBLogger;

import GameStoreOop.core.loggers.abstracts.UserInfoLogger;
import GameStoreOop.entities.concretes.UserInfo;

public class UserInfoDBLogger implements UserInfoLogger{

	@Override
	public void add(UserInfo userInfo) {
		System.out.println("Added user with ID "+ userInfo.getId() +" logged to DB");		
		
	}

	@Override
	public void update(UserInfo userInfo) {
		System.out.println("Updated user with ID "+ userInfo.getId() +" logged to DB");		
		
	}

	@Override
	public void delete(UserInfo userInfo) {
		System.out.println("Deleted user with ID "+ userInfo.getId() +" logged to DB");		
		
	}

}
