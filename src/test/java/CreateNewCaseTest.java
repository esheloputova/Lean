import configuration.ConfigProperties;
import models.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import pages.*;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * @author Elena_Sheloputova
 */
public class CreateNewCaseTest {

  final static Logger logger = Logger.getLogger(AuthorizationTest.class);

  @Title("Creating new case")
  @BeforeMethod
  public void setUp() {
    logger.info("Test STARTED");
    Page.getRegularDriver();
    Page.getRegularDriver().get(ConfigProperties.getTestProperty("urlnewlean"));

  }

  @Title("Possitive scenario")
  @Step("Creating new case")
  @Test
  public void createNewCase() {
    new MainPage().clickOnLoginButton();
    User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
    new LoginPage()
            .authorizationAnExistingUser(user1);
    new MainBoardPage()
            .clickOnCasesText()
            .clickNewCaseButton();
    new CreateNewCaseForm()
            .creatingNewCase();
  }

}
