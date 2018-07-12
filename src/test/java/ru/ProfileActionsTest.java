package ru;

import configuration.ConfigProperties;
import models.User;
import org.testng.ITestContext;
import org.testng.annotations.*;
import org.apache.log4j.Logger;
import pages.*;
import ru.AuthorizationTest;
import io.qameta.allure.Step;

/**
 * @author Elena_Sheloputova
 */

@Listeners (MyTestListener.class)
public class ProfileActionsTest {


	final static Logger logger = Logger.getLogger(ProfileActionsTest.class);

	@BeforeMethod
	public void setUp(ITestContext context) {
		logger.info("Test STARTED");

		Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));
		context.setAttribute("app", ProfilePage.class);
	}

//	@Step ("Edit First Name")
//	@Test(groups = {"positive"}, enabled = true)
//	public void editFirstName() {
////		new MainPage()
////				.clickOnLoginButton();
////		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
////		new LoginPage()
////						.authorizationAnExistingUser(user1);
//		new MainBoardPage().clickOnAvatarPhoto();
//		new ProfilePage()
//				.clickUserProfileButton()
//				.changeName();
//	}

	@Step ("Change Language on Norsk")
	@Test (groups = {"positive"}, enabled = true)
	public void changeLanguageOnNorsk() {
		new MainPage()
//				.clickOnAccept()
				.clickOnLoginButton();
		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
		new LoginPage()
				.authorizationAnExistingUser(user1);
		new MainBoardPage().clickOnAvatarPhoto();
		new ProfilePage()
				.changeLanguageOnNorsk();

	}

	@Step ("Change Language on English")
	@Test (groups = {"positive"}, dependsOnMethods = {"changeLanguageOnNorsk"}, enabled = true)
	public void changeLanguageOnEnglish() {
//		new MainPage()
//				.clickOnAccept()
//				.clickOnLoginButton();
//		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//		new LoginPage()
//				.authorizationAnExistingUser(user1);

		new MainBoardPage()
				.goMainPage()
				.clickOnAvatarPhoto();
		new ProfilePage()
				.changeLanguageOnEnglish();
		new MainBoardPage()
				.goMainPage();

	}



	@AfterClass
	public void tearDown() {
		logger.info("Test   ENDED");
        Page.getDriver().quit();
//		new MainBoardPage()
//				.clickOnAvatarPhoto();
//		new ProfilePage()
//				.clickSignOut();
	}


}
