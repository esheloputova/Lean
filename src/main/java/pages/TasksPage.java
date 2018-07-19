package pages;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Elena_Sheloputova
 */

public class TasksPage extends Page {

	@FindBys (@FindBy (xpath = "(//button[@qa-name='add-new-idea-button'])"))
	List<WebElement> listPluses;

	@FindBy (xpath = "(//button[@qa-name='add-new-idea-button'])[1]")
	WebElement toDoPlus;

	@FindBy (xpath = "(//button[@qa-name='add-new-idea-button'])[2]")
	WebElement monthlyCostsPlus;


	@FindBy (xpath = "(//button[@qa-name='add-new-idea-button'])[3]")
	WebElement doingCurrentMonthPlus;

	@FindBy (xpath = "(//button[@qa-name='add-new-idea-button'])[4]")
	WebElement doingNextMonthPlus;

	@FindBy (xpath = "(//multi-period-tasks-board[@stickies='$ctrl.stickies']//board-box-stickies[1]//sticky)[1]")
	WebElement toDoFirstSticky;

	@FindBy (xpath = "(//multi-period-tasks-board[@stickies='$ctrl.stickies']//board-box-stickies[1]//sticky)[1]//span")
	WebElement editToDoFirstSticky;

	@FindBy (xpath = "((//multi-period-tasks-board[@stickies='$ctrl.stickies']//board-box-stickies)[2])//sticky[1]")
	WebElement monthlyCostsFirstSticky;

	@FindBy (xpath = "((//multi-period-tasks-board[@stickies='$ctrl.stickies']//board-box-stickies)[2])//sticky[1]//span[2]")
	WebElement editMonthlyCostsFirstSticky;

	@FindBy (xpath = "((//multi-period-tasks-board[@stickies='$ctrl.stickies']//board-box-stickies)[3])//sticky[1]")
	WebElement doingCurrentMonthFirstSticky;

	@FindBy (xpath = "((//multi-period-tasks-board[@stickies='$ctrl.stickies']//board-box-stickies)[3])//sticky[1]//span")
	WebElement editDoingCurrentMonthFirstSticky;

	@FindBy (xpath = "((//multi-period-tasks-board[@stickies='$ctrl.stickies']//board-box-stickies)[4])//sticky[1]")
	WebElement doingNextMonthFirstSticky;

	@FindBy (xpath = "((//multi-period-tasks-board[@stickies='$ctrl.stickies']//board-box-stickies)[4])//sticky[1]//span")
	WebElement editDoingNextMonthFirstSticky;

	@FindBy (xpath = "((//multi-period-tasks-board[@stickies='$ctrl.stickies']//board-box-stickies)[5])//sticky[1]")
	WebElement doneCurrentMonthFirstSticky;

	@FindBy (xpath = "((//multi-period-tasks-board[@stickies='$ctrl.stickies']//board-box-stickies)[5])//sticky[1]//span")
	WebElement editDoneCurrentMonthFirstSticky;


	//    Edit sticky
	@FindBy (xpath = "//button[@qa-name='save-sticky-button']")
	WebElement buttonSave;

	@FindBy (xpath = "//div[@qa-name='delete-button-dialog']")
	WebElement deleteSticky;

	@FindBy (xpath = "//div[@class='button button-deactivate ng-scope']")
	WebElement deactivateSticky;

	@FindBy (xpath = "//div[@qa-name='activate-sticky-dialog-button']")
	WebElement activateSticky;

	@FindBy (xpath = "//span[@qa-name='more-less-span-sticky-dialog']")
	WebElement moreInformationSticky;

	@FindBy (xpath = "//textarea[@qa-name='description-text-area']")
	WebElement descriptionSticky;

	@FindBy (xpath = "//span[@qa-name='more-less-span-sticky-dialog']")
	WebElement lessInformationSticky;

	@FindBy (xpath = "//input[@qa-name='attach-file-input']")
	WebElement attachmentFile;

	@FindBy (xpath = "//div[contains(@class, 'dialog-close')]")
	WebElement closeForm;

	@FindBy (xpath = "//input[@qa-name='sticky-input-dialog']")
	WebElement fieldOfInput;

	@FindBy (xpath = "//div[@qa-name='remove-attach-file-button']")
	WebElement removeAttach;
// End.

	//    Start. Edit Stickies
	@FindBys(@FindBy(xpath = "//span[@popover-placement='bottom'][1]"))
	List<WebElement> chooseEditAllList;

	@FindBys(@FindBy(xpath = "//span[@class='title ng-binding']"))
	List<WebElement> editAllActions;

