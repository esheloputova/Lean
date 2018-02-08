package pages;

import models.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends Page{

  @FindBy(xpath = "//input[@type='email']")
  WebElement loginFormEmailField;

  @FindBy(xpath = "//input[@type='password']")
  WebElement loginFormPasswordFiels;


  @FindBy(xpath = "//button[@type='submit')]")
  WebElement loginFormLoginButton;

  @FindBy(xpath = "//div[contains(@class,'footer-item-forgot-pass') and contains(@role, 'button')]")
  WebElement loginFormForgotPasswordLink;

public MainBoardPage loginAs(User user) {
  new WebDriverWait(getDriver(), 7).until(ExpectedConditions.visibilityOf(loginFormEmailField));
  loginFormEmailField.click();
  loginFormEmailField.sendKeys(user.getLogin());

  loginFormPasswordFiels.click();
  loginFormPasswordFiels.sendKeys(user.getPassword());

  loginFormLoginButton.submit();
  return new MainBoardPage();


}


}
