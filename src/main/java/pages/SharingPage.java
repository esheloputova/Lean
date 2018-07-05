package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class SharingPage extends Page {

//    Beginning. Old sharing

	@FindBy (xpath = "//input[@type='email']")
	WebElement email;

	@FindBys (@FindBy (xpath = "//lb-select[contains(@list, 'accessRolesWithoutOwner')]//option"))
	List<WebElement> listAccessLevel;

	@FindBys (@FindBy (xpath = "//lb-select[contains(@list, '$ctrl.personalRoles')]//option"))
	List<WebElement> listRoleInCompany;

	@FindBy (xpath = "//lb-select[contains(@list, 'accessRolesWithoutOwner')]//option[1]")
	WebElement superDoer;

	@FindBy (xpath = "//lb-select[contains(@list, 'accessRolesWithoutOwner')]//option[2]")
	WebElement viewer;

	@FindBy (xpath = "//button[contains(@class, 'invite-btn')]")
	WebElement inviteButtonOld;

	@FindBy (xpath = "(//span[contains(@ng-click, 'onClickSend')])[2]")
	WebElement sendLink;

	@FindBy (xpath = "//span[contains(@class, 'text-button')]")
	WebElement backLink;

	@FindBy (xpath = "(//img[@class='trash-icon'])[2]")
	WebElement trash;

	@FindBy (xpath = "//div[contains(@ng-class, 'btnPending')]")
	WebElement ok;

	@FindBy (xpath = "//div[contains(@ng-class, 'btnPending')]")
	WebElement cancel;
//    End. Old sharing

//	Beginning.  New sharing

	@FindBy (xpath = "//button[contains(@class, 'mat-raised-button')]")
	WebElement inviteButtonNew;

//	End. New sharing


	public SharingPage inviteUserAsViewer() {
		email.click();
		email.sendKeys("elena.sheloputova+1@yandex.ru");
		viewer.click();
		inviteButtonOld.click();

		return this;
	}

	public SharingPage inviteUserAsSuperDoer() {
		email.click();
		email.sendKeys("elena.sheloputova+2@yandex.ru");
		superDoer.click();
		inviteButtonOld.click();

		return this;
	}

	public SharingPage resendInvite() {
		sendLink.click();
		ok.click();

		return this;
	}

	public SharingPage deleteInvite() {
		trash.click();
		ok.click();

		return this;
	}

	public MainBoardPage backInvite() {
		backLink.click();

		return new MainBoardPage();
	}


}
