import configuration.ConfigProperties;
import models.User;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import pages.*;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Title;

public class TasksTest {

	final static Logger logger = Logger.getLogger(AuthorizationTest.class);

	@Title ("Authorization")
	@BeforeMethod
	public void setUp() {
		logger.info("Test STARTED");
		Page.getDriver();
		Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));

	}

	@Title("Objectives")
	@Step ("Create task all of Cost group")
	@Test(priority = 1)
	public void createTask() {
		new MainPage().clickOnLoginButton();
		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
		new LoginPage()
				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goTasksfromToolBar();
		new TasksPage()
				.createStickiesToDo()
				.createStickiesDoingCurrentMonth()
				.createStickiesDoingNextMonth()
				.createStickiesMonthlyCostDefault()
				.createStickiesMonthlyCostVariable();

	}


	@Title ("Tasks")
	@Step ("Edit. Deactivate stickies Tasks")
	@Test(priority = 2)
	public void editDeactivateStickiesObjectives() {
//		new MainPage().clickOnLoginButton();
//		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//		new LoginPage()
//				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goTasksfromToolBar();
		new TasksPage()
				.editDeactivateFirstStickyEveryBoard();

	}

	@Step ("Edit. Activate stickies Tasks")
	@Test(priority = 3)
	public void editActivateStickiesObjectives() {
//		new MainPage().clickOnLoginButton();
//		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//		new LoginPage()
//				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goTasksfromToolBar();
		new TasksPage()
				.editActivateFirstStickyEveryBoard();

	}

	@Step ("Edit. Edit stickies Tasks")
	@Test(priority = 4)
	public void editEditStickiesObjectives() {
//		new MainPage().clickOnLoginButton();
//		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//		new LoginPage()
//				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goTasksfromToolBar();
		new TasksPage()
				.editEditFirstStickyEveryBoard();
	}

	@Step ("Edit. Delete stickies Tasks")
	@Test(priority = 5)
	public void editDeleteStickiesObjectives() {
//		new MainPage().clickOnLoginButton();
//		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//		new LoginPage()
//				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goTasksfromToolBar();
		new TasksPage()
				.editDeleteFirstStickyEveryBoard();
	}

	@Title ("Tasks")
	@Step ("Drag-and-drop stickies to DONE-CURRENT MONTH")
	@Test(priority = 6)
	public void dragAndDropStickiesObjectives() {
//		new MainPage().clickOnLoginButton();
//		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//		new LoginPage()
//				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goTasksfromToolBar();
		new TasksPage()
				.dragANDdrapFromToDOToDoing()
				.dragANDdrapFromMonthlyToDone();
	}

	@AfterClass
	public void tearDown() {
		logger.info("Test   ENDED");
		Page.getDriver().quit();
	}

}
