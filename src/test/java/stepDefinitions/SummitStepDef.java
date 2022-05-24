package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.SummitButtons;

public class SummitStepDef {

    @Given("all the information are completed click Save, Generate VBA, and Initiate Vendor Setup")
    public void allTheInformationAreCompletedClickSaveGenerateVBAAndInitiateVendorSetup() {

       SummitButtons summitButtons = new SummitButtons();

        summitButtons.save.click();
        summitButtons.generateVBA.click();
        summitButtons.initiateVendorSetup.click();
    }
}
