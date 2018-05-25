import configuration.ConfigProperties;
import data.AccDataProvider;
import models.User;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import pages.*;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Title;

public class ShareTest {

	final static Logger logger = Logger.getLogger(AuthorizationTest.class);


	@BeforeMethod
	public void setUp() {
		logger.info("Test STARTED");
		Page.getDriver();
		Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));

	}

	@Title ("Share")
	@Step ("Invite viewer")
	@Test (priority = 1)
	public void inviteUserAsViewer() {
		new MainPage().clickOnLoginButton();
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

	@AfterClass
	public void tearDown() {
		logger.info("Test   ENDED");
		Page.getDriver().quit();
	}

}
