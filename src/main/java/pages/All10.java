package pages;

import models.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

/**
 * @author Elena_Sheloputova
 */
public class All10 extends Page {

	@FindBy (xpath = "(//a[text()='Войти'])[1]")
	WebElement login;

	@FindBy (xpath = "//input[@name='login']")
	WebElement email;

	@FindBy (xpath = "//input[@id='password']")
	WebElement password;

	@FindBy (xpath = "//input[@title='Войти на сайт']")
	WebElement goToSite;

	@FindBy (xpath = "//a//div[text()='Сертификация']")
	WebElement goTOsertification;

	@FindBy (xpath = "//input[@class='submit']")
	WebElement sertification;

	@FindBy (xpath = "//button[@class='submitNew']")
	WebElement startSertification;

	@FindBys (@FindBy(xpath = "//div[@class='mainTxt']"))
	List<WebElement> allText;

	@FindBy (xpath = "//div[@class='divTextarea']")
	WebElement inputField;

	@FindBy (xpath = "//textarea[@spellcheck='false']")
	WebElement textarea;


	public All10 goTologin() {
		login.click();
		return this;
	}

	public All10 goSertifications() {
		goTOsertification.click();
		sertification.click();
		startSertification.click();

		return this;
	}


	public All10 passTest()  {
		for (int j=0; j<allText.; j++) {
			String text = allText.get(j).getText();
			new Actions(getRegularDriver()).sendKeys(text).perform();
		}
		String text = allText.get(0).;
//		String text = allText.get(0).getText();
//		textarea.click();


//		new Actions(getRegularDriver()).pause(100).sendKeys(text).pause(100).perform();

		return this;
	}


	public All10 loginAs(User user) {
		email.click();
		email.sendKeys(user.getLogin());

		password.click();
		password.sendKeys(user.getPassword());

		goToSite.submit();
		return this;
	}





}