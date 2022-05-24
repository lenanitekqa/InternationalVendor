package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AnnualBuyingAgreement {

    public AnnualBuyingAgreement (){ PageFactory.initElements(Driver.getDriver(), this);
    }

    // ABA TERMS

    @FindBy(xpath = "//span[contains(text(),'Annual Buying Agreement')]")
    public WebElement ABA;

    @FindBy(id = "stibo_tab_ABA_Terms")
    public WebElement abaTerms;

    @FindBy(xpath= "//div[@id='Merchant']//div[@class='widgetAndIconsWrapper']//div//div//select[@class='dropdown stibo-Value validator-text stibo-Value-Text mandatory']")
    public WebElement merchant;

    @FindBy(xpath="(//textarea[@class='gwt-TextArea'])[7]")
    public WebElement abaMerchantContactName;

    @FindBy(xpath = "(//textarea[@class='gwt-TextArea'])[8]")   //"(//textarea[@rows='1'])[1]")
    public WebElement abaMerchantContactTitle;

    @FindBy(xpath="(//textarea[@class='gwt-TextArea'])[9]")
    public WebElement abaMerchantEmail;

    @FindBy(xpath="(//textarea[@class='gwt-TextArea'])[10]")
    public WebElement reTypeAbaMerchantEmail;

    @FindBy(xpath="(//textarea[@class='gwt-TextArea'])[11]")
    public WebElement productToBePruchased;

    @FindBy(xpath = "(//input[@placeholder='yyyy-MM-dd'])")
    public WebElement calendar;

    @FindBy(xpath="//input[@class='gwt-TextBox validator-regexp stibo-Value-RegExp stibo-Value mandatory']")
    public WebElement VendorEstimatedAnnual;

  //Payment Terms

    @FindBy(xpath = "//div[@id='Incoterms']//select[@class='dropdown stibo-Value validator-text stibo-Value-Text mandatory']")
    public WebElement incoterms;

    @FindBy(xpath = "//div[@id='Country_of_Origin_(INCO/Pickup)']//select[@class='dropdown stibo-Value validator-text stibo-Value-Text mandatory']")
    public WebElement countryOfOrigin;

    @FindBy(xpath = "//div[@id='Primary_Term']//select[@class='dropdown stibo-Value validator-text stibo-Value-Text mandatory']")
    public WebElement primaryTerms;

    @FindBy(xpath = "//div[@id='BOL']//select[@class='dropdown stibo-Value validator-text stibo-Value-Text mandatory']")
    public WebElement bol;

    @FindBy(xpath = "//div[@id='F&D_Supply_Chain_Finance']//select[@class='dropdown stibo-Value validator-text stibo-Value-Text mandatory']")
    public WebElement supplyChainFinance;

    // New Store Program

    @FindBy(xpath = "//div[@id='New_Store_Program-_Fixed_Dollar_Amount_or_Percent?']//select[@class='dropdown stibo-Value validator-text stibo-Value-Text']")
    public WebElement newStoreDiscountFixedDollarAmountOrPercent;

    @FindBy(xpath = "//div[@id='New_Store_Discount_-_Percentage_(%_Percentage_format_=0.00)']//div[@class='widgetAndIconsWrapper']//div//div//input[@type='text']")
    public WebElement newStoreDiscountPercentage;

    //Special Even Support

    @FindBy(xpath = "//i[@class='material-icons indicator-closed']")
    public WebElement expendSection;

    @FindBy(xpath = "//div[@id='Special_Event_Support-_Fixed_Dollar_Amount_or_Percent?']//select[@class='dropdown stibo-Value validator-text stibo-Value-Text']")
    public WebElement specialEventSupportFixedDollarAmountOrPercent;

    @FindBy(xpath = "//div[@id='Special_Event_Support-_Percentage_(%_Percentage_format_=0.00)']//div[@class='widgetAndIconsWrapper']//div//div//input[@type='text']")
    public WebElement specialEventSupportPercentage;


    //Merchandising RTV and display Credit Allowances

    @FindBy(xpath = "//div[@id='RTV_Support_(Yes/No)']//select[@class='dropdown stibo-Value validator-text stibo-Value-Text mandatory']")
    public WebElement rtvSupport;

    @FindBy(xpath = "//div[@id='RTV_Support_-_Percentage_Allowance_(%_Percentage_format=0.00)']//div[@class='widgetAndIconsWrapper']//div//div//input[@type='text']")
    public WebElement rtvSupportPercentageAllowance;


    @FindBy(xpath = "//div[@id='PRV_Support_(Yes/No)']//select[@class='dropdown stibo-Value validator-text stibo-Value-Text mandatory']")
    public WebElement prvSupport;

    @FindBy(xpath = "//div[@id='PRV_Support_-_Percentage_Allowance_(%_Percentage_format=0.00)']//div[@class='widgetAndIconsWrapper']//div//div//input[@type='text']")
    public WebElement prvSupportPercentageAllowance;

    //Marketing Rebate

    @FindBy(xpath = "//div[@id='Marketing_Rebate_Program-_Fixed_Dollar_Amount_or_Percent?']//div[@class='widgetAndIconsWrapper']//div//div//div//select[@class='dropdown stibo-Value validator-text stibo-Value-Text']")
    public WebElement marketingRebateProgram;



    @FindBy(xpath = "//div[@id='Marketing_Rebate_Program_-_Percentage_(%_Percentage_format=0.00)']//div[@class='widgetAndIconsWrapper']//div//div//input[@type='text']")
    public WebElement marketingRebateProgramPercentage;


    // New Product Discount

    @FindBy (xpath ="//div[@id='New_Product_Discount_-_Percentage_(%_Percentage_format=0.00)']//input[@type='text']")
    public WebElement newProductDiscountPercentage;

    // Product Photography

    @FindBy (xpath ="//div[@id='Room_Scene_Photography_(Yes/No)']//div[@class='widgetAndIconsWrapper']//div//div//select[@class='dropdown stibo-Value validator-text stibo-Value-Text mandatory']")
    public WebElement RoomScenePhotography;


    //F&D Express


    @FindBy (xpath ="//div[@id='FDX_Vendor?']//div[@class='widgetAndIconsWrapper']//div//div//select[@class='dropdown stibo-Value validator-text stibo-Value-Text mandatory']")
    public WebElement fdxVendor;


    @FindBy (xpath ="//div[@id='Floor_&_Decor_Express-_$_per_SKU_per_new_installation_per_store_($_Amount_format=12,345,678.90)']//div[@class='widgetAndIconsWrapper']//div//div//input[@type='text']")
    public WebElement floorDecorExpressInstallation;


    @FindBy (xpath = "//div[@id='Floor_&_Decor_Express-_$_per_SKU_per_refresh_per_store_($_Amount_format=12,345,678.90)']//div[@class='widgetAndIconsWrapper']//div//div//input[@type='text']")
    public WebElement floorDecorExpressRefresh;

    // Additional Comments

    @FindBy(xpath="(//textarea[@class='gwt-TextArea'])[12]")
    public WebElement abaAdditionalComments;

    //PO Receipt Volume Rebate Program

    @FindBy(xpath = "//span[contains(text(),'PO Receipt $ Volume Rebate Program')]")
    public WebElement poReceiptVolumeRebateProgram;


    @FindBy (xpath ="//div[@class='sheet-cell']")
    public WebElement table;


public void sendKeysToTableEven(int colNo, String keysToSend) throws InterruptedException {
    Actions actions = new Actions(Driver.getDriver());
    String xpath = "(//tr[@class='even']//div[@class='sheet-cell'])["+colNo+"]";
    WebElement element = Driver.getDriver().findElement(By.xpath(xpath));
    //Thread.sleep(500);
    //SeleniumUtils.jsClick(element);
    actions.doubleClick(element).build().perform();
    Thread.sleep(500);
    actions.sendKeys(keysToSend).sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();
    Thread.sleep(500);
}

    public void sendKeysToTableOdd(int colNo, String keysToSend) throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        String xpath = "(//tr[@class='odd']//div[@class='sheet-cell'])["+colNo+"]";
        WebElement element = Driver.getDriver().findElement(By.xpath(xpath));
        //Thread.sleep(500);
        //SeleniumUtils.jsClick(element);
        actions.doubleClick(element).build().perform();
        Thread.sleep(500);
        actions.sendKeys(keysToSend).sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();
        Thread.sleep(500);
    }


@FindBy(xpath = "//i [@class='material-icons portal-alert-popup-close-box__button']")
public WebElement popupBox;




}
