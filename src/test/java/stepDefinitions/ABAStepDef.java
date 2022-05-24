package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import pages.AnnualBuyingAgreement;
import utilities.SeleniumUtils;

import java.util.List;
import java.util.Map;

public class ABAStepDef {


    @Given("I am on the ABA Terms")
    public void iAmOnTheABATerms() {

        new AnnualBuyingAgreement().ABA.click();
        new AnnualBuyingAgreement().abaTerms.click();

    }

    @Then("I complete the ABA Merchant section and select merchant {string}")
    public void iCompleteTheABAMerchantSectionAndSelectMerchant(String merchant,List<Map<String, String>> dataTable)  {

        Select select = new Select(new AnnualBuyingAgreement().merchant);
        select.selectByVisibleText(merchant);

        new AnnualBuyingAgreement().abaMerchantContactName.sendKeys(dataTable.get(0).get("abaMerchantContactName"));
        new AnnualBuyingAgreement().abaMerchantContactTitle.sendKeys(dataTable.get(0).get("abaMerchantContactTitle"));
        new AnnualBuyingAgreement().abaMerchantEmail.sendKeys(dataTable.get(0).get("abaMerchantEmail"));
        new AnnualBuyingAgreement().reTypeAbaMerchantEmail.sendKeys(dataTable.get(0).get("reTypeAbaMerchantEmail"));
        new AnnualBuyingAgreement().productToBePruchased.sendKeys(dataTable.get(0).get("productToBePruchased"));
        new AnnualBuyingAgreement().calendar.sendKeys(dataTable.get(0).get("calendar"));
        new AnnualBuyingAgreement().VendorEstimatedAnnual.sendKeys(dataTable.get(0).get("VendorEstimatedAnnual"));

    }

    @Then("I complete the Payment Terms section")
    public void iCompleteThePaymentTermsSection(List<Map<String, String>> dataTable)  {

        new AnnualBuyingAgreement().incoterms.sendKeys(dataTable.get(0).get("incoterms"));
        new AnnualBuyingAgreement().countryOfOrigin.sendKeys(dataTable.get(0).get("countryOfOrigin"));
        new AnnualBuyingAgreement().primaryTerms.sendKeys(dataTable.get(0).get("primaryTerms"));
        new AnnualBuyingAgreement().bol.sendKeys(dataTable.get(0).get("bol"));
        new AnnualBuyingAgreement().supplyChainFinance.sendKeys(dataTable.get(0).get("supplyChainFinance"));
    }

    @Then("I complete the New Store Program section by choosing {string} and {string} amount")
    public void iCompleteTheNewStoreProgramSectionByChoosingAndAmount(String NSFixOrDollarAmount, String Percentage)  {

        SeleniumUtils.scroll(0,250);

        Select select = new Select(new AnnualBuyingAgreement().newStoreDiscountFixedDollarAmountOrPercent);
        select.selectByVisibleText(NSFixOrDollarAmount);

        new AnnualBuyingAgreement().newStoreDiscountPercentage.sendKeys(Percentage);

    }

    @Then("I complete the Special Event Support section by choosing {string} and {string} amount")
    public void iCompleteTheSpecialEventSupportSectionByChoosingAndAmount(String FixOrDollarAmount, String Percentage) {

        SeleniumUtils.scroll(0,700);

//        new AnnualBuyingAgreement().expendSection.click();
        SeleniumUtils.jsClick(new AnnualBuyingAgreement().expendSection);

        Select select = new Select(new AnnualBuyingAgreement().specialEventSupportFixedDollarAmountOrPercent);
        select.selectByVisibleText(FixOrDollarAmount);
        new AnnualBuyingAgreement().specialEventSupportPercentage.sendKeys(Percentage);

    }

    @Then("I complete the Merchandising RTV by choosing {string} and percentage allowance {string}")
    public void iCompleteTheMerchandisingRTVByChoosingAndPercentageAllowance(String answer, String amount)  {

        SeleniumUtils.scroll(0,500);

        Select select1stBox = new Select(new AnnualBuyingAgreement().rtvSupport);
        select1stBox.selectByVisibleText(answer);
        SeleniumUtils.jsClick(new AnnualBuyingAgreement().rtvSupportPercentageAllowance);
        new AnnualBuyingAgreement().rtvSupportPercentageAllowance.sendKeys(amount);

      }

