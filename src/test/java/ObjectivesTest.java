import configuration.ConfigProperties;
import models.User;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import pages.*;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Title;

public class ObjectivesTest {

	final static Logger logger = Logger.getLogger(AuthorizationTest.class);

	@Title ("Authorization")
	@BeforeMethod
	public void setUp(ITestContext context) {
		logger.info("Test STARTED");
		Page.getDriver();
		Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));

	}

	@Title ("Objectives")
	@Step ("Create stickies Objectives")
	@Test(priority = -3)
	public void createNewObjectives() {
//		new MainPage()
//				.clickOnLoginButton();
//		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//		new LoginPage()
//				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goObjectivesfromToolBar();
		new ObjectivesPage()
				.createStickyNumetic()
				.createStickyMilestone()
				.createStickyMoneySalesRevenue()
				.createStickyMoneyNewEquity()
				.createStickyMoneyNewGrants()
				.createStickyMoneyNewCreditNewLoan()
				.createStickyMoneyNewCreditNewOverfraft()

				.addSubObjectives();
	}

	@Title ("Objectives")
	@Step ("Edit. Deactivate stickies Objectives")
	@Test(priority = 1)
	public void editDeactivateStickiesObjectives() {
//		new MainPage().clickOnLoginButton();
//		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//		new LoginPage()
//				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goObjectivesfromToolBar();
		new ObjectivesPage()
				.editDeactivateFirstStickyEveryBoard();

	}

	@Title ("Objectives")
	@Step ("Edit. Activate stickies Objectives")
	@Test(priority = 2)
	public void editStickiesObjectives() {
//		new MainPage().clickOnLoginButton();
//		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//		new LoginPage()
//				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goObjectivesfromToolBar();
		new ObjectivesPage()
				.editActivateFirstStickyEveryBoard();

	}

	@Title ("Objectives")
	@Step ("Edit. Edit, rename stickies Objectives")
	@Test(priority = 3)
	public void editRenameStickiesObjectives() {
//		new MainPage().clickOnLoginButton();
//		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//		new LoginPage()
//				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goObjectivesfromToolBar();
		new ObjectivesPage()
				.editEditFirstStickyEveryBoard();

	}

	@Title ("Objectives")
	@Step ("Edit. Delete stickies Objectives")
	@Test(priority = 4)
	public void editDeleteStickiesObjectives() {
//		new MainPage().clickOnLoginButton();
//		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//		new LoginPage()
//				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goObjectivesfromToolBar();
		new ObjectivesPage()
				.editDeleteFirstStickyEveryBoard();

	}

	@Title ("Objectives")
	@Step ("Drag-and-drop stickies Objectives")
	@Test(priority = 6)
	public void dragAndDropStickiesObjectives() {
//		new MainPage().clickOnLoginButton();
//		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//		new LoginPage()
//				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goObjectivesfromToolBar();
		new ObjectivesPage()
				.dragANDdrap();
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
