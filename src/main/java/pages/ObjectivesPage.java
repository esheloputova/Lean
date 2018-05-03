package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Elena_Sheloputova
 */
public class ObjectivesPage extends Page {

	@FindBy (xpath = "(//button[(@type='button') and (@aria-label='Add new card')])[1]")
	WebElement firstPlus;

	@FindBy (xpath = "(//button[(@type='button') and (@aria-label='Add new card')])[2]")
	WebElement secondPlus;

	@FindBy (xpath = "(//button[(@type='button') and (@aria-label='Add new card')])[3]")
	WebElement thirdPlus;

	// Beginning. Actions in the form

	@FindBy (xpath = "(//button[contains(@class, 'md-raised') and (@type='button')])[2]")
	WebElement buttonSave;

	@FindBy (xpath = "//div[@class='button button-remove ng-scope']")
	WebElement deleteSticky;

	@FindBy (xpath = "//div[@class='button button-deactivate ng-scope']")
	WebElement deactivateSticky;

	@FindBy (xpath = "//div[@class='button button-activate ng-scope']")
	WebElement activateSticky;

	@FindBy (xpath = "//span[contains(@class,'button-more') and (text()='more')]")
	WebElement moreInformationSticky;

	@FindBy (xpath = "//textarea[contains(@ng-model,'description')]")
	WebElement descriptionSticky;

	@FindBy (xpath = "//span[contains(@class,'button-more') and (text()='less')]")
	WebElement lessInformationSticky;

	@FindBy (xpath = "//input[@type ='file']")
	WebElement attachmentFile;

	@FindBy (xpath = "//div[contains(@class, 'dialog-close')]")
	WebElement closeForm;

	@FindBy (xpath = "//input[(@type='text') and (@name='title')]")
	WebElement fieldOfInput;

	@FindBy (xpath = "//div[@title = 'Remove attach']")
	WebElement removeAttach;
	//	End. Actions in the form
}
