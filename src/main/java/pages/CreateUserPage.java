package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateUserPage extends Page{

  @FindBy(xpath = "//input[@placeholder = 'E-Mail']")
  private WebElement emailField;

  @FindBy(xpath = "//input[@placeholder = 'Password']")
  private WebElement passwordField;

  @FindBy(xpath = "//input[@placeholder = 'Repeat Password']")
  private WebElement repeatPasswordField;

  @FindBy(xpath = "//input[@placeholder = 'First Name']")
  private WebElement firstNameField;

  @FindBy(xpath = "//input[@placeholder = 'Last Name']")
  private WebElement lastNameField;


  @FindBy(xpath = "//mat-select[@ng-reflect-placeholder = 'Country of origin']")
  private WebElement countryOfOriginField;

  @FindBy(xpath = "//span[text() = 'Romania']")
  private WebElement chooseValueOfcountryOfOriginField;

  @FindBy(xpath = "//mat-select[@ng-reflect-placeholder = 'User language']")
  private WebElement userLanguageField;

  @FindBy(xpath = "//span[text() = 'English']")
  private WebElement chooseValueOfLanguageField;

  @FindBy(xpath = "//span[@class = 'mat-checkbox-label']")
  private WebElement acceptionField;

  @FindBy(xpath = "//span[text() = 'Register']")
  private WebElement registerButton;


  public void createNewUser() {
    new WebDriverWait(getDriver(),10).until(ExpectedConditions.visibilityOf(emailField));
    emailField.click();
    emailField.sendKeys("elena.sheloputova+2@nrg-soft.ru");
    passwordField.click();
    passwordField.sendKeys("Elena-4776547");
    repeatPasswordField.click();
    repeatPasswordField.sendKeys("Elena-4776547");
    firstNameField.click();
    firstNameField.sendKeys("Testov1");
    lastNameField.click();
    lastNameField.sendKeys("Test1");
    countryOfOriginField.click();
    chooseValueOfcountryOfOriginField.click();
    userLanguageField.click();
    chooseValueOfLanguageField.click();
    acceptionField.click();
    registerButton.click();
    //return CompanyAndCasePage;
  }

}
