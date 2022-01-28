package GameStoreOop.business.abstracts;

import GameStoreOop.entities.concretes.UserInfo;

public interface UserInfoService {
	void add(UserInfo userInfo);
	void update(UserInfo userInfo);
	void delete(UserInfo userInfo);
}
