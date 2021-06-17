package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Form3_Page {

	WebDriver driver;

	@FindBy(how = How.ID, using = "startdate")
	WebElement sDate;
	@FindBy(how = How.ID, using = "insurancesum")
	WebElement inSum;
	@FindBy(how = How.ID, using = "meritrating")
	WebElement meritRating;
	@FindBy(how = How.ID, using = "damageinsurance")
	WebElement damageInsur;
	@FindBy(how = How.XPATH, using = "//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span")
	WebElement optionalPrds;
	@FindBy(how = How.ID, using = "courtesycar")
	WebElement courtesyCar;
	@FindBy(how = How.ID, using = "nextselectpriceoption")
	WebElement btnNext3;

	public Form3_Page(WebDriver driver) {

		this.driver = driver;

	}

	public void waitClickBox() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(optionalPrds));
	}

	public void waitClickButton() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(btnNext3));
	}

	public void typeStartDate(String date) {
		sDate.sendKeys(date);

	}

	public void selectInsuranceSum(String Sum) {
		Select select = new Select(inSum);
		select.selectByValue(Sum);

	}

	public void selectMeritRatingr(String MeritR) {
		Select select = new Select(meritRating);
		select.selectByValue(MeritR);

	}

	public void selectDamageInsurance(String damageIn) {
		Select select = new Select(damageInsur);
		select.selectByValue(damageIn);

	}
	
	public void chooseOptionalProducts() {
		optionalPrds.click();

	}
	
	public void selectCourtesyCar(String carOption) {
		Select select = new Select(courtesyCar);
		select.selectByValue(carOption);
	}
	

	public void clickButtonNext3() {
		btnNext3.click();

	}



}
