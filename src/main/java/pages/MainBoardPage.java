package pages;

import org.openqa.selenium.WebElement;
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

	@FindBy(xpath = "//div[contains(@ng-class,'$ctrl.helpingModels') and contains(text(), 'Business models')]")
	WebElement businessModel;

	@FindBy(xpath = "//div[contains(@ng-class,'helpingGaps')]")
	WebElement gaps;





	@FindBy(xpath = "//img[@alt = 'Logo']")
	WebElement goMainPage;



	public MainBoardPage clickOnAvatarPhoto() {
		new WebDriverWait(getRegularDriver(), 3).until(ExpectedConditions.visibilityOf(avatarPhoto));
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
		new WebDriverWait(getRegularDriver(), 10).until(ExpectedConditions.visibilityOf(businessIdea));
		businessIdea.click();
		return new BusinessIdeaPage();
	}

	public BusinessModelPage clickOnBusinessModel() {
		new WebDriverWait(getRegularDriver(), 10).until(ExpectedConditions.visibilityOf(businessModel));
		businessModel.click();
		return new BusinessModelPage();
	}

	public GapsPage clickOnGap() {
		new WebDriverWait(getRegularDriver(), 20).until(ExpectedConditions.visibilityOf(gaps));
		gaps.click();
		return new GapsPage();
	}



	public MainBoardPage goMainPage() {
		goMainPage.click();
		return new MainBoardPage();
	}




}
