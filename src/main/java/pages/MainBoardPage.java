package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainBoardPage extends Page{

  WebDriverWait wait;

  @FindBy(xpath = "//div[@class='avatar-icon layout-row']")
  WebElement avatarPhoto;

  @FindBy(xpath = "//i[@class='mm-icon mm-icon-cases']")
  WebElement casesToolBar;

 @FindBy(xpath = "//button[contains(@class,'md-button') and contains(text(),'new case')]")
  WebElement newCaseButton;

  public MainBoardPage clickOnAvatarPhoto() {
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


}
