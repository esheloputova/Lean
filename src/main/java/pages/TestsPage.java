package pages;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Elena_Sheloputova
 */
public class TestsPage extends Page {

    @FindBy (xpath="(//button[(@type='button') and contains(@ng-click, '$ctrl.addTest({idea:idea})')])[1]")
        WebElement clickFirstButtonAddIdea;

    @FindBy (xpath="//span[text()='test results']")
        WebElement testResults;

    public TestBusinessIdeaPage addBussinesIdea() {
        clickFirstButtonAddIdea.click();

        return new TestBusinessIdeaPage();
    }

    public static byte[] takeScreenshot(){
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }

}
