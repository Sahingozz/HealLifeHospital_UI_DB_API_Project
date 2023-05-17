package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DoctorPage extends Base{


    //----Zafer

    // Doctor->Radiology linki
    @FindBy (xpath = "//*[text()='Radiology']")
    public WebElement radiologyLinki;

    // Doctor->Radiology->Radiology Bill text
    @FindBy (xpath = "//*[text()=' Radiology Bill']")
    public WebElement radiologyBillText;

    //Doctor->Radiology ->Bill No
    @FindBy (xpath = "(//*[text()='Bill No'])[1]")
    public WebElement radiologyBillNo;

    //Doctor->Radiology ->CaseID
    @FindBy (xpath = "(//*[text()='Case ID / Patient ID'])[1]")
    public WebElement radiologyCaseId;

    //Doctor->Radiology ->Reporting Date
    @FindBy (xpath = "(//*[text()='Reporting Date'])[1]")
    public WebElement radiologyReportingDate;

    //Doctor->Radiology ->Patient Name
    @FindBy (xpath = "(//*[text()='Patient Name'])[1]")
    public WebElement radiologyPatientName;

    //Doctor->Radiology ->Reference Doctor
    @FindBy (xpath = "(//*[text()='Reference Doctor'])[1]")
    public WebElement radiologyReferenceDoctor;

    //Doctor->Radiology ->Note
    @FindBy (xpath = "(//*[text()='Bill No'])[1]")
    public WebElement radiologyNote;

    //Doctor->Radiology ->Amount ($)
    @FindBy (xpath = "(//*[text()='Amount ($)'])[1]")
    public WebElement radiologyAmount$;

    //Doctor->Radiology ->Paid Amount ($)
    @FindBy (xpath = "(//*[text()='Paid Amount ($)'])[1]")
    public WebElement radiologyPaidAmount$;

    //Doctor->Radiology ->Paid Amount ($)
    @FindBy (xpath = "(//*[text()='Balance Amount ($)'])[1]")
    public WebElement radiologyBalanceAmount$;

    //Doctor->Radiology ->Bill No'ya göre siralamada ilk element
    @FindBy (xpath = "//td[text()='RADIOB1']")
    public WebElement billNoSiraIlkElement;

    //Doctor->Radiology ->SearchTextBox
    @FindBy (xpath = "//input[@type='search']")
    public WebElement radiologySearchTextBox ;

    //Doctor->Radiology ->liste drop down elementi
    @FindBy (xpath = "//select[@name='testreport_length']")
    public WebElement radiologyDDM;

    //Doctor->Radiology ->liste 100 secenegiText
    @FindBy (xpath = "//*[text()='100']")
    public WebElement radiologyDDM100Text;

    //Doctor->Radiology ->liste All secenegiText
    @FindBy (xpath = "//*[text()='All']")
    public WebElement radiologyDDMAllText;

}

