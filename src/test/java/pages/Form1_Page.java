package pages;


import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Form1_Page {

	WebDriver driver;
	
	
	
	@FindBy(how = How.ID, using = "make")
	WebElement makeCar;
	@FindBy(how = How.ID, using = "model")
	WebElement modelCar;
	@FindBy(how = How.ID, using = "cylindercapacity")
	WebElement cylinderCap;
	@FindBy(how = How.ID, using = "engineperformance")
	WebElement enginePerf;
	@FindBy(how = How.ID, using = "dateofmanufacture")
	WebElement dateManufacture;
	@FindBy(how = How.ID, using = "numberofseats")
	WebElement numberSeats;
	@FindBy(how = How.CLASS_NAME, using = "ideal-radio")
	WebElement rightYes;
	@FindBy(how = How.ID, using = "righthanddriveno")
	WebElement rightNo;
	@FindBy(how = How.ID, using = "numberofseatsmotorcycle")
	WebElement numberSeatsMoto;
	@FindBy(how = How.ID, using = "fuel")
	WebElement fuelType;
	@FindBy(how = How.ID, using = "payload")
	WebElement payloadCar;
	@FindBy(how = How.ID, using = "totalweight")
	WebElement totalWeight;
	@FindBy(how = How.ID, using = "listprice")
	WebElement listPrice;
	@FindBy(how = How.ID, using = "licenseplatenumber")
	WebElement licenseNumber;
	@FindBy(how = How.ID, using = "annualmileage")
	WebElement anualMiliAge;
	@FindBy(how = How.ID, using = "nextenterinsurantdata")
	WebElement btnNext1;
	@FindBy(how = How.TAG_NAME, using = "title")
	WebElement titlePage;
	
	
	
	public Form1_Page(WebDriver driver) {

		this.driver = driver;

	}
	
	public void waitClickBox(){
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(rightYes));
	}

	public void waitClickButton(){
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(btnNext1));
	}

	public void selectMakeCar(String car ) {
		Select select = new Select(makeCar);
		select.selectByValue(car);

	}

	public void selectModelCar(String carModel) {
		Select select = new Select(modelCar);
		select.selectByValue(carModel);

	}

	public void typeCylinderCapacity(String typeC) {
		cylinderCap.sendKeys(typeC);

	}

	public void typeEnginePerformance(String engineP) {
		enginePerf.sendKeys(engineP);

	}

	public void typeDateManufacture(String date) {
		dateManufacture.sendKeys(date);

	}

	public void selectNumberOfSeats(String nSeats) {
		Select select = new Select(numberSeats);
		select.selectByValue(nSeats);

	}

	public void choosetRightHandDrive() {
		rightYes.click();

	}

	public void selectNumberOfSeatsMotocicle(String nSeatsM) {
		Select select = new Select(numberSeatsMoto);
		select.selectByValue(nSeatsM);

	}

	public void selectFuelType(String fuelT) {
		Select select = new Select(fuelType);
		select.selectByValue(fuelT);

	}

	public void typePayload(String pLoad) {
		payloadCar.sendKeys(pLoad);
	}

	public void typeTotalWeight(String totalW) {
		totalWeight.sendKeys(totalW);
	}

	public void typeListPrice(String tListP) {
		listPrice.sendKeys(tListP);

	}

	public void typeLicensePlateNumber(String licenseN) {
		licenseNumber.sendKeys(licenseN);

	}

	public void typeAnnualMileage(String AMileAge) {
		anualMiliAge.sendKeys(AMileAge);
	}

	public void clickButtonNext1() {
		btnNext1.click();

	}
	

	

}
