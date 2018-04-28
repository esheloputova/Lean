package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Elena_Sheloputova
 */
public class BusinessModelPage extends Page {


	@FindBy (xpath = "(//div[@class = 'box-header'])[1]//button[@type = 'button']")
	WebElement businessModelWhatMakesYouUniqueButtonPlus;

	@FindBy (xpath = "(//div[@class = 'grid__cell business-items__models-cell ng-scope'])[1]")
	WebElement businessModelWhoCanHelpYou;

	@FindBy (xpath = "(//div[@class = 'grid__cell business-items__models-cell ng-scope'])[1]//sticky[@ng-model='item'][1]")
	WebElement firstStickyBusinessModelWhoCanHelpYou;

	@FindBy (xpath = "(//div[@class = 'grid__cell business-items__models-cell ng-scope'])[2]")
	WebElement businessModelHowWillYouMarketAndSell;

	@FindBy (xpath = "(//div[@class = 'grid__cell business-items__models-cell ng-scope'])[2]//sticky[@ng-model='item'][1]")
	WebElement firstStickyBusinessModelHowWillYouMarketAndSell;

	@FindBy (xpath = "(//div[@class = 'grid__cell business-items__models-cell ng-scope'])[3]")
	WebElement businessModelHowWillYouCharge;

	@FindBy (xpath = "(//div[@class = 'grid__cell business-items__models-cell ng-scope'])[3]//sticky[@ng-model='item'][1]")
	WebElement firstStickyBusinessModelHowWillYouCharge;


	@FindBy (xpath = "(//div[@class = 'grid__cell business-items__models-cell ng-scope'])[4]")
	WebElement businessModelWhatIsYourUniqueValueProposition;

	@FindBy (xpath = "(//div[@class = 'grid__cell business-items__models-cell ng-scope'])[4]//sticky[@ng-model='item'][1]")
	WebElement firstStickyBusinessModelWhatIsYourUniqueValueProposition;


	@FindBy (xpath = "(//div[@class = 'grid__cell business-items__models-cell ng-scope'])[5]")
	WebElement businessModelWhatFeaturesWillYourProductHave;

	@FindBy (xpath = "(//div[@class = 'grid__cell business-items__models-cell ng-scope'])[5]//sticky[@ng-model='item'][1]")
	WebElement firstStickyBusinessModelWhatFeaturesWillYourProductHave;


	@FindBy (xpath = "(//div[@class = 'grid__cell business-items__models-cell ng-scope'])[6]")
	WebElement businessModelWhoWillBeYourFirstCustomers;

	@FindBy (xpath = "(//div[@class = 'grid__cell business-items__models-cell ng-scope'])[6]//sticky[@ng-model='item'][1]")
	WebElement firstStickyBusinessModelWhoWillBeYourFirstCustomers;


	@FindBy (xpath = "//input[(@type='text') and (@name='title')]")
	WebElement fieldOfInputBusinessModel;

	@FindBy (xpath = "(//button[contains(@class, 'md-raised') and (@type='button')])[2]")
	WebElement buttonSave;

	@FindBy (xpath = "(//div[@class = 'grid__cell business-items__idea-cell ng-scope'])[1]")
	WebElement businessModelIdea1WhatMakesYouUnique;

	@FindBy (xpath = "(//div[@class = 'grid__cell business-items__idea-cell ng-scope'])[2]")
	WebElement businessModelIdea2WhatProblemWillYouSolve;

	@FindBy (xpath = "(//div[@class = 'grid__cell business-items__idea-cell ng-scope'])[3]")
	WebElement businessModelIdea3WhoWillHaveThisProblem;

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

	@FindBy (xpath = "//input[(@type='text') and (@name='title')]")
	WebElement fieldOfInputBM;

	@FindBy (xpath = "//div[@title = 'Remove attach']")
	WebElement removeAttach;
	//	End. Actions in the form

	@FindBy (xpath = "//a[text() = 'gaps']")
	WebElement goGaps;

	@FindBy (xpath = "//a[text() = 'test']")
	WebElement goTests;


	public List<WebElement> listFirstStickies;

