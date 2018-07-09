package ru;

import configuration.ConfigProperties;
import models.User;
import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.*;
import ru.AuthorizationTest;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * @author Elena_Sheloputova
 */

@Listeners(MyTestListener.class)
public class BusinessIdeaTest {

	final static Logger logger = Logger.getLogger(BusinessIdeaTest.class);

	@BeforeMethod
	public void setUp(ITestContext context) {
		logger.info("Test STARTED");
//		Page.getDriver();
		Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));
		context.setAttribute("app", BusinessIdeaPage.class);

	}

	@Step ("Create stickies in BI")
	@Test (groups = {"positive"}, enabled=true)
	public void createStickiesBusinessIdeaTest() {
		new MainPage()
//				.clickOnAccept()
				.clickOnLoginButton();
		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
		new LoginPage()
				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.clickOnBusinessIdea();
		new BusinessIdeaPage()
				.createAllStickiesBI();
	}

	@Step ("Create New first Business idea")
	@Test (groups = {"positive"}, dependsOnMethods = {"createStickiesBusinessIdeaTest"}, enabled=true)
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

	@Step ("Edit Business ideas")
	@Test (groups = {"positive"}, dependsOnMethods = {"createNewBusinessIdeaTest"}, enabled=true)
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


	@Step ("Drag-and-drop stickies of Business ideas")
	@Test (groups = {"positive"}, dependsOnMethods = {"editBusinessIdeaTest"}, enabled=true)
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

	@Step ("Delete stickies of Business ideas")
	@Test (groups = {"positive"}, dependsOnMethods = {"dragAndDropStickiesBusinessIdeaTest"}, enabled=true)
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



	@Step ("Go to Business Model from Business ideas by link")
	@Test (groups = {"positive"}, dependsOnMethods = {"deleteStickiesBusinessIdeaTest"}, enabled=true)
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

	@Step ("Go to Tests from Business ideas by link")
	@Test (groups = {"positive"}, dependsOnMethods = {"goBMFromBIByLink"}, enabled=true)
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
		new MainBoardPage()
				.clickOnAvatarPhoto();
		new ProfilePage()
				.clickSignOut();
	}

}
