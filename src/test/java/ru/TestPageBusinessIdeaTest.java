package ru;

import configuration.ConfigProperties;
import models.User;
import org.testng.ITestContext;
import org.testng.annotations.*;
import org.apache.log4j.Logger;
import pages.*;
import ru.AuthorizationTest;
import io.qameta.allure.Step;


@Listeners(MyTestListener.class)
public class TestPageBusinessIdeaTest {


	final static Logger logger = Logger.getLogger(TestPageBusinessIdeaTest.class);

	@BeforeMethod
	public void setUp(ITestContext context) {
		logger.info("Test STARTED");
		Page.getDriver();
        Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));
		context.setAttribute("app",TestsPage.class);

	}

	@Step ("Go to Business Model from Business ideas by link")
	@Test(groups = {"positive"}, enabled = true)
	public void createTestForBusinessIdea() {
		new MainPage()
//				.clickOnAccept()
				.clickOnLoginButton();
		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
		new LoginPage()
				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goTestsfromToolBar();
		new TestsPage()
				.addBussinesIdea();
		new TestBusinessIdeaPage()
				.addName()
//                .addDate()
				.addTargetAudience()
				.addComments()
				.addGeneralComments()
				.saveTestBusinessIdea();


	}

	@AfterMethod
	public void tearDown() {
		logger.info("Test   ENDED");
//        Page.getDriver().quit();
//		new MainBoardPage()
//				.clickOnAvatarPhoto();
//		new ProfilePage()
//				.clickSignOut();
	}

}

