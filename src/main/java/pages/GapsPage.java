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
public class GapsPage extends Page {

    @FindBy(xpath = "(//div[@class = 'box-header'])[1]//button[@type = 'button']")
    WebElement buttonPlus;


    @FindBy(xpath = "(//board-box-stickies[@ng-model='box.stickies'])[1]")
    WebElement gapsAddStickies;

    @FindBy(xpath = "(//board-box-stickies[@ng-model='box.stickies'])[2]")
    WebElement competitorAddStickies;


    // Beginning. Actions in the form

    @FindBy(xpath = "//input[@name='title']")
    WebElement nameGaps;

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

    @FindBy(xpath = "(//select[@ng-model='$ctrl.currentOption'])[2]")
    WebElement clickBusinessModelCard;

    @FindBy(xpath = "//select[@ng-model='$ctrl.currentOption']/optgroup[@label='What will make you unique?']/option[1]")
    WebElement chooseBusinessModelCard;

    @FindBy(xpath = "//div[contains(@class, 'item-good')]")
    WebElement strengthButton;

    @FindBy(xpath = "//div[contains(@class, 'item-bad')]")
    WebElement weaknessButton;

//    @FindBy(xpath = "(//button[@type='submit'])")
//    WebElement gapsButtonSave;

    @FindBy(xpath = "(//button[contains(@ng-click,'ctrl.onSubmit')])")
    WebElement gapsButtonSave;


//	End. Actions in the form

    @FindBy(xpath = "//input[contains(@type, 'text') and contains(@ng-model, 'ngModel')]")
    WebElement nameCompetitor;

    @FindBy(xpath = "//button[contains(@type, 'submit')]")
    WebElement addCompetitor;

    @FindBy(xpath = "//a[contains(@class, 'add-competitor')]")
    WebElement linkAddCompetitor;

    @FindBy(xpath = "//input[contains(@type, 'text') and contains(@name, 'title')]")
    WebElement formGapsNameCompetitor;

    @FindBy(xpath = "(//div[@ng-transclude='stickies'])[2]")
    WebElement competitorFirst;

    @FindBy(xpath = "(//div[@class='select-btn'])[1]")
    WebElement competitorEditFirst;

    @FindBy(xpath = "(//span[@class='title ng-binding'])[1]")
    WebElement competitorDeactivateOrActivate;

    @FindBy(xpath = "(//span[@class='title ng-binding'])[2]")
    WebElement competitorRenameFirst;

    @FindBy(xpath = "(//span[@class='title ng-binding'])[3]")
    WebElement competitorDelete;


    @FindBy(xpath = "//a[contains(@ng-click, 'startAddingGaps')]")
    WebElement linkStart;

    //    Start. Edit Stickies
    @FindBys(@FindBy(xpath = "//span[@popover-placement='bottom'][1]"))
    List<WebElement> chooseEditAllList;

    @FindBys(@FindBy(xpath = "//span[@class='title ng-binding']"))
    List<WebElement> editAllActions;


    @FindBy(xpath = "(//span[@popover-placement='bottom'][1])[1]")
    WebElement editFirstStickyGaps;

    @FindBy(xpath = "(//div[@class='select-btn'])")
    WebElement editCompetitor;

    @FindBy(xpath = "(//span[@class='title ng-binding'])[4]")
    WebElement editDeactivate;

    @FindBy(xpath = "(//span[@class='title ng-binding'])[4]")
    WebElement editActivate;

    @FindBy(xpath = "(//span[@class='title ng-binding'])[5]")
    WebElement editEdit;

    @FindBy(xpath = "(//span[@class='title ng-binding'])[6]")
    WebElement editDelete;
//    End


    public GapsPage createStickies() {
        new WebDriverWait(getDriver(), 5).until(ExpectedConditions.visibilityOf(gapsAddStickies));
        gapsAddStickies.click();
        new Actions(driver).doubleClick(gapsAddStickies).build().perform();

        nameGaps.click();
        nameGaps.sendKeys("Test Gaps");
        clickBusinessModelCard.click();
        chooseBusinessModelCard.click();
        weaknessButton.click();
        moreInformationSticky.click();
        descriptionSticky.click();
        descriptionSticky.sendKeys("Test description");
        gapsButtonSave.click();
        return this;
    }

    public GapsPage createCompetitor() {
        linkAddCompetitor.click();
        nameGaps.click();
        nameGaps.sendKeys("Test Competitor");
        gapsButtonSave.click();
        return this;
    }

    public GapsPage createStickiesCompetitor() {

        new WebDriverWait(getDriver(), 5).until(ExpectedConditions.visibilityOf(competitorAddStickies));
//		competitorAddStickies.click();
        new Actions(driver).doubleClick(competitorAddStickies).build().perform();

        nameGaps.click();
        nameGaps.sendKeys("Test Competitor Sticky");
        clickBusinessModelCard.click();
        chooseBusinessModelCard.click();
        strengthButton.click();
        moreInformationSticky.click();
        descriptionSticky.click();
        descriptionSticky.sendKeys("Test description for competitor");
        gapsButtonSave.click();
        return this;
    }

    public GapsPage editDeactivateAllStikies() {
        for (WebElement webElement : chooseEditAllList) {
            new WebDriverWait(getDriver(), 5).until(ExpectedConditions.visibilityOf(webElement));
            webElement.click();

//        new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(editFirstStickyGaps));
            new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(editDeactivate));
            editDeactivate.click();
        }

        return this;
    }

    public GapsPage editActivateAllStikies() {
        for (WebElement webElement : chooseEditAllList) {
            new WebDriverWait(getDriver(), 5).until(ExpectedConditions.visibilityOf(webElement));
            webElement.click();
//            new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(editFirstStickyGaps));
//            editFirstStickyGaps.click();
            new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(editActivate));
            editActivate.click();
        }

        return this;
    }

    public GapsPage editFirstStickyGap() {
//		for (WebElement webElement : chooseEditAllList) {
//			new WebDriverWait(getDriver(), 5).until(ExpectedConditions.visibilityOf(webElement));
        new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(editFirstStickyGaps));
        editFirstStickyGaps.click();
        new WebDriverWait(getDriver(), 10).until(ExpectedConditions.visibilityOf(editEdit));
        editEdit.click();
        nameGaps.clear();
        nameGaps.sendKeys("Edit Gaps");
        gapsButtonSave.click();

        return this;
    }

    public GapsPage editDeleteFirstStickyGap() {
        new WebDriverWait(getDriver(), 5).until(ExpectedConditions.visibilityOf(editFirstStickyGaps));
        editFirstStickyGaps.click();
        new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(editDelete));
        editDelete.click();

        return this;
    }

    public GapsPage editCompetitorDeactivate() {
        new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(competitorEditFirst));
        competitorEditFirst.click();
        new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(competitorDeactivateOrActivate));
        competitorDeactivateOrActivate.click();
        return this;
    }

    public GapsPage editCompetitorActivate() {
        competitorEditFirst.click();
        new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(competitorDeactivateOrActivate));
        competitorDeactivateOrActivate.click();

        return this;
    }

    public GapsPage editCompetitorDelete() {
        competitorEditFirst.click();
        new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(competitorDelete));
        competitorDelete.click();

        return this;
    }

    public static byte[] takeScreenshot(){
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }

}
