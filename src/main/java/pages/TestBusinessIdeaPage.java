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

    @FindBy(xpath = "//button[@qa-name='save-sticky-button']")
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
    @FindBy(xpath = "//div[@qa-name='delete-button-dialog']")
    WebElement deleteSticky;

    @FindBy(xpath = "//div[@class='button button-deactivate ng-scope']")
    WebElement deactivateSticky;

    @FindBy(xpath = "//div[@qa-name='activate-sticky-dialog-button']")
    WebElement activateSticky;

    @FindBy(xpath = "//span[@qa-name='more-less-span-sticky-dialog']")
    WebElement moreInformationSticky;

    @FindBy(xpath = "//textarea[@qa-name='description-text-area']")
    WebElement descriptionSticky;

    @FindBy(xpath = "//span[@qa-name='more-less-span-sticky-dialog']")
    WebElement lessInformationSticky;

    @FindBy(xpath = "//input[@qa-name='attach-file-input']")
    WebElement attachmentFile;

    @FindBy(xpath = "//div[contains(@class, 'dialog-close')]")
    WebElement closeForm;

    @FindBy(xpath = "//input[@qa-name='sticky-input-dialog']")
    WebElement fieldOfInputBM;

    @FindBy(xpath = "//div[@qa-name='remove-attach-file-button']")
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
