package pages;

import models.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends Page {

  @FindBy(xpath = "//input[@type='email']")
  WebElement loginFormEmailField;

  @FindBy(xpath = "//input[@type='password']")
  WebElement loginFormPasswordFiels;


  @FindBy(xpath = "//button[@type='submit']")
  WebElement loginFormLoginButton;

  @FindBy(xpath = "//div[contains(@class,'footer-item-forgot-pass') and contains(@role, 'button')]")
  WebElement loginFormForgotPasswordLink;

  @FindBy(xpath = "//div[contains(@class, 'login-form__err')]")
  WebElement loginFormErrorAboutIncorrectNameOrPassword;

  @FindBy(xpath = "//div[contains(@ng-message,'required') and contains(text(),'E-mail is required')]")
  WebElement loginFormErrorAboutMissingEmail;

  @FindBy(xpath = "//div[contains(@ng-message,'email') and contains(text(),'E-mail is not valid')]")
  WebElement loginFormErrorAboutInvalidEmail;

  @FindBy(xpath = "//div[contains(@ng-message,'required') and contains(text(),'Password is required.')]")
  WebElement loginFormErrorAboutMissingPassword;





  public MainBoardPage authorizationAnExistingUser(User user) {
    loginFormEmailField.click();
    loginFormEmailField.sendKeys(user.getLogin());

    loginFormPasswordFiels.click();
    loginFormPasswordFiels.sendKeys(user.getPassword());

    loginFormLoginButton.submit();
    return new MainBoardPage();
  }

  final String textIncorrectNameOrPassword = "The user name or password is incorrect.";

  public LoginPage authorizationNotAnExistingUser(User user) {
    loginFormEmailField.click();
    loginFormEmailField.sendKeys(user.getLogin());

    loginFormPasswordFiels.click();
    loginFormPasswordFiels.sendKeys(user.getPassword());

    loginFormLoginButton.submit();

    loginFormErrorAboutIncorrectNameOrPassword.click();
    String textError1 = loginFormErrorAboutIncorrectNameOrPassword.getText();

    Assert.assertTrue( textError1.equals(textIncorrectNameOrPassword));
    return this;
  }

  final String textInvalidEmail = "E-mail is not valid";

  public LoginPage invalidEmail(User user) {
    loginFormEmailField.click();
    loginFormEmailField.sendKeys(user.getLogin());

    loginFormPasswordFiels.click();
    loginFormPasswordFiels.sendKeys(user.getPassword());

    loginFormLoginButton.submit();

    String textErrorEmail = loginFormErrorAboutInvalidEmail.getText();
    Assert.assertTrue( textErrorEmail.equals(textInvalidEmail));
    return this;
  }

  final String textMissingEmail = "E-mail is required";
  final String textMissingPasssword = "Password is required.";

  public LoginPage missingEmailAndPassword() {

    loginFormLoginButton.submit();

    String textErrorMissingEmail = loginFormErrorAboutMissingEmail.getText();
    String textErrorMissingPassword = loginFormErrorAboutMissingPassword.getText();

    Assert.assertTrue( textErrorMissingEmail.equals(textMissingEmail));
    Assert.assertTrue(textErrorMissingPassword.equals(textMissingPasssword));
    return this;
  }

  public PasswordResetForm clickOnFogotPasswordLink() {
    loginFormForgotPasswordLink.click();
    return new PasswordResetForm();

  }

}
