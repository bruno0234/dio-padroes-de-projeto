package facade;

import facade.subsystems.crm.CrmService;
import facade.subsystems.zip.ZipApi;

public class Facade {
	public void migrateClient(String name, String zip) {
		String city = ZipApi.getInstance().retrieveCity(zip);
		String state = ZipApi.getInstance().retrieveState(zip);

		CrmService.registerClient(name, zip, city, state);
	}
}
