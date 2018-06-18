import configuration.ConfigProperties;
import models.User;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import pages.*;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Title;

public class AuthorizationTest {
	final static Logger logger = Logger.getLogger(AuthorizationTest.class);

	@BeforeMethod
	public void setUp() {
		logger.info("Test STARTED");
		Page.getDriver();
		Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));

	}

	@Title ("Possitive scenario")
	@Step ("Authorization is an existing user")
	@Test (priority = 4)
	public void authorizationAnExistingUser() {
		new MainPage().clickOnLoginButton();
		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
		new LoginPage()
				.authorizationAnExistingUser(user1);
//        new MainBoardPage()
//                .clickOnAvatarPhoto();
//        new ProfilePage()
//                .clickSignOut();
	}

	@Title ("Negative scenario")
	@Step ("Authorization is not an existing user")
	@Test (priority = 3)
	public void authorizationNotAnExistingUser() {
//        Page.getDriver().navigate().back();
		new MainPage().clickOnLoginButton();
		User user2 = new User(ConfigProperties.getTestProperty("notAnExistingLogin"), ConfigProperties.getTestProperty("inCorrectPassword"));
		new LoginPage()
				.authorizationNotAnExistingUser(user2);
	}

	@Title ("Negative scenario")
	@Step ("Invalid email")
	@Test (priority = 2)
	public void invalidEmail() {
//        Page.getDriver().navigate().back();
		new MainPage().clickOnLoginButton();
		User user3 = new User(ConfigProperties.getTestProperty("invalidEmail"), ConfigProperties.getTestProperty("invalidPassword"));
		new LoginPage()
				.invalidEmail(user3);
	}

	@Title ("Negative scenario")
	@Step ("Missing email and password")
	@Test (priority = 1)
	public void missingEmailAndPasssword() {
//        Page.getDriver().navigate().back();
		new MainPage()
				.clickOnAccept()
				.clickOnLoginButton();
		new LoginPage().missingEmailAndPassword();
	}

	@AfterSuite
	public void tearDown() {
		logger.info("Test   ENDED");
//        Page.getDriver().quit();
		new MainBoardPage()
				.clickOnAvatarPhoto();
		new ProfilePage()
				.clickSignOut();
//		just
	}

}