	@FindBy(xpath = "(//span[@class='title ng-binding'])[1]")
	WebElement editDeactivate;

	@FindBy(xpath = "(//span[@class='title ng-binding'])[1]")
	WebElement editActivate;

	@FindBy(xpath = "(//span[@class='title ng-binding'])[2]")
	WebElement editEdit;

	@FindBy(xpath = "(//span[@class='title ng-binding'])[3]")
	WebElement editDelete;
//	End

	@FindBy (xpath = "(//lb-select[contains(@list, 'attachedList')]//option)[3]")
	WebElement attachedToThird;

	@FindBy (xpath = "(//lb-select[contains(@list, 'responsibleList')]//option)[1]")
	WebElement responsibleFirst;

	@FindBy (xpath = "//lb-select[contains(@list, '$ctrl.months')]//option[2]")
	WebElement forecastMonthSecond;

	@FindBys (@FindBy (xpath = "//lb-select[contains(@list, 'costGroups')]//option"))
	List<WebElement> costGroups;

	@FindBy (xpath = "//lb-select[contains(@list, 'costGroups')]")
	WebElement clickCostGroups;


	@FindBy (xpath = "//lb-select[contains(@list, 'costGroups')]//option[2]")
	WebElement costGroupsSecond;

	@FindBy (xpath = "//lb-select[contains(@list, 'costsList')]")
	WebElement clickPaymentType;

	@FindBy (xpath = "//lb-select[contains(@list, 'costsList')]//option[1]")
	WebElement paymentTypeDefaultMonthlyValue;

	@FindBy (xpath = "//lb-select[contains(@list, 'costsList')]//option[2]")
	WebElement paymentTypeVariableCostPerMonth;

	@FindBy (xpath = "(//input[contains(@ng-model, 'fixedCost')])[2]")
	WebElement value;

	@FindBys (@FindBy (xpath = "//tbody[@class='ng-scope']//td"))
	List<WebElement> listValue;


	@FindBy (xpath = "//input[contains(@ng-model, 'fixedCost')]")
	WebElement cost;

	@FindBy (xpath = "//input[contains(@ng-model, 'item.inputCost')]")
	WebElement actualCost;

	@FindBy (xpath = "//a[contains(@class, 'btn-plain')]")
	WebElement saveActualCost;

	@FindBy (xpath = "//button[contains(@ng-click, 'continueActual')]")
	WebElement finish;

	@FindBy (xpath = "//button[contains(@ng-click, 'cancelActual')]")
	WebElement cancel;


	public List<WebElement> editFirstStickies;


	public ArrayList<WebElement> creatingList() {
		editFirstStickies = new ArrayList<WebElement>();
		editFirstStickies.add(editToDoFirstSticky);
		editFirstStickies.add(editDoingCurrentMonthFirstSticky);
		editFirstStickies.add(editMonthlyCostsFirstSticky);
		editFirstStickies.add(editDoingNextMonthFirstSticky);

		return new ArrayList<>();
	}

	public TasksPage createStickiesToDo() {
		for (int i = 0; i < 8; i++) {
			toDoPlus.click();
			fieldOfInput.click();
			fieldOfInput.sendKeys("Test Task To DO");
			moreInformationSticky.click();
			descriptionSticky.click();
			descriptionSticky.sendKeys("It's description for this stickies");
//			attachedToThird.click();
			responsibleFirst.click();
			costGroups.get(i).click();

			cost.click();
			cost.sendKeys("15500");
//            nextMonthObjective.click();
//            chooseThirdMonthObjective.click();
//			attachmentFile.sendKeys("/Users/elenasheloputova/IdeaProjects/MyfirstProjectTest/Lean/src/main/resources/Attachment.zip");
			buttonSave.click();
		}

		return this;
	}

	public TasksPage createStickiesDoingCurrentMonth() {
		for (int i = 0; i < 8; i++) {
			doingCurrentMonthPlus.click();
			fieldOfInput.click();
			fieldOfInput.sendKeys("Test Task DOING CURRENT MONTHS");
			moreInformationSticky.click();
			descriptionSticky.click();
			descriptionSticky.sendKeys("It's description for this stickies");
//			attachedToThird.click();
			responsibleFirst.click();
			costGroups.get(i).click();

			cost.click();
			cost.sendKeys("25500");
//            nextMonthObjective.click();
//            chooseThirdMonthObjective.click();
//			attachmentFile.sendKeys("/Users/elenasheloputova/IdeaProjects/MyfirstProjectTest/Lean/src/main/resources/Attachment.zip");
			buttonSave.click();
		}

		return this;
	}

