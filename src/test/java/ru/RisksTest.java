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
public class RisksTest {
    final static Logger logger = Logger.getLogger(RisksTest.class);


    @BeforeMethod
    public void setUp(ITestContext context) {
        logger.info("Test STARTED");

        Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));
        context.setAttribute("app",RisksPage.class);

    }

    @Step("Create stickies in Risks")
    @Test(groups = {"positive"}, enabled = true)
    public void createStickiesRisks() {
        new MainPage()
                .clickOnLoginButton();
        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
        new LoginPage()
                .authorizationAnExistingUser(user1);
        new MainBoardPage()
                .goRisksfromToolBar();
        new RisksPage()
                .createRisksStickies();
    }

    @Step("Drag-and-drop stickies in Risks")
    @Test(groups = {"positive"}, dependsOnMethods = {"createStickiesRisks"}, enabled = true)
    public void dragANDdropStickiesRisks() {
//        new MainPage().clickOnLoginButton();
//        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//        new LoginPage()
//                .authorizationAnExistingUser(user1);
        new MainBoardPage()
                .goRisksfromToolBar();
        new RisksPage()
                .dragANDdrap();
    }

    @Step("Edit stickies in Risks")
    @Test(groups = {"positive"}, dependsOnMethods = {"dragANDdropStickiesRisks"}, enabled = true)
    public void editStickiesRisks() {
//        new MainPage().clickOnLoginButton();
//        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//        new LoginPage()
//                .authorizationAnExistingUser(user1);
        new MainBoardPage()
                .goRisksfromToolBar();
        new RisksPage()
                .editDeactivateAllStickies()
                .editActivateAllStickies()
                .editAllStickies()
                .editDeleteAllStickies();
    }

    @Step("Add risk from helper")
    @Test(groups = {"positive"}, dependsOnMethods = {"editStickiesRisks"}, enabled = true)
    public void addRiskFromHelper() {
//        new MainPage().clickOnLoginButton();
//        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//        new LoginPage()
//                .authorizationAnExistingUser(user1);
        new MainBoardPage()
                .goRisksfromToolBar();
        new RisksPage()
                .addRiskFromHelper();
    }

    @Step("Go to Task from Risks")
    @Test(groups = {"positive"}, dependsOnMethods = {"addRiskFromHelper"}, enabled = true)
    public void goTaskStickiesRisks() {
//        new MainPage().clickOnLoginButton();
//        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//        new LoginPage()
//                .authorizationAnExistingUser(user1);
        new MainBoardPage()
                .goRisksfromToolBar();
        new RisksPage()
                .goTasks();
    }

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
