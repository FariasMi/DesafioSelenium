package steps;

import pages.Form1_Page;
import pages.Form2_Page;
import pages.Form3_Page;
import pages.Form4_Page;
import pages.Form5_Page;
import pages.OpenDriver_Page;
import pages.Validation_Page;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class CaseValidateFormSteps {

	WebDriver driver;
	WebDriverWait wait;

	@Before
	public void setup() {

		driver = new OpenDriver_Page().setup();
		wait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();

	}

	@Dado("que eu estou na tela de formulário do site de insurance")
	public void que_eu_estou_na_tela_de_formulário_do_site() throws Exception {
		driver.get("http://sampleapp.tricentis.com/101/app.php");

	}

	@Quando("preencho informações válidas no formulário da aba enter Vehicle Data")
	public void preencho_informações_válidas_no_formulário_da_aba() throws Exception {
		String validPage = "Enter Vehicle Data";
		assertEquals(validPage, driver.getTitle());

		Form1_Page Form1 = PageFactory.initElements(driver, Form1_Page.class);
		Form1.selectMakeCar("BMW");
		Form1.selectModelCar("Scooter");
		Form1.typeCylinderCapacity("2000");
		Form1.typeEnginePerformance("1000");
		Form1.typeDateManufacture("06/16/2019");
		Form1.selectNumberOfSeats("2");
		Form1.choosetRightHandDrive();
		Form1.selectNumberOfSeatsMotocicle("2");
		Form1.selectFuelType("Electric Power");
		Form1.typePayload("250");
		Form1.typeTotalWeight("300");
		Form1.typeListPrice("25000");
		Form1.typeLicensePlateNumber("a4432b");
		Form1.typeAnnualMileage("125");

	}

	@Quando("clico no botão para ir para a  próxima aba enter Insurant Data")
	public void clico_no_botão_para_ir_para_a_próxima_aba_enter_insurant_data() throws Exception {

		String validPage = "Enter Vehicle Data";
		assertEquals(validPage, driver.getTitle());

		Form1_Page Form1 = PageFactory.initElements(driver, Form1_Page.class);
		Form1.waitClickButton();
		Form1.clickButtonNext1();

	}

	@Quando("preencho informações válidas no formulário da aba enter Insurant Data")
	public void preencho_informações_válidas_no_formulário_da_aba_enter_insurant_data() throws Exception {
		String validPage = "Enter Insurant Data";
		assertEquals(validPage, driver.getTitle());

		Form2_Page Form2 = PageFactory.initElements(driver, Form2_Page.class);
		Form2.waitClickButton();
		Form2.typeFirstName("Frederico");
		Form2.typeLastName("Silva");
		Form2.typebirthdate("03/20/1988");
		Form2.chooseGender();
		Form2.typeStreetAddress("Rua do Cucumber");
		Form2.typeCountryAddress("Andorra");
		Form2.typeZipCodeAddAddress("1123455");
		Form2.typeCityAddress("Canillo");
		Form2.selectOcupation("Farmer");
		Form2.chooseHobbies();
		Form2.typeWebsite("wwww.mypersonalpage.com.ad");

	}

	@Quando("clico no botão para ir para a próxima aba enter Product Data")
	public void clico_no_botão_para_ir_para_a_próxima_aba_product_data() throws Exception {
		String validPage = "Enter Insurant Data";
		assertEquals(validPage, driver.getTitle());

		Form2_Page Form2 = PageFactory.initElements(driver, Form2_Page.class);
		Form2.waitClickButton();
		Form2.clickButtonNext2();
	}

	@Quando("preencho informações válidas no formulário da aba enter Product Data")
	public void preencho_informações_válidas_no_formulário_da_aba_product_data() throws Exception {
		String validPage = "Enter Product Data";
		assertEquals(validPage, driver.getTitle());

		Form3_Page Form3 = PageFactory.initElements(driver, Form3_Page.class);
		Form3.typeStartDate("06/09/2029");
		Form3.selectInsuranceSum("35000000");
		Form3.selectMeritRatingr("Malus 10");
		Form3.selectDamageInsurance("Full Coverage");
		Form3.waitClickBox();
		Form3.chooseOptionalProducts();
		Form3.selectCourtesyCar("Yes");

	}

	@Quando("clico no botão para ir para a  próxima aba Select Price Option")
	public void clico_no_botão_para_ir_para_a_próxima_aba_select_price_option() throws Exception {
		String validPage = "Enter Product Data";
		assertEquals(validPage, driver.getTitle());

		Form3_Page Form3 = PageFactory.initElements(driver, Form3_Page.class);
		Form3.waitClickButton();
		Form3.clickButtonNext3();
	}

	@Quando("preencho informações válidas no formulário da aba Select Price Option")
	public void preencho_informações_válidas_no_formulário_da_aba_select_price_option() throws Exception {
		String validPage = "Select Price Option";
		assertEquals(validPage, driver.getTitle());

		Form4_Page Form4 = PageFactory.initElements(driver, Form4_Page.class);
		Form4.choosePriceOption();

	}

	@Quando("clico no botão para ir para a próxima aba Send Quote")
	public void clico_no_botão_para_ir_para_a_próxima_aba_send_quote() throws Exception {
		String validPage = "Select Price Option";
		assertEquals(validPage, driver.getTitle());

		Form4_Page Form4 = PageFactory.initElements(driver, Form4_Page.class);
		Form4.clickButtonNext4();
	}

	@Quando("preencho informações válidas no formulário da aba Send Quote")
	public void preencho_informações_válidas_no_formulário_da_aba_send_quote() throws Exception {
		String validPage = "Send Quote";
		assertEquals(validPage, driver.getTitle());

		Form5_Page Form5 = PageFactory.initElements(driver, Form5_Page.class);
		Form5.typeEmail("frederico.silva@teste.com");
		Form5.typephone("123456789");
		Form5.userName("Fredotaku12");
		Form5.typePassword("A1234567h");
		Form5.typePasswordAgain("A1234567h");
		Form5.typeComments("Thank you for the oportunity to learn those things!");

	}

	@Quando("clico no botão Send para enviar os formulários")
	public void pression_o_botão_send() throws Exception {
		String validPage = "Send Quote";
		assertEquals(validPage, driver.getTitle());
		Form5_Page Form5 = PageFactory.initElements(driver, Form5_Page.class);
		Form5.clickSendInfos();
	}

	@Então("deve aparecer a mensagem {string}")
	public void deve_aparecer_a_mensagem(String finalMessage) throws Exception {
		String validPage = "Send Quote";
		assertEquals(validPage, driver.getTitle());
		Validation_Page Validation = PageFactory.initElements(driver, Validation_Page.class);
		Validation.waitValidationMessage();
		assertEquals(Validation.getMessage(), finalMessage);
	}

	@After
	public void aft() {
		driver.quit();
	}

}
