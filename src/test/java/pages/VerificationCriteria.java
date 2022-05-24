package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerificationCriteria {



@FindBy(xpath = "//div[@id='entity-summary_vCard-header']")
public WebElement summaryVcardHeader;

@FindBy(xpath = "//div[@class='gwt-Label status-group-item-table-title-panel__status-label'][normalize-space()='Vendor Enrichment']")
public WebElement vendorEnrichment;

@FindBy(xpath = "//span[@class='menulink']")
public WebElement vendorID;







}
