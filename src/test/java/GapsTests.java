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

/**
 * @author Elena_Sheloputova
 */
public class GapsTests {

	final static Logger logger = Logger.getLogger(AuthorizationTest.class);

	@Title ("Authorization")
	@BeforeMethod
	public void setUp() {
		logger.info("Test STARTED");
		Page.getDriver();
		Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));

	}

	@Title ("Gaps")
	@Step ("Create stickies Gaps")
	@Test (priority = -3)
	public void createNewGaps() {
		new MainPage()
				.clickOnAccept()
				.clickOnLoginButton();
		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
		new LoginPage()
				.authorizationAnExistingUser(user1);
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
		new MainPage().clickOnLoginButton();
		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
		new LoginPage()
				.authorizationAnExistingUser(user1);
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
