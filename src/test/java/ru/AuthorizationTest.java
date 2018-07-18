package ru;

import configuration.ConfigProperties;
import io.qameta.allure.Step;
import models.User;
import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.*;

import static pages.Page.getDriver;

@Listeners (MyTestListener.class)

public class AuthorizationTest {
	final static Logger logger = Logger.getLogger(AuthorizationTest.class);

	@BeforeMethod
	public void setUp(ITestContext context) {
		logger.info("Test STARTED");
//		loggerMethod.info("Метод");
//		Page.getDriver();
		getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));
		context.setAttribute("app", LoginPage.class);
	}

	@Step ("Missing email and password")
	@Test (groups = {"positive"}, enabled = true)
	public void missingEmailAndPasssword() {
		new MainPage()
//				.clickOnAccept()
				.clickOnLoginButton();
		new LoginPage().missingEmailAndPassword();
	}

	@Step ("Invalid email")
	@Test (groups = {"positive"}, dependsOnMethods = {"missingEmailAndPasssword"}, enabled = true)
	public void invalidEmail() {
		new MainPage()
				.clickOnLoginButton();
		User user3 = new User(ConfigProperties.getTestProperty("invalidEmail"), ConfigProperties.getTestProperty("invalidPassword"));
		new LoginPage()
				.invalidEmail(user3);
	}

	@Step ("Authorization is not an existing user")
	@Test (groups = {"positive"}, dependsOnMethods = {"invalidEmail"}, enabled = true)
	public void authorizationNotAnExistingUser() {
		new MainPage()
				.clickOnLoginButton();
		User user2 = new User(ConfigProperties.getTestProperty("notAnExistingLogin"), ConfigProperties.getTestProperty("inCorrectPassword"));
		new LoginPage()
				.authorizationNotAnExistingUser(user2);
	}

	@Step ("Authorization is an existing user")
	@Test (groups = {"positive"}, dependsOnMethods = {"authorizationNotAnExistingUser"}, enabled = true)
	public void authorizationAnExistingUser() {
		new MainPage()
//                .clickOnAccept()
				.clickOnLoginButton();
		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
		new LoginPage()
				.authorizationAnExistingUser(user1);
	}

	@AfterMethod
	public void logging() {
		logger.info("Test ENDED");

	}

	@AfterClass
	public void tearDown() {
		new MainBoardPage()
				.clickOnAvatarPhoto();
		new ProfilePage()
				.clickSignOut();

	}

}
