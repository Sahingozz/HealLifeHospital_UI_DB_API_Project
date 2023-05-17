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

    // Doctor->Radiology -> Radiology Bill List -> Balance Amount ($) alt bilgi alani
    @FindBy (xpath = "(//td[@class=' dt-body-right'])[3]")
    public WebElement bilgiDetayLinkAlani;

    // Doctor->Radiology -> Radiology Bill List -> Balance Amount ($) alt bilgi alani->View Reports Linki
    @FindBy (xpath = "(//i[@class='fa fa-reorder'])[2]")
    public WebElement viewReportsLink;

    // Doctor->Radiology -> Radiology Bill List -> Balance Amount ($) alt bilgi alani->View Reports Linki->acilan detay bölümü
    @FindBy (xpath = "//h4[text()='Bill Details']")
    public WebElement viewReportsDetay;

    // Doctor->Radiology -> Radiology Bill List -> Balance Amount ($) alt bilgi alani->View Reports Linki->acilan detay bölümü->Add/edit person
    @FindBy (xpath = " //i[@class='fa fa-user-plus']")
    public WebElement addEditPerson;

    // Doctor->Radiology -> Radiology Bill List -> Balance Amount ($) alt bilgi alani
    // ->View Reportsi->acilan detay bölümü->Add/edit person->Sample Collected Person Name
    @FindBy (xpath = "//select[@class='form-control']")
    public WebElement sampleCollectedPerson ;

    // Doctor->Radiology -> Radiology Bill List -> Balance Amount ($) alt bilgi alani
    // ->View Reportsi->acilan detay bölümü->Add/edit person->Collected Date
    @FindBy (xpath = "//input[@class='form-control']")
    public WebElement sampleCollectedDate ;

    // Doctor->Radiology -> Radiology Bill List -> Balance Amount ($) alt bilgi alani
    // ->View Reportsi->acilan detay bölümü->Add/edit person->Sample Collected Lab
    @FindBy (xpath = "//input[@name='radiology_center']")
    public WebElement sampleCollectedLab ;

    // Doctor->Radiology -> Radiology Bill List -> Balance Amount ($) alt bilgi alani
    // ->View Reportsi->acilan detay bölümü->Add/edit person->Save Butonu
    @FindBy (xpath = "(//button[@type='submit'])[5]")
    public WebElement sampleCollectedSaveButonu ;

    // Doctor->Radiology -> Radiology Bill List ->Radiology Test linki
    @FindBy (xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement radiologyTestLink;

    // Doctor->Radiology -> Radiology Bill List ->Radiology Test linki->Radiology Test Text
    @FindBy (xpath = "//h3[text()='Radiology Test']")
    public WebElement radiologyTestText;

    //Doctor->Radiology->Radiology Test-> Test Name
    @FindBy (xpath = "//th[text()='Test Name']")
    public WebElement radiologyTestName;

    //Doctor->Radiology->Radiology Test->Short Name
    @FindBy (xpath = "//th[text()='Short Name']")
    public WebElement radiologyShortName;

    //Doctor->Radiology->Radiology Test->Test Type
    @FindBy (xpath = "//th[text()='Test Type']")
    public WebElement radiologyTestType;

    //Doctor->Radiology->Radiology Test->Category
    @FindBy (xpath = "//th[text()='Category']")
    public WebElement radiologyCategory;

    //Doctor->Radiology->Radiology Test->Sub Category
    @FindBy (xpath = "//th[text()='Sub Category']")
    public WebElement radiologySubCategory;

    //Doctor->Radiology->Radiology Test-> Report Days
    @FindBy (xpath = "//th[text()='Report Days']")
    public WebElement radiologyReportDays;

    //Doctor->Radiology->Radiology Test-> Tax %
    @FindBy (xpath = "//th[text()='Tax (%)']")
    public WebElement radiologyTestTax;

    //Doctor->Radiology->Radiology Test->Charge $
    @FindBy (xpath = "//th[text()='Charge ($)']")
    public WebElement radiologyTestCharge;

    //Doctor->Radiology->Radiology Test-> Amount $
    @FindBy (xpath = "//th[text()='Amount ($)']")
    public WebElement radiologyTestAmount;

    //Doctor->Radiology->Radiology Test-> Liste sutun ilk bilgi ( Test Name, sıralı)
    @FindBy (xpath = "(//td[@class='sorting_1'])[1]")
    public WebElement radiologyTestListIlkBilgiText;

    //Doctor->Radiology->Radiology Test-> Search Box
    @FindBy (xpath = "(//input[@type='search'])[1]")
    public WebElement radiologyTestListSearchTextBox;


    //Doctor->Radiology ->liste 100 secenegiText
    @FindBy (xpath = "//*[text()='100']")
    public WebElement radiologyTestDDM100Text;

    //Doctor->Radiology ->liste All secenegiText
    @FindBy (xpath = "//*[text()='All']")
    public WebElement radiologyTestDDMAllText;

    //Doctor->Radiology ->RAdiology Test ->AMount $ altındaki bilgi alani
    @FindBy (xpath = " (//td[@class=' dt-body-right'])[3]")
    public WebElement radiologyTestListIlkBilgiElementi;

    //Doctor->Radiology ->RAdiology Test ->Show Test Details link->Test Details text secenegiText
    @FindBy (xpath = "//h4[text()='Test Details']")
    public WebElement radiologyTestDetailsText;




}

