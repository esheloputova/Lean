package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class CreateUserPage extends Page {

	@FindBy (xpath = "(//span[@class='mat-button-wrapper'])[2]")
	private WebElement next;


	//	Beginning. PRIVACY AND TERMS
	@FindBy (xpath = "//mat-dialog-actions/button[@class = 'mat-raised-button']")
	private WebElement acceptPrivacyAndTerms;

	@FindBy (xpath = "//mat-dialog-actions/button[@class = 'mat-button']")
	private WebElement cancelPrivacyAndTerms;

	@FindBy (xpath = "(//label[@class='mat-checkbox-layout'])[2]")
	private WebElement checkBox1;

	@FindBy (xpath = "(//label[@class='mat-checkbox-layout'])[3]")
	private WebElement checkBox2;
	//	End. PRIVACY AND TERMS

	@FindBy (xpath = "//input[@placeholder = 'E-Mail']")
	private WebElement emailField;

	@FindBy (xpath = "//input[@placeholder = 'Password']")
	private WebElement passwordField;

	@FindBy (xpath = "//input[@placeholder = 'Repeat Password']")
	private WebElement repeatPasswordField;

	@FindBy (xpath = "//input[@placeholder = 'First Name']")
	private WebElement firstNameField;

	@FindBy (xpath = "//input[@placeholder = 'Last Name']")
	private WebElement lastNameField;


	@FindBy (xpath = "(//div[@class = 'mat-select-value'])[1]")
	private WebElement countryOfOriginField;

	@FindBy (xpath = "//div[@id='cdk-overlay-0']//mat-option[1]")
	private WebElement chooseValueOfcountryOfOriginField;

	@FindBy (xpath = "//span[text() = 'RUB']")
	private WebElement chooseValueOfCurrency;

	@FindBy (xpath = "(//div[@class = 'mat-select-value'])[2]")
	private WebElement userLanguageField;

	@FindBy (xpath = "//span[contains(@class, 'mat-option-text') and (text() = 'English')]")
	private WebElement chooseValueOfLanguageField;

	@FindBy (xpath = "//span[@class = 'mat-checkbox-label']")
	private WebElement acceptionField;

	@FindBy (xpath = "//span[(@class = 'mat-button-wrapper') and contains(text(), 'user')]")
	private WebElement createUser;

	@FindBy (xpath = "//span[text() = 'Register']")
	private WebElement registerButton;

	@FindBy (xpath = "(//div[@class='mat-radio-container'])[1]")
	private WebElement developingCompany;

	@FindBy (xpath = "(//div[@class='mat-radio-container'])[2]")
	private WebElement limitedProject;

	@FindBy (xpath = "(//div[@class='mat-radio-container'])[3]")
	private WebElement notRegisteredCompany;

	//I am developing an existing company
	@FindBy (xpath = "//input[(@formcontrolname = 'organisationNumber')]")
	private WebElement organisationNumber;

	@FindBy (xpath = "//input[(@formcontrolname = 'companyName')]")
	private WebElement companyName;

	@FindBy (xpath = "//mat-select[(@formcontrolname = 'countryOfRegistration')]")
	private WebElement countryOfRegistration;

	@FindBy (xpath = "(//span[text() = 'Romania'])[2]")
	private WebElement chooseValueOfcountry;

	@FindBy (xpath = "//mat-select[(@formcontrolname = 'companyCurrency')]")
	private WebElement companyCurrency;

	@FindBy (xpath = "(//button[@type = 'submit'])[2]")
	private WebElement createStep2;

	@FindBy (xpath = "(//span[(@class = 'mat-button-wrapper') and (text()='go')])")
	private WebElement goStep3;

	@FindBys (@FindBy (xpath = "//mat-option[@class = 'mat-option ng-star-inserted']"))
	private List<WebElement> listCountry;


//  I work with a limited project within an existing company

	@FindBy (xpath = "//input[@formcontrolname = 'caseTitle']")
	private WebElement nameCase;

	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());

	//I am developing an existing company
	public CreateUserPage createNewUser1() {

		String emailNewUser1 = "elena.sheloputova+" + timeStamp + "@nrg-soft.ru";
		String passNewUser1 = "Elena-4776547";

		new WebDriverWait(getDriver(), 10).until(ExpectedConditions.visibilityOf(emailField));
		emailField.click();
		emailField.sendKeys(emailNewUser1);
		passwordField.click();
		passwordField.sendKeys(passNewUser1);
		repeatPasswordField.click();
		repeatPasswordField.sendKeys(passNewUser1);
		firstNameField.click();
		firstNameField.sendKeys("Testov1");
		lastNameField.click();
		lastNameField.sendKeys("Test1");
//		countryOfOriginField.click();
//		chooseValueOfcountryOfOriginField.click();
//		userLanguageField.click();
//		chooseValueOfLanguageField.click();
		acceptionField.click();

		new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(createUser));
		createUser.click();

		acceptPivacy();

		new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(developingCompany));
		developingCompany.click();
		organisationNumber.click();
		organisationNumber.sendKeys("It is number of organisation for test");
		companyName.click();
		companyName.sendKeys("Test nameeee");
