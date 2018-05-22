package pages;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage extends Page {

	@FindBy (xpath = "//*[@id='profile-popover']//div[@class='profile-sh__footer']/div[text()='Sign Out']")
	WebElement signOutButton;

	@FindBy (xpath = "//div[contains(@ng-click, '$ctrl.onEdit()') and contains(text(), 'User profile')]")
	WebElement userProfileButton;

	@FindBy (xpath = "//div[contains(@ng-click, '$ctrl.onSettings()') and contains(text(), 'Case settings')]")
	WebElement caseSettingsButton;

	@FindBy (xpath = "//select[@ng-model='$ctrl.currentOption']")
	WebElement languagesButton;

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
		Assert.assertTrue("Текст не изменился", getChangedFullName.equals(textPfofileDataChange));
		return new MainBoardPage();
	}


	public ProfilePage clickCaseSettingsButton() {
		caseSettingsButton.click();
		return this;

	}


}
