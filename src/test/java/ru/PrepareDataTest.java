package ru;

import configuration.ConfigProperties;
import models.User;
import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.*;
import io.qameta.allure.Step;

/**
 * @author Elena_Sheloputova
 */

@Listeners (MyTestListener.class)
public class PrepareDataTest {

	final static Logger logger = Logger.getLogger(PrepareDataTest.class);

	@BeforeMethod
	public void setUp(ITestContext context) {
		logger.info("Test STARTED");
		Page.getDriver();
		Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));
		context.setAttribute("app", MainBoardPage.class);

	}

	//	Creating New Test case
	@Step ("Creating new case")
	@Test (groups = {"positive"}, enabled = true)
	public void createNewCase() {
//		new MainPage()
////				.clickOnAccept()
//				.clickOnLoginButton();
//		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//		new LoginPage()
//				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.clickOnCasesText()
				.clickNewCaseButton();
		new CreateNewCaseForm()
				.prepareDataNewCase()
				.createNewUserNewCase();
	}

	//	Creating New BI
	@Step ("Create stickies in BI")
	@Test (groups = {"positive"}, dependsOnMethods = {"createNewCase"}, enabled = true)
	public void createStickiesBusinessIdeaTest() {
		new MainBoardPage()
				.goBIfromToolBar();
		new BusinessIdeaPage()
				.createAllStickyByDefault();
	}

	@Test (groups = {"positive"}, dependsOnMethods = {"createStickiesBusinessIdeaTest"}, enabled = true)
	public void createBusinessIdeaTest() {
		new MainBoardPage()
				.goBIfromToolBar();
		new BusinessIdeaPage()
				.createBI();
	}

	@AfterMethod
	public void tearDown() {
		logger.info("Test   ENDED");
//		new MainBoardPage()
//				.clickOnAvatarPhoto();
//		new ProfilePage()
//				.clickSignOut();
	}

}
