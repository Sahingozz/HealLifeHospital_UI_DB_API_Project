package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

public class PatientPage extends Base {


    @FindBy(xpath = "(//h3[@class='box-tab-title'])[1]")
    public WebElement bloodIssueText;

    @FindBy(xpath = "(//ul[@class='nav nav-tabs']//li)[2]")
    public WebElement componentIssueButton;

    @FindBy(xpath = "(//div[@class='box-tab-header']//h3)[2]")
    public WebElement componentIssueText;

    //-----------------Zafer

    //Patient -> user(patient) login username
    @FindBy(xpath = "//input[@name='username']")
    public WebElement patientLoginUsername;

    //Patient -> user(patient) login password
    @FindBy(xpath = "//input[@name='password']")
    public WebElement patientLoginPassword;

    //Patient -> user (patient) login submit buton
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement patientSigninSubmit;

    //Patient Dashboard ->Blood Bank Link
    @FindBy(xpath = "//span[text()=' Blood Bank']")
    public WebElement patientBloodBankLink;

    // Patient->Blood Bank->Blood Issue Link
    @FindBy(xpath = "//a[@href='#bloodissue']")
    public WebElement patientBloodIssueLink;

    //Patient->Blood Bank->patient ID
    @FindBy(xpath = "//b[text()='Patient Id']")
    public WebElement BloodBankPatientId;

    //Patient->Blood Bank->patient ID bilgi
    @FindBy(xpath = "(//a[@class='pull-right text-aqua'])[1]")
    public WebElement BloodBankPatientIdBilgi;

    //Patient->Blood Bank->patient Gender
    @FindBy(xpath = "//b[text()='Gender']")
    public WebElement BloodBankGender;

    //Patient->Blood Bank->patient Gender bilgi
    @FindBy(xpath = "(//a[@class='pull-right text-aqua'])[2]")
    public WebElement BloodBankPatientGenderBilgi;

    //Patient->Blood Bank->patient Marital Status
    @FindBy(xpath = "//b[text()='Marital Status']")
    public WebElement BloodBankMaritalStatus;

    //Patient->Blood Bank->patient Marital Status bilgi
    @FindBy(xpath = "(//a[@class='pull-right text-aqua'])[3]")
    public WebElement BloodBankPatientMaritalStatusBilgi;

    //Patient->Blood Bank->patient Phone
    @FindBy(xpath = "//b[text()='Phone']")
    public WebElement BloodBankPhone;

    //Patient->Blood Bank->patient Phone bilgi
    @FindBy(xpath = "(//a[@class='pull-right text-aqua'])[4]")
    public WebElement BloodBankPatientPhoneBilgi;

    //Patient->Blood Bank->patient Email
    @FindBy(xpath = "//b[text()='Email']")
    public WebElement BloodBankEmail;

    //Patient->Blood Bank->patient Email bilgi
    @FindBy(xpath = "(//a[@class='pull-right text-aqua'])[5]")
    public WebElement BloodBankPatientEmailBilgi;

    //Patient->Blood Bank->patient Address
    @FindBy(xpath = "//b[text()='Email']")
    public WebElement BloodBankAddress;

    //Patient->Blood Bank->patient Address bilgi
    @FindBy(xpath = "(//a[@class='pull-right text-aqua'])[6]")
    public WebElement BloodBankPatientAddressBilgi;

    //Patient->Blood Bank->patient Age
    @FindBy(xpath = "//b[text()='Age']")
    public WebElement Age;

    //Patient->Blood Bank->patient Age bilgi
    @FindBy(xpath = "(//a[@class='pull-right text-aqua'])[7]")
    public WebElement BloodBankPatientAgeBilgi;

    //Patient->Blood Bank->patient Guardian Name
    @FindBy(xpath = "//b[text()='Guardian Name']")
    public WebElement GuardianName;

    //Patient->Blood Bank->patient Guardian Name Bilgi
    @FindBy(xpath = "(//a[@class='pull-right text-aqua'])[8]")
    public WebElement BloodBankGuardianNameBilgi;

    //Patient->Blood Bank-> Component Issue Link
    @FindBy (xpath = "//a[@href='#activity']")
    public WebElement componentIssueLink;

    public void WebElementVisibility() {
        WebElement[] elements = {
                BloodBankPatientId,
                BloodBankPatientIdBilgi,
                BloodBankGender,
                BloodBankPatientGenderBilgi,
                BloodBankMaritalStatus,
                BloodBankPatientMaritalStatusBilgi,
                BloodBankPhone,
                BloodBankPatientPhoneBilgi,
                BloodBankEmail,
                BloodBankPatientEmailBilgi,
                BloodBankAddress,
                BloodBankPatientAddressBilgi,
                Age,
                BloodBankPatientAgeBilgi,
                GuardianName,
                BloodBankGuardianNameBilgi,

        };
        for (WebElement element : elements) {
            String elementName = element.toString();
            Assert.assertTrue(element.isDisplayed(), "Element görünmüyor: " + elementName);
        }
    }

    //Patient -> Blood Bank -> Blood Issue List ->Bill No
    @FindBy (xpath = "(//*[text()='Bill No'])[1]")
    public WebElement billNo;


    //Patient -> Blood Bank -> Blood Issue List ->Received To
    @FindBy (xpath = "(//*[text()='Received To'])[1]")
    public WebElement receivedTo;


    //Patient -> Blood Bank -> Blood Issue List ->Issue Date
    @FindBy (xpath = "(//*[text()='Issue Date'])[1]")
    public WebElement issueDate;

    //Patient -> Blood Bank -> Blood Issue List ->Blood Group
    @FindBy (xpath = "(//*[text()='Blood Group'])[1]")
    public WebElement bloodGroup;

    //Patient -> Blood Bank -> Blood Issue List -> Gender
    @FindBy (xpath = "(//*[text()='Gender'])[1]")
    public WebElement Gender;

    //Patient -> Blood Bank -> Blood Issue List ->Donor Name
    @FindBy (xpath = "(//*[text()='Donor Name'])[1]")
    public WebElement donorName;

    //Patient -> Blood Bank -> Blood Issue List ->Bags
    @FindBy (xpath = "(//*[text()='Bags'])[1]")
    public WebElement bags;

    //Patient -> Blood Bank -> Blood Issue List ->Amount $
    @FindBy (xpath = "(//*[text()='Amount ($)'])[1]")
    public WebElement amount$;

    //Patient -> Blood Bank -> Blood Issue List ->Paid Amount $
    @FindBy (xpath = "(//*[text()='Paid Amount ($)'])[1]")
    public WebElement paidAmount$;

    //Patient -> Blood Bank -> Blood Issue List ->Balance Amount $
    @FindBy (xpath = "(//*[text()='Balance Amount ($)'])[1]")
    public WebElement balanceAmount$;

    //Patient -> Blood Bank -> Blood Issue List ->Action
    @FindBy (xpath = "(//*[text()='Action'])[1]")
    public WebElement action;

}

