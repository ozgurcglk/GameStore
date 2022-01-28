package GameStoreOop.dataAccess.concretes.jdbcimpls;

import GameStoreOop.dataAccess.abstracts.UserInfoDao;
import GameStoreOop.entities.concretes.UserInfo;

public class UserInfoJdbcDao implements UserInfoDao{

	@Override
	public void add(UserInfo userInfo) {
		System.out.println("User with ID "+ userInfo.getId() +" added via JDBC");		
	}

	@Override
	public void update(UserInfo userInfo) {
		System.out.println("User with ID "+ userInfo.getId() +" updated via JDBC");
		
	}

	@Override
	public void delete(UserInfo userInfo) {
		System.out.println("User with ID "+ userInfo.getId() +" deleted via JDBC");
		
	}

}
