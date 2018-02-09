package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import sun.applet.Main;

public class ProfilePage extends Page {

  @FindBy(xpath = "//*[@id='profile-popover']//div[@class='profile-sh__footer']/div[text()='Sign Out']")
  WebElement signOutButton;


  public MainPage clickOnSignOut() {
     signOutButton.click();
     return new MainPage();
  }


}
