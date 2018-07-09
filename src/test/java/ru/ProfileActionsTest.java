package ru;

import configuration.ConfigProperties;
import org.testng.ITestContext;
import org.testng.annotations.*;
import org.apache.log4j.Logger;
import pages.*;
import ru.AuthorizationTest;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * @author Elena_Sheloputova
 */

@Listeners(MyTestListener.class)
public class ProfileActionsTest {


	final static Logger logger = Logger.getLogger(ProfileActionsTest.class);

	@BeforeMethod
	public void setUp(ITestContext context) {
		logger.info("Test STARTED");

		Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));
		context.setAttribute("app",ProfilePage.class);
	}

	@Ignore
	@Step ("Edit First Name")
	@Test(priority = 1)
	public void editFirstName() {
//		new MainPage()
//				.clickOnLoginButton();
//		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//		new LoginPage()
//						.authorizationAnExistingUser(user1);
		new MainBoardPage().clickOnAvatarPhoto();
		new ProfilePage()
				.clickUserProfileButton()
				.changeName();

	}

	@Step ("Change Language on Norsk")
	@Test(priority = 2)
	public void changeLanguageOnNorsk() {
//		new MainPage()
//				.clickOnAccept()
//				.clickOnLoginButton();
//		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//		new LoginPage()
//				.authorizationAnExistingUser(user1);
		new MainBoardPage().clickOnAvatarPhoto();
		new ProfilePage()
				.changeLanguageOnNorsk();

	}

	@Step ("Change Language on English")
	@Test(priority = 3)
	public void changeLanguageOnEnglish() {
//		new MainPage()
//				.clickOnAccept()
//				.clickOnLoginButton();
//		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//		new LoginPage()
//				.authorizationAnExistingUser(user1);

		new MainBoardPage().clickOnAvatarPhoto();
		new ProfilePage()
				.changeLanguageOnEnglish();


	}

//	@AfterSuite
//	public void tearDown() {
////        logger.info("Test   ENDED");
////        Page.getDriver().quit();
//		new MainBoardPage()
//				.clickOnAvatarPhoto();
//		new ProfilePage()
//				.clickSignOut();
//	}


}
