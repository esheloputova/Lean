package ru;

import configuration.ConfigProperties;
import org.testng.ITestContext;
import org.testng.annotations.*;
import org.apache.log4j.Logger;
import pages.*;
import ru.AuthorizationTest;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Title;

@Listeners(MyTestListener.class)
public class TasksTest {

	final static Logger logger = Logger.getLogger(TasksTest.class);

	@BeforeMethod
	public void setUp(ITestContext context) {
		logger.info("Test STARTED");

		Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));
		context.setAttribute("app",TasksPage.class);
	}

	@Step ("Create task all of Cost group")
	@Test(priority = 1)
	public void createTask() {
//		new MainPage()
//				.clickOnLoginButton();
//		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//		new LoginPage()
//				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goTasksfromToolBar();
		new TasksPage()
				.createStickiesToDo()
				.createStickiesDoingCurrentMonth()
				.createStickiesDoingNextMonth()
				.createStickiesMonthlyCostDefault()
				.createStickiesMonthlyCostVariable();

	}


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
	public void editActivateStickiesTasks() {
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
	public void editEditStickiesTasks() {
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
	@Test(priority = 6)
	public void editDeleteStickiesTasks() {
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
	@Test(priority = 5)
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
//	@AfterSuite
//	public void tearDown() {
//		logger.info("Test   ENDED");
////        Page.getDriver().quit();
//		new MainBoardPage()
//				.clickOnAvatarPhoto();
//		new ProfilePage()
//				.clickSignOut();
//	}
}
