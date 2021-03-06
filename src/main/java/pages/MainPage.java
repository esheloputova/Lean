package pages;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends Page {

	@FindBy (xpath = "//p[text() = 'Create user']")
	private WebElement createUserButton;

	@FindBy (xpath = "//span[text() = 'Login']")
	private WebElement loginButtonOnToolBox;

	@FindBy (xpath = "//p[contains(@class,'ng-binding') and contains(text(), 'Login')]")
	private WebElement loginButton;

	@FindBy (xpath = "//p[contains(@class,'ng-binding') and contains(text(), 'About us')]")
	private WebElement aboutUsButton;

	@FindBy (xpath = "//p[contains(@class,'ng-binding') and contains(text(), 'Register')]")
	private WebElement registerButton;


	@FindBy (xpath = "//span[text() = 'Strategy and Project']")
	private WebElement strategyAndProjectLink;

	@FindBy (xpath = "//span[text() = 'Strategy']")
	private WebElement strategyLink;

	@FindBy (xpath = "//span[text() = 'Project']")
	private WebElement projectLink;

	@FindBy (xpath = "//span[text() = 'Customize']")
	private WebElement customizeLink;

	@FindBy (xpath = "//input[@placeholder = 'E-Mail']")
	private WebElement emailField;

	@FindBy (xpath = "//a[@id='hs-eu-confirmation-button']")
	WebElement accept;

	@FindBy (xpath = "//a[@id='hs-eu-decline-button']")
	WebElement decline;

	public CreateUserPage clickCreateUser() {
		createUserButton.click();
		new WebDriverWait(getDriver(), 10).until(ExpectedConditions.visibilityOf(emailField));
		return new CreateUserPage();
	}

	public MainPage clickOnAccept() {
		new WebDriverWait(getDriver(), 5).until(ExpectedConditions.visibilityOf(accept));
		accept.click();
		return new MainPage();
	}

//	public LoginPage clickOnLoginButton() {
//		if (!Page.elementExists("//a[@id='hs-eu-confirmation-button']")) {
//			accept.click();
//			new WebDriverWait(getDriver(), 5).until(ExpectedConditions.visibilityOf(loginButton));
//			loginButton.click();
//		} else {
//			new WebDriverWait(getDriver(), 10).until(ExpectedConditions.visibilityOf(loginButton));
//			loginButton.click();
//		}
//			return new LoginPage();
//		}

//    public LoginPage clickOnLoginButton() {
//
//        new WebDriverWait(getDriver(), 5).until(ExpectedConditions.visibilityOf(loginButton));
//        loginButton.click();
//
//        return new LoginPage();
//    }

	public LoginPage clickOnLoginButton() {

		if (!Page.elementExists("//p[contains(@class,'ng-binding') and contains(text(), 'Login')]")) {
			loginButton.click();
		} else {
			new MainBoardPage()
					.clickOnAvatarPhoto();
			new ProfilePage()
					.clickSignOut();
			new WebDriverWait(getDriver(), 5).until(ExpectedConditions.visibilityOf(loginButton));
			loginButton.click();
		}
		return new LoginPage();
	}


	public static byte[] takeScreenshot() {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}

}
