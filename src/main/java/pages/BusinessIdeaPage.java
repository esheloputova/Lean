package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/**
 * @author Elena_Sheloputova
 */
public class BusinessIdeaPage extends Page {
	@FindBy(xpath = "(//board-box-stickies[@ng-model='box.stickies'])[1]")
	WebElement whatMakesYouUniqueColumn;

	@FindBys(@FindBy(xpath = "(//board-box-stickies[@ng-model='box.stickies'])[1]/idea-sticky"))
	List<WebElement> allStickyWhatMakesYouUniqueColumn;

	@FindBys(@FindBy(xpath = "(//board-box-stickies[@ng-model='box.stickies'])[2]/idea-sticky"))
	List<WebElement> allStickyWhatProblemWillYouSolveColumn;

	@FindBys(@FindBy(xpath = "(//board-box-stickies[@ng-model='box.stickies'])[3]/idea-sticky"))
	List<WebElement> allStickyWhoWillHaveThisProblemColumn;


	@FindBy(xpath = "(//board-box-stickies[@ng-model='box.stickies'])[1]//idea-sticky[@ng-model='item'][1]")
	WebElement clickStick1;

	@FindBy(xpath = "(//board-box-stickies[@ng-model='box.stickies'])[1]//idea-sticky[@ng-model='item'][1]//div[@ng-dblclick ='$event.stopPropagation();']")
	WebElement chooseStick11;

	@FindBy(xpath = "(//board-box-stickies[@ng-model='box.stickies'])[1]//idea-sticky[@ng-model='item'][2]//div[@ng-dblclick ='$event.stopPropagation();']")
	WebElement chooseStick12;

	@FindBy(xpath = "(//board-box-stickies[@ng-model='box.stickies'])[2]//idea-sticky[@ng-model='item'][1]")
	WebElement editStick2;

	@FindBy(xpath = "(//board-box-stickies[@ng-model='box.stickies'])[2]//idea-sticky[@ng-model='item'][1]//div[@ng-dblclick ='$event.stopPropagation();']")
	WebElement chooseStick21;

	@FindBy(xpath = "(//board-box-stickies[@ng-model='box.stickies'])[2]//idea-sticky[@ng-model='item'][2]//div[@ng-dblclick ='$event.stopPropagation();']")
	WebElement chooseStick22;


	@FindBy(xpath = "(//board-box-stickies[@ng-model='box.stickies'])[3]//idea-sticky[@ng-model='item'][1]")
	WebElement editStick3;


	@FindBy(xpath = "(//board-box-stickies[@ng-model='box.stickies'])[3]//idea-sticky[@ng-model='item'][1]//div[@ng-dblclick ='$event.stopPropagation();']")
	WebElement chooseStick31;

	@FindBy(xpath = "(//board-box-stickies[@ng-model='box.stickies'])[3]//idea-sticky[@ng-model='item'][2]//div[@ng-dblclick ='$event.stopPropagation();']")
	WebElement chooseStick32;


	@FindBy(xpath = "//input[(@type='text') and contains(@placeholder, 'Give the new idea name')]")
	WebElement giveNameIdea;

	@FindBy(xpath = "//span[(@class='ng-binding ng-scope') and contains(text(), 'add')]")
	WebElement addIdea;

	@FindBy(xpath = "//div[(@ng-show='!vm.isEditingTitle[idea.id]')")
	WebElement createdIdea;

	@FindBy(xpath = "//a[text() = 'Business models']")
	WebElement linkBusinessModel;

	@FindBy(xpath = "//a[text() = 'TESTS']")
	WebElement linkTests;

	@FindBy(xpath = "//a[text() = 'models']")
	WebElement linkModels;

//	Form of creating
	@FindBy(xpath = "//button[@type='submit']")
	WebElement businessIdeaButtonSave;

	@FindBy(xpath = "(//board-box-stickies[@ng-model='box.stickies'])[2]")
	WebElement whatProblemWillYouSolveColumn;

	@FindBy(xpath = "(//board-box-stickies[@ng-model='box.stickies'])[3]")
	WebElement whoWillHaveThisProblemColumn;

	@FindBy(xpath = "(//span[@class='fa fa-caret-down'])[1]")
	WebElement actionsWithSticky;


// Beginning. Actions in the form

	@FindBy(xpath = "//input[(@type='text') and (@name='title')]")
	WebElement nameOfSticky;

	@FindBy(xpath = "//div[@qa-name='delete-button-dialog']")
	WebElement deleteSticky;

	@FindBy(xpath = "//div[@class='button button-deactivate ng-scope']")
	WebElement deactivateSticky;

	@FindBy(xpath = "//div[@class='button button-activate ng-scope']")
	WebElement activateSticky;

	@FindBy(xpath = "//span[contains(@class,'button-more') and (text()='more')]")
	WebElement moreInformationSticky;

	@FindBy(xpath = "//textarea[contains(@ng-model,'description')]")
	WebElement descriptionSticky;

	@FindBy(xpath = "//span[contains(@class,'button-more') and (text()='less')]")
	WebElement lessInformationSticky;

