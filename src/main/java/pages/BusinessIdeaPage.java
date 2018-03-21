package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

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


	@FindBy(xpath = "//input[(@type='text') and (@name='title')]")
	WebElement fieldOfInputBusinessIdea;

	@FindBy(xpath = "(//board-box-stickies[@ng-model='box.stickies'])[1]//idea-sticky[@ng-model='item'][1]")
	WebElement editStick1;

	@FindBy(xpath = "(//board-box-stickies[@ng-model='box.stickies'])[1]//idea-sticky[@ng-model='item'][1]//div[@ng-dblclick ='$event.stopPropagation();']")
	WebElement chooseStick1;

	@FindBy(xpath = "(//board-box-stickies[@ng-model='box.stickies'])[2]//idea-sticky[@ng-model='item'][1]")
	WebElement editStick2;

	@FindBy(xpath = "(//board-box-stickies[@ng-model='box.stickies'])[2]//idea-sticky[@ng-model='item'][1]//div[@ng-dblclick ='$event.stopPropagation();']")
	WebElement chooseStick2;

	@FindBy(xpath = "(//board-box-stickies[@ng-model='box.stickies'])[3]//idea-sticky[@ng-model='item'][1]")
	WebElement editStick3;

	@FindBy(xpath = "(//board-box-stickies[@ng-model='box.stickies'])[3]//idea-sticky[@ng-model='item'][1]//div[@ng-dblclick ='$event.stopPropagation();']")
	WebElement chooseStick3;

	@FindBy(xpath = "//input[(@type='text') and contains(@placeholder, 'Give the new idea name')]")
	WebElement giveNameIdea;

	@FindBy(xpath = "//span[(@class='ng-binding ng-scope') and contains(text(), 'add')]")
	WebElement addIdea;

	@FindBy(xpath = "//div[(@ng-show='!vm.isEditingTitle[idea.id]')")
	WebElement createdIdea;

	@FindBy(xpath = "//a[text() = 'Business models']")
	WebElement linkBusinessModel;

	@FindBy(xpath = "(//button[contains(@class, 'md-raised') and (@type='button')])[2]")
	WebElement businessIdeaButtonSave;

	@FindBy(xpath = "(//board-box-stickies[@ng-model='box.stickies'])[2]")
	WebElement whatProblemWillYouSolveColumn;

	@FindBy(xpath = "(//board-box-stickies[@ng-model='box.stickies'])[3]")
	WebElement whoWillHaveThisProblemColumn;

//	@FindBy(xpath = "//div[@class='button button-remove ng-scope']")
//	WebElement deleteSticky;

	@FindBy(xpath = "//div[@class='button button-remove ng-scope']")
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

	@FindBy(xpath = "//div[contains(@class, 'dialog-close')]")
	WebElement closeForm;

	@FindBy(xpath = "(//span[@class = 'fa fa-caret-down'])[1]")
	WebElement firsrTab;

	@FindBy(xpath = "(//span[(@class = 'title ng-binding')])[1]")
	WebElement firstDeactivate;

	@FindBy(xpath = "(//span[(@class = 'title ng-binding')])[2]")
	WebElement firstRename;

	@FindBy(xpath = "(//span[(@class = 'title ng-binding')])[3]")
	WebElement firstDelete;

	@FindBy(xpath = "(//span[(@class = 'title ng-binding')])[4]")
	WebElement firstEdit;

	@FindBy(xpath = "(//div[@ng-repeat = 'idea in $ctrl.list'])[1]")
	WebElement changeColorFirst;

	@FindBy(xpath = "(//div[@ng-repeat = 'idea in $ctrl.list'])[2]")
	WebElement changeColorSecond;


	//div[@ng-repeat = 'idea in $ctrl.list']


	//div[@aria-hidden = 'true']


	//button[contains(@class, 'button-attach')]

	public BusinessIdeaPage createAllStickiesBI() {
		whatMakesYouUniqueColumn.click();
		new Actions(driver).doubleClick(whatMakesYouUniqueColumn).build().perform();
		fieldOfInputBusinessIdea.click();
		fieldOfInputBusinessIdea.sendKeys("What makes you unique?");
		attachmentFile.sendKeys("C:\\Elena\\Java\\Tests_start\\leanbusinessplatformcom\\src\\main\\resources\\Attachment.zip");
		moreInformationSticky.click();
		descriptionSticky.click();
		descriptionSticky.sendKeys("Here you should add what makes you better suited to solve the problem than anyone else. " +
						"Why should the customer choose you? What will make it difficult for the competition to copy you? " +
						"Add as many cards as you need. One uniqueness can relate to one problem, or to many.");
		businessIdeaButtonSave.click();

		whatProblemWillYouSolveColumn.click();
		new Actions(driver).doubleClick(whatProblemWillYouSolveColumn).build().perform();
		fieldOfInputBusinessIdea.click();
		fieldOfInputBusinessIdea.sendKeys("What problem will you solve?");
		attachmentFile.sendKeys("C:\\Elena\\Java\\Tests_start\\leanbusinessplatformcom\\src\\main\\resources\\Attachment.zip");
		moreInformationSticky.click();
		descriptionSticky.click();
		descriptionSticky.sendKeys("People are usually willing to pay good money if you solve a problem for them." +
						" Given your uniqueness and resources; what problem can you solve? Try to be creative and let the wild ideas flow.");
		businessIdeaButtonSave.click();

		whoWillHaveThisProblemColumn.click();
		new Actions(driver).doubleClick(whoWillHaveThisProblemColumn).build().perform();
		fieldOfInputBusinessIdea.click();
		fieldOfInputBusinessIdea.sendKeys("Who will have this problem?");
		attachmentFile.sendKeys("C:\\Elena\\Java\\Tests_start\\leanbusinessplatformcom\\src\\main\\resources\\Attachment.zip");
		moreInformationSticky.click();
		descriptionSticky.click();
		descriptionSticky.sendKeys("No point in solving problems if you do not know who has them. " +
						"Try to think of the possible target groups for all imaginable problems you are solving. " +
						"Don't make the target groups too wide and generic." +
						" It is so much easier to reach out to a small and clearly defined group.");
		businessIdeaButtonSave.click();

		return new BusinessIdeaPage();
	}

	public BusinessIdeaPage deleteAllStickiesBIFirst() {
		for (int i = 0; i < allStickyWhatMakesYouUniqueColumn.size(); i++) {
			allStickyWhatMakesYouUniqueColumn.get(i).click();
			if (!Page.isNotElementExists("//div[@class='button button-remove ng-scope']")) {
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
			if (!Page.isNotElementExists("//div[@class='button button-remove ng-scope']")) {
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
			if (!Page.isNotElementExists("//div[@class='button button-remove ng-scope']")) {
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
		chooseStick1.click();
		chooseStick2.click();
		chooseStick3.click();
		giveNameIdea.click();
		giveNameIdea.sendKeys("New idea");
		addIdea.click();

		return new BusinessIdeaPage();
	}

	public BusinessModelPage goToBM() {
		linkBusinessModel.click();

		return new BusinessModelPage();
	}

}
