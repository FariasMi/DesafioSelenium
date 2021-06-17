package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Form2_Page {

	WebDriver driver;

	@FindBy(how = How.ID, using = "firstname")
	WebElement fName;
	@FindBy(how = How.ID, using = "lastname")
	WebElement lName;
	@FindBy(how = How.ID, using = "birthdate")
	WebElement bdate;
	@FindBy(how = How.XPATH, using = "//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span")
	WebElement genderM;
	@FindBy(how = How.ID, using = "streetaddress")
	WebElement streetAdd;
	@FindBy(how = How.ID, using = "country")
	WebElement countryAdd;
	@FindBy(how = How.ID, using = "zipcode")
	WebElement zipCodeAdd;
	@FindBy(how = How.ID, using = "city")
	WebElement cityAdd;
	@FindBy(how = How.ID, using = "occupation")
	WebElement occupation;
	@FindBy(how = How.CLASS_NAME, using = "ideal-check")
	WebElement hobbies;
	@FindBy(how = How.ID, using = "website")
	WebElement personaWebsite;
	@FindBy(how = How.ID, using = "open")
	WebElement btnSendPicture;
	@FindBy(how = How.ID, using = "picture")
	WebElement fieldSendPicture;
	@FindBy(how = How.ID, using = "nextenterproductdata")
	WebElement btnNext2;

	public Form2_Page(WebDriver driver) {

		this.driver = driver;

	}

	public void waitClickButton() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(btnNext2));
	}

	public void typeFirstName(String firstName) {
		fName.sendKeys(firstName);

	}

	public void typeLastName(String lastName) {
		lName.sendKeys(lastName);

	}

	public void typebirthdate(String date) {
		bdate.sendKeys(date);

	}

	public void chooseGender() {
		genderM.click();

	}

	public void typeStreetAddress(String sAddress) {
		streetAdd.sendKeys(sAddress);
	}

	public void typeCountryAddress(String cAddress) {
		countryAdd.sendKeys(cAddress);
	}

	public void typeZipCodeAddAddress(String zAddress) {
		zipCodeAdd.sendKeys(zAddress);
	}

	public void typeCityAddress(String ciAddress) {
		cityAdd.sendKeys(ciAddress);
	}

	public void selectOcupation(String occup) {
		Select select = new Select(occupation);
		select.selectByValue(occup);

	}

	public void chooseHobbies() {
		hobbies.click();

	}

	public void typeWebsite(String site) {
		personaWebsite.sendKeys(site);
	}

	public void clickButtonNext2() {
		btnNext2.click();

	}

}
