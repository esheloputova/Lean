import configuration.ConfigProperties;
import models.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import pages.*;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Title;

public class ObjectivesTest {

    final static Logger logger = Logger.getLogger(AuthorizationTest.class);

    @Title("Authorization")
    @BeforeMethod
    public void setUp() {
        logger.info("Test STARTED");
        Page.getDriver();
        Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));

    }

    @Title("Gaps")
    @Step("Create stickies Gaps")
    @Test
    public void createNewObjectives() {
        new MainPage().clickOnLoginButton();
        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
        new LoginPage()
                .authorizationAnExistingUser(user1);
        new MainBoardPage()
                .goObjectivesfromToolBar();
        new ObjectivesPage()
//                .createAllStickyByDefault()
//                .createStickyNumetic()
//                .createStickyMilestone()
//                .createStickyMoneySalesRevenue()
//                .createStickyMoneyNewEquity()
//                .createStickyMoneyNewGrants()
//                .createStickyMoneyNewCreditNewLoan()
//                .createStickyMoneyNewCreditNewOverfraft();
                .editActivateAllStickies();
    }

}
