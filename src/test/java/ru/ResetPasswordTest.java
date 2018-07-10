package ru;

import configuration.ConfigProperties;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import pages.*;
import ru.AuthorizationTest;
import io.qameta.allure.Step;


/**
 * @author Elena_Sheloputova
 */

@Listeners(MyTestListener.class)
public class ResetPasswordTest {

	final static Logger logger = Logger.getLogger(ResetPasswordTest.class);

	@BeforeMethod
	public void setUp(ITestContext context) {
		logger.info("Test STARTED");
//		Page.getDriver();
		Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));
		context.setAttribute("app",PasswordResetForm.class);

	}

	@Step ("Reset password is an existing user")
	@Test (groups = {"positive"}, enabled = true)
	public void resetPasswordAnExistingUser() {
		new MainPage()
				.clickOnAccept()
				.clickOnLoginButton();
		new LoginPage().clickOnFogotPasswordLink();
		new PasswordResetForm()
				.ExistingUser();
	}

	@Step ("Reset password is an invalid user")
	@Test (groups = {"negative"}, enabled = true)
	public void resetPasswordAnInvalidUser() {
		new MainPage()
//				.clickOnAccept()
				.clickOnLoginButton();
		new LoginPage().clickOnFogotPasswordLink();
		new PasswordResetForm()
				.checkUnAvailabilityButtonSendMessage();
	}

	@AfterMethod
	public void loggerr() {
		logger.info("Test   ENDED");
	}
}

