package GameStoreOop.dataAccess.abstracts;

import GameStoreOop.entities.concretes.UserInfo;

public interface UserInfoDao {
	void add(UserInfo userInfo);
	void update(UserInfo userInfo);
	void delete(UserInfo userInfo);
}
