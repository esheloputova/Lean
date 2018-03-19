package pages;

import junit.framework.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainBoardPage extends Page {

	WebDriverWait wait;

	@FindBy(xpath = "//div[@class='avatar-icon layout-row']")
	WebElement avatarPhoto;

	@FindBy(xpath = "//i[@class='mm-icon mm-icon-cases']")
	WebElement casesToolBar;

	@FindBy(xpath = "//button[contains(@class,'md-button') and contains(text(),'new case')]")
	WebElement newCaseButton;

	@FindBy(xpath = "//div[contains(@ng-class,'$ctrl.helpingIdeas') and contains(text(), 'Business Idea')]")
	WebElement businessIdea;


	public MainBoardPage clickOnAvatarPhoto() {
		new WebDriverWait(getDriver(), 3).until(ExpectedConditions.visibilityOf(avatarPhoto));
		avatarPhoto.click();

		return this;
	}

	public MainBoardPage clickOnCasesText() {
		casesToolBar.click();
		return this;
	}

	public CreateNewCaseForm clickNewCaseButton() {
		newCaseButton.click();
		return new CreateNewCaseForm();
	}

	public BusinessIdeaPage clickOnBusinessIdea() {
		new WebDriverWait(getDriver(), 10).until(ExpectedConditions.visibilityOf(businessIdea));
		businessIdea.click();
		return new BusinessIdeaPage();
	}


}
