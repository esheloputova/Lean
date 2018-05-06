import configuration.ConfigProperties;
import models.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import pages.*;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Title;

public class ShareTest {

    final static Logger logger = Logger.getLogger(AuthorizationTest.class);


    @BeforeMethod
    public void setUp() {
        logger.info("Test STARTED");
        Page.getDriver();
        Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));

    }

    @Title("Share")
    @Step("Invite viewer")
    @Test
    public void inviteUserAsViewer() {
        new MainPage().clickOnLoginButton();
        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
        new LoginPage()
                .authorizationAnExistingUser(user1);
        new MainBoardPage()
                .goSharefromToolBar();

        new SharingPage()
                .inviteUserAsViewer();
    }
    @Step("Invite viewer")
    @Test
    public void inviteUserAsSuperDoer() {
        new MainPage().clickOnLoginButton();
        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
        new LoginPage()
                .authorizationAnExistingUser(user1);
        new MainBoardPage()
                .goSharefromToolBar();

        new SharingPage()
                .inviteUserAsSuperDoer();
    }

 @Step("Resend invitation. Delete. Back.")
    @Test
    public void editInvitationFirst() {
        new MainPage().clickOnLoginButton();
        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
        new LoginPage()
                .authorizationAnExistingUser(user1);
        new MainBoardPage()
                .goSharefromToolBar();

        new SharingPage()
                .resendInvite()
                .deleteInvite()
                .backInvite();
    }


}
