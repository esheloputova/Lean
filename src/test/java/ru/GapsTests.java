package ru;

import configuration.ConfigProperties;
import org.testng.ITestContext;
import org.testng.annotations.*;
import org.apache.log4j.Logger;
import pages.*;
import ru.AuthorizationTest;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * @author Elena_Sheloputova
 */

@Listeners(MyTestListener.class)
public class GapsTests {

	final static Logger logger = Logger.getLogger(GapsTests.class);

	@BeforeMethod
	public void setUp(ITestContext context) {
		logger.info("Test STARTED");
		Page.getDriver();
		Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));
		context.setAttribute("app",GapsPage.class);

	}

	@Title ("Gaps")
	@Step ("Create stickies Gaps")
	@Test (priority = -3)
	public void createNewGaps() {
//		new MainPage()
//				.clickOnLoginButton();
//		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//		new LoginPage()
//				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goGapsfromToolBar();
		new GapsPage()
				.createStickies();
	}

	@Title ("Gaps")
	@Step ("Create Competitor and Sticky for Competitor in Gaps")
	@Test (priority = -2)
	public void createCompetitorGaps() {
//		new MainPage().clickOnLoginButton();
//		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//		new LoginPage()
//				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goGapsfromToolBar();
		new GapsPage()
				.createCompetitor()
				.createStickiesCompetitor();
	}

	@Title ("Gaps")
	@Step ("Edit stickies in Gaps. Deactivate")
	@Test (priority = -1)
	public void editDeactivateStickiesGaps() {
//        new MainPage().clickOnLoginButton();
//        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//        new LoginPage()
//                .authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goGapsfromToolBar();
		new GapsPage()
				.editDeactivateAllStikies();
	}

	@Title ("Gaps")
	@Step ("Edit stickies in Gaps. Activate")
	@Test (priority = 1)
	public void editActivateStickiesGaps() {
//        new MainPage().clickOnLoginButton();
//        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//        new LoginPage()
//                .authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goGapsfromToolBar();
		new GapsPage()
				.editActivateAllStikies();

	}

	@Title ("Gaps")
	@Step ("Edit stickies in Gaps. Edit")
	@Test (priority = 2)
	public void editEditStickiesGaps() {
//        new MainPage().clickOnLoginButton();
//        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//        new LoginPage()
//                .authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goGapsfromToolBar();
		new GapsPage()
				.editFirstStickyGap();
	}

	@Title ("Gaps")
	@Step ("Edit stickies in Gaps. Delete")
	@Test (priority = 3)
	public void editDeleteStickiesGaps() {
//		new MainPage().clickOnLoginButton();
//		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//		new LoginPage()
//				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goGapsfromToolBar();
		new GapsPage()
				.editDeleteFirstStickyGap();
	}

	@Title ("Gaps")
	@Step ("Edit stickies in Competitor")
	@Test (priority = 4)
	public void deleteCompetitorGaps() {
//		new MainPage().clickOnLoginButton();
//		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//		new LoginPage()
//				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goGapsfromToolBar();
		new GapsPage()
//				.editCompetitorDeactivate()
//				.editCompetitorActivate()
				.editCompetitorDelete();
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
