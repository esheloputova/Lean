package pages;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.util.calendar.BaseCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Elena_Sheloputova
 */
public class CreateNewCaseForm extends Page {



	@FindBy (xpath = "//input[@name='caseName']")
	WebElement nameCase;

	@FindBy (xpath = "//span[contains(@ng-click,'copy')]")
	WebElement copyCase;

	@FindBy (xpath = "//span[text() = 'Strategy and Project']")
	private WebElement strategyAndProjectText;

	@FindBy (xpath = "//span[text() = 'Strategy']")
	private WebElement strategyText;

	@FindBy (xpath = "//span[text() = 'Project']")
	private WebElement projectText;

	@FindBy (xpath = "//span[text() = 'Customize']")
	private WebElement customizeText;

	@FindBy (xpath = "//md-radio-button[@id='radio_0']")
	private WebElement radioButtonIwant;

	@FindBy (xpath = "//md-radio-button[@id='radio_1']")
	private WebElement radioButtonIdontWant;

	@FindBy (xpath = "//button[@type='submit']")
	private WebElement createButton;


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

	@FindBy (xpath = "(//button[@type = 'submit'])[1]")
	private WebElement createStep2;

	@FindBy (xpath = "(//span[(@class = 'mat-button-wrapper') and (text()='go')])")
	private WebElement goStep3;

	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());

	public CreateNewCaseForm creatingNewCase() {
		nameCase.click();
		nameCase.sendKeys("Test test");
		strategyAndProjectText.click();
		radioButtonIwant.click();
		createButton.click();
		return new CreateNewCaseForm();
	}

	public CreateNewCaseForm prepareDataNewCase() {
		nameCase.click();
		nameCase.sendKeys("Test case from data preparation" + timeStamp);
		strategyAndProjectText.click();
		radioButtonIwant.click();
		createButton.click();
		return new CreateNewCaseForm();
	}

	public CreateNewCaseForm copyCase() {
		copyCase.click();
		nameCase.click();
		nameCase.sendKeys("Copy case" + timeStamp);
		createButton.click();
		return new CreateNewCaseForm();
	}

	public MainBoardPage createNewUserNewCase() {
		new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(developingCompany));
		developingCompany.click();
		organisationNumber.click();
		organisationNumber.sendKeys("It is number of organisation for test");
		companyName.click();

		companyName.sendKeys("Company name" + timeStamp);
//		countryOfRegistration.click();
//		new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOfAllElements(listCountry));

//		chooseValueOfcountry.click();
//		companyCurrency.click();
		createStep2.click();

		new WebDriverWait(getDriver(), 10).until(ExpectedConditions.elementToBeClickable(goStep3));
		goStep3.submit();

		return new MainBoardPage();
	}

	public static byte[] takeScreenshot(){
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}


}
