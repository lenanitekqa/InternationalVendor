Feature: Merchant related features

  Scenario: Complete the Merchant Decision section

    Given I am on the homepage
    When I am on login page I filling out user and password and click login button
    Then I should be able to click on task and Merchant Decision and land on the Vendor Enrichment Workflow page
    Then Based on the "V-558282" I should be able to access the correct vendor
    Then I should land on Vendor "2000Test1 INTL Vessel FOB"
#  Complete the Vendor Buyer Agreement section
    Then I am on VBA and should assign the task to me
    Then I should choose International as the vendor type
    Then I should complete the VBA Merchant Information section
        | vbaMerchantContactSigner | vbaMerchantContactTitle | vbaMerchantEmail              |
        | Mark Smith               | VP                      | Magda.Nitek@flooranddecor.com |
      Then I should complete the VBA Vendor Information section
        | vbaVendorContactSigner | vbaVendorContactTitle | vbaVendorEmail         |
        | Sue Smith              | SVP                   | lenaniteqa@hotmail.com |
#Complete the Annual Buyer Agreement section
    Then I am on the ABA Terms
    Then I complete the ABA Merchant section and select merchant "Erin White"
      | abaMerchantContactName | abaMerchantContactTitle | abaMerchantEmail              | reTypeAbaMerchantEmail        | productToBePruchased | calendar   | VendorEstimatedAnnual |
      | Bob Patrick            | MGR                     | Magda.Nitek@flooranddecor.com | Magda.Nitek@flooranddecor.com | Tile                 | 2022-07-01 | 15,000,000.00         |
    Then I complete the Payment Terms section
      | incoterms         | countryOfOrigin | primaryTerms | bol | supplyChainFinance |
      | FOB-FREE ON BOARD | China           | NET 60       | Yes | No                 |

    Then I complete the New Store Program section by choosing "Percent %" and "1.02" amount
    Then I complete the Special Event Support section by choosing "Percent %" and "1.02" amount
    Then I complete the Merchandising RTV by choosing "Yes" and percentage allowance "1.03"
    Then On display Credit Allowances I am choosing "Yes" and percentage allowance "1.04"
    Then I complete the Marketing Rebate section by choosing "Percent %" and "1.05" amount
    Then I enter the New Product Discount Percentage "1.06"
    Then I choose "Yes" in the Room Scene Photography
    Then I complete the FandD Express section by choosing "Yes" under FDX vendor and pass the "101.00" and "102.00"
    Then I complete the Comments section by sending "message"
    Then I complete the PO Receipt Volume Rebate Program

# Complete the Non Disclosure Agreement section
     Then I am on Non Disclosure Agreement and I upload the NDA Asset
     When I click on upload and insert asset folder
     Then I should be able to navigate to the Vendor's Assets folder and click ok
     Then I should be able to upload the file from the following path "C:\\Project1\\NDAAsset.txt"

# Complete the Additional Documents section

    Then I am on Additional Documents and I upload the Exclusivity Asset documents
    When I click on upload and insert asset folder
    Then I should be able to navigate to the Vendor's Assets folder and click ok
    Then I should be able to upload the file form the following path EA "C:\\Project1\\Exclusivity Asset.txt"

#Complete the Additional Documents section
  Then I upload Miscellaneous Asset documents
  When I click on upload and insert asset folder
  Then I should be able to navigate to the Vendor's Assets folder and click ok
  Then I should be able to upload the file from the following path MA "C:\\Project1\\Miscellaneous Asset.txt"
#  Scenario: Complete the process
#  Given all the information are completed click Save, Generate VBA, and Initiate Vendor Setup
#  Then The process should be done and move to the vendor stage and see the ID "V-558282"
#



