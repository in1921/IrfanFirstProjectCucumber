package com.SignUp.Steps_Definations;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.SignUp.Pages.GenderPom;
import com.SignUp.Pages.signupButton;
import com.SignUp.Pages.signupPom;
import com.SignUp.Utilities.CustomUtilities;
import com.SignUp.Utilities.base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebook extends base {
	
	public Facebook() {
		
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,30);
		PageFactory.initElements(factory, this);
	}
	
	// this class is fine
	
	signupPom su = new signupPom();
	GenderPom gp = new GenderPom();
	signupButton bt = new signupButton();
	

@Given("^user able to open facebook url$")
public void user_able_to_open_facebook_url() throws Throwable {
   driver.get("https://www.facebook.com");
}
  @ Given("^verfiy the title \"([^\"]*)\"$")
   public void verfiy_the_title(String title) throws Throwable {
	  //Assert.assertEquals(title, driver.getTitle());
	  sAssert.assertThat(title).isEqualTo(driver.getTitle());
	   
       
   
   
}
//
//@Then("^user able to write first name into the first name field$")
//public void user_able_to_write_first_name_into_the_first_name_field() throws Throwable {
//	
//	su.FirstName.sendKeys("irfan");
//}
//
//@Then("^user able to write lastname into the last name field$")
//public void user_able_to_write_lastname_into_the_last_name_field() throws Throwable {
//	su.LastName.sendKeys("nigah");
//   
//}
//
//@Then("^user able to write phone number or email address into the field$")
//public void user_able_to_write_phone_number_or_email_address_into_the_field() throws Throwable {
//	su.Emailorphone.sendKeys("irfankhan.va@gmail.com");
//    
//}
//
//@When("^user able to re-write into the phone or email address field$")
//public void user_able_to_re_write_into_the_phone_or_email_address_field() throws Throwable {
//    su.Reenteremailorphone.sendKeys("irfankhan.va@gmail.com");
//}
//
//@When("^select the passord into the password field$")
//public void select_the_passord_into_the_password_field() throws Throwable {
//	su.password.sendKeys("Irfankhan");
//}
//
//	
//	@Given("^user select gender$")
//	public void user_select_gender() throws Throwable {
//		gp.radio.click();
//	    
//	}
//
//	@Given("^user is able to click signup button$")
//	public void user_is_able_to_click_signup_button() throws Throwable {
//	    bt.signbutton.click();
//	    
//	    driver.quit();
//		driver.close();
//	}


	
   


@Then("^user able to write \"([^\"]*)\" into the first name field$")
public void user_able_to_write_into_the_first_name_field(String FirstName) throws Throwable {
	//CustomUtilities.fluentWait(su.FirstName);
	CustomUtilities.highlightElement(su.FirstName);
	su.FirstName.sendKeys(FirstName);
   
   // Assert.assertEquals(FirstName, su.FirstName.getAttribute("value"));
}

    		@Then("^user able to write lastname into the \"([^\"]*)\" field$")
public void user_able_to_write_lastname_into_the_field(String LastName) throws Throwable {
	su.LastName.sendKeys(LastName);
	//Assert.assertEquals(LastName, su.LastName.getAttribute("value"));
} 

@Then("^user able to write \"([^\"]*)\" into the field$")
public void user_able_to_write_into_the_field(String emailaddress) throws Throwable {
   su.Emailorphone.sendKeys(emailaddress);
   
}

@When("^user able to re-write into the \"([^\"]*)\" field$")
public void user_able_to_re_write_into_the_field(String Reenteremailaddress) throws Throwable {
	su.Reenteremailorphone.sendKeys(Reenteremailaddress);
}

@When("^select the passord into the \"([^\"]*)\" field$")
public void select_the_passord_into_the_field(String password) throws Throwable {
    su.password.sendKeys(password);
}
}




