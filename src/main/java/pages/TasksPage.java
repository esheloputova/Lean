package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

/**
 * @author Elena_Sheloputova
 */
public class TasksPage extends Page {

    @FindBys(@FindBy(xpath = "(//button[(@type='button') and (@aria-label='Add new card')])"))
    List<WebElement> listPluses;

    @FindBy(xpath = "(//button[(@type='button') and (@aria-label='Add new card')])[1]")
    WebElement toDoPlus;

    @FindBy(xpath = "(//button[(@type='button') and (@aria-label='Add new card')])[2]")
    WebElement monthlyCostsPlus;


    @FindBy(xpath = "(//button[(@type='button') and (@aria-label='Add new card')])[3]")
    WebElement doingCurrentMonthPlus;

    @FindBy(xpath = "(//button[(@type='button') and (@aria-label='Add new card')])[4]")
    WebElement doingNextMonthPlus;

//    Edit sticky

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
// End.


    @FindBy(xpath = "(//lb-select[contains(@list, 'attachedList')]//option)[3]")
    WebElement attachedToThird;

    @FindBy(xpath = "(//lb-select[contains(@list, 'responsibleList')]//option)[1]")
    WebElement responsibleFirst;

    @FindBy(xpath = "//lb-select[contains(@list, '$ctrl.months')]//option[2]")
    WebElement forecastMonthSecond;

    @FindBys(@FindBy(xpath = "//lb-select[contains(@list, 'costGroups')]//option["))
    WebElement costGroups;

    @FindBy(xpath = "//lb-select[contains(@list, 'costGroups')]//option[2]")
    WebElement costGroupsSecond;

    @FindBy(xpath = "//lb-select[contains(@list, 'costsList')]//option[1]")
    WebElement paymentTypeDefaultMonthlyValue;

    @FindBy(xpath = "//lb-select[contains(@list, 'costsList')]//option[2]")
    WebElement paymentTypeVariableCostPerMonth;

    @FindBy(xpath = "(//input[contains(@ng-model, 'fixedCost')])[2]")
    WebElement value;

    @FindBys(@FindBy(xpath = "//tbody[@class='ng-scope']//td"))
    List<WebElement> listValue;


    @FindBy(xpath = "//input[contains(@ng-model, 'fixedCost')]")
    WebElement cost;

 @FindBy(xpath = "//input[contains(@ng-model, 'item.inputCost')]")
    WebElement actualCost;

 @FindBy(xpath = "//a[contains(@class, 'btn-plain')]")
    WebElement saveActualCost;




}