	public GapsPage goGaps() {
		goGaps.click();

		return new GapsPage();
	}

	public TestsPage goTests() {
		goTests.click();

		return new TestsPage();
	}


	public BusinessModelPage createAllStickiesBM() {

		businessModelWhoCanHelpYou.click();
		new Actions(regularDriver).doubleClick(businessModelWhoCanHelpYou).build().perform();
		fieldOfInputBusinessModel.sendKeys("Who can help you?");
		buttonSave.click();

		businessModelHowWillYouMarketAndSell.click();
		new Actions(regularDriver).doubleClick(businessModelHowWillYouMarketAndSell).build().perform();
		fieldOfInputBusinessModel.sendKeys("How will you market and sell?");
		buttonSave.click();

		businessModelHowWillYouCharge.click();
		new Actions(regularDriver).doubleClick(businessModelHowWillYouCharge).build().perform();
		fieldOfInputBusinessModel.sendKeys("How will you charge?");
		buttonSave.click();

		businessModelWhatIsYourUniqueValueProposition.click();
		new Actions(regularDriver).doubleClick(businessModelWhatIsYourUniqueValueProposition).build().perform();
		fieldOfInputBusinessModel.sendKeys("What is your unique value proposition?");
		buttonSave.click();

		businessModelWhatFeaturesWillYourProductHave.click();
		new Actions(regularDriver).doubleClick(businessModelWhatFeaturesWillYourProductHave).build().perform();
		fieldOfInputBusinessModel.sendKeys("What features will your product have?");
		buttonSave.click();

		businessModelWhoWillBeYourFirstCustomers.click();
		new Actions(regularDriver).doubleClick(businessModelWhoWillBeYourFirstCustomers).build().perform();
		fieldOfInputBusinessModel.sendKeys("Who will be your first customers?");
		buttonSave.click();

		return this;
	}

	public BusinessModelPage createBIStickiesBM() {
		businessModelIdea1WhatMakesYouUnique.click();
		new Actions(regularDriver).doubleClick(businessModelIdea1WhatMakesYouUnique).build().perform();
		fieldOfInputBusinessModel.sendKeys("What makes you unique? Add in BI");
		buttonSave.click();

		businessModelIdea2WhatProblemWillYouSolve.click();
		new Actions(regularDriver).doubleClick(businessModelIdea2WhatProblemWillYouSolve).build().perform();
		fieldOfInputBusinessModel.sendKeys("What makes you unique? Add in BI");
		buttonSave.click();

		businessModelIdea3WhoWillHaveThisProblem.click();
		new Actions(regularDriver).doubleClick(businessModelIdea3WhoWillHaveThisProblem).build().perform();
		fieldOfInputBusinessModel.sendKeys("Who will have this problem? Add in BI");
		buttonSave.click();

		return this;
	}

	//Add attach + description + deactive + active

	public List<WebElement> createList() {
		listFirstStickies = new ArrayList<WebElement>();
		listFirstStickies.add(firstStickyBusinessModelWhoCanHelpYou);
		listFirstStickies.add(firstStickyBusinessModelHowWillYouMarketAndSell);
		listFirstStickies.add(firstStickyBusinessModelHowWillYouCharge);
		listFirstStickies.add(firstStickyBusinessModelWhatIsYourUniqueValueProposition);
		listFirstStickies.add(firstStickyBusinessModelWhatFeaturesWillYourProductHave);
		listFirstStickies.add(firstStickyBusinessModelWhoWillBeYourFirstCustomers);
		return listFirstStickies;
	}

	public BusinessModelPage editNameStickiesBM() {
		listFirstStickies = new ArrayList<WebElement>();
		listFirstStickies.add(firstStickyBusinessModelWhoCanHelpYou);
		listFirstStickies.add(firstStickyBusinessModelHowWillYouMarketAndSell);
		listFirstStickies.add(firstStickyBusinessModelHowWillYouCharge);
		listFirstStickies.add(firstStickyBusinessModelWhatIsYourUniqueValueProposition);
		listFirstStickies.add(firstStickyBusinessModelWhatFeaturesWillYourProductHave);
		listFirstStickies.add(firstStickyBusinessModelWhoWillBeYourFirstCustomers);
		for (WebElement x : listFirstStickies) {
			new WebDriverWait(getRegularDriver(), 5).until(ExpectedConditions.visibilityOf(x));
			x.click();
			fieldOfInputBM.click();
			fieldOfInputBM.clear();
			fieldOfInputBM.sendKeys("Edit");
			buttonSave.click();

		}
		return this;
	}

