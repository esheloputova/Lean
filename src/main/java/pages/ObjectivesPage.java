package pages;

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
public class ObjectivesPage extends Page {


    @FindBys(@FindBy(xpath = "(//button[(@type='button') and (@aria-label='Add new card')])"))
    List<WebElement> listPluses;

    @FindBy(xpath = "(//button[(@type='button') and (@aria-label='Add new card')])[1]")
    WebElement firstPlus;

    @FindBy(xpath = "(//button[(@type='button') and (@aria-label='Add new card')])[2]")
    WebElement secondPlus;

    @FindBy(xpath = "(//button[(@type='button') and (@aria-label='Add new card')])[3]")
    WebElement thirdPlus;

    // Beginning. Actions in the form

    @FindBy(xpath = "//input[@type='number']")
    WebElement cost;

    @FindBy(xpath = "//lb-select[contains(@list, '$ctrl.types')]")
    WebElement objectiveType;

    @FindBys(@FindBy(xpath = "//lb-select[contains(@list, '$ctrl.types')]//option"))
    List<WebElement> listObjectiveType;

    @FindBys(@FindBy(xpath = "//tbody[@class='ng-scope']//td"))
    List<WebElement> listValue;

    @FindBys(@FindBy(xpath = "//lb-select[contains(@list, 'creditTypes')]//option"))
    List<WebElement> listCreditType;

    @FindBy(xpath = "//lb-select[contains(@list, '$ctrl.types')]//option[1]")
    WebElement salesRevenue;

    @FindBy(xpath = "//lb-select[contains(@list, '$ctrl.types')]//option[2]")
    WebElement newEquity;

    @FindBy(xpath = "//lb-select[contains(@list, '$ctrl.types')]//option[3]")
    WebElement newGrants;

    @FindBy(xpath = "//lb-select[contains(@list, '$ctrl.types')]//option[4]")
    WebElement newCredit;

    @FindBy(xpath = "//lb-select[contains(@list, 'creditTypes')]//option[1]")
    WebElement newOverdraft;


    @FindBy(xpath = "//lb-select[contains(@list, 'creditTypes')]//option[2]")
    WebElement newLoan;

    @FindBy(xpath = "//input[contains(@ng-model, 'initialAmount')]")
    WebElement loanAmount;

    @FindBy(xpath = "//input[contains(@ng-model, 'overdraftLimit')]")
    WebElement overdraftLimit;

//    @FindBy(xpath = "//input[contains(@ng-model, 'interestRate')]")
//    WebElement overdraftRate;

    @FindBy(xpath = "//input[contains(@ng-model, 'remainingMonths')]")
    WebElement numberOfMonths;

    @FindBy(xpath = "//input[contains(@ng-model, 'interestRate')]")
    WebElement interestRateInPercent;

    @FindBy(xpath = "//input[contains(@ng-model, 'availableRightNow')]")
    WebElement availableAmount;

    @FindBy(xpath = "//lb-select[contains(@list, '$ctrl.months')]")
    WebElement monthsReceiveMoney;


    @FindBy(xpath = "//lb-select[contains(@list, '$ctrl.types')]//option[1]")
    WebElement objectiveTypeNumeric;

    @FindBy(xpath = "//lb-select[contains(@list, '$ctrl.types')]//option[2]")
    WebElement objectiveTypeMilestone;

    @FindBy(xpath = "//lb-select[contains(@list, '$ctrl.nextMonths')]")
    WebElement nextMonthObjective;

    @FindBy(xpath = "//lb-select[contains(@list, '$ctrl.nextMonths')]//option[3]")
    WebElement chooseThirdMonthObjective;

    @FindBy(xpath = "(//button[contains(@class, 'md-raised') and (@type='button')])[2]")
    WebElement buttonSave;

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

    @FindBy(xpath = "//input[(@type='text') and (@name='title')]")
    WebElement fieldOfInput;

    @FindBy(xpath = "//div[@title = 'Remove attach']")
    WebElement removeAttach;

    @FindBy(xpath = "//span[contains(@class, 'add-sub-obj-btn')]")
    WebElement addSubObjective;

    @FindBy(xpath = "//input[@ng-model='subItem.title']")
    WebElement nameSubObjective;

    @FindBy(xpath = "//lb-select[contains(@list, '_nextMonths')]")
    WebElement nextMonthsSubObjective;

    @FindBy(xpath = "//lb-select[contains(@list, '_nextMonths')]//option[2]")
    WebElement chooseNextMonthSubObjective;

