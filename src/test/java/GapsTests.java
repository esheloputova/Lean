import configuration.ConfigProperties;
import models.User;
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
	@Test
	public void createNewGaps() {
		new MainPage().clickOnLoginButton();
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
	@Test
	public void createCompetitorGaps() {
		new MainPage().clickOnLoginButton();
		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
		new LoginPage()
				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goGapsfromToolBar();
		new GapsPage()
				.createCompetitor()
				.createStickiesCompetitor();
	}

	@Title ("Gaps")
	@Step ("Edit stickies in Gaps")
	@Test
	public void editStickiesGaps() {
		new MainPage().clickOnLoginButton();
		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
		new LoginPage()
				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goGapsfromToolBar();
		new GapsPage()
//				.editDeactivateAllStickies()
//				.editActivateAllStickies()
//				.editAllStickies()
				.editDeleteAllStickies();
	}

	@Title ("Gaps")
	@Step ("Edit stickies in Competitor")
	@Test
	public void deleteCompetitorGaps() {
		new MainPage().clickOnLoginButton();
		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
		new LoginPage()
				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goGapsfromToolBar();
		new GapsPage()
//				.editCompetitorDeactivate()
//				.editCompetitorActivate()
				.editCompetitorDelete();
	}
}
