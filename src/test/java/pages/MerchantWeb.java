package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.util.List;

public class MerchantWeb {

    public MerchantWeb(){ PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id ="username-input")
    public WebElement username;

    @FindBy(id="password-input")
    public WebElement password;

    @FindBy(id="login-button")
    public WebElement login;

    @FindBy(xpath = "//i[normalize-space()='menu']")
    public WebElement menu;

    @FindBy(xpath = "//i[normalize-space()='tasks_list']")
    public WebElement tasks;

    @FindBy(xpath = "//div[contains(text(),'Merchant Decision')]")
    public WebElement decision;

    @FindBy(xpath = "//span[@class='DomainNodeCell null']")
    public WebElement vendorNames;

    @FindBy(xpath = "//span[@class='DomainNodeCell single_user_unassign']")
    public WebElement checkBox; //not sure, it should be a better way

    @FindBy(xpath="//div[contains(text(),'Vendor Enrichment Workflow - Merchant Decision - Available')]")
    public WebElement vendorEnrichmentWorkflow;

    @FindBy(xpath = "//span[@class='menulink']")
    public List<WebElement> foundationVendorID;

    @FindBy(xpath="//div[contains(text(),'Vendor Setup/Maintenance - Merchant Decision')]")
    public WebElement vendorSetupMaintenanceMerchantDecision;

    @FindBy(xpath="//div[@id='entity-summary_vCard-header']")
    public WebElement vendorDescription1;



    @FindBy(xpath = "//span[contains(text(),'V-554314')]")
    public WebElement myVendor;


    public void LoginMethod()   {

        username.sendKeys(ConfigReader.getProperty("username"));
        password.sendKeys(ConfigReader.getProperty("password"));
        SeleniumUtils.jsClick(login);
    }

}
