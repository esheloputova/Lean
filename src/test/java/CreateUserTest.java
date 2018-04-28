import configuration.ConfigProperties;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CreateUserPage;
import pages.MainPage;
import pages.Page;
import ru.yandex.qatools.allure.annotations.Step;

public class CreateUserTest {


  @BeforeMethod
  public void setUp() {
    Page.getRegularDriver().get(ConfigProperties.getTestProperty("urlnewlean"));
  }

  @Step("Create new user. I am developing an existing company")
  @Test
  public void createUserWithDevelopingCompany() {
//    Page.getRegularDriver().navigate().back();
    new MainPage().clickCreateUser();
    new CreateUserPage().createNewUser1();
  }

  @Step("Create new user. I work with a limited project within an existing company")
  @Test
  public void createUserLimitedProject() {
//    Page.getRegularDriver().navigate().back();
    new MainPage().clickCreateUser();
    new CreateUserPage().createNewUser2();
  }

  @Step("Create new user. I have not registered a company yet")
  @Test
  public void createUserNotRegisteredCompany() {
//    Page.getRegularDriver().navigate().back();
    new MainPage().clickCreateUser();
    new CreateUserPage().createNewUser3();
  }


}
