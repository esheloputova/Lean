import configuration.ConfigProperties;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CreateUserPage;
import pages.MainPage;
import pages.Page;
import ru.yandex.qatools.allure.annotations.Step;

public class CreateUserTest {


	@BeforeMethod
	public void setUp() {
		Page.getDriver();
		Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));
	}

	@Step ("Create new user. I am developing an existing company")
	@Test (priority = -3)
	public void createUserWithDevelopingCompany() {
//		Page.getDriver().navigate().back();
		new MainPage().clickCreateUser();
		new CreateUserPage().createNewUser1();
	}

	@Step ("Create new user. I work with a limited project within an existing company")
	@Test (priority = -2)
	public void createUserLimitedProject() {
//		Page.getDriver().navigate().refresh();
		new MainPage().clickCreateUser();
		new CreateUserPage().createNewUser2();
	}

	@Step ("Create new user. I have not registered a company yet")
	@Test (priority = -1)
	public void createUserNotRegisteredCompany() {
//		Page.getDriver().navigate().refresh();
		new MainPage().clickCreateUser();
		new CreateUserPage().createNewUser3();
	}

	@AfterMethod
	public void tear() {
		Page.getDriver().close();
	}

	@AfterClass
	public void tearDown() {
		Page.getDriver().quit();
	}

}
