package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * @author Elena_Sheloputova
 */
public class BusinessModelPage extends Page {

	@FindBy(xpath = "(//p[@class = 'box__help-text ng-scope ng-binding'])[1]")
	WebElement businessModelCreateSticky1;

	@FindBy(xpath = "(//p[@class = 'box__help-text ng-scope ng-binding'])[2]")
	WebElement businessModelCreateSticky2;

	@FindBy(xpath = "(//p[@class = 'box__help-text ng-scope ng-binding'])[3]")
	WebElement businessModelCreateSticky3;

	@FindBy(xpath = "(//p[@class = 'box__help-text ng-scope ng-binding'])[4]")
	WebElement businessModelCreateSticky4;

	@FindBy(xpath = "(//p[@class = 'box__help-text ng-scope ng-binding'])[5]")
	WebElement businessModelCreateSticky5;

	@FindBy(xpath = "(//p[@class = 'box__help-text ng-scope ng-binding'])[6]")
	WebElement businessModelCreateSticky6;

	@FindBy(xpath = "//input[(@type='text') and (@name='title')]")
	WebElement fieldOfInputBusinessModel;

	@FindBy(xpath = "(//button[contains(@class, 'md-raised') and (@type='button')])[2]")
	WebElement buttonSave;


	public BusinessModelPage createBM() {
		businessModelCreateSticky1.click();
		new Actions(driver).doubleClick(businessModelCreateSticky1).build().perform();
		fieldOfInputBusinessModel.sendKeys("One");
		buttonSave.click();

		return this;
	}
}
