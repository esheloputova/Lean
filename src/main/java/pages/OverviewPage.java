package pages;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class OverviewPage extends Page {


    public static byte[] takeScreenshot(){
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }
}
