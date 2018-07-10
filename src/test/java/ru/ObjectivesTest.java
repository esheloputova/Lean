package ru;

import configuration.ConfigProperties;
import models.User;
import org.testng.ITestContext;
import org.testng.annotations.*;
import org.apache.log4j.Logger;
import pages.*;
import ru.AuthorizationTest;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Title;

@Listeners(MyTestListener.class)
public class ObjectivesTest {

    final static Logger logger = Logger.getLogger(ObjectivesTest.class);

    @BeforeMethod
    public void setUp(ITestContext context) {
        logger.info("Test STARTED");

        Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));
        context.setAttribute("app", ObjectivesPage.class);
    }

    @Step("Create stickies Objectives")
    @Test(groups = {"positive"}, enabled = true)
    public void createNewObjectives() {
        new MainPage()
                .clickOnLoginButton();
        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
        new LoginPage()
                .authorizationAnExistingUser(user1);
        new MainBoardPage()
                .goObjectivesfromToolBar();
        new ObjectivesPage()
                .createStickyNumetic()
                .createStickyMilestone()
                .createStickyMoneySalesRevenue()
                .createStickyMoneyNewEquity()
                .createStickyMoneyNewGrants()
                .createStickyMoneyNewCreditNewLoan()
                .createStickyMoneyNewCreditNewOverfraft()

                .addSubObjectives();
    }
//
//    @Step("Edit. Deactivate stickies Objectives")
//    @Test(groups = {"positive"}, dependsOnMethods = {"createNewObjectives"}, enabled = true)
//    public void editDeactivateStickiesObjectives() {
////		new MainPage().clickOnLoginButton();
////		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
////		new LoginPage()
////				.authorizationAnExistingUser(user1);
//        new MainBoardPage()
//                .goObjectivesfromToolBar();
//        new ObjectivesPage()
//                .editDeactivateFirstStickyEveryBoard();
//
//    }

//    @Step("Edit. Activate stickies Objectives")
//    @Test(groups = {"positive"}, dependsOnMethods = {"editDeactivateStickiesObjectives"}, enabled = true)
//    public void editStickiesObjectives() {
////		new MainPage().clickOnLoginButton();
////		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
////		new LoginPage()
////				.authorizationAnExistingUser(user1);
//        new MainBoardPage()
//                .goObjectivesfromToolBar();
//        new ObjectivesPage()
//                .editActivateFirstStickyEveryBoard();
//
//    }

//    @Step("Edit. Edit, rename stickies Objectives")
//    @Test(groups = {"positive"}, dependsOnMethods = {"editStickiesObjectives"}, enabled = true)
//    public void editRenameStickiesObjectives() {
////		new MainPage().clickOnLoginButton();
////		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
////		new LoginPage()
////				.authorizationAnExistingUser(user1);
//        new MainBoardPage()
//                .goObjectivesfromToolBar();
//        new ObjectivesPage()
//                .editEditFirstStickyEveryBoard();
//
//    }

//    @Step("Drag-and-drop stickies Objectives")
//    @Test(groups = {"positive"}, dependsOnMethods = {"editRenameStickiesObjectives"}, enabled = true)
//    public void dragAndDropStickiesObjectives() {
////		new MainPage().clickOnLoginButton();
////		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
////		new LoginPage()
////				.authorizationAnExistingUser(user1);
//        new MainBoardPage()
//                .goObjectivesfromToolBar();
//        new ObjectivesPage()
//                .dragANDdrap();
//    }

//    @Step("Edit. Delete stickies Objectives")
//    @Test(groups = {"positive"}, dependsOnMethods = {"dragAndDropStickiesObjectives"}, enabled = true)
//    public void editDeleteStickiesObjectives() {
////		new MainPage().clickOnLoginButton();
////		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
////		new LoginPage()
////				.authorizationAnExistingUser(user1);
//        new MainBoardPage()
//                .goObjectivesfromToolBar();
//        new ObjectivesPage()
//                .editDeleteFirstStickyEveryBoard();
//
//    }

    @AfterClass
    public void tearDown() {
        logger.info("Test   ENDED");
//        Page.getDriver().quit();
        new MainBoardPage()
                .clickOnAvatarPhoto();
        new ProfilePage()
                .clickSignOut();
    }
}