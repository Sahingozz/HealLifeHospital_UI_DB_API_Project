package pages;

import org.apache.hc.core5.net.WWWFormCodec;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Base{

    // HomePage > Appointment / "Specialist" Text
    @FindBy(xpath = "(//label[@for='pwd'])[1]")
    public WebElement specialistText;

    // HomePage > Appointment / "Specialist" Text
    @FindBy(xpath = "(//span[@class='selection'])[1]")
    public WebElement specialistTextBox;

    // HomePage > Appointment / "Doctor" TextBox
    @FindBy(xpath = "(//span[@class='selection'])[1]")
    public WebElement doctorTextBox;

    // HomePage > Appointment / "Shift" TextBox
    @FindBy(xpath = "(//span[@class='selection'])[1]")
    public WebElement shiftTextBox;

    // HomePage > Appointment / "Date" TextBox
    @FindBy(xpath = "//div[@class='input-group date']")
    public WebElement dateTextBox;

    // HomePage > Appointment / "Message" TextBox
    @FindBy(id = "message")
    public WebElement messageTextBox;

    // HomePage > Appointment / "Slot" Button
    @FindBy(xpath = "//div[@class='slot-details each-slot-duration']")
    public WebElement slotButton;

    // HomePage > Appointment / Slot > Submit button
    @FindBy(id = "submitbtn")
    public WebElement submitButton;

    // HomePage > Appointment / Slot > patientNameTextBox
    @FindBy(id = "patient_name")
    public WebElement patientNameTextBox;

    // HomePage > Appointment / Slot > emailTextBox
    @FindBy(id = "email")
    public WebElement emailTextBox;

    // HomePage > Appointment / Slot > phoneTextBox
    @FindBy(id = "phone")
    public WebElement phoneTextBox;

    // HomePage > Login > My appointment / Pay Button
    @FindBy(xpath = "//a[@class='btn btn-info btn-xs']")
    public WebElement payButton;

    // HomePage > Login > My appointment / Pay Button > Pay With Card Button
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement payWithCardButton;


    // HomePage > Login > My appointment / Pay Button > Pay With Card Button / email Box
    @FindBy(id = "email")
    public WebElement iframeEmailBox;

    // HomePage > Login > My appointment / Pay Button > Pay With Card Button / iframe
    @FindBy(xpath = "//iframe[@class='stripe_checkout_app']")
    public WebElement iframe;

    // HomePage > Login > My appointment / Pay Button > Pay With Card Button / card number TextBox
    @FindBy(id = "card_number")
    public WebElement iframeCardNumberTextbox;

    // HomePage > Login > My appointment / Pay Button > Pay With Card Button / CC card
    @FindBy(id = "cc-exp")
    public WebElement iframeCardCC;

    // HomePage > Login > My appointment / Pay Button > Pay With Card Button / CVC Card
    @FindBy(id = "cc-csc")
    public WebElement iframeCardCVC;

    // HomePage > Login > My appointment / Pay Button > Pay With Card Button / Pay Button
    @FindBy(id = "submitButton")
    public WebElement iframeCardPayButton;















    // heallife homepage > logo
    @FindBy(xpath = "//a[@class='navbar-brand logo']")
    public WebElement homepageLogo;

    @FindBy(xpath = "//h2[text()='Gallery']")
    public WebElement galleryText;

    @FindBy(xpath = "(//div[@class='col-md-12'])//p[2]")
    public WebElement galleryAciklama;


    //---------zafer

    //Homepage -> Latest News Elementi Text
    @FindBy(xpath = "//div[text()='Latest News']")
    public WebElement latestNewsText;

    // Homepage -> Latest News Kayan Element

    @FindBy(xpath = "//marquee[@behavior ='scroll']")
    public WebElement latestNewsAlani;

    // Homepage -> Home linki üst bar
    @FindBy (xpath = "(//a[text()='Home'])[1]")
    public WebElement homeLinkUst;

    // Homepage -> Appointment linki üst bar
    @FindBy (xpath = "//a[text()='Appointment']")
    public WebElement appointmentLink;

    // Homepage -> Events linki üst bar
    @FindBy (xpath = "//a[text()='Events']")
    public WebElement EventsLink;

    // Homepage -> About Us linki üst bar
    @FindBy (xpath = "(//a[@href='#'])[1]")
    public WebElement aboutUsLink;

    // Homepage -> Gallery linki üst bar
    @FindBy (xpath = "(//a[text()='Gallery'])[1]")
    public WebElement GalleryLink;

    // Homepage -> Contact Us linki üst bar
    @FindBy (xpath = "(//a[text()='Contact Us'])[1]")
    public WebElement contactUsLinkUst;

    // Homepage -> Latest News 1st element
    @FindBy (xpath = "(//div[@class='datenews'])[1]")
    public WebElement latestNews1stElement;

}