    @FindBy(xpath = "//button[@class='button button-remove']")
    WebElement removeSubObjective;

    @FindBy(xpath = "(//div[@class='button button-deactivate ng-scope'])[2]")
    WebElement deactivateSubObjective;

    @FindBy(xpath = "//div[@class='button button-activate ng-scope']")
    WebElement activateSubObjective;

    @FindBy(xpath = "//span[contains(@class,'more-btn') and (text()='more')]")
    WebElement moreSubObjective;

    @FindBy(xpath = "(//textarea[contains(@ng-model,'description')])[2]")
    WebElement descriptionSubObjective;

    @FindBy(xpath = "//button[@ng-click='$ctrl.onConfirm()']")
    WebElement deleteStickyConfirm;

    @FindBy(xpath = "//div[@ng-click='$ctrl.onCancel()']")
    WebElement deleteStickyCancel;

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


    //	End. Actions in the form

//	@FindBy (xpath = "//div[@title = 'Remove attach']")
//	WebElement removeAttach;


    public List<WebElement> plusFirstAndSecond;

    public List<WebElement> values123;


    public ObjectivesPage createAllStickyByDefault() {
        for (WebElement webElement : listPluses) {
            webElement.click();

            fieldOfInput.click();
            fieldOfInput.sendKeys("Create stickies in Objective by default");
            moreInformationSticky.click();
            descriptionSticky.click();
            descriptionSticky.sendKeys("It's description for this stickies");
//            nextMonthObjective.click();
//            chooseThirdMonthObjective.click();
            attachmentFile.sendKeys("/Users/elenasheloputova/IdeaProjects/MyfirstProjectTest/Lean/src/main/resources/Attachment.zip");
            buttonSave.click();
        }

        return this;
    }

    public ObjectivesPage createStickyNumetic() {
        plusFirstAndSecond = new ArrayList<WebElement>();

        plusFirstAndSecond.add(firstPlus);
        plusFirstAndSecond.add(secondPlus);

        for (WebElement webElementPlus : plusFirstAndSecond) {
//            for(WebElement webElementType: listObjectiveType) {
            webElementPlus.click();
            objectiveTypeNumeric.click();
            fieldOfInput.click();
            fieldOfInput.sendKeys("Numeric Test");


            for (WebElement webElementValue : listValue) {
//                    new WebDriverWait(getDriver(), 5).until(ExpectedConditions.visibilityOfAllElements(listValue));
                new Actions(driver).moveToElement(webElementValue).click().sendKeys("123").build().perform();

            }
            attachmentFile.sendKeys("/Users/elenasheloputova/IdeaProjects/MyfirstProjectTest/Lean/src/main/resources/Attachment.zip");
            buttonSave.click();
        }

        return this;
    }

    public ObjectivesPage createStickyMilestone() {
        plusFirstAndSecond = new ArrayList<WebElement>();

        plusFirstAndSecond.add(firstPlus);
        plusFirstAndSecond.add(secondPlus);

        for (WebElement webElementPlus : plusFirstAndSecond) {
//            for(WebElement webElementType: listObjectiveType) {
            webElementPlus.click();
            objectiveTypeMilestone.click();
            fieldOfInput.click();
            fieldOfInput.sendKeys("Milestone Test");
            moreInformationSticky.click();
            descriptionSticky.click();
            descriptionSticky.sendKeys("Test More information");
            nextMonthObjective.click();
            chooseThirdMonthObjective.click();

            attachmentFile.sendKeys("/Users/elenasheloputova/IdeaProjects/MyfirstProjectTest/Lean/src/main/resources/Attachment.zip");
            buttonSave.click();
        }
        return this;
    }

    public ObjectivesPage createStickyMoneySalesRevenue() {
        thirdPlus.click();
        salesRevenue.click();
        fieldOfInput.click();
        fieldOfInput.sendKeys("Test sales revenue");
        cost.click();
        cost.clear();
        cost.sendKeys("5");
        for (WebElement webElementValue : listValue) {
            new Actions(driver).moveToElement(webElementValue).click().sendKeys("123").build().perform();
        }

        attachmentFile.sendKeys("/Users/elenasheloputova/IdeaProjects/MyfirstProjectTest/Lean/src/main/resources/Attachment.zip");
        buttonSave.click();
        return this;

    }

