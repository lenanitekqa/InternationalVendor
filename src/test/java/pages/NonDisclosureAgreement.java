package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class NonDisclosureAgreement {

    public NonDisclosureAgreement (){ PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath =" //span[normalize-space()='Non-Disclosure Agreement']")
    public WebElement nonDisclosureAgreement;



    @FindBy(xpath ="(//i[@title='Add Asset reference'][normalize-space()='add_circle'])[1]")
    public WebElement ndaAssetPlusSign;


     @FindBy(xpath ="(//div[@class='hover-context-menu__item']")
     public WebElement entireBox;


    @FindBy(xpath ="//div[contains(text(),'Upload and insert asset')]")
    public WebElement uploadAndInsertAsset;

    @FindBy(xpath ="//i[@class='material-icons NodePickerIcon']")
    public WebElement nodePicker;

    @FindBy(id ="tree_expanded_node_SupplierRoot")
    public WebElement nodeSupplierRoot;

    @FindBy(id ="tree_expanded_node_New_Vendor1")
    public WebElement newVendor;

    @FindBy( xpath ="//div[@class='treeItem treeItem-classification treeItem-objecttype-vendorassetroot']")
    public WebElement newVendorAssets;

    @FindBy(xpath ="//span[contains(text(),'OK')]")
    public WebElement ok;

    @FindBy(xpath ="//input[@name='upload']")
    public WebElement chooseFile;

    @FindBy(xpath ="//button[@class='stibo-GraphicsButton']")
    public WebElement upload;




}
