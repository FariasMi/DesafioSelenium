package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Form4_Page {

	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span")
	WebElement priceOpt;	
	@FindBy(how = How.ID, using = "nextsendquote")
	WebElement btnNext4;
	
	public Form4_Page(WebDriver driver) {

		this.driver = driver;

	}
	
	public void choosePriceOption() {
		priceOpt.click();

	}

	public void clickButtonNext4() {
		btnNext4.click();

	}

}

