package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.NonDisclosureAgreement;
import utilities.SeleniumUtils;

public class NDAStepDef {

    @Given("I am on Non Disclosure Agreement and I upload the NDA Asset")
    public void iAmOnNonDisclosureAgreementAndIUploadTheNDAAsset() throws InterruptedException {

        NonDisclosureAgreement nda = new NonDisclosureAgreement();

        nda.nonDisclosureAgreement.click();
        SeleniumUtils.jsClick(nda.ndaAssetPlusSign);

        Thread.sleep(5000);

    }

    @When("I click on upload and insert asset folder")
    public void iClickOnUploadAndInsertAssetFolder() throws InterruptedException {

        NonDisclosureAgreement nda = new NonDisclosureAgreement();

        SeleniumUtils.jsClick(nda.uploadAndInsertAsset);
        nda.nodePicker.click();

        Thread.sleep(2000);

    }

    @Then("I should be able to navigate to the Vendor's Assets folder and click ok")
    public void iShouldBeAbleToNavigateToTheVendorSAssetsFolderAndClickOk() {

        NonDisclosureAgreement nda = new NonDisclosureAgreement();

        nda.nodeSupplierRoot.click();
        SeleniumUtils.jsClick(nda.newVendor);
        SeleniumUtils.jsClick(nda.newVendorAssets);
        SeleniumUtils.jsClick(nda.ok);
    }

//    @Then("I should be able to upload the file")
//    public void iShouldBeAbleToUploadTheFile() throws InterruptedException {
//
//
//
//        WebElement upload_file = new NonDisclosureAgreement().chooseFile;
//        upload_file.sendKeys("C:\\Users\\magda\\Desktop\\FloorAndDecor\\Exclusivity Asset.docx");
//        new NonDisclosureAgreement().upload.click();
//
//        Thread.sleep(2000);
//    }

    @Then("I should be able to upload the file from the following path {string}")
    public void iShouldBeAbleToUploadTheFileFromTheFollowingPath(String path) throws InterruptedException {


        WebElement upload_file = new NonDisclosureAgreement().chooseFile;
        upload_file.sendKeys(path);
        new NonDisclosureAgreement().upload.click();

        Thread.sleep(1000);
    }
}
