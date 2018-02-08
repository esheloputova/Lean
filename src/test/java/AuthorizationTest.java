import configuration.ConfigProperties;
import models.User;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainBoardPage;
import pages.MainPage;
import pages.Page;

import java.util.logging.Logger;


public class AuthorizationTest {
    //final static Logger logger = Logger.getLogger(AuthorizationTest.class);

  @BeforeMethod
  public void setUp() {
    Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));
  }


  @Test
  public void login() {
    new MainPage().clickOnLoginButton();

    User user1 = new User(ConfigProperties.getTestProperty("login1"), ConfigProperties.getTestProperty("password1"));
    new LoginPage()
            .loginAs(user1);

  }

  @AfterMethod
  public void Stop() {
    Page.getDriver().quit();
  }

}
