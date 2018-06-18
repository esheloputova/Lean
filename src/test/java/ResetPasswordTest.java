import configuration.ConfigProperties;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import pages.LoginPage;
import pages.MainPage;
import pages.Page;
import pages.PasswordResetForm;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * @author Elena_Sheloputova
 */

public class ResetPasswordTest {

	final static Logger logger = Logger.getLogger(AuthorizationTest.class);

	@BeforeMethod
	public void setUp() {
		logger.info("Test STARTED");
		Page.getDriver();
		Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));

	}

	@Title ("Possitive scenario")
	@Step ("Reset password is an existing user")
	@Test (priority = 1)
	public void resetPasswordAnExistingUser() {
		new MainPage()
				.clickOnAccept()
				.clickOnLoginButton();
		new LoginPage().clickOnFogotPasswordLink();
		new PasswordResetForm()
				.ExistingUser();
	}

	@Title ("Negative scenario")
	@Step ("Reset password is an invalid user")
	@Test (priority = 2)
	public void resetPasswordAnInvalidUser() {
		new MainPage().clickOnLoginButton();
		new LoginPage().clickOnFogotPasswordLink();
		new PasswordResetForm()
				.checkUnAvailabilityButtonSendMessage();
	}

}

