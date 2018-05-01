package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Elena_Sheloputova
 */
public class GapsPage extends Page {

	@FindBy (xpath = "(//div[@class = 'box-header'])[1]//button[@type = 'button']")
	WebElement buttonPlus;


	@FindBy (xpath = "(//board-box-stickies[@ng-model='box.stickies'])[1]")
	WebElement gapsAddStickies;


	// Beginning. Actions in the form
	@FindBy (xpath = "//div[@class='button button-remove ng-scope']")
	WebElement deleteSticky;

	@FindBy (xpath = "//div[@class='button button-deactivate ng-scope']")
	WebElement deactivateSticky;

	@FindBy (xpath = "//div[@class='button button-activate ng-scope']")
	WebElement activateSticky;

	@FindBy (xpath = "//span[contains(@class,'button-more') and (text()='more')]")
	WebElement moreInformationSticky;

	@FindBy (xpath = "//textarea[contains(@ng-model,'description')]")
	WebElement descriptionSticky;

	@FindBy (xpath = "//span[contains(@class,'button-more') and (text()='less')]")
	WebElement lessInformationSticky;

	@FindBy (xpath = "//input[@type ='file']")
	WebElement attachmentFile;

	@FindBy (xpath = "//div[contains(@class, 'dialog-close')]")
	WebElement closeForm;

	@FindBy (xpath = "(//select[@ng-model='$ctrl.currentOption'])[2]")
	WebElement clickBusinessModelCard;

	@FindBy (xpath = "//select[@ng-model='$ctrl.currentOption']/optgroup[@label='What will make you unique?']/option[1]")
	WebElement chooseBusinessModelCard;

	@FindBy (xpath = "//div[contains(@class, 'item-good')]")
	WebElement strengthButton;

	@FindBy (xpath = "//div[contains(@class, 'item-bad')]")
	WebElement weaknessButton;

	@FindBy (xpath = "(//button[contains(@class, 'md-raised') and (@type='button')])[2]")
	WebElement gapsButtonSave;

//	End. Actions in the form

	@FindBy (xpath = "//input[contains(@type, 'text') and contains(@ng-model, 'ngModel')]")
	WebElement nameCompetitor;

	@FindBy (xpath = "//button[contains(@type, 'submit')]")
	WebElement addCompetitor;

	@FindBy (xpath = "//a[contains(@class, 'add-competitor')]")
	WebElement linkAddCompetitor;

	@FindBy (xpath = "//input[contains(@type, 'text') and contains(@name, 'title')]")
	WebElement formGapsNameCompetitor;

	@FindBy (xpath = "(//div[@ng-transclude='stickies'])[2]")
	WebElement firstCompetitor;

	@FindBy (xpath = "(//div[@class='select-btn'])[1]")
	WebElement editFirstCompetitor;

	@FindBy (xpath = "(//span[@class='title ng-binding'])[1]")
	WebElement deactivateOrActivateFirstCompetitor;

	@FindBy (xpath = "(//span[@class='title ng-binding'])[2]")
	WebElement renameFirstCompetitor;

	@FindBy (xpath = "(//span[@class='title ng-binding'])[3]")
	WebElement deleteFirstCompetitor;


	@FindBy (xpath = "//a[contains(@ng-click, 'startAddingGaps')]")
	WebElement linkStart;

	public GapsPage createStickies() {
		new WebDriverWait(getDriver(), 5).until(ExpectedConditions.visibilityOf(gapsAddStickies));
		gapsAddStickies.click();
		new Actions(driver).doubleClick(gapsAddStickies).build().perform();

		nameCompetitor.click();
		nameCompetitor.sendKeys("Test competitor");
		clickBusinessModelCard.click();
		chooseBusinessModelCard.click();
		weaknessButton.click();
		moreInformationSticky.click();
		descriptionSticky.click();
		descriptionSticky.sendKeys("Test description");
		gapsButtonSave.click();
		return this;
	}

}
