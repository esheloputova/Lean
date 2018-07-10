package ru;

import configuration.ConfigProperties;
import models.User;
import org.testng.ITestContext;
import org.testng.annotations.*;
import org.apache.log4j.Logger;
import pages.*;
import io.qameta.allure.Step;


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

	@Step ("Create stickies Gaps")
	@Test (groups = {"positive"}, enabled=true)
	public void createNewGaps() {
		new MainPage()
//				.clickOnAccept()
				.clickOnLoginButton();
		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
		new LoginPage()
				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goGapsfromToolBar();
		new GapsPage()
				.createStickies();
	}

	@Step ("Create Competitor and Sticky for Competitor in Gaps")
	@Test (groups = {"positive"}, dependsOnMethods = {"createNewGaps"}, enabled=true)
	public void createCompetitorGaps() {
//		new MainPage().clickOnLoginButton();
//		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//		new LoginPage()
//				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goGapsfromToolBar();
		new GapsPage()
				.createCompetitorByAdd()
				.createStickiesCompetitor();
	}

//	сделать деактивацию и активацию только первой стики
//	@Step ("Edit stickies in Gaps. Deactivate")
//	@Test (groups = {"positive"}, dependsOnMethods = {"createCompetitorGaps"}, enabled=true)
//	public void editDeactivateStickiesGaps() {
//		new MainBoardPage()
//				.goGapsfromToolBar();
//		new GapsPage()
//				.editDeactivateAllStikies();
//	}
//
//	@Step ("Edit stickies in Gaps. Activate")
//	@Test (groups = {"positive"}, dependsOnMethods = {"editDeactivateStickiesGaps"}, enabled=true)
//	public void editActivateStickiesGaps() {
//		new MainBoardPage()
//				.goGapsfromToolBar();
//		new GapsPage()
//				.editActivateAllStikies();
//	}

	@Step ("Edit stickies in Gaps. Edit")
	@Test (groups = {"positive"}, dependsOnMethods = {"createCompetitorGaps"}, enabled=true)
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

	@Step ("Edit stickies in Gaps. Delete")
	@Test (groups = {"positive"}, dependsOnMethods = {"editEditStickiesGaps"}, enabled=true)
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

	@Step ("Edit stickies in Competitor")
	@Test (groups = {"positive"}, dependsOnMethods = {"editDeleteStickiesGaps"}, enabled=true)
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

	@AfterMethod
	public void tearDown() {
		logger.info("Test   ENDED");
//        Page.getDriver().quit();
//		new MainBoardPage()
//				.clickOnAvatarPhoto();
//		new ProfilePage()
//				.clickSignOut();
	}
}
