package pages;

import configuration.ConfigProperties;
import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static java.lang.System.setProperty;

public abstract class Page {

	protected static WebDriver driver;
	protected WebDriverWait wait;
	protected Actions action;


	public Page() {

		PageFactory.initElements(getDriver(), this);

	}

	public static WebDriver getDriver() {
		if (driver == null) {
//
//			DesiredCapabilities caps = new DesiredCapabilities();
//			//Properties property = new Properties();
//			String browserName = System.getProperty("browser", "");
//			setProperty("browser", toLowerCase(setProperty("browser", browserName)));
//			if (browserName.equals("firefox") || browserName.equals("chrome") || browserName.equals("internet explorer"))
//				caps.setBrowserName(browserName);
//			else caps.setBrowserName("chrome");
//
//			URL hostURL = null;
//			try {
//				hostURL = new URL(" http://192.168.1.42:5555/wd/hub");
//			} catch (MalformedURLException e) {
//				e.printStackTrace();
//			}
//			driver = new RemoteWebDriver(hostURL, caps);

            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized"); // open Browser in maximized mode
            options.addArguments("disable-infobars"); // disabling infobars
            options.addArguments("--disable-extensions"); // disabling extensions
            options.addArguments("--disable-gpu"); // applicable to windows os only
            options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
            options.addArguments("--no-sandbox"); // Bypass OS security model

			System.setProperty("webdriver.chrome.driver", ConfigProperties.getTestProperty("chromeMac"));
			//System.setProperty("webdriver.chrome.driver", "src/test/resources/webDriver/chromedriver_linux64/chromedriver");
			driver = new ChromeDriver(options);
			options.addArguments("start-maximized");
//			driver.manage().window().maximize();
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

	public static boolean isNotElementExists(java.lang.String xpath) {
		return getDriver().findElements(By.xpath(xpath)).isEmpty();
	}


}
