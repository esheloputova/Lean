import configuration.ConfigProperties;
import org.junit.Before;
import org.junit.Test;
import pages.CreateUserPage;
import pages.MainPage;
import pages.Page;

import java.lang.management.ManagementFactory;

public class CreateUserTest {



    @Before
    public void setUp() {
      Page.getDriver().get(ConfigProperties.getTestProperty("url"));
    }

@Test
  public void createUser() {
      new MainPage().clickCreateUser();
      new CreateUserPage().createNewUser();
  }
}
