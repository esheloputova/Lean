import configuration.ConfigProperties;
import models.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.All10;
import pages.LoginPage;
import pages.Page;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Title;

public class PassTest {

    @Title("Authorization")
    @BeforeMethod
    public void setUp() {
//        Page.getDriver();
        Page.getDriver().get(ConfigProperties.getTestProperty("urlall10"));

    }

    @Step("Pass test")
    @Test
    public void pastTest() {
        new All10().goTologin();

        new All10().goSertifications();


    }
}