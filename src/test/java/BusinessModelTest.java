import configuration.ConfigProperties;
import models.User;
import org.testng.annotations.AfterMethod;
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
                .clickOnBusinessModel();
        new BusinessModelPage()
                .createBIStickiesBM()
                .createAllStickiesBM();
        }

    @Title("Business model")
    @Step("Edit stickies business model")
    @Test
    public void editBusinessModelTest() {
        new MainPage().clickOnLoginButton();
        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
        new LoginPage()
                .authorizationAnExistingUser(user1);
        new MainBoardPage()
                .clickOnBusinessModel();
        new BusinessModelPage()
                .editNameStickiesBM()
                .deactivateStickiesBM()
                .activateStickiesBM()
				.addMoreInformationStickiesBM()
                .addAttachesBM()
                .deleteAttachesBM()
                .deleteAddInformationsBM()
				.gragAndDropBM();
    }

    @Step("Go to Gaps from BM")
    @Test
    public void goGaps() {
        new MainPage().clickOnLoginButton();
        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
        new LoginPage()
                .authorizationAnExistingUser(user1);
        new MainBoardPage()
                .clickOnBusinessModel();
        new BusinessModelPage()
                .goGaps();
    }

    @Step("Go to Tests from BM")
    @Test
    public void goTests() {
        new MainPage().clickOnLoginButton();
        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
        new LoginPage()
                .authorizationAnExistingUser(user1);
        new MainBoardPage()
                .clickOnBusinessModel();
        new BusinessModelPage()
                .goTests();
    }

    @AfterMethod
    public void tearDown() {
        logger.info("Test   ENDED");
        Page.getDriver().quit();
    }


}
