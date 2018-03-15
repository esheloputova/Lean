package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * @author Elena_Sheloputova
 */
public class BusinessIdeaPage extends Page {
	@FindBy(xpath = "(//board-box-stickies[@ng-model='box.stickies'])[1]")
	WebElement whatMakesYouUniqueColumn;


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

	//span[text() = название идеи]


	@FindBy(xpath = "(//button[contains(@class, 'md-raised') and (@type='button')])[2]")
	WebElement whatMakesYouUniqueButtonSave;

	@FindBy(xpath = "(//board-box-stickies[@ng-model='box.stickies'])[2]")
	WebElement whatProblemWillYouSolveColumn;

	@FindBy(xpath = "(//board-box-stickies[@ng-model='box.stickies'])[3]")
	WebElement whoWillHaveThisProblemColumn;

  //div[@class='scroll-content ps']/div[@ng-transclude='stickies']/div[@class='sticky__btn link-icon ng-scope']
	//board-box-stickies[@ng-model='box.stickies'])(/idea-sticky[@ng-model='item'])/div[@class='sticky__btn link-icon ng-scope']



	public BusinessIdeaPage createWhatMakesYouUnique() {
		whatMakesYouUniqueColumn.click();
		new Actions(driver).doubleClick(whatMakesYouUniqueColumn).build().perform();
		fieldOfInputBusinessIdea.click();
		fieldOfInputBusinessIdea.sendKeys("What makes you unique?");
		whatMakesYouUniqueButtonSave.click();
		return new BusinessIdeaPage();
	}

	public BusinessIdeaPage createWhatProblemWillYouSolve() {
		whatProblemWillYouSolveColumn.click();
		new Actions(driver).doubleClick(whatProblemWillYouSolveColumn).build().perform();
		fieldOfInputBusinessIdea.click();
		fieldOfInputBusinessIdea.sendKeys("What problem will you solve?");
		whatMakesYouUniqueButtonSave.click();
		return new BusinessIdeaPage();
	}

	public BusinessIdeaPage createWhoWillHaveThisProblem() {
		whoWillHaveThisProblemColumn.click();
		new Actions(driver).doubleClick(whoWillHaveThisProblemColumn).build().perform();
		fieldOfInputBusinessIdea.click();
		fieldOfInputBusinessIdea.sendKeys("Who will have this problem?");
		whatMakesYouUniqueButtonSave.click();
		return new BusinessIdeaPage();
	}

	public BusinessIdeaPage selectWhatMakesYouUniqueSticky() {
//		chooseStick1.click();
//		chooseStick2.click();
//		chooseStick3.click();
//		giveNameIdea.click();
//		giveNameIdea.sendKeys("New idea");
//		addIdea.click();
		linkBusinessModel.click();


		return new BusinessIdeaPage();
	}

}
