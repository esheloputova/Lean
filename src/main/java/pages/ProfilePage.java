package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;

public class ProfilePage extends Page {

	@FindBy (xpath = "//div[contains(@ng-class ,'helpingResources')]")
	WebElement resource;

	@FindBy (xpath = "//*[@id='profile-popover']//div[@class='profile-sh__footer']/div[text()='Sign Out']")
	WebElement signOutButton;

	@FindBy (xpath = "//div[contains(@ng-click, '$ctrl.onEdit()') and contains(text(), 'User profile')]")
	WebElement userProfileButton;

	@FindBy (xpath = "//div[contains(@ng-click, '$ctrl.onSettings()')]")
	WebElement caseSettingsButton;

	@FindBy (xpath = "//span[contains(@class, 'mat-button-wrapper') and contains(text(),'Delete')]")
	WebElement deleteCase;

	@FindBy (xpath = "//span[contains(@class, 'mat-button-wrapper') and contains(text(),'Yes')]")
	WebElement deleteYes;

	@FindBy (xpath = "//span[contains(@class, 'mat-button-wrapper') and contains(text(),'No')]")
	WebElement deleteNo;


	@FindBy (xpath = "//select[@ng-model='$ctrl.currentOption']")
	WebElement languagesButton;

	@FindBy (xpath = "//select[@ng-model='$ctrl.currentOption']/option[2]")
	WebElement changeLanguageOnNorsk;

	@FindBy (xpath = "//select[@ng-model='$ctrl.currentOption']/option[1]")
	WebElement changeLanguageOnEnglish;

	@FindBy (xpath = "//input[@placeholder='First Name']")
	WebElement firstNameInput;

	@FindBy (xpath = "//input[@placeholder='Last Name']")
	WebElement lastNameInput;

	@FindBy (xpath = "//span[contains(@class,'mat-button-wrapper') and contains(text(),'Save')]")
	WebElement saveProfileButton;

	@FindBy (xpath = "//div[contains(@aria-live, 'assertive')]")
	@CacheLookup
	WebElement profileSuccessfullySaved;

	@FindBy (xpath = "//span[@class = 'profile-sh__info_name ng-binding']")
	WebElement profileData;

	public MainPage clickSignOut() {
		new WebDriverWait(getDriver(), 7).until(ExpectedConditions.visibilityOf(signOutButton));
		signOutButton.click();
		return new MainPage();
	}

	public ProfilePage clickUserProfileButton() {
		userProfileButton.click();
//		new WebDriverWait(getDriver(), 7).until(ExpectedConditions.visibilityOf(firstNameInput));
		return this;
	}

	public MainBoardPage changeName() {
		String textFirstName = "Change the first name";
		firstNameInput.click();
		firstNameInput.clear();
		firstNameInput.sendKeys(textFirstName);
		saveProfileButton.click();
//		String textSucceedSaved = "Profile successfully saved!";
//		new WebDriverWait(getDriver(), 10).until(ExpectedConditions.alertIsPresent());

//		String messageSucceedSaved = profileSuccessfullySaved.getText();
//		ExpectedConditions.;
//		Assert.assertTrue("Text is not visible", messageSucceedSaved.equals());
		return new MainBoardPage();

	}

	public MainBoardPage checkNameChange() {
		String textPfofileDataChange = "Change the first name Sheloputova";
		String getChangedFullName = profileData.getText();
		AssertJUnit.assertTrue("Текст не изменился", getChangedFullName.equals(textPfofileDataChange));
		return new MainBoardPage();
	}


	public ProfilePage clickCaseSettingsButton() {
		caseSettingsButton.click();
		return this;
	}

	public MainBoardPage deleteCase() {
		deleteCase.click();

		if (deleteYes.isDisplayed()) {
			deleteYes.click();
		}
		return new MainBoardPage();
	}


	public ProfilePage changeLanguageOnNorsk() {
		languagesButton.click();
		changeLanguageOnNorsk.click();

		String resourceTranslateEng = "RESOURCES";

		new WebDriverWait(getDriver(), 10);
//				.until(ExpectedConditions.stalenessOf(resource));
		String getTextResource = resource.getText();
		System.out.println(getTextResource);
		AssertJUnit.assertTrue("Success", resourceTranslateEng.equals(getTextResource));

		return this;

	}

	public ProfilePage changeLanguageOnEnglish() {

		languagesButton.click();
		changeLanguageOnEnglish.click();

		String resourceTranslateNor = "RESSURSER";

		new WebDriverWait(getDriver(), 10);
		String getTextResource = resource.getText();
		System.out.println(getTextResource);

		AssertJUnit.assertTrue("Success", resourceTranslateNor.equals(getTextResource));

		return this;

	}


}
