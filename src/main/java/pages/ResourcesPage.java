package pages;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * @author Elena_Sheloputova
 */
public class ResourcesPage extends Page {


	@FindBys (@FindBy (xpath = "(//button[@qa-name='add-new-idea-button'])"))
	List<WebElement> listPluses;

	@FindBy (xpath = "(//button[@qa-name='add-new-idea-button'])[1]")
	WebElement plus1;

	@FindBy (xpath = "(//button[@qa-name='add-new-idea-button'])[2]")
	WebElement plus2;

	@FindBy (xpath = "(//button[@qa-name='add-new-idea-button'])[3]")
	WebElement plus3;

	@FindBy (xpath = "//a[@ui-sref='app.case.ideas']")
	WebElement goBI;

	//	Start. Actions on form
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
//	End

	//    Start. Edit Stickies
	@FindBys (@FindBy (xpath = "//span[@popover-placement='bottom'][1]"))
	List<WebElement> chooseEditAllList;

	@FindBys (@FindBy (xpath = "//span[@class='title ng-binding']"))
	List<WebElement> editAllActions;

	@FindBy (xpath = "(//span[@class='title ng-binding'])[1]")
	WebElement editDeactivate;

	@FindBy (xpath = "(//span[@class='title ng-binding'])[1]")
	WebElement editActivate;

	@FindBy (xpath = "(//span[@class='title ng-binding'])[2]")
	WebElement editEdit;

	@FindBy (xpath = "(//span[@class='title ng-binding'])[3]")
	WebElement editDelete;

	@FindBy (xpath = "//objectives-board[@stickies='$ctrl.stickies']/board-box[1]//sticky")
	WebElement boardStickies1;

	@FindBy (xpath = "(//objectives-board[@stickies='$ctrl.stickies']/board-box[1]//sticky//span)[1]")
	WebElement editBoard1FirstSticky;

	@FindBy (xpath = "(//resources-board[@stickies='$ctrl.stickies']//board-box[1]//sticky)[1]")
	WebElement board1FirstSticky;

	@FindBy (xpath = "(//objectives-board[@stickies='$ctrl.stickies']/board-box[2]//sticky//span)[1]")
	WebElement editBoard2FirstSticky;

	@FindBy (xpath = "(//objectives-board[@stickies='$ctrl.stickies']/board-box[2]//sticky)[1]")
	WebElement board2FirstSticky;

	@FindBy (xpath = "(//objectives-board[@stickies='$ctrl.stickies']/board-box[3]//sticky//span)[1]")
	WebElement editBoard3FirstSticky;

	@FindBy (xpath = "(//resources-board[@stickies='$ctrl.stickies']/board-box[3]//sticky)[1]")
	WebElement board3FirstSticky;
	//    End

	public ResourcesPage createAllStickiesByDefault() {

		for (WebElement webElement : listPluses) {
			webElement.click();
			fieldOfInput.click();
			fieldOfInput.sendKeys("AT Test");
			buttonSave.click();
		}
		return this;

	}

	public ResourcesPage editDeactivate() {

		for (WebElement webElement : chooseEditAllList) {

			try {
				new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(webElement));
				webElement.click();

				new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(editDeactivate));
				editDeactivate.click();
			} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			}
		}

		return this;
	}

	public ResourcesPage editAactivate() {

		for (WebElement webElement : chooseEditAllList) {

			try {
				new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(webElement));
				webElement.click();

				new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(editActivate));
				editActivate.click();
			} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			}
		}
		return this;
	}

	public ResourcesPage editEdit() {

		for (WebElement webElement : chooseEditAllList) {

			try {
				new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(webElement));
				webElement.click();

				new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(editEdit));
				editEdit.click();
				fieldOfInput.click();
				fieldOfInput.sendKeys("AT Test Edit");
				buttonSave.click();
			} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			}
		}

		return this;
	}

	public ResourcesPage editDelete() {
		for (WebElement webElement : chooseEditAllList) {
			try {
				new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(webElement));
				webElement.click();
				new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(editDelete));
				editDelete.click();
			} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			}
		}
		return this;
	}

	public BusinessIdeaPage goBI() {
		goBI.click();

		return new BusinessIdeaPage();
	}

	public ResourcesPage dragANDdrap() {
		new WebDriverWait(getDriver(), 5).until(ExpectedConditions.visibilityOf(board1FirstSticky));

		new Actions(getDriver()).clickAndHold(board1FirstSticky).moveToElement(board3FirstSticky).release().build().perform();

		return this;

	}

	public static byte[] takeScreenshot(){
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
}
