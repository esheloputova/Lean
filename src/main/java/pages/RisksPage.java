package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Elena_Sheloputova
 */
public class RisksPage extends Page {


    @FindBy(xpath = "(//div[@class='grid__row ng-scope']/board-box)[1]")
    WebElement hightFirst;

    @FindBy(xpath = "(//div[@class='grid__row ng-scope']/board-box)[2]")
    WebElement hightSecond;

    @FindBy(xpath = "(//div[@class='grid__row ng-scope']/board-box)[3]")
    WebElement hightThird;

    @FindBy(xpath = "(//div[@class='grid__row ng-scope']/board-box)[4]")
    WebElement mediumFirst;

    @FindBy(xpath = "(//div[@class='grid__row ng-scope']/board-box)[5]")
    WebElement mediumSecond;

    @FindBy(xpath = "(//div[@class='grid__row ng-scope']/board-box)[6]")
    WebElement mediumThird;

    //    Creating risks
    @FindBy(xpath = "//input[@name='title']")
    WebElement nameRisk;

    @FindBy(xpath = "(//select[@ng-model='$ctrl.currentOption'])[2]")
    WebElement attachToRisk;

    @FindBy(xpath = "(//select[@ng-model='$ctrl.currentOption'])[3]")
    WebElement probability;

    @FindBy(xpath = "(//select[@ng-model='$ctrl.currentOption'])[3]")
    WebElement consequence;

    @FindBy(xpath = "div[contains(@class, 'item-good')]")
    WebElement good;

    @FindBy(xpath = "div[contains(@class, 'item-good')]")
    WebElement bad;


//    End


}
