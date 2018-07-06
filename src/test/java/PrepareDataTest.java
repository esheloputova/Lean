import configuration.ConfigProperties;
import models.User;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import pages.*;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * @author Elena_Sheloputova
 */

@Listeners(MyTestListener.class)
public class PrepareDataTest {

	final static Logger logger = Logger.getLogger(AuthorizationTest.class);

	@BeforeMethod
	public void setUp(ITestContext context) {
		logger.info("Test STARTED");
		Page.getDriver();
		Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));
		context.setAttribute("app",MainBoardPage.class);

	}

	//	Creating New Test case
	@Step ("Creating new case")
	@Test (priority = 1)
	public void createNewCase() {
//		new MainPage()
//				.clickOnLoginButton();
//		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//		new LoginPage()
//				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.clickOnCasesText()
				.clickNewCaseButton();
		new CreateNewCaseForm()
				.prepareDataNewCase()
				.createNewUserNewCase();
	}

	//	Creating New BI
	@Step ("Create stickies in BI")
	@Test (priority = 2)
	public void createStickiesBusinessIdeaTest() {
		new MainBoardPage()
				.clickOnBusinessIdea();
		new BusinessIdeaPage()
				.createAllStickyByDefault();
			}

	@Test (priority = 3)
	public void createBusinessIdeaTest() {
		new MainBoardPage()
				.clickOnBusinessIdea();
		new BusinessIdeaPage()
				.createBI();
	}

	@AfterSuite
	public void tearDown() {
//        logger.info("Test   ENDED");
//        Page.getDriver().quit();
		new MainBoardPage()
				.clickOnAvatarPhoto();
		new ProfilePage()
				.clickSignOut();
	}

}
