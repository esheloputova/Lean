package ru;

import configuration.ConfigProperties;
import models.User;
import org.testng.ITestContext;
import org.testng.annotations.*;
import org.apache.log4j.Logger;
import pages.*;
import ru.AuthorizationTest;
import io.qameta.allure.Step;


@Listeners (MyTestListener.class)
public class GoAllPagesTest {

	final static Logger logger = Logger.getLogger(GoAllPagesTest.class);

	@BeforeMethod
	public void setUp(ITestContext context) {
		logger.info("Test STARTED");
		Page.getDriver();
		Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));
		context.setAttribute("app", MainBoardPage.class);

	}

	public void login() {
		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
		new LoginPage()
				.authorizationAnExistingUser(user1);
	}

	@Step ("Go to Business Idea")
	@Test (groups = {"positive"}, enabled=true)
	public void goBIfromToolBar() {
//		new MainPage()
//				.clickOnLoginButton();
//		login();
		new MainBoardPage()
				.goBIfromToolBar();
	}

	@Step ("Go to Business Model")
	@Test(groups = {"positive"}, enabled=true)
	public void goBMfromToolBar() {
//        login();
		new MainBoardPage()
				.goBMfromToolBar();
	}

	@Step ("Go to Objectives")
	@Test(groups = {"positive"}, enabled=true)
	public void goObjectivesfromToolBar() {
//        login();
		new MainBoardPage()
				.goObjectivesfromToolBar();
	}

	@Step ("Go to Risks")
	@Test(groups = {"positive"}, enabled=true)
	public void goRisksfromToolBar() {
//        login();
		new MainBoardPage()
				.goRisksfromToolBar();
	}

	@Step ("Go to Resources")
	@Test(groups = {"positive"}, enabled=true)
	public void goResourcesfromToolBar() {
//        login();
		new MainBoardPage()
				.goResourcesfromToolBar();
	}

	@Step ("Go to Gaps")
	@Test(groups = {"positive"}, enabled=true)
	public void goGapsfromToolBar() {
//        login();
		new MainBoardPage()
				.goGapsfromToolBar();
	}

	@Step ("Go to Tests")
	@Test(groups = {"positive"}, enabled=true)
	public void goTestsfromToolBar() {
//        login();
		new MainBoardPage()
				.goTestsfromToolBar();
	}

	@Step ("Go to Tasks")
	@Test(groups = {"positive"}, enabled=true)
	public void goTasksfromToolBar() {
//        login();
		new MainBoardPage()
				.goTasksfromToolBar();
	}

	@Step ("Go to Share")
	@Test(groups = {"positive"}, enabled=true)
	public void goSharefromToolBar() {
//        login();
		new MainBoardPage()
				.goSharefromToolBar();
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

