import configuration.ConfigProperties;
import models.User;
import org.testng.ITestContext;
import org.testng.annotations.*;
import org.testng.log4testng.Logger;
import pages.*;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Title;

@Listeners(MyTestListener.class)
public class GoAllPagesTest {

    final static Logger logger = Logger.getLogger(AuthorizationTest.class);

    @Title("Go to All Pages")
    @BeforeMethod
    public void setUp(ITestContext context) {
        logger.info("Test STARTED");
        Page.getDriver();
        Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));
        context.setAttribute("app",MainBoardPage.class);

    }

    public void login() {
        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
        new LoginPage()
                .authorizationAnExistingUser(user1);
    }

    @Step("Go to Business Idea")
    @Test(priority = -1)
    public void goBIfromToolBar() {
//        new MainPage()
//                .clickOnLoginButton();
//        login();
        new MainBoardPage()
                .goBIfromToolBar();
    }

    @Step("Go to Business Model")
    @Test
    public void goBMfromToolBar() {
//        login();
        new MainBoardPage()
                .goBMfromToolBar();
    }

    @Step("Go to Objectives")
    @Test
    public void goObjectivesfromToolBar() {
//        login();
        new MainBoardPage()
                .goObjectivesfromToolBar();
    }

    @Step("Go to Risks")
    @Test
    public void goRisksfromToolBar() {
//        login();
        new MainBoardPage()
                .goRisksfromToolBar();
    }

    @Step("Go to Resources")
    @Test
    public void goResourcesfromToolBar() {
//        login();
        new MainBoardPage()
                .goResourcesfromToolBar();
    }

    @Step("Go to Gaps")
    @Test
    public void goGapsfromToolBar() {
//        login();
        new MainBoardPage()
                .goGapsfromToolBar();
    }

    @Step("Go to Tests")
    @Test
    public void goTestsfromToolBar() {
//        login();
        new MainBoardPage()
                .goTestsfromToolBar();
    }

    @Step("Go to Tasks")
    @Test
    public void goTasksfromToolBar() {
//        login();
        new MainBoardPage()
                .goTasksfromToolBar();
    }

    @Step("Go to Share")
    @Test
    public void goSharefromToolBar() {
//        login();
        new MainBoardPage()
                .goSharefromToolBar();
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

