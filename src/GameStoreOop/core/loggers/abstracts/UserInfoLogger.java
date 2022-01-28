package GameStoreOop.core.loggers.abstracts;

import GameStoreOop.entities.concretes.UserInfo;

public interface UserInfoLogger {
	void add(UserInfo userInfo);
	void update(UserInfo userInfo);
	void delete(UserInfo userInfo);
}
