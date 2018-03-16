package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Elena_Sheloputova
 */
public class BusinessModelPage extends Page {

	@FindBy(xpath = "(//div[@ng-repeat = 'box in boxes'])[1]")
	WebElement businessModelIdea1WhatMakesYouUnique;

	@FindBy(xpath = "(//div[@class = 'box-header'])[1]//button[@type = 'button']")
	WebElement businessModelWhatMakesYouUniqueButtonPlus;


	@FindBy(xpath = "(//div[@class = 'box-header__cnt'])[2]")
	WebElement businessModelWhatProblemWillYouSolve;

	@FindBy(xpath = "(//div[@class = 'box-header__cnt'])[3]")
	WebElement businessModelWhoWillHaveThisProblem;

	@FindBy(xpath = "(//div[@class = 'grid__cell business-items__models-cell ng-scope'])[1]")
	WebElement businessModelWhoCanHelpYou;

	@FindBy(xpath = "(//div[@class = 'grid__cell business-items__models-cell ng-scope'])[2]")
	WebElement businessModelHowWillYouMarketAndSell;

	@FindBy(xpath = "(//div[@class = 'grid__cell business-items__models-cell ng-scope'])[3]")
	WebElement businessModelHowWillYouCharge;

	@FindBy(xpath = "(//div[@class = 'grid__cell business-items__models-cell ng-scope'])[4]")
	WebElement businessModelWhatIsYourUniqueValueProposition;

	@FindBy(xpath = "(//div[@class = 'grid__cell business-items__models-cell ng-scope'])[5]")
	WebElement businessModelWhatFeaturesWillYourProductHave;

	@FindBy(xpath = "(//div[@class = 'grid__cell business-items__models-cell ng-scope'])[6]")
	WebElement businessModelWhoWillBeYourFirstCustomers;

	@FindBy(xpath = "//input[(@type='text') and (@name='title')]")
	WebElement fieldOfInputBusinessModel;

	@FindBy(xpath = "(//button[contains(@class, 'md-raised') and (@type='button')])[2]")
	WebElement buttonSave;


	public BusinessModelPage createAllStickiesBM() {

		businessModelWhoCanHelpYou.click();
		new Actions(driver).doubleClick(businessModelWhoCanHelpYou).build().perform();
		fieldOfInputBusinessModel.sendKeys("Who can help you?");
		buttonSave.click();

		businessModelHowWillYouMarketAndSell.click();
		new Actions(driver).doubleClick(businessModelHowWillYouMarketAndSell).build().perform();
		fieldOfInputBusinessModel.sendKeys("How will you market and sell?");
		buttonSave.click();

		businessModelHowWillYouCharge.click();
		new Actions(driver).doubleClick(businessModelHowWillYouCharge).build().perform();
		fieldOfInputBusinessModel.sendKeys("How will you charge?");
		buttonSave.click();

		businessModelWhatIsYourUniqueValueProposition.click();
		new Actions(driver).doubleClick(businessModelWhatIsYourUniqueValueProposition).build().perform();
		fieldOfInputBusinessModel.sendKeys("What is your unique value proposition?");
		buttonSave.click();

		businessModelWhatFeaturesWillYourProductHave.click();
		new Actions(driver).doubleClick(businessModelWhatFeaturesWillYourProductHave).build().perform();
		fieldOfInputBusinessModel.sendKeys("What features will your product have?");
		buttonSave.click();

		businessModelWhoWillBeYourFirstCustomers.click();
		new Actions(driver).doubleClick(businessModelWhoWillBeYourFirstCustomers).build().perform();
		fieldOfInputBusinessModel.sendKeys("Who will be your first customers?");
		buttonSave.click();

		return this;
	}
}
