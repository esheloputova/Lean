package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyAndCasePage extends Page {

  @FindBy(xpath = "//input[@id = 'mat-radio-2-input']")
  private WebElement developingAnExistingCompany;
}
