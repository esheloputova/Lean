import configuration.ConfigProperties;
import models.User;
import org.testng.annotations.*;
import org.testng.log4testng.Logger;
import pages.*;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * @author Elena_Sheloputova
 */
public class BusinessIdeaTest {

    final static Logger logger = Logger.getLogger(AuthorizationTest.class);

    @Title("Authorization")
    @BeforeMethod
    public void setUp() {
        logger.info("Test STARTED");
        Page.getDriver();
        Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));

    }

    @Title("Business idea")
    @Step("Create stickies in BI")
    @Test(priority = -13)
    public void createStickiesBusinessIdeaTest() {
        new MainPage().clickOnLoginButton();
        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
        new LoginPage()
                .authorizationAnExistingUser(user1);
        new MainBoardPage()
                .clickOnBusinessIdea();
        new BusinessIdeaPage()
                .createAllStickiesBI()
                .createAllStickiesBI();

    }

    @Title("Business idea")
    @Step("Create New first Business idea")
    @Test(priority = -12)
    public void createNewBusinessIdeaTest() {
//        new MainPage().clickOnLoginButton();
//        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//        new LoginPage()
//                .authorizationAnExistingUser(user1);
        new MainBoardPage()
                .clickOnBusinessIdea();
        new BusinessIdeaPage()
                .createBI();
    }

    @Title("Business idea")
    @Step("Create Second Business idea")
    @Test(priority = -11)
    public void createSecondBusinessIdeaTest() {
        createNewBusinessIdeaTest();
    }

    @Title("Business idea")
    @Step("Edit Business ideas")
    @Test(priority = -10)
    public void editBusinessIdeaTest() {
//        new MainPage().clickOnLoginButton();
//        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//        new LoginPage()
//                .authorizationAnExistingUser(user1);
        new MainBoardPage()
                .clickOnBusinessIdea();
        new BusinessIdeaPage()
                .editBI()
                .deleteBI();
    }


    @Step("Delete stickies of Business ideas")
    @Test(priority = -5)
    public void deleteStickiesBusinessIdeaTest() {
//        new MainPage().clickOnLoginButton();
//        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//        new LoginPage()
//                .authorizationAnExistingUser(user1);
        new MainBoardPage()
                .clickOnBusinessIdea();
        new BusinessIdeaPage()
                .deleteAllStickiesBIFirst()
                .deleteAllStickiesBISecond()
                .deleteAllStickiesBIThird();
    }

    @Step("Drag-and-drop stickies of Business ideas")
    @Test(priority = -6)
    public void dragAndDropStickiesBusinessIdeaTest() {
//        new MainPage().clickOnLoginButton();
//        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//        new LoginPage()
//                .authorizationAnExistingUser(user1);
        new MainBoardPage()
                .clickOnBusinessIdea();
        new BusinessIdeaPage()
                .gragAndDrop();
    }

    @Ignore
    @Step("Go to Business Model from Business ideas by link")
    @Test(priority = 2)
    public void goBMFromBIByLink() {
//        new MainPage().clickOnLoginButton();
//        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//        new LoginPage()
//                .authorizationAnExistingUser(user1);
        new MainBoardPage()
                .clickOnBusinessIdea();
        new BusinessIdeaPage()
                .goToBM();
    }

    @Ignore
    @Step("Go to Tests from Business ideas by link")
    @Test(priority = 3)
    public void goTestsFromBIByLink() {
//        new MainPage().clickOnLoginButton();
//        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//        new LoginPage()
//                .authorizationAnExistingUser(user1);
        new MainBoardPage()
                .clickOnBusinessIdea();
        new BusinessIdeaPage()
                .goToFirstTab()
                .goToTests();
    }

    @AfterClass
    public void tearDown() {
        logger.info("Test   ENDED");
        Page.getDriver().quit();
    }

}
