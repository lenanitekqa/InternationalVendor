package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VendorBuyingAgreement {

    public VendorBuyingAgreement(){ PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(text(),'Vendor Buying Agreement')]")
    public WebElement VBA;

    //span[normalize-space()='Assign To Me']
//    @FindBy(xpath = "//button[@class='stibo-GraphicsButton material AssignToMeButton']")
//    public WebElement assignToMe;

    @FindBy(xpath = "//span[contains(text(),'Assign To Me')]")
    public WebElement assignToMe;

    @FindBy(id="gwt-uid-5")
    public WebElement international;

//    @FindBy(xpath="//input[@id='gwt-uid-5']")
//    public WebElement international;


    @FindBy(xpath="(//textarea[@class='gwt-TextArea'])[1]")
    public WebElement vbaMerchantContactSigner;

    @FindBy(xpath = "(//textarea[@class='gwt-TextArea'])[2]")   //"(//textarea[@rows='1'])[1]")
    public WebElement vbaMerchantContactTitle;

    @FindBy(xpath="(//textarea[@class='gwt-TextArea'])[3]")
    public WebElement vbaMerchantEmail;

    @FindBy(xpath="(//textarea[@class='gwt-TextArea'])[4]")
    public WebElement vbaVendorContactSigner;

    @FindBy(xpath = "(//textarea[@class='gwt-TextArea'])[5]")
    public WebElement vbaVendorContactTitle;

    @FindBy(xpath="(//textarea[@class='gwt-TextArea'])[6]")
    public WebElement vbaVendorEmail;

    @FindBy(id="SheetShortcutHelper-ClipboardTextBox")
    public WebElement box;

}