    public ObjectivesPage createStickyMoneyNewEquity() {
        thirdPlus.click();
        newEquity.click();
        fieldOfInput.click();
        fieldOfInput.sendKeys("Test new equity");

        for (WebElement webElementValue : listValue) {
            new Actions(driver).moveToElement(webElementValue).click().sendKeys("52").build().perform();
        }

        attachmentFile.sendKeys("/Users/elenasheloputova/IdeaProjects/MyfirstProjectTest/Lean/src/main/resources/Attachment.zip");
        buttonSave.click();
        return this;

    }

    public ObjectivesPage createStickyMoneyNewGrants() {
        thirdPlus.click();
        newGrants.click();
        fieldOfInput.click();
        fieldOfInput.sendKeys("Test new grants");

        for (WebElement webElementValue : listValue) {
            new Actions(driver).moveToElement(webElementValue).click().sendKeys("45").build().perform();
        }

        attachmentFile.sendKeys("/Users/elenasheloputova/IdeaProjects/MyfirstProjectTest/Lean/src/main/resources/Attachment.zip");
        buttonSave.click();
        return this;

    }

    public ObjectivesPage createStickyMoneyNewCreditNewLoan() {
        thirdPlus.click();
        newCredit.click();
        fieldOfInput.click();
        fieldOfInput.sendKeys("Test new credit loan");

        newLoan.click();
        loanAmount.click();
        loanAmount.sendKeys("12345");
//            monthsReceiveMoney.click();
        numberOfMonths.click();
        numberOfMonths.sendKeys("6");
        interestRateInPercent.click();
        interestRateInPercent.sendKeys("12.9");
        attachmentFile.sendKeys("/Users/elenasheloputova/IdeaProjects/MyfirstProjectTest/Lean/src/main/resources/Attachment.zip");
        buttonSave.click();

        return this;

    }

    public ObjectivesPage createStickyMoneyNewCreditNewOverfraft() {
        thirdPlus.click();
        newCredit.click();
        fieldOfInput.click();
        fieldOfInput.sendKeys("Test new credit overdraft");

        newOverdraft.click();
        overdraftLimit.click();
        overdraftLimit.sendKeys("87654");
//            monthsReceiveMoney.click();
        interestRateInPercent.click();
        interestRateInPercent.sendKeys("12.9");
//        availableAmount.click();
//        availableAmount.sendKeys("552018");

        attachmentFile.sendKeys("/Users/elenasheloputova/IdeaProjects/MyfirstProjectTest/Lean/src/main/resources/Attachment.zip");
        buttonSave.click();

        return this;

    }

    public ObjectivesPage editDeactivateAllStickies() {
        for (WebElement webElement : chooseEditAllList) {

            webElement.click();

            try {
                new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(editDeactivate));
                editDeactivate.click();
            } catch (org.openqa.selenium.StaleElementReferenceException ex) {

            }
        }
        return this;

    }

    public Boolean waiting() {
        boolean breakIt = true;
        while (true) {
            breakIt = true;
            try {
                // write your code here
            } catch (Exception e) {
                if (e.getMessage().contains("element is not attached")) {
                    breakIt = false;
                }
            }
            if (breakIt) {
                break;
            }

        }
        return true;
    }


    public ObjectivesPage editActivateAllStickies() {
            for (WebElement webElement : chooseEditAllList) {
                webElement.click();

                try {
                    new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(editActivate));
                    editActivate.click();
                } catch (org.openqa.selenium.StaleElementReferenceException ex) {
                }
            }
        return this;

    }

    public ObjectivesPage editAllStickies() {
        for (WebElement webElement : chooseEditAllList) {
            webElement.click();

            try {
                new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(editEdit));
                editEdit.click();
                fieldOfInput.click();
                fieldOfInput.clear();
                fieldOfInput.sendKeys("Edit Objectives");
                buttonSave.click();
            } catch (org.openqa.selenium.StaleElementReferenceException ex) {

            }
        }
        return this;

    }

    public ObjectivesPage editDeleteAllStickies() {
        for (WebElement webElement : chooseEditAllList) {
            webElement.click();
            new WebDriverWait(getDriver(), 4).until(ExpectedConditions.visibilityOf(editDelete));
            editDelete.click();
            deleteStickyConfirm.click();

        }
        return this;

    }

//    public RisksPage dragANDdrap() {
//        new WebDriverWait(getDriver(), 5).until(ExpectedConditions.visibilityOf(hightFirst));
//
//        new Actions(getDriver()).clickAndHold(hightFirst).moveToElement(hightLast).release().build().perform();
//
//        return new RisksPage();
//
//    }


}
