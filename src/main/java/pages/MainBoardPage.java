package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainBoardPage extends Page{

  WebDriverWait wait;

  @FindBy(xpath = "//div[@class='avatar-icon layout-row']")
  WebElement avatarPhoto;

  public MainBoardPage clickOnAvatarPhoto() {
    avatarPhoto.click();
    return this;
  }

}
