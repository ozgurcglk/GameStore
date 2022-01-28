package GameStoreOop.adapters.abstracts;

import GameStoreOop.entities.concretes.UserInfo;

public interface IUserCheckService {
	boolean checkIfRealPerson(UserInfo userInfo);
}
