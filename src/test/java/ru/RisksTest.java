package ru;

import configuration.ConfigProperties;
import models.User;
import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.*;
import io.qameta.allure.Step;

@Listeners (MyTestListener.class)
public class RisksTest {
	final static Logger logger = Logger.getLogger(RisksTest.class);


	@BeforeMethod
	public void setUp(ITestContext context) {
		logger.info("Test STARTED");
		Page.getDriver();
		Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));
		context.setAttribute("app", RisksPage.class);

	}

	@Step ("Create stickies in Risks")
	@Test (groups = {"positive"}, enabled = true)
	public void createStickiesRisks() {
		new MainPage()
//				.clickOnAccept()
				.clickOnLoginButton();
		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
		new LoginPage()
				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goRisksfromToolBar();
		new RisksPage()
				.createRisksStickies();
	}

//	@Step ("Drag-and-drop stickies in Risks")
//	@Test (groups = {"positive"}, dependsOnMethods = {"createStickiesRisks"}, enabled = true)
//	public void dragANDdropStickiesRisks() {
////        new MainPage().clickOnLoginButton();
////        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
////        new LoginPage()
////                .authorizationAnExistingUser(user1);
//		new MainBoardPage()
//				.goRisksfromToolBar();
//		new RisksPage()
//				.dragANDdrap();
//	}

//	@Step ("Add risk from helper")
//	@Test (groups = {"positive"}, dependsOnMethods = {"createStickiesRisks"}, enabled = true)
//	public void addRiskFromHelper() {
////        new MainPage().clickOnLoginButton();
////        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
////        new LoginPage()
////                .authorizationAnExistingUser(user1);
//		new MainBoardPage()
//				.goRisksfromToolBar();
//		new RisksPage()
//				.addRiskFromHelper();
//	}

	@Step ("Go to Task from Risks")
	@Test (groups = {"positive"}, dependsOnMethods = {"createStickiesRisks"}, enabled = true)

	public void goTaskStickiesRisks() {
//        new MainPage()
////		        .clickOnAccept()
//		        .clickOnLoginButton();
//        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//        new LoginPage()
//                .authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goRisksfromToolBar();
		new RisksPage()
				.goTasks();
	}
	@Step ("Edit stickies in Risks")
	@Test (groups = {"positive"}, dependsOnMethods = {"goTaskStickiesRisks"}, enabled = true)
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



	@AfterClass
	public void tearDown() {
		logger.info("Test   ENDED");
		new MainBoardPage()
				.clickOnAvatarPhoto();
		new ProfilePage()
				.clickSignOut();
	}

}
