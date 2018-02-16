package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Elena_Sheloputova
 */
public class CreateNewCaseForm extends Page {

  @FindBy(xpath = "//input[@name='caseName']")
  WebElement nameCase;

  @FindBy(xpath = "//span[text() = 'Strategy and Project']")
  private WebElement strategyAndProjectText;

  @FindBy(xpath = "//span[text() = 'Strategy']")
  private WebElement strategyText;

  @FindBy(xpath = "//span[text() = 'Project']")
  private WebElement projectText;

  @FindBy(xpath = "//span[text() = 'Customize']")
  private WebElement customizeText;

  @FindBy(xpath = "//md-radio-button[@id='radio_0']")
  private WebElement radioButtonIwant;

  @FindBy(xpath = "//md-radio-button[@id='radio_1']")
  private WebElement radioButtonIdontWant;

  @FindBy(xpath = "//button[@type='submit']")
  private WebElement createButton;


  public CreateNewCaseForm creatingNewCase() {
    nameCase.click();
    nameCase.sendKeys("Test test");
    strategyAndProjectText.click();
    radioButtonIwant.click();
    createButton.click();
    return new CreateNewCaseForm();
  }


}
