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
public class TasksTest {

    final static Logger logger = Logger.getLogger(TasksTest.class);

    @BeforeMethod
    public void setUp(ITestContext context) {
        logger.info("Test STARTED");

        Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));
        context.setAttribute("app", TasksPage.class);
    }

    @Step("Create task all of Cost group")
    @Test(groups = {"positive"}, enabled = true)
    public void createTask() {
		new MainPage()
//                .clickOnAccept()
				.clickOnLoginButton();
		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
		new LoginPage()
				.authorizationAnExistingUser(user1);
        new MainBoardPage()
                .goTasksfromToolBar();
        new TasksPage()
                .createStickiesToDo()
                .createStickiesDoingCurrentMonth()
                .createStickiesDoingNextMonth()
                .createStickiesMonthlyCostDefault()
                .createStickiesMonthlyCostVariable();
        }


//    @Step("Edit. Deactivate stickies Tasks")
//    @Test(groups = {"positive"}, dependsOnMethods = {"createTask"}, enabled = true)
//    public void editDeactivateStickiesObjectives() {
////		new MainPage().clickOnLoginButton();
////		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
////		new LoginPage()
////				.authorizationAnExistingUser(user1);
//        new MainBoardPage()
//                .goTasksfromToolBar();
//        new TasksPage()
//                .editDeactivateFirstStickyEveryBoard();
//
//    }
//
//    @Step("Edit. Activate stickies Tasks")
//    @Test(groups = {"positive"}, dependsOnMethods = {"editDeactivateStickiesObjectives"}, enabled = true)
//    public void editActivateStickiesTasks() {
////		new MainPage().clickOnLoginButton();
////		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
////		new LoginPage()
////				.authorizationAnExistingUser(user1);
//        new MainBoardPage()
//                .goTasksfromToolBar();
//        new TasksPage()
//                .editActivateFirstStickyEveryBoard();
//
//    }

//    @Step("Edit. Edit stickies Tasks")
//    @Test(groups = {"positive"}, dependsOnMethods = {"editActivateStickiesTasks"}, enabled = true)
//    public void editEditStickiesTasks() {
////		new MainPage().clickOnLoginButton();
////		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
////		new LoginPage()
////				.authorizationAnExistingUser(user1);
//        new MainBoardPage()
//                .goTasksfromToolBar();
//        new TasksPage()
//                .editEditFirstStickyEveryBoard();
//    }

//    @Step("Drag-and-drop stickies to DONE-CURRENT MONTH")
//    @Test(groups = {"positive"}, dependsOnMethods = {"editEditStickiesTasks"}, enabled = true)
//    public void dragAndDropStickiesObjectives() {
////		new MainPage().clickOnLoginButton();
////		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
////		new LoginPage()
////				.authorizationAnExistingUser(user1);
//        new MainBoardPage()
//                .goTasksfromToolBar();
//        new TasksPage()
//                .dragANDdrapFromToDOToDoing()
//                .dragANDdrapFromMonthlyToDone();
//    }

//    @Step("Edit. Delete stickies Tasks")
//    @Test(groups = {"positive"}, dependsOnMethods = {"editActivateStickiesTasks"}, enabled = true)
//    public void editDeleteStickiesTasks() {
////		new MainPage().clickOnLoginButton();
////		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
////		new LoginPage()
////				.authorizationAnExistingUser(user1);
//        new MainBoardPage()
//                .goTasksfromToolBar();
//        new TasksPage()
//                .editDeleteFirstStickyEveryBoard();
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
