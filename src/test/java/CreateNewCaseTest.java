import configuration.ConfigProperties;
import models.User;
import org.openqa.selenium.Cookie;
import org.testng.annotations.*;
import org.testng.log4testng.Logger;
import pages.*;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * @author Elena_Sheloputova
 */
public class CreateNewCaseTest {

	final static Logger logger = Logger.getLogger(AuthorizationTest.class);

//	@BeforeSuite
//	public void startBrowser() {
//
//		Page.getDriver();
//	}

	@Title ("Creating new case")
	@BeforeMethod
	public void setUp() {
		logger.info("Test STARTED");
		Page.getDriver();
		Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));

	}

	@Title ("Possitive scenario")
	@Step ("Creating new case")
	@Test
	public void createNewCase() {
		new MainPage().clickOnLoginButton();
		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
		new LoginPage()
				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.clickOnCasesText()
				.clickNewCaseButton();
		new CreateNewCaseForm()
				.creatingNewCase()
				.createNewUser1();
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
