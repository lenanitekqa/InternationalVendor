package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MerchantWeb;
import pages.VerificationCriteria;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.SeleniumUtils;

public class VCStepDef {

        @Then("The process should be done and move to the vendor stage and see the ID {string}")
        public void theProcessShouldBeDoneAndMoveToTheVendorStageAndSeeTheID(String vendorNum) {

                Driver.getDriver().get(ConfigReader.getProperty("urlVendor"));
                //Driver.getDriver().manage().window().maximize();
                new MerchantWeb().username.sendKeys(ConfigReader.getProperty("userVendor"));
                new MerchantWeb().password.sendKeys(ConfigReader.getProperty("passwordVendor"));
                SeleniumUtils.jsClick(new MerchantWeb().login);

                new MerchantWeb().tasks.click();
                new VerificationCriteria().vendorEnrichment.click();

                String actual = new VerificationCriteria().vendorID.getText();
                Assert.assertEquals(vendorNum,actual);

        }
}
