package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Validation_Page {
	
	WebDriver driver;
	
	@FindBy(how = How.TAG_NAME, using = "h2")
	WebElement confirmationMessage;
	
		
	public  Validation_Page (WebDriver driver) {
		
		this.driver = driver;
	}	
	
	public void waitValidationMessage(){
		new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOf(confirmationMessage));
	}
	
	public String getMessage() {
		
		return confirmationMessage.getText();
		
	}

}
