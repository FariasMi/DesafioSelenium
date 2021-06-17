package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Form5_Page {
	
	@FindBy(how = How.ID, using = "email")
	WebElement email;
	@FindBy(how = How.ID, using = "phone")
	WebElement telephone;
	@FindBy(how = How.ID, using = "username")
	WebElement userName;
	@FindBy(how = How.ID, using = "password")
	WebElement passwrd;
	@FindBy(how = How.ID, using = "confirmpassword")
	WebElement confirmPasswrd;
	@FindBy(how = How.ID, using = "Comments")
	WebElement comments;
	@FindBy(how = How.ID, using = "sendemail")
	WebElement sEmail;
	
	
	public void typeEmail(String yourEmail) {
		email.sendKeys(yourEmail);

	}
	public void typephone(String phoneNumber) {
		telephone.sendKeys(phoneNumber);

	}
	public void userName(String user) {
		userName.sendKeys(user);

	}
	public void typePassword(String pass) {
		passwrd.sendKeys(pass);

	}
	public void typePasswordAgain(String passAgain) {
		confirmPasswrd.sendKeys(passAgain);

	}
	public void typeComments(String comment) {
		comments.sendKeys(comment);

	}
	
	public void clickSendInfos() {
		sEmail.click();
;

	}


}