	public BusinessModelPage deactivateStickiesBM() {
		for (WebElement x : listFirstStickies) {
			new WebDriverWait(getRegularDriver(), 5).until(ExpectedConditions.visibilityOf(x));
			x.click();
			new WebDriverWait(getRegularDriver(), 2).until(ExpectedConditions.visibilityOf(deactivateSticky));
			deactivateSticky.click();
			buttonSave.click();
		}
		return this;
	}

	public BusinessModelPage activateStickiesBM() {
		for (WebElement x : listFirstStickies) {
			new WebDriverWait(getRegularDriver(), 5).until(ExpectedConditions.visibilityOf(x));
			x.click();
			new WebDriverWait(getRegularDriver(), 2).until(ExpectedConditions.visibilityOf(activateSticky));
			activateSticky.click();
			buttonSave.click();
		}
		return this;
	}

	public BusinessModelPage addMoreInformationStickiesBM() {
		for (WebElement x : listFirstStickies) {
			new WebDriverWait(getRegularDriver(), 5).until(ExpectedConditions.visibilityOf(x));
			x.click();
			new WebDriverWait(getRegularDriver(), 2).until(ExpectedConditions.visibilityOf(moreInformationSticky));
			moreInformationSticky.click();
			descriptionSticky.click();
			descriptionSticky.sendKeys("Created when I edit");
			buttonSave.click();
		}
		return this;
	}

	public BusinessModelPage addAttachesBM() {
		for (WebElement x : listFirstStickies) {
			new WebDriverWait(getRegularDriver(), 5).until(ExpectedConditions.visibilityOf(x));
			x.click();
			attachmentFile.sendKeys("C:\\Elena\\Java\\Tests_start\\leanbusinessplatformcom\\src\\main\\resources\\Attachment.zip");
			buttonSave.click();
		}
		return this;
	}

	public BusinessModelPage deleteAttachesBM() {
		for (WebElement x : listFirstStickies) {
			new WebDriverWait(getRegularDriver(), 5).until(ExpectedConditions.visibilityOf(x));
			x.click();
			new WebDriverWait(getRegularDriver(), 2).until(ExpectedConditions.visibilityOf(removeAttach));
			removeAttach.click();
			buttonSave.click();
		}
		return this;
	}

	public BusinessModelPage deleteAddInformationsBM() {
		for (WebElement x : listFirstStickies) {
			new WebDriverWait(getRegularDriver(), 5).until(ExpectedConditions.visibilityOf(x));
			x.click();
			new WebDriverWait(getRegularDriver(), 2).until(ExpectedConditions.visibilityOf(descriptionSticky));
			descriptionSticky.click();
			descriptionSticky.clear();
			new WebDriverWait(getRegularDriver(), 2).until(ExpectedConditions.visibilityOf(lessInformationSticky));
			lessInformationSticky.click();
			buttonSave.click();
		}
		return this;
	}

	public BusinessModelPage gragAndDropBM() {

		new WebDriverWait(getRegularDriver(), 5).until(ExpectedConditions.visibilityOf(firstStickyBusinessModelWhoCanHelpYou));

		new Actions(getRegularDriver()).clickAndHold(firstStickyBusinessModelWhoCanHelpYou).moveToElement(firstStickyBusinessModelHowWillYouMarketAndSell).release().build().perform();
// 		new WebDriverWait(getRegularDriver(), 2).until(ExpectedConditions.visibilityOf());
//		new WebDriverWait(getRegularDriver(), 2).until(ExpectedConditions.visibilityOf(chooseStick32));
//		new Actions(getRegularDriver()).dragAndDrop(chooseStick12, chooseStick32).perform();
		return this;
	}

}