//		countryOfRegistration.click();
//		new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOfAllElements(listCountry));

//		chooseValueOfcountry.click();
//		companyCurrency.click();
		createStep2.click();
		new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(goStep3));
		goStep3.click();

		next.click();

		System.out.println("Login is" + emailNewUser1);
		return new CreateUserPage();
	}


	public CreateUserPage createNewUser2() {
		new WebDriverWait(getDriver(), 10).until(ExpectedConditions.visibilityOf(emailField));
		emailField.click();
		emailField.sendKeys("elena.sheloputova+" + timeStamp + "@nrg-soft.ru");
		passwordField.click();
		passwordField.sendKeys("Elena-4776547");
		repeatPasswordField.click();
		repeatPasswordField.sendKeys("Elena-4776547");
		firstNameField.click();
		firstNameField.sendKeys("Testov1");
		lastNameField.click();
		lastNameField.sendKeys("Test1");
//		countryOfOriginField.click();
//		chooseValueOfcountryOfOriginField.click();
//		userLanguageField.click();
//		chooseValueOfLanguageField.click();
		acceptionField.click();



		new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(createUser));
		createUser.click();

		acceptPivacy();

		new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(developingCompany));
		limitedProject.click();
		nameCase.click();
		nameCase.sendKeys("Name of case test");
		organisationNumber.click();
		organisationNumber.sendKeys("It is number of organisation for test");
		companyName.click();
		companyName.sendKeys("Test nameeee");
//    countryOfRegistration.click();
		new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOfAllElements(listCountry));

//		chooseValueOfcountry.getSize();
//		chooseValueOfcountry.click();
//		companyCurrency.click();
		createStep2.click();
		new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(goStep3));
		goStep3.submit();

		return new CreateUserPage();
	}

	public CreateUserPage createNewUser3() {
		new WebDriverWait(getDriver(), 10).until(ExpectedConditions.visibilityOf(emailField));
		emailField.click();
		emailField.sendKeys("elena.sheloputova+" + timeStamp + "@nrg-soft.ru");
		passwordField.click();
		passwordField.sendKeys("Elena-4776547");
		repeatPasswordField.click();
		repeatPasswordField.sendKeys("Elena-4776547");
		firstNameField.click();
		firstNameField.sendKeys("Testov1");
		lastNameField.click();
		lastNameField.sendKeys("Test1");
//		countryOfOriginField.click();
//		chooseValueOfcountryOfOriginField.click();
//		userLanguageField.click();
//		chooseValueOfLanguageField.click();
		acceptionField.click();

		acceptPivacy();

		new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(createUser));
		createUser.click();

		new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(developingCompany));
		notRegisteredCompany.click();
		nameCase.click();
		nameCase.sendKeys("Name of case test");
//    countryOfRegistration.click();
//    new WebDriverWait(getDriver(),4).until(ExpectedConditions.visibilityOfAllElements(listCountry));

//    chooseValueOfcountry.getSize();
//    chooseValueOfcountry.click();
//    companyCurrency.click();
		createStep2.click();
		new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(goStep3));
		goStep3.submit();

		return new CreateUserPage();
	}

//  I have not registered a company yet


	public CreateUserPage acceptPivacy() {
		new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(acceptPrivacyAndTerms));
		acceptPrivacyAndTerms.click();

		new WebDriverWait(getDriver(), 10).until(ExpectedConditions.visibilityOf(checkBox1));
		checkBox1.click();
		new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(checkBox2));
		checkBox2.click();

		acceptPrivacyAndTerms.click();

		return this;
	}

	public static byte[] takeScreenshot(){
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}

}
