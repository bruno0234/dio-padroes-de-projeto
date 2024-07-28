package facade.subsystems.crm;

public class CrmService {

	private CrmService() {};

	public static void registerClient(String name, String zip, String city, String state) {
		System.out.println("The client has been registered in the CRM system:");
		System.out.println(name);
		System.out.println(zip);
		System.out.println(city);
		System.out.println(state);
	}
}
