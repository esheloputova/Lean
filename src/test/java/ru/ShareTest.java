package ru;

import configuration.ConfigProperties;
import io.qameta.allure.Step;
import models.User;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import pages.*;

@Listeners(MyTestListener.class)
public class ShareTest {

	final static Logger logger = Logger.getLogger(AuthorizationTest.class);


	@BeforeMethod
	public void setUp(ITestContext context) {
		logger.info("Test STARTED");
		Page.getDriver();
		Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));
		context.setAttribute("app",SharingPage.class);

	}

	@Step ("Invite viewer")
	@Test (priority = 1)
	public void inviteUserAsViewer() {
		new MainPage()
				.clickOnAccept()
				.clickOnLoginButton();
		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
		new LoginPage()
				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goSharefromToolBar();

		new SharingPage()
				.inviteUserAsViewer();
	}

	@Step ("Invite SuperDoer")
	@Test (priority = 2)
	public void inviteUserAsSuperDoer() {
		new MainPage().clickOnLoginButton();
		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
		new LoginPage()
				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goSharefromToolBar();

		new SharingPage()
				.inviteUserAsSuperDoer();
	}

	@Step ("Resend invitation. Delete. Back.")
	@Test (priority = 3)
	public void editInvitationFirst() {
//		new MainPage().clickOnLoginButton();
//		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//		new LoginPage()
//				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goSharefromToolBar();

		new SharingPage()
				.resendInvite()
				.deleteInvite()
				.backInvite();
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
