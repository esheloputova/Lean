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

    @FindBy(xpath = "//tbody[@class='ng-scope']//td[1]")
    WebElement firstValue;

    @FindBy(xpath = "//tbody[@class='ng-scope']//td[2]")
    WebElement secondValue;

    @FindBy(xpath = "//tbody[@class='ng-scope']//td[3]")
    WebElement thirdValue;


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

    public ObjectivesPage createStickyEveryTypeFirst() {
        plusFirstAndSecond = new ArrayList<WebElement>();

        plusFirstAndSecond.add(firstPlus);
        plusFirstAndSecond.add(secondPlus);

        for (WebElement webElementPlus : plusFirstAndSecond) {
//            for(WebElement webElementType: listObjectiveType) {
            webElementPlus.click();
            objectiveTypeNumeric.click();
            fieldOfInput.click();
            fieldOfInput.sendKeys("Numeric Test");

            values123 = new ArrayList<>();
            values123.add(firstValue);
            values123.add(secondValue);
            values123.add(thirdValue);

            for (WebElement webElementValue : listValue) {
//                    new WebDriverWait(getDriver(), 5).until(ExpectedConditions.visibilityOfAllElements(listValue));
               new Actions(driver).moveToElement(webElementValue).click().sendKeys("123").build().perform();

            }
            attachmentFile.sendKeys("/Users/elenasheloputova/IdeaProjects/MyfirstProjectTest/Lean/src/main/resources/Attachment.zip");
            buttonSave.click();
        }

        return this;


    }


}
