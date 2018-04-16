package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CreateUserPage extends Page {

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

	@FindBy (xpath = "//span[text() = 'Norway']")
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

	@FindBy (xpath = "//mat-radio-button[@id = 'mat-radio-2']")
	private WebElement developingCompany;

	@FindBy (xpath = "(//div[(@class = 'mat-radio-label-content')])[2]")
	private WebElement limitedProject;

	@FindBy (xpath = "(//div[(@class = 'mat-radio-label-content')])[3]")
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

	//I am developing an existing company
	public CreateUserPage createNewUser1() {
		new WebDriverWait(getDriver(), 10).until(ExpectedConditions.visibilityOf(emailField));
		emailField.click();
		emailField.sendKeys("elena.sheloputova+" + Math.random() * 3 + "@nrg-soft.ru");
		passwordField.click();
		passwordField.sendKeys("Elena-4776547");
		repeatPasswordField.click();
		repeatPasswordField.sendKeys("Elena-4776547");
		firstNameField.click();
		firstNameField.sendKeys("Testov1");
		lastNameField.click();
		lastNameField.sendKeys("Test1");
		countryOfOriginField.click();
		chooseValueOfcountryOfOriginField.click();
		userLanguageField.click();
		chooseValueOfLanguageField.click();
		acceptionField.click();
		createUser.click();

		new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(developingCompany));
		developingCompany.click();
		organisationNumber.click();
		organisationNumber.sendKeys("It is number of organisation for test");
		companyName.click();
		companyName.sendKeys("Test nameeee");
		countryOfRegistration.click();
		new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOfAllElements(listCountry));

		chooseValueOfcountry.getSize();
		chooseValueOfcountry.click();
		companyCurrency.click();
		createStep2.click();
		new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(goStep3));
		goStep3.click();

		return new CreateUserPage();
	}


	public CreateUserPage createNewUser2() {
		new WebDriverWait(getDriver(), 10).until(ExpectedConditions.visibilityOf(emailField));
		emailField.click();
		emailField.sendKeys("elena.sheloputova+" + Math.random() * 3 + "@nrg-soft.ru");
		passwordField.click();
		passwordField.sendKeys("Elena-4776547");
		repeatPasswordField.click();
		repeatPasswordField.sendKeys("Elena-4776547");
		firstNameField.click();
		firstNameField.sendKeys("Testov1");
		lastNameField.click();
		lastNameField.sendKeys("Test1");
		countryOfOriginField.click();
		chooseValueOfcountryOfOriginField.click();
		userLanguageField.click();
		chooseValueOfLanguageField.click();
		acceptionField.click();
		createUser.click();

		new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(developingCompany));
		limitedProject.click();
		nameCase.click();
		nameCase.sendKeys("Name of case test");
		organisationNumber.click();
		organisationNumber.sendKeys("It is number of organisation for test");
		companyName.click();
		companyName.sendKeys("Test nameeee");
    countryOfRegistration.click();
		new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOfAllElements(listCountry));

		chooseValueOfcountry.getSize();
		chooseValueOfcountry.click();
		companyCurrency.click();
		createStep2.click();
		new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(goStep3));
		goStep3.click();

		return new CreateUserPage();
	}

	public CreateUserPage createNewUser3() {
		new WebDriverWait(getDriver(), 10).until(ExpectedConditions.visibilityOf(emailField));
		emailField.click();
		emailField.sendKeys("elena.sheloputova+" + Math.random() * 3 + "@nrg-soft.ru");
		passwordField.click();
		passwordField.sendKeys("Elena-4776547");
		repeatPasswordField.click();
		repeatPasswordField.sendKeys("Elena-4776547");
		firstNameField.click();
		firstNameField.sendKeys("Testov1");
		lastNameField.click();
		lastNameField.sendKeys("Test1");
		countryOfOriginField.click();
		chooseValueOfcountryOfOriginField.click();
		userLanguageField.click();
		chooseValueOfLanguageField.click();
		acceptionField.click();
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
		goStep3.click();

		return new CreateUserPage();
	}

//  I have not registered a company yet


}