	public TasksPage createStickiesDoingNextMonth() {
		for (int i = 0; i < 8; i++) {
			doingNextMonthPlus.click();
			fieldOfInput.click();
			fieldOfInput.sendKeys("Test Task DOING NEXT MONTHS");
			moreInformationSticky.click();
			descriptionSticky.click();
			descriptionSticky.sendKeys("It's description for this stickies");
//			attachedToThird.click();
			responsibleFirst.click();
			costGroups.get(i).click();

			cost.click();
			cost.sendKeys("35500");
//            nextMonthObjective.click();
//            chooseThirdMonthObjective.click();
//			attachmentFile.sendKeys("/Users/elenasheloputova/IdeaProjects/MyfirstProjectTest/Lean/src/main/resources/Attachment.zip");
			buttonSave.click();
		}

		return this;
	}

	public TasksPage createStickiesMonthlyCostDefault() {
		for (int i = 0; i < 8; i++) {
			monthlyCostsPlus.click();
			fieldOfInput.click();
			fieldOfInput.sendKeys("Test Task MONTHLY COSTS");
			moreInformationSticky.click();
			descriptionSticky.click();
			descriptionSticky.sendKeys("It's description for this stickies");
//			attachedToThird.click();
			responsibleFirst.click();
			costGroups.get(i).click();

//			clickPaymentType.click();
//
			paymentTypeDefaultMonthlyValue.click();

			value.click();
			value.sendKeys("9999");
//            nextMonthObjective.click();
//            chooseThirdMonthObjective.click();
//			attachmentFile.sendKeys("/Users/elenasheloputova/IdeaProjects/MyfirstProjectTest/Lean/src/main/resources/Attachment.zip");
			buttonSave.click();
		}

		return this;
	}

	public TasksPage createStickiesMonthlyCostVariable() {
		for (int i = 0; i < 8; i++) {
			monthlyCostsPlus.click();
			fieldOfInput.click();
			fieldOfInput.sendKeys("Variable Test Task MONTHLY COSTS");
			moreInformationSticky.click();
			descriptionSticky.click();
			descriptionSticky.sendKeys("It's description for this stickies");
//			attachedToThird.click();
			responsibleFirst.click();
			costGroups.get(i).click();

			paymentTypeVariableCostPerMonth.click();

			for (WebElement webElementValue : listValue) {
				new Actions(driver).moveToElement(webElementValue).click().sendKeys("553").build().perform();
			}
			buttonSave.click();
		}

		return this;
	}

	public TasksPage dragANDdrapFromToDOToDoing() {
		new WebDriverWait(getDriver(), 5).until(ExpectedConditions.visibilityOf(toDoFirstSticky));
		new Actions(getDriver()).clickAndHold(toDoFirstSticky).moveToElement(doingCurrentMonthFirstSticky).release().build().perform();

		return this;

	}

//	public TasksPage dragANDdrapFromMonthlyToDone() {
//		new WebDriverWait(getDriver(), 5).until(ExpectedConditions.visibilityOf(monthlyCostsFirstSticky));
//		new Actions(getDriver()).clickAndHold(monthlyCostsFirstSticky).moveToElement(doneCurrentMonthFirstSticky).release().build().perform();
////		actualCost.click();
//		saveActualCost.click();
//
//		finish.click();
//
//		return this;
//	}

	public TasksPage editDeactivateFirstStickyEveryBoard() {

		creatingList();

		for (WebElement webElement : editFirstStickies) {
			webElement.click();

			new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(editDeactivate));
			editDeactivate.click();
		}

		return this;

	}

	public TasksPage editActivateFirstStickyEveryBoard() {

		creatingList();

		for (WebElement webElement : editFirstStickies) {
			webElement.click();

			new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(editActivate));
			editActivate.click();
		}

		return this;

	}

	public TasksPage editEditFirstStickyEveryBoard() {

		creatingList();
		for (WebElement webElement : editFirstStickies) {
			webElement.click();

			new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(editEdit));
			editEdit.click();
			fieldOfInput.click();
			fieldOfInput.clear();
			fieldOfInput.sendKeys(" Edit");
			buttonSave.click();
		}
		return this;

	}

	public TasksPage editDeleteFirstStickyEveryBoard() {

		creatingList();

		for (WebElement webElement : editFirstStickies) {
			webElement.click();
			new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(editDelete));
			editDelete.click();


		}
		return this;

	}

	public static byte[] takeScreenshot(){
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
}
