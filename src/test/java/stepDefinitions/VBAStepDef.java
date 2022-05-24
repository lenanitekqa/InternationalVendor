package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.runner.notification.RunListener;
import pages.AdditionalDocuments;
import pages.VendorBuyingAgreement;
import utilities.SeleniumUtils;

import java.util.List;
import java.util.Map;

public class VBAStepDef {

    @Given("I am on VBA and should assign the task to me")
    public void iAmOnVBAAndShouldAssignTheTaskToMe() throws InterruptedException {

        // new VendorBuyingAgreement().VBA.click();
        new AdditionalDocuments().additionalDocuments.click();

        try{
            SeleniumUtils.jsClick(new VendorBuyingAgreement().assignToMe);
//            new VendorBuyingAgreement().box.click();
//            Thread.sleep(2000);
            //new VendorBuyingAgreement().assignToMe.click();
            //new VendorBuyingAgreement().box.click();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        //Thread.sleep(1000);
        new VendorBuyingAgreement().VBA.click();
    }



    @Then("I should choose International as the vendor type")
    public void iShouldChooseInternationalAsTheVendorType() throws InterruptedException {

       // SeleniumUtils.waitForVisibility(new VendorBuyingAgreement().international,2);
        SeleniumUtils.jsClick(new VendorBuyingAgreement().international);

        Thread.sleep(1000);

        //new VendorBuyingAgreement().international.click();

    }

    @Then("I should complete the VBA Merchant Information section")
    public void iShouldCompleteTheVBAMerchantInformationSection(List<Map<String, String>> dataTable)  {

// Using for loop, it tries for 3 times.
// If the element is located for the first time then it breaks from the for loop nad comeout of the loop
        for(int i=0; i<=2;i++){
            try{
                new VendorBuyingAgreement().vbaMerchantContactSigner.sendKeys(dataTable.get(0).get("vbaMerchantContactSigner"));
                new VendorBuyingAgreement().vbaMerchantContactTitle.sendKeys(dataTable.get(0).get("vbaMerchantContactTitle"));
                //Driver.getDriver().navigate().refresh();
                new VendorBuyingAgreement().vbaMerchantEmail.sendKeys(dataTable.get(0).get("vbaMerchantEmail"));
                break;
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

    }

    @Then("I should complete the VBA Vendor Information section")
    public void iShouldCompleteTheVBAVendorInformationSection(List<Map<String, String>> dataTable) {

        new VendorBuyingAgreement().vbaVendorContactSigner.sendKeys(dataTable.get(0).get("vbaVendorContactSigner"));
        new VendorBuyingAgreement().vbaVendorContactTitle.sendKeys(dataTable.get(0).get("vbaVendorContactTitle"));
        new VendorBuyingAgreement().vbaVendorEmail.sendKeys(dataTable.get(0).get("vbaVendorEmail"));


    }


}