    @And("On display Credit Allowances I am choosing {string} and percentage allowance {string}")
    public void onDisplayCreditAllowancesIAmChoosingAndPercentageAllowance(String answer, String amount)  {

        Select select2ndBox = new Select(new AnnualBuyingAgreement().prvSupport);
        select2ndBox.selectByVisibleText(answer);
        SeleniumUtils.jsClick(new AnnualBuyingAgreement().prvSupportPercentageAllowance);
        new AnnualBuyingAgreement().prvSupportPercentageAllowance.sendKeys(amount);

    }

    @Then("I complete the Marketing Rebate section by choosing {string} and {string} amount")
    public void iCompleteTheMarketingRebateSectionByChoosingAndAmount(String FixOrDollarAmount, String Percentage)  {

        SeleniumUtils.scroll(0, 500);
        Select select = new Select(new AnnualBuyingAgreement().marketingRebateProgram);
        select.selectByVisibleText(FixOrDollarAmount);
        SeleniumUtils.jsClick(new AnnualBuyingAgreement().marketingRebateProgramPercentage);
        new AnnualBuyingAgreement().marketingRebateProgramPercentage.sendKeys(Percentage);
      }

    @Then("I enter the New Product Discount Percentage {string}")
    public void iEnterTheNewProductDiscountPercentage(String value){

        SeleniumUtils.scroll(0,250);
        new AnnualBuyingAgreement().newProductDiscountPercentage.sendKeys(value);

    }
    @Then("I choose {string} in the Room Scene Photography")
    public void iChooseInTheRoomScenePhotography(String answer) {

        SeleniumUtils.scroll(0,250);
        Select select = new Select(new AnnualBuyingAgreement().RoomScenePhotography);
        select.selectByVisibleText(answer);
         }


    @Then("I complete the FandD Express section by choosing {string} under FDX vendor and pass the {string} and {string}")
    public void iCompleteTheFandDExpressSectionByChoosingUnderFDXVendorAndPassTheAnd(String answer, String amount1, String amount2) {

        SeleniumUtils.scroll(0, 700);
        Select select = new Select(new AnnualBuyingAgreement().fdxVendor);
        select.selectByVisibleText(answer);

        SeleniumUtils.waitForVisibility(new AnnualBuyingAgreement().floorDecorExpressInstallation,5);
        SeleniumUtils.jsClick(new AnnualBuyingAgreement().floorDecorExpressInstallation);
        new AnnualBuyingAgreement().floorDecorExpressInstallation.sendKeys(amount1);
        SeleniumUtils.scroll(0,250);
        SeleniumUtils.waitForVisibility(new AnnualBuyingAgreement().floorDecorExpressRefresh,5);
        SeleniumUtils.jsClick(new AnnualBuyingAgreement().floorDecorExpressRefresh);
        new AnnualBuyingAgreement().floorDecorExpressRefresh.sendKeys(amount2);

    }

    @Then("I complete the Comments section by sending {string}")
    public void iCompleteTheCommentsSectionBySending(String message)  {

        SeleniumUtils.scroll(0, 250);
        SeleniumUtils.jsClick(new AnnualBuyingAgreement().abaAdditionalComments);
        new AnnualBuyingAgreement().abaAdditionalComments.sendKeys(message);
        }

    @Then("I complete the PO Receipt Volume Rebate Program")
    public void iCompleteThePOReceiptVolumeRebateProgram() throws InterruptedException {

        new AnnualBuyingAgreement().poReceiptVolumeRebateProgram.click();

        AnnualBuyingAgreement annualBuyingAgreement = new AnnualBuyingAgreement();


        annualBuyingAgreement.sendKeysToTableEven(2,"0.00");
        Thread.sleep(5000);
        annualBuyingAgreement.sendKeysToTableEven(3,"10,000,000.00");
        Thread.sleep(2000);
        annualBuyingAgreement.sendKeysToTableEven(4,"0.01");

        annualBuyingAgreement.sendKeysToTableOdd(2,"10,000,000.01");
        Thread.sleep(2000);
        annualBuyingAgreement.sendKeysToTableOdd(3,"20,000,000.00");
        Thread.sleep(2000);
        annualBuyingAgreement.sendKeysToTableOdd(4,"0.02");

        annualBuyingAgreement.sendKeysToTableEven(8,"20,000,000.01");
        Thread.sleep(2000);
        annualBuyingAgreement.sendKeysToTableEven(9,"50,000,000.00");
        Thread.sleep(2000);
        annualBuyingAgreement.sendKeysToTableEven(10,"0.03");

        Thread.sleep(2000);

        new AnnualBuyingAgreement().popupBox.click();
    }

}
