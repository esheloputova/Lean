package ru;

import configuration.ConfigProperties;
import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.*;
import ru.yandex.qatools.allure.annotations.Step;

@Listeners(MyTestListener.class)
public class TestsPageTests {

	final static Logger logger = Logger.getLogger(TestsPageTests.class);


	@BeforeMethod
	public void setUp(ITestContext context) {
		logger.info("Test STARTED");

		Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));
		context.setAttribute("app",TestsPage.class);

	}

	@Step ("Go to Business Model from Business ideas by link")
	@Test
	public void goTestsFromBIByLink() {
//		new MainPage().clickOnLoginButton();
//		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//		new LoginPage()
//				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.clickOnBusinessIdea();
		new BusinessIdeaPage()
				.goToFirstTab()
				.goToTests();
		new TestsPage()
				.addBussinesIdea();

	}

//	@AfterSuite
//	public void tearDown() {
//		logger.info("Test   ENDED");
////        Page.getDriver().quit();
//		new MainBoardPage()
//				.clickOnAvatarPhoto();
//		new ProfilePage()
//				.clickSignOut();
//	}
}
