package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.MerchantWeb;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class MerchantStepDef {

    @Given("I am on the homepage")
    public void iAmOnTheHomepage(){

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        //Driver.getDriver().manage().window().maximize();
    }

    @When("I am on login page I filling out user and password and click login button")
    public void i_am_on_login_page_i_filling_out_user_and_password_and_click_login_button() throws InterruptedException {

        new MerchantWeb().LoginMethod();
    }

    @Then("I should be able to click on task and Merchant Decision and land on the Vendor Enrichment Workflow page")
    public void iShouldBeAbleToClickOnTaskAndMerchantDecisionAndLandOnTheVendorEnrichmentWorkflowPage() {


      new MerchantWeb().tasks.click();
      new MerchantWeb().decision.click();
    }

    @Then("Based on the {string} I should be able to access the correct vendor")
    public void basedOnTheIShouldBeAbleToAccessTheCorrectVendor(String vendor) {


        List<WebElement> vendorIdentification = new MerchantWeb().foundationVendorID;

        for (WebElement option:vendorIdentification) {
            if(option.getText().equalsIgnoreCase(vendor)){
            option.click(); }
        }
        }

//    @Then("I should land on Vendor Setup Maintenance - Merchant Decision {string} and {string}")
//    public void iShouldLandOnVendorSetupMaintenanceMerchantDecisionAnd(String title1, String title2) {
//
//        //String expected = "Vendor Setup/Maintenance - Merchant Decision";
//        String actual = new MerchantWeb().vendorSetupMaintenanceMerchantDecision.getText();
//        Assert.assertEquals(title1,actual);
//
//        //String expected1 = "2000Test INTL Vessel FOB";
//        String actual1 = new MerchantWeb().vendorDescription1.getText();
//        Assert.assertEquals(title2,actual);
//    }


    @Then("I should land on Vendor {string}")
    public void iShouldLandOnVendor(String vendorName) {

        String actual = new MerchantWeb().vendorDescription1.getText();
        Assert.assertEquals(vendorName,actual);
    }
}

