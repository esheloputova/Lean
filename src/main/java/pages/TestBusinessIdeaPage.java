package pages;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestBusinessIdeaPage extends Page {

    @FindBy(xpath = "//input[@ng-model='$ctrl.ngModel.title']")
    WebElement nameYourInterviewee;

    @FindBy(xpath = "//div[@class='md-datepicker-expand-triangle ng-scope']")
    WebElement clickDate;

    @FindBy(xpath = "(//span[@class='md-calendar-date-selection-indicator'])[28]")
    WebElement chooseDate;

    @FindBy(xpath = "(//select[@ng-model='$ctrl.currentOption'])[2]")
    WebElement clickTargetAudience;

    @FindBy(xpath = "//optgroup/option[1]")
    WebElement chooseTargetAudience;

    @FindBy(xpath = "//textarea[@ng-model='problem.comment']")
    WebElement comments;

    @FindBy(xpath = "//div[(@class='md-track md-track-fill') and (@style='width: 66.6667%;')]")
    WebElement chooseBigProblem;

    @FindBy(xpath = "//div[(@class='md-container md-ink-ripple')]")
    WebElement na;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement saveButton;

    @FindBy(xpath = "//div[@ng-click='$ctrl.goBack()']")
    WebElement cancelButton;

    @FindBy(xpath = "//div[contains(@class, 'button-deactivate')]")
    WebElement deactivateTest;

    @FindBy(xpath = "//div[contains(@class, 'button-activate')]")
    WebElement activateTest;

    @FindBy(xpath = "//textarea[@ng-model='$ctrl.ngModel.comments']")
    WebElement generalComments;

    @FindBy(xpath = "//div[@class='underline-btn ng-binding ng-scope']")
    WebElement addNewProblem;

    @FindBy(xpath = "//span[@ng-click='$ctrl.goBack()']")
    WebElement goBackToTestFromTestResultPage;


    // Beginning. Actions in the form
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
    WebElement fieldOfInputBM;

    @FindBy(xpath = "//div[@title = 'Remove attach']")
    WebElement removeAttach;

    @FindBy(xpath = "(//button[contains(@class, 'md-raised') and (@type='button')])[2]")
    WebElement buttonSaveBI;

    //	End. Actions in the form


    public TestBusinessIdeaPage addName() {
        nameYourInterviewee.click();
        nameYourInterviewee.sendKeys("Test name creating AT");

        return new TestBusinessIdeaPage();
    }

    public TestBusinessIdeaPage addDate() {
        clickDate.click();
        chooseDate.click();

        return new TestBusinessIdeaPage();
    }

    public TestBusinessIdeaPage addTargetAudience() {
        clickTargetAudience.click();
        chooseTargetAudience.click();

        return new TestBusinessIdeaPage();
    }

    public TestBusinessIdeaPage addComments() {
        comments.click();
        comments.sendKeys("Test comments creating AT");

        return new TestBusinessIdeaPage();
    }

     public TestBusinessIdeaPage addGeneralComments() {
        generalComments.click();
        generalComments.sendKeys("Test general comments creating AT");

        return new TestBusinessIdeaPage();
    }


     public TestsPage saveTestBusinessIdea() {
        saveButton.click();

        return new TestsPage();
    }

    public static byte[] takeScreenshot(){
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }


}
