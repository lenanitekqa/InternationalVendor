package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SummitButtons {

    public SummitButtons (){ PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(text(),'Generate VBA')]")
    public WebElement generateVBA;

    @FindBy(xpath = "//span[contains(text(),'Initiate Vendor Setup')]")
    public WebElement initiateVendorSetup;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    public WebElement save;
}
