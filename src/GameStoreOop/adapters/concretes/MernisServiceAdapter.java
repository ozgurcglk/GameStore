package GameStoreOop.adapters.concretes;

import java.rmi.RemoteException;

import GameStoreOop.adapters.abstracts.IUserCheckService;
import GameStoreOop.entities.concretes.UserInfo;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IUserCheckService {

	@Override
	public boolean checkIfRealPerson(UserInfo userInfo) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(userInfo.getNationalityId()), userInfo.getFirstName().toUpperCase(), userInfo.getLastName().toUpperCase(), userInfo.getYearOfBirth());
		} catch (NumberFormatException | RemoteException e) {
			e.printStackTrace();
			return false;
		}
	}

}
