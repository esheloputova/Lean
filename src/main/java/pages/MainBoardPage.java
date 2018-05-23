package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainBoardPage extends Page {

    WebDriverWait wait;

    @FindBy(xpath = "//div[@class='avatar-icon layout-row']")
    WebElement avatarPhoto;

    @FindBy(xpath = "//i[contains(@class, 'cases')]")
    WebElement casesToolBar;

    @FindBy(xpath = "//i[contains(@class, 'boards')]")
    WebElement boardsToolBar;

    @FindBy(xpath = "//i[contains(@class, 'mm-icon-overview')]")
    WebElement overviewToolBar;

    @FindBy(xpath = "//i[contains(@class, 'share')]")
    WebElement shareToolBar;

    @FindBy(xpath = "//i[contains(@class, 'about')]")
    WebElement moreToolBar;

    @FindBy(xpath = "//i[contains(@class, 'admin')]")
    WebElement adminToolBar;

    @FindBy(xpath = "//span[contains(@class,'resources')]")
    WebElement resourcesFromToolBar;

    @FindBy(xpath = "//span[contains(@class,'ideas')]")
    WebElement ideasFromToolBar;

    @FindBy(xpath = "//span[contains(@class,'models')]")
    WebElement businessModelFromToolBar;

    @FindBy(xpath = "//span[contains(@class,'gaps')]")
    WebElement gapsFromToolBar;

    @FindBy(xpath = "//span[contains(@class,'objectives')]")
    WebElement objectivesFromToolBar;

    @FindBy(xpath = "//span[contains(@class,'risks')]")
    WebElement risksFromToolBar;

    @FindBy(xpath = "//span[contains(@class,'tasks')]")
    WebElement tasksFromToolBar;

    @FindBy(xpath = "//span[contains(@class,'overview')]")
    WebElement overviewFromToolBar;

    @FindBy(xpath = "//span[contains(@class,'tests')]")
    WebElement testsFromToolBar;

    @FindBy(xpath = "//span[(@class='ng-binding') and (text()='Select boards')]")
    WebElement selectboardsFromToolBar;

    @FindBy(xpath = "//button[contains(@class,'md-button') and contains(text(),'new case')]")
    WebElement newCaseButton;

    @FindBy(xpath = "//div[contains(@ng-class,'$ctrl.helpingIdeas') and contains(text(), 'Business Idea')]")
    WebElement businessIdea;

    @FindBy(xpath = "//div[contains(@ng-class,'$ctrl.helpingModels') and contains(text(), 'Business models')]")
    WebElement businessModel;

    @FindBy(xpath = "//div[contains(@ng-class,'$ctrl.helpingGaps')]")
    WebElement gaps;

    @FindBy(xpath = "//img[@alt = 'Logo']")
    WebElement goMainPage;


    public MainBoardPage clickOnAvatarPhoto() {
        new WebDriverWait(getDriver(), 3).until(ExpectedConditions.visibilityOf(avatarPhoto));
        avatarPhoto.click();

        return this;
    }

    public MainBoardPage clickOnCasesText() {
        casesToolBar.click();
        return this;
    }

    public CreateNewCaseForm clickNewCaseButton() {
        newCaseButton.click();
        return new CreateNewCaseForm();
    }

    public BusinessIdeaPage clickOnBusinessIdea() {
        new WebDriverWait(getDriver(), 10).until(ExpectedConditions.visibilityOf(businessIdea));
        businessIdea.click();
        return new BusinessIdeaPage();
    }

    public BusinessModelPage clickOnBusinessModel() {
        new WebDriverWait(getDriver(), 10).until(ExpectedConditions.visibilityOf(businessModel));
        businessModel.click();
        return new BusinessModelPage();
    }

    public GapsPage clickOnGap() {
        new WebDriverWait(getDriver(), 10).until(ExpectedConditions.visibilityOf(gaps));
        gaps.click();
        return new GapsPage();
    }


    public MainBoardPage goMainPage() {
        goMainPage.click();
        return new MainBoardPage();
    }

    public ResourcesPage goResourcesfromToolBar() {
        boardsToolBar.click();
        resourcesFromToolBar.click();
        return new ResourcesPage();
    }

    public BusinessIdeaPage goBIfromToolBar() {
        boardsToolBar.click();
        ideasFromToolBar.click();
        return new BusinessIdeaPage();
    }

    public BusinessModelPage goBMfromToolBar() {
        boardsToolBar.click();
        businessModelFromToolBar.click();
        return new BusinessModelPage();
    }

    public GapsPage goGapsfromToolBar() {
        boardsToolBar.click();
        gapsFromToolBar.click();
        return new GapsPage();
    }

    public ObjectivesPage goObjectivesfromToolBar() {
        boardsToolBar.click();
        objectivesFromToolBar.click();
        return new ObjectivesPage();
    }

    public RisksPage goRisksfromToolBar() {
        boardsToolBar.click();
        risksFromToolBar.click();
        return new RisksPage();
    }

    public TasksPage goTasksfromToolBar() {
        boardsToolBar.click();
        tasksFromToolBar.click();
        return new TasksPage();
    }

    public OverviewPage goOverviewfromToolBar() {
        boardsToolBar.click();
        overviewFromToolBar.click();
        return new OverviewPage();
    }

    public TestsPage goTestsfromToolBar() {
        boardsToolBar.click();
        testsFromToolBar.click();
        return new TestsPage();
    }

    public MainPage goSelectBoardsfromToolBar() {
        boardsToolBar.click();
        selectboardsFromToolBar.click();
        return new MainPage();
    }

public SharingPage goSharefromToolBar() {
        shareToolBar.click();
        return new SharingPage();
    }


}
