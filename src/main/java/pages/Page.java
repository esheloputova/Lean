package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public abstract class Page {

	protected static WebDriver driver;
	protected WebDriverWait wait;
	protected Actions action;


	public Page() {

		PageFactory.initElements(getDriver(), this);

	}

	public static WebDriver getDriver() {
		if (driver == null) {
			System.setProperty("webDriver.chrome.driver", "src/test/resources/webDriver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		return driver;


/*
замедление выполнения каждого действия, по умочанию 2 мин
			regularDriver1 = new HighlightingWrapper(new ChromeDriver());
//			EventFiringWebDriver driver = new EventFiringWebDriver(regularDriver1);
//			driver.register(new ListenerThatWaitsBeforeAnyAction(500000, TimeUnit.SECONDS));

			regularDriver1.manage().window().maximize();
//			regularDriver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		return regularDriver1;
*/
	}

	public WebDriverWait justWait() {
		if (wait == null) {
			wait = new WebDriverWait(driver, 10);
		}
		return wait;
	}

	public Actions doubleAction() {
		if (action == null) {
			action = new Actions(driver);
		}
		return action;
	}

	public static boolean isNotElementExists(String xpath) {
		return getDriver().findElements(By.xpath(xpath)).isEmpty();
	}


}
