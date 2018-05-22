package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

/**
 * @author Elena_Sheloputova
 */
public class ResoucesPage extends Page {

	@FindBys (@FindBy (xpath = "(//button[(@type='button') and (@aria-label='Add new card')])"))
	List<WebElement> listPluses;

	@FindBy(xpath = "(//button[(@type='button') and (@aria-label='Add new card')])[1]")
	WebElement plus1;

	@FindBy(xpath = "(//button[(@type='button') and (@aria-label='Add new card')])[2]")
	WebElement plus2;

	@FindBy(xpath = "(//button[(@type='button') and (@aria-label='Add new card')])[3]")
	WebElement plus3;




}
