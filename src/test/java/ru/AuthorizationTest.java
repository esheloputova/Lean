package ru;

import configuration.ConfigProperties;
import io.qameta.allure.Step;
import models.User;
import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.*;

import static pages.Page.getDriver;

@Listeners (MyTestListener.class)

public class AuthorizationTest {
	final static Logger logger = Logger.getLogger(AuthorizationTest.class);

	@BeforeMethod
	public void setUp(ITestContext context) {
		logger.info("Test STARTED");
//		Page.getDriver();
		getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));
		context.setAttribute("app", LoginPage.class);
	}

	@Step ("Authorization is an existing user")
	@Test (groups = {"positive"}, enabled = true)
	public void authorizationAnExistingUser() {
		new MainPage()
				.clickOnAccept()
				.clickOnLoginButton();
		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
		new LoginPage()
				.authorizationAnExistingUser(user1);
	}

//    @Step("Authorization is not an existing user")
//    @Test(priority = 3)
//    public void authorizationNotAnExistingUser() {
//        new MainPage().clickOnLoginButton();
//        User user2 = new User(ConfigProperties.getTestProperty("notAnExistingLogin"), ConfigProperties.getTestProperty("inCorrectPassword"));
//        new LoginPage()
//                .authorizationNotAnExistingUser(user2);
//    }
//
//    @Step("Invalid email")
//    @Test(priority = 2)
//    public void invalidEmail() {
//        new MainPage().clickOnLoginButton();
//        User user3 = new User(ConfigProperties.getTestProperty("invalidEmail"), ConfigProperties.getTestProperty("invalidPassword"));
//        new LoginPage()
//                .invalidEmail(user3);
//    }
//
//    @Step("Missing email and password")
//    @Test(priority = 1)
//    public void missingEmailAndPasssword() {
//        new MainPage()
//                .clickOnAccept()
//                .clickOnLoginButton();
//        new LoginPage().missingEmailAndPassword();
//    }

	@AfterMethod
	public void tearDown() {
		logger.info("Test   ENDED");
//		new MainBoardPage()
//				.clickOnAvatarPhoto();
//		new ProfilePage()
//				.clickSignOut();
	}

}
