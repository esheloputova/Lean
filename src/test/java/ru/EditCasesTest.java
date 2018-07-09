package ru;

import configuration.ConfigProperties;
import org.testng.ITestContext;
import org.testng.annotations.*;
import org.testng.log4testng.Logger;
import pages.*;
import ru.AuthorizationTest;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * @author Elena_Sheloputova
 */

@Listeners(MyTestListener.class)
public class EditCasesTest {

	final static Logger logger = Logger.getLogger(AuthorizationTest.class);

	@BeforeMethod
	public void setUp(ITestContext context) {
//		logger.info("Test STARTED");

		Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));
		context.setAttribute("app",ProfilePage.class);

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
	@Test (groups = {"positive"}, enabled=true)
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


	@AfterSuite
	public void tearDown() {
		logger.info("Test   ENDED");
//        Page.getDriver().quit();
		new MainBoardPage()
				.clickOnAvatarPhoto();
		new ProfilePage()
				.clickSignOut();
	}

}
