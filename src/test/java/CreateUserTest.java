import configuration.ConfigProperties;
import org.testng.annotations.*;
import pages.*;
import ru.yandex.qatools.allure.annotations.Step;

public class CreateUserTest {

	@BeforeMethod
	public void setUp() {
		Page.getDriver();
		Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));
	}

	@Step ("Create new user. I am developing an existing company")
	@Test (priority = -3)
	public void createUserWithDevelopingCompany(){
		new MainPage()
				.clickOnAccept()
				.clickCreateUser();
		new CreateUserPage().createNewUser1();
	}

	@Step ("Create new user. I work with a limited project within an existing company")
	@Test (priority = -2)
	public void createUserLimitedProject() {
		new MainPage().clickCreateUser();
		new CreateUserPage().createNewUser2();
	}

	@Step ("Create new user. I have not registered a company yet")
	@Test (priority = -1)
	public void createUserNotRegisteredCompany() {
		new MainPage()
				.clickOnAccept()
				.clickCreateUser();
		new CreateUserPage().createNewUser3();
	}

	@AfterMethod
	public void tearDown() {
		new MainBoardPage()
				.clickOnAvatarPhoto();
		new ProfilePage()
				.clickSignOut();
	}


}
