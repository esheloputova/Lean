package ru;

import configuration.ConfigProperties;
import models.User;
import org.testng.ITestContext;
import org.testng.annotations.*;
import org.apache.log4j.Logger;
import pages.*;
import ru.AuthorizationTest;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * @author Elena_Sheloputova
 */

@Listeners(MyTestListener.class)
public class BusinessModelTest {
	final static Logger logger = Logger.getLogger(BusinessModelTest.class);

	@BeforeMethod
	public void setUp(ITestContext context) {
		logger.info("Test STARTED");
		Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));
		context.setAttribute("app",BusinessModelPage.class);
	}

	@Step ("Create business model")
	@Test (groups = {"positive"}, enabled=true)
	public void createNewBusinessModelTest() {
		new MainPage()
				.clickOnLoginButton();
		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
		new LoginPage()
				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.clickOnBusinessModel();
		new BusinessModelPage()
				.createBIStickiesBM1()
				.createAllStickiesBM1()
				.createAllStickiesBM2();
	}

	@Step ("Edit stickies business model from creating form")
	@Test(groups = {"positive"}, dependsOnMethods = {"createNewBusinessModelTest"}, enabled=true)
	public void editBusinessModelTest() {
//        new MainPage().clickOnLoginButton();
//        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//        new LoginPage()
//                .authorizationAnExistingUser(user1);
		new MainBoardPage()
				.clickOnBusinessModel();
		new BusinessModelPage()
				.editNameStickiesBM()
				.deactivateStickiesBM()
				.activateStickiesBM()
				.addMoreInformationStickiesBM()
//				.addAttachesBM()
//				.deleteAttachesBM()
				.deleteAddInformationsBM()
				.gragAndDropBM();
	}

////    не работает т к пытается изменить все стики нужно изменить на стики только BM
//	@Step ("Edit stickies business model from main form")
//	@Test(groups = {"positive"}, dependsOnMethods = {"createNewBusinessModelTest"}, enabled=true)
//	public void editBusinessModelFromMainForm() {
////        new MainPage().clickOnLoginButton();
////        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
////        new LoginPage()
////                .authorizationAnExistingUser(user1);
//		new MainBoardPage()
//				.clickOnBusinessModel();
//		new BusinessModelPage()
////				.editDeactivateAllStickies()
////				.editActivateAllStickies()
//				.editAllStickies()
//				.editDeleteAllStickies();
//	}

	@Step ("Go to Gaps from BM")
	@Test(groups = {"positive"}, dependsOnMethods = {"editBusinessModelTest"}, enabled=true)
	public void goGaps() {
//        new MainPage().clickOnLoginButton();
//        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//        new LoginPage()
//                .authorizationAnExistingUser(user1);
		new MainBoardPage()
				.clickOnBusinessModel();
		new BusinessModelPage()
				.goGaps();
	}

	@Step ("Go to Tests from BM")
	@Test(groups = {"positive"}, dependsOnMethods = {"goGaps"}, enabled=true)
	public void goTests() {
//        new MainPage().clickOnLoginButton();
//        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//        new LoginPage()
//                .authorizationAnExistingUser(user1);
		new MainBoardPage()
				.clickOnBusinessModel();
		new BusinessModelPage()
				.goTests();
	}

	@AfterClass
	public void tearDown() {
		logger.info("Test   ENDED");
//        Page.getDriver().quit();
		new MainBoardPage()
				.clickOnAvatarPhoto();
		new ProfilePage()
				.clickSignOut();
	}


}
