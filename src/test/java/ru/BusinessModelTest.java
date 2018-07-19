package ru;

import configuration.ConfigProperties;
import io.qameta.allure.Step;
import models.User;
import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.*;

/**
 * @author Elena_Sheloputova
 */

@Listeners (MyTestListener.class)
public class BusinessModelTest {
	final static Logger logger = Logger.getLogger(BusinessModelTest.class);

	@BeforeMethod
	public void setUp(ITestContext context) {
		logger.info("Test STARTED");
		Page.getDriver().get(ConfigProperties.getTestProperty("urlnewlean"));
		context.setAttribute("app", BusinessModelPage.class);
	}

	@Step ("Create business model")
	@Test (groups = {"positive"}, enabled = true)
	public void createNewBusinessModelTest() {
		new MainPage()
//                .clickOnAccept()
				.clickOnLoginButton();
		User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
		new LoginPage()
				.authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goBMfromToolBar();
		new BusinessModelPage()
				.createBIStickiesBM1()
				.createAllStickiesBM1()
				.createAllStickiesBM2();
	}

	@Step ("Edit stickies business model from creating form" +
			"Edit name" +
			"Activate/ Deactivate" +
			"Drag-and-drop")
	@Test (groups = {"positive"}, dependsOnMethods = {"createNewBusinessModelTest"}, enabled = true)
	public void editBusinessModelTest() {
//        new MainPage()
//                .clickOnAccept()
//                .clickOnLoginButton();
//        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//        new LoginPage()
//                .authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goBMfromToolBar();
		new BusinessModelPage()
				.editNameStickiesBM()
				.deactivateFirstStickiesBM()
				.activateFirstStickiesBM()
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
	@Test (groups = {"positive"}, dependsOnMethods = {"editBusinessModelTest"}, enabled = true)
	public void goGaps() {
//        new MainPage().clickOnLoginButton();
//        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
//        new LoginPage()
//                .authorizationAnExistingUser(user1);
		new MainBoardPage()
				.goBMfromToolBar();
		new BusinessModelPage()
				.goGaps();
	}

//	@Step ("Go to Tests from BM")
//	@Test (groups = {"positive"}, dependsOnMethods = {"goGaps"}, enabled = true)
//	public void goTests() {
////        new MainPage().clickOnLoginButton();
////        User user1 = new User(ConfigProperties.getTestProperty("anExistingLogin"), ConfigProperties.getTestProperty("correctPassword"));
////        new LoginPage()
////                .authorizationAnExistingUser(user1);
//		new MainBoardPage()
//				.goBMfromToolBar();
//		new BusinessModelPage()
//				.goTests();
//	}

	@AfterMethod
	public void logging() {
		logger.info("Test   ENDED");

	}


	@AfterClass
	public void tearDown() {
		new MainBoardPage()
				.clickOnAvatarPhoto();
		new ProfilePage()
				.clickSignOut();

	}

}
