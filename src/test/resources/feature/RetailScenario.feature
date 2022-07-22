@RetailFeature
Feature: Retail Page Feature

Background: 
Given User is on Retail website 
And User click on MyAccount 
When User click on Login 
And User enter username "samiullah.ayoubi1232@gmail.com" and password "12345678" 
And User click on Login button 
Then User should be logged in to MyAccount dashboard 

@RegisterAffiliatedInfo
Scenario: Register as an Affiliate user with Cheque Payment Method 
When User click on Register for an Affiliate Account link 
And User fill affiliate form with below information 
|company   |website       |taxID | paymentMethod|payeeName |
|tet       |test.com |1234       | Cheque       |test       |          
And User check on About us check box 
And User click on Continue button 
#Then User should see a success message 

@AffiliateInformation
Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer 
When User click on Edit your affiliate informationlink 
And user click on Bank Transfer radio button 
And User fill Bank information with below information 
|bankName|abaNumber    |swiftCode|accountName|accountNumber|
|BOA     |1234567899   |2589633  |TEK        |14785236999   | 
And User click on Continue buttonn 
#Then User should see a success messagee 

@EditAccountInfo
Scenario: Edit your account Information 
When User click on Edit your account information link 
And User modify below information 
|firstname|lastName|email              |telephone | 
|Zabi     |Majidi  |zabe.fast@gmail.com|8584100041|
And User click on continue buttonnn 
#Then User should see a messageee Success: Your account has been successfully updated. 


