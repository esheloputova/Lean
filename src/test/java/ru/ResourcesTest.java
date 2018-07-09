package ru;

import configuration.ConfigProperties;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import pages.*;
import ru.AuthorizationTest;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * @author Elena_Sheloputova
 */

@Listeners(MyTestListener.class)
public class ResourcesTest {

	final static Logger logger = Logger.getLogger(ResourcesTest.class);

	@Title ("Authorization")
	@BeforeMethod
	public void setUp(ITestContext context) {
		logger.info("Test STARTED");
		Page.getDriver();
		Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));
		context.setAttribute("app",ResourcesPage.class);

	}

	@Step ("Create stickies Resources")
	@Test (priority = -3)
	public void createNewResources() {
//		new MainPage()
//				.clickOnLoginButton();
//		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//		new LoginPage()
//				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goResourcesfromToolBar();
		new ResourcesPage()
				.createAllStickiesByDefault();
	}

	@Title ("Resources")
	@Step ("Create stickies Resources")
	@Test (priority = -2)
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
