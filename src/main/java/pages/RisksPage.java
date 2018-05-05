package pages;

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
public class RisksPage extends Page {

    @FindBys(@FindBy(xpath = "//div[@class='grid-horizontal']/div/board-box"))
    List<WebElement> allRisks;


    @FindBy(xpath = "(//sticky[@type='risk'])[1]")
    WebElement hightFirst;

    @FindBy(xpath = "(//sticky[@type='risk'])[9]")
    WebElement hightLast;

    //    Creating risks
    @FindBy(xpath = "//input[@name='title']")
    WebElement nameRisk;

    @FindBy(xpath = "(//select[@ng-model='$ctrl.currentOption'])[2]")
    WebElement attachToRisk;

    @FindBy(xpath = "(//select[@ng-model='$ctrl.currentOption'])[2]/optgroup[1]/option")
    WebElement attachToFirstRisk;


    @FindBy(xpath = "(//select[@ng-model='$ctrl.currentOption'])[3]")
    WebElement probability;

    @FindBy(xpath = "(//select[@ng-model='$ctrl.currentOption'])[3]/option[2]")
    WebElement chooseMediumProbability;

    @FindBy(xpath = "(//select[@ng-model='$ctrl.currentOption'])[4]")
    WebElement consequence;

    @FindBy(xpath = "(//select[@ng-model='$ctrl.currentOption'])[4]/option[3]")
    WebElement chooseLowConsequence;

    @FindBy(xpath = "//div[contains(@class, 'item-good')]")
    WebElement goodOpportunity;

    @FindBy(xpath = "//div[contains(@class, 'item-good')]")
    WebElement badThreats;

    @FindBy(xpath = "//div[@class='button button-deactivate ng-scope']")
    WebElement deactivateRisk;

    @FindBy(xpath = "//div[@class='button button-activate ng-scope']")
    WebElement activateRisk;

    @FindBy(xpath = "//span[contains(@class,'button-more') and (text()='more')]")
    WebElement moreInformationRisk;

    @FindBy(xpath = "//textarea[contains(@ng-model,'description')]")
    WebElement descriptionRisk;

    @FindBy(xpath = "//span[contains(@class,'button-more') and (text()='less')]")
    WebElement lessInformationRisk;

    @FindBy(xpath = "//input[@type ='file']")
    WebElement attachmentFile;

    @FindBy(xpath = "//div[contains(@class, 'dialog-close')]")
    WebElement closeForm;

    @FindBy(xpath = "(//button[contains(@class, 'md-raised') and (@type='button')])[2]")
    WebElement buttonSaveRisk;
    //    End

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


//    End


    @FindBy(xpath = "//a[@ng-click='$ctrl.onTasksClick()']")
    WebElement goTask;

    @FindBy(xpath = "//li[@ng-click='$ctrl.onStickyClick({sticky: $ctrl.visibleStickies[1]})']")
    WebElement bmHelper;


    @FindBys(@FindBy(xpath = "//button[(@type='button') and (@aria-label='Add new card')]"))
    List<WebElement> addNewCard;


    public TasksPage goTasks() {
        goTask.click();

        return new TasksPage();
    }

    public RisksPage addRiskFromHelper() {
        bmHelper.click();
        nameRisk.sendKeys("Risk from Helper");
        attachToFirstRisk.click();
        goodOpportunity.click();
//            chooseMediumProbability.click();
//            chooseLowConsequence.click();
        buttonSaveRisk.click();

        return new RisksPage();

    }

    public RisksPage createRisksStickies() {
        for (WebElement webElementBad : allRisks) {

            new Actions(driver).doubleClick(webElementBad).build().perform();
            nameRisk.sendKeys("Name of risk with Threats");
            attachToFirstRisk.click();
            badThreats.click();
//            chooseMediumProbability.click();
//            chooseLowConsequence.click();

            buttonSaveRisk.click();
        }

//        for (WebElement webElementGood : allRisks) {
//
//            new Actions(driver).doubleClick(webElementGood).build().perform();
//
//            nameRisk.sendKeys("Name of risk with Opportunity");
//            attachToFirstRisk.click();
//            goodOpportunity.click();
////            chooseMediumProbability.click();
////            chooseLowConsequence.click();
//
//            buttonSaveRisk.click();
//        }
        return new RisksPage();
    }

    public RisksPage editDeactivateAllStickies() {
        for (WebElement webElement : chooseEditAllList) {
            webElement.click();

            try {
                new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(editDeactivate));
                editDeactivate.click();
            } catch (org.openqa.selenium.StaleElementReferenceException ex) {
            }
        }

        return new RisksPage();

    }

    public RisksPage editActivateAllStickies() {
        for (WebElement webElement : chooseEditAllList) {
            webElement.click();

            try {
                new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(editActivate));
                editActivate.click();
            } catch (org.openqa.selenium.StaleElementReferenceException ex) {

            }
        }
        return new RisksPage();

    }

    public RisksPage editAllStickies() {
        for (WebElement webElement : chooseEditAllList) {
            webElement.click();

            try {
                new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(editEdit));
                editEdit.click();
                nameRisk.clear();
                nameRisk.sendKeys("Edit Risk");
                buttonSaveRisk.click();
            } catch (org.openqa.selenium.StaleElementReferenceException ex) {

            }
        }
        return new RisksPage();

    }

    public RisksPage editDeleteAllStickies() {
        for (WebElement webElement : chooseEditAllList) {
            webElement.click();

            try {
                new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(editDelete));
                editDelete.click();
            } catch (org.openqa.selenium.StaleElementReferenceException ex) {

            }

        }
        return new RisksPage();

    }

    public RisksPage dragANDdrap() {
        new WebDriverWait(getDriver(), 5).until(ExpectedConditions.visibilityOf(hightFirst));

        new Actions(getDriver()).clickAndHold(hightFirst).moveToElement(hightLast).release().build().perform();

        return new RisksPage();

    }

}