	@FindBy(xpath = "//input[@type ='file']")
	WebElement attachmentFile;

	@FindBy(xpath = "//div[@qa-name='close-dialog']")
	WebElement closeForm;
//	End. Actions in the form

	@FindBy(xpath = "(//span[@ng-if='$index !== 0'])[1]")
	WebElement clickFirsrTab;

	@FindBy(xpath = "(//div[@class='select-btn'])[1]")
	WebElement firsrTab;

	@FindBy(xpath = "(//span[(@class = 'title ng-binding')])[1]")
	WebElement firstDeactivateActivate;

	@FindBy(xpath = "(//span[(@class = 'title ng-binding')])[2]")
	WebElement firstRename;

	@FindBy(xpath = "(//input[@ng-model = 'idea.title'])[2]")
	WebElement inputNewName;

	@FindBy(xpath = "(//input[@ng-model = 'idea.title'])[1]")
	WebElement goAllCards;

	@FindBy(xpath = "(//span[(@class = 'title ng-binding')])[3]")
	WebElement firstDelete;

	@FindBy(xpath = "(//span[(@class = 'title ng-binding')])[4]")
	WebElement firstEdit;

	@FindBy(xpath = "//div[contains(@class, 'btn-save')]")
	WebElement buttonSaveIdea;


	@FindBy(xpath = "(//div[@ng-repeat = 'idea in $ctrl.list'])[1]")
	WebElement changeColorFirst;

	@FindBy(xpath = "(//div[@ng-repeat = 'idea in $ctrl.list'])[2]")
	WebElement changeColorSecond;

	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());

	@FindBys(@FindBy(xpath = "(//button[(@type='button') and (@aria-label='Add new card')])"))
	List<WebElement> listPluses;

	@FindBy(xpath = "(//button[(@type='button') and (@aria-label='Add new card')])[1]")
	WebElement firstPlus;

	@FindBy(xpath = "(//button[(@type='button') and (@aria-label='Add new card')])[2]")
	WebElement secondPlus;

	@FindBy(xpath = "(//button[(@type='button') and (@aria-label='Add new card')])[3]")
	WebElement thirdPlus;

	public BusinessIdeaPage createAllStickyByDefault() {
		for (WebElement webElement : listPluses) {
			webElement.click();

			nameOfSticky.click();
			nameOfSticky.sendKeys("Create stickies in BI by default");
			moreInformationSticky.click();
			descriptionSticky.click();
			descriptionSticky.sendKeys("It's description for this stickies");
//            nextMonthObjective.click();
//            chooseThirdMonthObjective.click();
//            attachmentFile.sendKeys("/Users/elenasheloputova/IdeaProjects/MyfirstProjectTest/Lean/src/main/resources/Attachment.zip");
			businessIdeaButtonSave.click();
		}
		return this;
	}

