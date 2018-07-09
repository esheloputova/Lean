package ru;

import configuration.ConfigProperties;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import pages.*;
import ru.AuthorizationTest;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Title;

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

	@Title ("Possitive scenario")
	@Step ("Reset password is an existing user")
	@Test (priority = 1)
	public void resetPasswordAnExistingUser() {
		new MainPage()
//				.clickOnAccept()
				.clickOnLoginButton();
		new LoginPage().clickOnFogotPasswordLink();
		new PasswordResetForm()
				.ExistingUser();
	}

	@Title ("Negative scenario")
	@Step ("Reset password is an invalid user")
	@Test (priority = 2)
	public void resetPasswordAnInvalidUser() {
		new MainPage()
//				.clickOnAccept()
				.clickOnLoginButton();
		new LoginPage().clickOnFogotPasswordLink();
		new PasswordResetForm()
				.checkUnAvailabilityButtonSendMessage();
	}

}

