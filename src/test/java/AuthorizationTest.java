import configuration.ConfigProperties;
import models.User;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import pages.LoginPage;
import pages.MainPage;
import pages.Page;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Title;


public class AuthorizationTest {
  final static Logger logger = Logger.getLogger(AuthorizationTest.class);

  @Title("Authorization")
  @BeforeMethod
  public void setUp() {
    logger.info("Test STARTED");
    Page.getRegularDriver();
    Page.getRegularDriver().get(ConfigProperties.getTestProperty("urlnewlean"));

  }

  @Title("Possitive scenario")
  @Step("Authorization is an existing user")
  @Test
  public void authorizationAnExistingUser() {
    new MainPage().clickOnLoginButton();
    User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
    new LoginPage()
            .authorizationAnExistingUser(user1);
  }

  @Title("Negative scenario")
  @Step("Authorization is not an existing user")
  @Test
  public void authorizationNotAnExistingUser() {
    Page.getRegularDriver().navigate().back();
    new MainPage().clickOnLoginButton();
    User user2 = new User(ConfigProperties.getTestProperty("notAnExistingLogin"), ConfigProperties.getTestProperty("inCorrectPassword"));
    new LoginPage()
            .authorizationNotAnExistingUser(user2);
  }

  @Title("Negative scenario")
  @Step("Invalid email")
  @Test
  public void invalidEmail() {
    Page.getRegularDriver().navigate().back();
    new MainPage().clickOnLoginButton();
    User user3 = new User(ConfigProperties.getTestProperty("invalidEmail"), ConfigProperties.getTestProperty("invalidPassword"));
    new LoginPage()
            .invalidEmail(user3);
  }

  @Title("Negative scenario")
  @Step("Missing email and password")
  @Test
  public void missingEmailAndPasssword() {
    Page.getRegularDriver().navigate().back();
    new MainPage().clickOnLoginButton();
    new LoginPage().missingEmailAndPassword();
  }


  @AfterClass
  public void tearDown() {
    logger.info("Test   ENDED");
    Page.getRegularDriver().quit();
  }

}
