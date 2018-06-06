import configuration.ConfigProperties;
import models.User;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import pages.*;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Title;

public class TestPageBusinessIdeaTest {


	final static Logger logger = Logger.getLogger(AuthorizationTest.class);

	@Title ("Authorization")
	@BeforeMethod
	public void setUp() {
		logger.info("Test STARTED");
		Page.getDriver();
//        Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));

	}

	@Step ("Go to Business Model from Business ideas by link")
	@Test
	public void createTestForBusinessAdea() {
		new MainPage().clickOnLoginButton();
		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
		new LoginPage()
				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goTestsfromToolBar();
		new TestsPage()
				.addBussinesIdea();
		new TestBusinessIdeaPage()
				.addName()
//                .addDate()
				.addTargetAudience()
				.addComments()
				.addGeneralComments()
				.saveTestBusinessIdea();


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

