import configuration.ConfigProperties;
import models.User;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
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
    @Step("Edit stickies business model from creating form")
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

    @Ignore
//    не работает т к пытается изменить все стики нужно изменить на стики только BM
    @Title("Business model")
    @Step("Edit stickies business model from main form")
    @Test
    public void editBusinessModelFromManeForm() {
        new MainPage().clickOnLoginButton();
        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
        new LoginPage()
                .authorizationAnExistingUser(user1);
        new MainBoardPage()
                .clickOnBusinessModel();
        new BusinessModelPage()
                .editDeactivateAllStickies()
                .editActivateAllStickies()
                .editAllStickies()
                .editDeleteAllStickies();
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