//	Create sticky by double click
	public BusinessIdeaPage createAllStickiesBI() {
		whatMakesYouUniqueColumn.click();
		new Actions(driver).doubleClick(whatMakesYouUniqueColumn).build().perform();
		nameOfSticky.click();
		nameOfSticky.sendKeys("What makes you unique?");
//		attachmentFile.sendKeys("src/test/resources/Attachment");
		moreInformationSticky.click();
		descriptionSticky.click();
		descriptionSticky.sendKeys("Here you should add? AT_" + timeStamp);
		businessIdeaButtonSave.click();

		whatProblemWillYouSolveColumn.click();
		new Actions(driver).doubleClick(whatProblemWillYouSolveColumn).build().perform();
		nameOfSticky.click();
		nameOfSticky.sendKeys("What problem will you solve? AT_" + timeStamp );
//		attachmentFile.sendKeys("/Users/elenasheloputova/IdeaProjects/MyfirstProjectTest/Lean/src/main/resources/Attachment.zip");
		moreInformationSticky.click();
		descriptionSticky.click();
		descriptionSticky.sendKeys("People are usually willing to pay good money ))) ");
		businessIdeaButtonSave.click();

		whoWillHaveThisProblemColumn.click();
		new Actions(driver).doubleClick(whoWillHaveThisProblemColumn).build().perform();
		nameOfSticky.click();
		nameOfSticky.sendKeys("Who will have this problem?  AT_" + timeStamp);
//		attachmentFile.sendKeys("/Users/elenasheloputova/IdeaProjects/MyfirstProjectTest/Lean/src/main/resources/Attachment.zip");

		moreInformationSticky.click();
		descriptionSticky.click();
		descriptionSticky.sendKeys("No point in solving problems )))");
		businessIdeaButtonSave.click();

		return new BusinessIdeaPage();
	}

	public BusinessIdeaPage deleteAllStickiesBIFirst() {
		for (int i = 0; i < allStickyWhatMakesYouUniqueColumn.size(); i++) {
			allStickyWhatMakesYouUniqueColumn.get(i).click();
			if (!Page.elementExists("//div[@qa-name='delete-button-dialog']")) {
				deleteSticky.click();
			} else {
				closeForm.click();
			}
		}
		return new BusinessIdeaPage();
	}

	public BusinessIdeaPage deleteAllStickiesBISecond() {
		for (int i = 0; i < allStickyWhatProblemWillYouSolveColumn.size(); i++) {
			allStickyWhatProblemWillYouSolveColumn.get(i).click();
			if (!Page.elementExists("//div[@qa-name='delete-button-dialog']")) {
				deleteSticky.click();
			} else {
				closeForm.click();
			}
		}
		return new BusinessIdeaPage();
	}

	public BusinessIdeaPage deleteAllStickiesBIThird() {
		for (int i = 0; i < allStickyWhoWillHaveThisProblemColumn.size(); i++) {
			allStickyWhoWillHaveThisProblemColumn.get(i).click();
			if (!Page.elementExists("//div[@qa-name='delete-button-dialog']")) {
				deleteSticky.click();
			} else {
				closeForm.click();
			}
		}
		return new BusinessIdeaPage();
	}


	public BusinessIdeaPage addAttachFile() {
		attachmentFile.sendKeys("src/main/resources/Attachment.zip");
		return new BusinessIdeaPage();
	}


	public BusinessIdeaPage createBI() {

		new WebDriverWait(getDriver(),6).until(ExpectedConditions.visibilityOf(chooseStick21));
		chooseStick21.click();
		new WebDriverWait(getDriver(),6).until(ExpectedConditions.visibilityOf(chooseStick31));
		chooseStick31.click();
		new WebDriverWait(getDriver(),6).until(ExpectedConditions.visibilityOf(chooseStick11));
		chooseStick11.click();
		giveNameIdea.click();
		giveNameIdea.sendKeys("New idea_" + timeStamp);
		addIdea.click();

		return new BusinessIdeaPage();
	}

	public BusinessIdeaPage editBI() {

		//deactivate
		firsrTab.click();
		new WebDriverWait(getDriver(), 2).until(ExpectedConditions.visibilityOf(firstDeactivateActivate));
		firstDeactivateActivate.click();

		//activate
		firsrTab.click();
		new WebDriverWait(getDriver(), 2).until(ExpectedConditions.visibilityOf(firstDeactivateActivate));
		firstDeactivateActivate.click();

		//rename BI
		firsrTab.click();
		new WebDriverWait(getDriver(), 2).until(ExpectedConditions.visibilityOf(firstRename));
		firstRename.click();
		inputNewName.clear();
		inputNewName.sendKeys("Change name BI 22");
		inputNewName.sendKeys(Keys.ENTER);

		//editBI
		firsrTab.click();
		new WebDriverWait(getDriver(), 2).until(ExpectedConditions.visibilityOf(firstEdit));
		firstEdit.click();
//		chooseStick12.click();
//		chooseStick22.click();
//		chooseStick32.click();

		new WebDriverWait(getDriver(), 2).until(ExpectedConditions.visibilityOf(buttonSaveIdea));
		buttonSaveIdea.click();

//		//change color
//		firsrTab.click();
//		new WebDriverWait(getDriver(), 2).until(ExpectedConditions.visibilityOf(changeColorSecond));
//		changeColorSecond.click();

		return new BusinessIdeaPage();
	}

	public BusinessIdeaPage gragAndDrop() {
		new WebDriverWait(getDriver(), 2).until(ExpectedConditions.visibilityOf(chooseStick12));
		new WebDriverWait(getDriver(), 2).until(ExpectedConditions.visibilityOf(chooseStick32));
		new Actions(getDriver()).dragAndDrop(chooseStick12, chooseStick32).perform();

		new WebDriverWait(getDriver(), 2).until(ExpectedConditions.visibilityOf(chooseStick21));
		new WebDriverWait(getDriver(), 2).until(ExpectedConditions.visibilityOf(chooseStick32));
		new Actions(getDriver()).dragAndDrop(chooseStick32, chooseStick21).perform();

		new WebDriverWait(getDriver(), 2).until(ExpectedConditions.visibilityOf(chooseStick22));
		new WebDriverWait(getDriver(), 2).until(ExpectedConditions.visibilityOf(chooseStick32));
		new Actions(getDriver()).dragAndDrop(chooseStick22, chooseStick22).perform();

		new WebDriverWait(getDriver(), 2).until(ExpectedConditions.visibilityOf(chooseStick12));
		new WebDriverWait(getDriver(), 2).until(ExpectedConditions.visibilityOf(chooseStick22));
		new Actions(getDriver()).dragAndDrop(chooseStick12, chooseStick22).perform();

		return new BusinessIdeaPage();
	}

	public BusinessIdeaPage deleteBI() {
		firsrTab.click();
		new WebDriverWait(getDriver(), 2).until(ExpectedConditions.visibilityOf(firstDelete));
		firstDelete.click();
		return new BusinessIdeaPage();
	}


	public BusinessModelPage goToBM() {
		linkBusinessModel.click();

		return new BusinessModelPage();
	}

	public TestsPage goToTests() {
		linkTests.click();

		return new TestsPage();
	}

	public BusinessIdeaPage goToFirstTab() {
		clickFirsrTab.click();

		return new BusinessIdeaPage();
		}

	public static byte[] takeScreenshot(){
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}

}
