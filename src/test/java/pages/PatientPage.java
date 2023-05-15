package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PatientPage extends Base{


    @FindBy(xpath = "(//h3[@class='box-tab-title'])[1]")
    public WebElement bloodIssueText;

    @FindBy(xpath = "(//ul[@class='nav nav-tabs']//li)[2]")
    public WebElement componentIssueButton;

    @FindBy(xpath = "(//div[@class='box-tab-header']//h3)[2]")
    public WebElement componentIssueText;

    //-----------------Zafer

    //Patient -> user(patient) login username
   // @FindBy (xpath = "//")

}
