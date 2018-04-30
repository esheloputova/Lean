import configuration.ConfigProperties;
import models.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.All10;
import pages.LoginPage;
import pages.MainPage;
import pages.Page;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Title;

public class PassTest {

    @Title("Authorization")
    @BeforeMethod
    public void setUp() {
        Page.getRegularDriver();
        Page.getRegularDriver().get(ConfigProperties.getTestProperty("urlall10"));

    }

    @Step("Pass test")
    @Test
    public void pastTest() {
//        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//        new LoginPage()
//                .authorizationAnExistingUser(user1);

        new All10().goSertifications();



    }
}
