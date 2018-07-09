package ru;

import configuration.ConfigProperties;
import models.User;
import org.testng.ITestContext;
import org.testng.annotations.*;
import org.testng.log4testng.Logger;
import pages.*;
import ru.AuthorizationTest;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Title;

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

	@Title ("Old sharing")
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

	@Title ("New sharing")

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
