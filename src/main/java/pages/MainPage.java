package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends Page{

  @FindBy(xpath = "//span[text() = 'Create user']")
  private WebElement createUserButton;

  @FindBy(xpath = "//span[text() = 'Login']")
  private WebElement loginButton;


  @FindBy(xpath = "//span[text() = 'Strategy and Project']")
  private WebElement strategyAndProjectLink;

  @FindBy(xpath = "//span[text() = 'Strategy']")
  private WebElement strategyLink;

  @FindBy(xpath = "//span[text() = 'Project']")
  private WebElement projectLink;

  @FindBy(xpath = "//span[text() = 'Customize']")
  private WebElement customizeLink;

  @FindBy(xpath = "//input[@placeholder = 'E-Mail']")
  private WebElement emailField;

  public CreateUserPage clickCreateUser() {
    createUserButton.click();
    new WebDriverWait(getDriver(),10).until(ExpectedConditions.visibilityOf(emailField));
    return new CreateUserPage();

  }

}
