package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.stqa.selenium.wrapper.HighlightingWrapper;

import java.util.concurrent.TimeUnit;

public abstract class Page {

	protected static WebDriver regularDriver;
	protected WebDriverWait wait;
	protected Actions action;


	public Page() {

		PageFactory.initElements(getRegularDriver(), this);

	}

	public static WebDriver getRegularDriver() {
		if (regularDriver == null) {
			System.setProperty("webdriver.chrome.regularDriver", "src/main/resources/chromedriver.exe");

			regularDriver = new HighlightingWrapper(new ChromeDriver());
//			EventFiringWebDriver driver = new EventFiringWebDriver(regularDriver);
//			driver.register(new ListenerThatWaitsBeforeAnyAction(500000, TimeUnit.SECONDS));

			regularDriver.manage().window().maximize();
//			regularDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		return regularDriver;
	}

	public WebDriverWait justWait() {
		if (wait == null) {
			wait = new WebDriverWait(regularDriver, 10);
		}
		return wait;
	}

	public Actions doubleAction() {
		if (action == null) {
			action = new Actions(regularDriver);
		}
		return action;
	}

	public static boolean isNotElementExists(String xpath) {
		return getRegularDriver().findElements(By.xpath(xpath)).isEmpty();
	}





}
