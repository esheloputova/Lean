import configuration.ConfigProperties;
import models.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import pages.*;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * @author Elena_Sheloputova
 */
public class PrepareDataTest {

	final static Logger logger = Logger.getLogger(AuthorizationTest.class);

	@BeforeMethod
	public void setUp() {
		logger.info("Test STARTED");
		Page.getDriver();
		Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));

	}

	//	Creating New Test case
	@Step ("Creating new case")
	@Test (priority = 1)
	public void createNewCase() {
		new MainPage()
				.clickOnLoginButton();
		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
		new LoginPage()
				.authorizationAnExistingUser(user1);
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

}
