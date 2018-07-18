package ru;

import configuration.ConfigProperties;
import models.User;
import org.testng.ITestContext;
import org.testng.annotations.*;
import org.apache.log4j.Logger;
import pages.*;
import io.qameta.allure.Step;


/**
 * @author Elena_Sheloputova
 */

@Listeners(MyTestListener.class)
public class ResourcesTest {

	final static Logger logger = Logger.getLogger(ResourcesTest.class);

	@BeforeMethod
	public void setUp(ITestContext context) {
		logger.info("Test STARTED");
		Page.getDriver();
		Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));
		context.setAttribute("app",ResourcesPage.class);

	}

	@Step ("Create stickies Resources")
	@Test (groups = {"positive"}, enabled = true)
	public void createNewResources() {
		new MainPage()
				.clickOnLoginButton();
		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
		new LoginPage()
				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goResourcesfromToolBar();
		new ResourcesPage()
				.createAllStickiesByDefault();
	}

	@Step ("Create stickies Resources")
	@Test (groups = {"positive"}, dependsOnMethods = {"createNewResources"}, enabled = true)
	public void editResources() {
//		new MainPage().clickOnLoginButton();
//		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//		new LoginPage()
//				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goResourcesfromToolBar();
		new ResourcesPage()
				.editDeactivate()
				.editAactivate()
				.editEdit()
				.editDelete();
	}

	@AfterMethod
	public void logging() {
		logger.info("Test   ENDED");

	}

	@AfterClass
	public void tearDown() {
		new MainBoardPage()
				.clickOnAvatarPhoto();
		new ProfilePage()
				.clickSignOut();

	}


}
