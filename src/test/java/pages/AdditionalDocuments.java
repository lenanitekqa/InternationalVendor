package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdditionalDocuments {

    public AdditionalDocuments (){ PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath ="//span[normalize-space()='Additional Documents']")
    public WebElement additionalDocuments;




    @FindBy(xpath ="(//i[@title='Add Asset reference'][contains(text(),'add_circle')])[2]")
    public WebElement exclusivityAsset;

    @FindBy(xpath ="(//i[@title='Add Asset reference'][contains(text(),'add_circle')])[3]")
    public WebElement miscellaneousAsset;

}
