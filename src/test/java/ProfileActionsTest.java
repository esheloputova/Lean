import configuration.ConfigProperties;
import models.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import pages.*;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * @author Elena_Sheloputova
 */
public class ProfileActionsTest {


	final static Logger logger = Logger.getLogger(AuthorizationTest.class);

	@BeforeMethod
	public void setUp() {
		logger.info("Test STARTED");
		Page.getDriver();
		Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));

	}

	@Ignore
	@Step ("Edit First Name")
	@Test(priority = 1)
	public void editFirstName() {
		new MainPage()
				.clickOnAccept()
				.clickOnLoginButton();
		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
		new LoginPage()
						.authorizationAnExistingUser(user1);
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


}
