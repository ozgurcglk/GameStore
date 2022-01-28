package GameStoreOop.business.concretes;

import GameStoreOop.adapters.abstracts.IUserCheckService;
import GameStoreOop.business.abstracts.UserInfoService;
import GameStoreOop.dataAccess.abstracts.UserInfoDao;
import GameStoreOop.entities.concretes.UserInfo;

public class UserInfoManager implements UserInfoService {
	private UserInfoDao userInfoDao;
	private IUserCheckService iUserCheckService;
	
	public UserInfoManager() {
		super();
	}



	public UserInfoManager(UserInfoDao userInfoDao, IUserCheckService iUserCheckService) {
		super();
		this.userInfoDao = userInfoDao;
		this.iUserCheckService = iUserCheckService;
	}



	@Override
	public void add(UserInfo userInfo) {
		if(iUserCheckService.checkIfRealPerson(userInfo)) {
			userInfoDao.add(userInfo);
		} else {
			System.out.println("Not verified, please try again");
		}
	}

	@Override
	public void update(UserInfo userInfo) {
		userInfoDao.update(userInfo);
	}

	@Override
	public void delete(UserInfo userInfo) {
		userInfoDao.delete(userInfo);
	}
	
	
	
}
