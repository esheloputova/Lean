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
public class BusinessModelTest {
	final static Logger logger = Logger.getLogger(AuthorizationTest.class);

	@Title("Authorization")
	@BeforeMethod
	public void setUp() {
		logger.info("Test STARTED");
		Page.getDriver();
		Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));

	}

	@Title("Business model")
	@Step("Create business model")
	@Test
	public void createNewBusinessModelTest() {
		new MainPage().clickOnLoginButton();
		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
		new LoginPage()
						.authorizationAnExistingUser(user1);
		new MainBoardPage()
						.clickOnBusinessIdea();
		new BusinessIdeaPage()
						.goToBM();
		new BusinessModelPage()
						.createAllStickiesBM();



	}


}
