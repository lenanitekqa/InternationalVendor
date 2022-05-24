package stepDefinitions;

import pages.AdditionalDocuments;
import pages.NonDisclosureAgreement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import utilities.SeleniumUtils;

public class ADStepDef {

    @Given("I am on Additional Documents and I upload the Exclusivity Asset documents")
    public void iAmOnAdditionalDocumentsAndIUploadTheExclusivityAssetDocuments() throws InterruptedException {

        new AdditionalDocuments().additionalDocuments.click();
        new AdditionalDocuments().exclusivityAsset.click();

        Thread.sleep(2000);
    }

//    @Then("I should be able to upload the file for Exclusivity Asset")
//    public void iShouldBeAbleToUploadTheFileForExclusivityAsset() {
//
//        WebElement upload_file = new NonDisclosureAgreement().chooseFile;
//        upload_file.sendKeys("C:\\Users\\magda\\Desktop\\FloorAndDecor\\Exclusivity Asset.docx");
//        new NonDisclosureAgreement().upload.click();
//    }

    @Then("I should be able to upload the file form the following path EA {string}")
    public void iShouldBeAbleToUploadTheFileFormTheFollowingPathEA(String path) throws InterruptedException {

        WebElement upload_file = new NonDisclosureAgreement().chooseFile;
        upload_file.sendKeys(path);
        new NonDisclosureAgreement().upload.click();
        Thread.sleep(2000);

    }

    @And("I upload Miscellaneous Asset documents")
    public void iUploadMiscellaneousAssetDocuments() throws InterruptedException {

        new AdditionalDocuments().additionalDocuments.click();
        SeleniumUtils.jsClick(new AdditionalDocuments().miscellaneousAsset);
        Thread.sleep(2000);

    }
//    @Then("I should be able to upload the file for Miscellaneous Asset")
//    public void iShouldBeAbleToUploadTheFileForMiscellaneousAsset() {
//
//        WebElement upload_file = new NonDisclosureAgreement().chooseFile;
//        upload_file.sendKeys("C:\\Users\\magda\\Desktop\\FloorAndDecor\\Miscellaneous Asset.docx");
//        new NonDisclosureAgreement().upload.click();

//    }

    @Then("I should be able to upload the file from the following path MA {string}")
    public void iShouldBeAbleToUploadTheFileFromTheFollowingPathMA(String path) throws InterruptedException {

        WebElement upload_file = new NonDisclosureAgreement().chooseFile;
        upload_file.sendKeys(path);
        new NonDisclosureAgreement().upload.click();
        Thread.sleep(2000);
    }
}
