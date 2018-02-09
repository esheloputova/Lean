import configuration.ConfigProperties;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.CreateUserPage;
import pages.MainPage;
import pages.Page;

public class CreateUserTest {


  @BeforeMethod
  public void setUp() {
    Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));
  }

  @Ignore
  @Test
  public void createUser() {
    new MainPage().clickCreateUser();
    new CreateUserPage().createNewUser();
  }
}
