package GameStoreOop.dataAccess.concretes.hibernateimpls;

import GameStoreOop.dataAccess.abstracts.UserInfoDao;
import GameStoreOop.entities.concretes.UserInfo;

public class UserInfoHibernateDao implements UserInfoDao {

	@Override
	public void add(UserInfo userInfo) {
		System.out.println("User with ID "+ userInfo.getId() +" added via Hibernate");		
	}

	@Override
	public void update(UserInfo userInfo) {
		System.out.println("User with ID "+ userInfo.getId() +" updated via Hibernate");
		
	}

	@Override
	public void delete(UserInfo userInfo) {
		System.out.println("User with ID "+ userInfo.getId() +" deleted via Hibernate");
		
	}

}
