package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

/**
 * @author Elena_Sheloputova
 */
public class All10 extends Page {

	@FindBy(xpath = "(//a[text()='Войти'])[1]")
	WebElement login;

	@FindBy(xpath = "(//label[@for='rb2'])")
	WebElement eng;


	@FindBy(xpath = "//input[@name='login']")
	WebElement email;

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;

	@FindBy(xpath = "//input[@title='Войти на сайт']")
	WebElement goToSite;

	@FindBy(xpath = "//a//div[text()='Сертификация']")
	WebElement goTOsertification;

	@FindBy(xpath = "//input[@class='submit']")
	WebElement sertification;

	@FindBy(xpath = "//button[@class='submitNew']")
	WebElement startSertification;

	@FindBys(@FindBy(xpath = "//div[@class='mainTxt']/span"))
	List<WebElement> allTexts;

	@FindBy(xpath = "//div[@class='mainTxt']")
	WebElement allText;


	@FindBy(xpath = "//div[@class='divTextarea']")
	WebElement inputField;

	@FindBy(xpath = "//textarea[@spellcheck='false']")
	WebElement textarea;


	public All10 goTologin() {
		login.click();
		return this;
	}

	public All10 goSertifications() {

		goTOsertification.click();
		eng.click();
		sertification.click();
		startSertification.click();

		for (WebElement webelement : allTexts) {

			try {
				// some code that can throw both checked and runtime exception
				Thread.sleep(2000);
//				new Actions(getDriver()).sendKeys(text).perform();
			} catch (RuntimeException e) {
				throw e;
			} catch (Exception e) {
				throw new RuntimeException(e);
			}

			new Actions(getDriver()).sendKeys(webelement.getText() + " ").perform();
//		}
		}
			return this;

	}
}


//		public All10 loginAs (User user){
//			email.click();
//			email.sendKeys(user.getLogin());
//
//			password.click();
//			password.sendKeys(user.getPassword());
//
//			goToSite.submit();
//			return this;
//		}







