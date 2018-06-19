import configuration.ConfigProperties;
import models.User;
import org.testng.annotations.*;
import org.testng.log4testng.Logger;
import pages.*;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * @author Elena_Sheloputova
 */
public class EditCasesTest {

	final static Logger logger = Logger.getLogger(AuthorizationTest.class);

	@BeforeMethod
	public void setUp() {
		logger.info("Test STARTED");
		Page.getDriver();
		Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));

	}

//	@Step ("Creating new case")
//	@Test (priority = 1)
//	public void createNewCase() {
//		new MainPage()
//				.clickOnAccept()
//				.clickOnLoginButton();
//		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//		new LoginPage()
//				.authorizationAnExistingUser(user1);
//		new MainBoardPage()
//				.clickOnCasesText()
//				.clickNewCaseButton();
//		new CreateNewCaseForm()
//				.creatingNewCase()
//				.createNewUserNewCase();
//	}
//
//	@Step ("Copy case")
//	@Test (priority = 2)
//	public void copyCase() {
////		new MainPage()
////				.clickOnAccept()
////				.clickOnLoginButton();
////		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
////		new LoginPage()
////				.authorizationAnExistingUser(user1);
//		new MainBoardPage()
//				.clickOnCasesText()
//				.clickNewCaseButton();
//		new CreateNewCaseForm()
//				.copyCase();
//	}

	@Step ("Delete case")
	@Test (priority = 3)
	public void deleteCase() {
//		new MainPage()
//				.clickOnLoginButton();
//		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//		new LoginPage()
//				.authorizationAnExistingUser(user1);
		new MainBoardPage().clickOnAvatarPhoto();
		new ProfilePage()
				.clickCaseSettingsButton()
				.deleteCase();
	}


//	@AfterSuite
//	public void tearDown() {
//		logger.info("Test   ENDED");
////        Page.getDriver().quit();
//		new MainBoardPage()
//				.clickOnAvatarPhoto();
//		new ProfilePage()
//				.clickSignOut();
//	}

}
