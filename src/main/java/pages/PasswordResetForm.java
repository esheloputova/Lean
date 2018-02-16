package pages;

import configuration.ConfigProperties;
import junit.framework.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PasswordResetForm extends Page {

  @FindBy(xpath = "//input[@name='email']")
  WebElement passwordResetFormEmail;

  @FindBy(xpath = "//button[@type='submit']")
  WebElement passwordResetFormSendMessageButton;

  @FindBy(xpath = "//p[@class='help-text ng-scope']")
  WebElement passwordResetHelpText;

  @FindBy(xpath = "//button[contains(@class,'btn-close') and contains(text(),'Close')]")
  WebElement passwordResetCloseButton;

  @FindBy(xpath = "//div[@ng-if='!$ctrl.hideButton']")
  WebElement passwordResetCloseCross;



  final String textHelpPasswordResset = "We've sent an email to elena.sheloputova@yandex.ru. Click the link in the email to reset your password.\n\nIf you do not receive the e-mail immediately please check your spamfilter or junk e-mail folder.";

  public MainPage ExistingUser() {
    passwordResetFormEmail.click();
    passwordResetFormEmail.sendKeys(ConfigProperties.getTestProperty("anExistingLogin"));
    passwordResetFormSendMessageButton.submit();
    String textHelpPasswordSucced = passwordResetHelpText.getText();
    Assert.assertTrue("No text", textHelpPasswordSucced.equals(textHelpPasswordResset));
    passwordResetCloseButton.submit();
    return new MainPage();
  }

  public MainPage checkUnAvailabilityButtonSendMessage() {
    passwordResetFormEmail.click();
    passwordResetFormEmail.sendKeys(ConfigProperties.getTestProperty("invalidEmail"));
    Assert.assertFalse("Button is unavailable", passwordResetFormSendMessageButton.isEnabled());
    passwordResetCloseCross.click();
    return new MainPage();
  }
}
