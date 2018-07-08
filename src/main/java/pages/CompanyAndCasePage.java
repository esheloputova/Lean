package pages;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyAndCasePage extends Page {

  @FindBy(xpath = "//input[@id = 'mat-radio-2-input']")
  private WebElement developingAnExistingCompany;

  public static byte[] takeScreenshot(){
    return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
  }
}
