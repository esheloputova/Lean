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
public class BusinessIdeaTest {

	final static Logger logger = Logger.getLogger(AuthorizationTest.class);

	@Title ("Authorization")
	@BeforeMethod
	public void setUp() {
		logger.info("Test STARTED");
		Page.getDriver();
		Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));

	}

	@Title ("Business idea")
	@Step ("Create/ Edit/ Edit Business ideas")
	@Test
	public void createNewBusinessIdeaTest() {
		new MainPage().clickOnLoginButton();
		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
		new LoginPage()
				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.clickOnBusinessIdea();
		new BusinessIdeaPage()
				.createAllStickiesBI();
		new MainBoardPage()
				.goMainPage()
				.clickOnBusinessIdea();
		new BusinessIdeaPage()
				.createBI()
				.editBI()
				.deleteBI();
	}

	@Ignore
	@Step ("Delete stickies of Business ideas")
	@Test
	public void deleteStickiesBusinessIdeaTest() {
		new MainPage().clickOnLoginButton();
		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
		new LoginPage()
				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.clickOnBusinessIdea();
		new BusinessIdeaPage()
				.deleteAllStickiesBIFirst()
				.deleteAllStickiesBISecond()
				.deleteAllStickiesBIThird();
	}

	@Step ("Drag-and-drop stickies of Business ideas")
	@Test
	public void dragAndDropStickiesBusinessIdeaTest() {
		new MainPage().clickOnLoginButton();
		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
		new LoginPage()
				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.clickOnBusinessIdea();
		new BusinessIdeaPage()
				.gragAndDrop();
	}

	@Step ("Go to Business Model from Business ideas by link")
	@Test
	public void goBMFromBIByLink() {
		new MainPage().clickOnLoginButton();
		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
		new LoginPage()
				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.clickOnBusinessIdea();
		new BusinessIdeaPage()
				.goToBM();
	}

}
