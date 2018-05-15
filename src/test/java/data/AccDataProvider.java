package data;

import org.testng.annotations.DataProvider;

/**
 * @author Elena_Sheloputova
 */
public class AccDataProvider {

	@DataProvider
	public static Object[][] sysadminUser() {
		return new Object[][]{
//				{UserData.SYSADMIN.getUserDto()}
		};
	}

	@DataProvider
	public static Object[][] adminUser() {
		return new Object[][]{
//				{UserData.ADMIN.getUserDto()}
		};
	}
}
