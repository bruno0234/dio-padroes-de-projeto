package facade.subsystems.zip;

import singleton.EagerSingleton;

public class ZipApi {
	private static ZipApi instance = new ZipApi();

	private ZipApi() {};

	public static ZipApi getInstance() {
		return instance;
	}

	public String retrieveCity(String zip) {
		return "Some City";
	}

	public String retrieveState(String zip) {
		return "Some State";
	}
}
