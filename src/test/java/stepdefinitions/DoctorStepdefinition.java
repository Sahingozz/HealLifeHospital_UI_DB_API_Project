package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.AdminPage;
import pages.DoctorPage;
import pages.HomePage;
import pages.PatientPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class DoctorStepdefinition {

    AdminPage adminPage = new AdminPage();
    DoctorPage doctorPage = new DoctorPage();
    HomePage homePage = new HomePage();
    PatientPage patientPage = new PatientPage();

    //------------zafer
    @And("Kullanici bilgilerini girerek doktor paneline giris yapar")
    public void kullaniciBilgileriniGirerekDoktorPanelineGirisYapar() {
        patientPage.patientLoginUsername.sendKeys("zafer.sahingoz.doctor@heallifehospital.com");
        patientPage.patientLoginPassword.sendKeys("heallife123");
        patientPage.patientSigninSubmit.click();

    }
    @Given("Radiology linkine tiklanip, ilgili sayfaya gidildigi dogrulanir")
    public void radiology_linkine_tiklanip_ilgili_sayfaya_gidildigi_dogrulanir() {
        doctorPage.radiologyLinki.click();
        ReusableMethods.wait(3);

        ReusableMethods.isDisplayed(doctorPage.radiologyBillText,"" +
                "Radiology linki tiklaninca ilgili sayfaya gidilmiyor");

    }
    @Given("Radiology linkine gidilir ve acilan sayfadaki liste basliklarinin varligi dogrulanir")
    public void radiology_linkine_gidilir_ve_acilan_sayfadaki_liste_basliklarinin_varligi_dogrulanir() {
        doctorPage.radiologyLinki.click();
        ReusableMethods.wait(3);

        ReusableMethods.isDisplayed(doctorPage.radiologyBillNo,
                "Radiology linkinde Bill no görünmüyor");
        ReusableMethods.isDisplayed(doctorPage.radiologyCaseId,
                "Radiology linkinde Case ID görünmüyor");
        ReusableMethods.isDisplayed(doctorPage.radiologyReportingDate,
                "Radiology linkinde Reporting Date görünmüyor");
        ReusableMethods.isDisplayed(doctorPage.radiologyPatientName,
                "Radiology linkinde Patient Name görünmüyor");
        ReusableMethods.isDisplayed(doctorPage.radiologyReferenceDoctor,
                "Radiology linkinde Reference Doctor görünmüyor");
        ReusableMethods.isDisplayed(doctorPage.radiologyNote,
                "Radiology linkinde Note görünmüyor");
        ReusableMethods.isDisplayed(doctorPage.radiologyAmount$,
                "Radiology linkinde Amount ($) görünmüyor");
        ReusableMethods.isDisplayed(doctorPage.radiologyPaidAmount$,
                "Radiology linkinde Paid Amount ($) görünmüyor");
        ReusableMethods.isDisplayed(doctorPage.radiologyBalanceAmount$,
                "Radiology linkinde Balance Amount ($) görünmüyor");

    }

    @Given("Radiology linkine gidilir ve Radio Bill alanındaki basliklara gore siralama yapildigi dogrulanir")
    public void radiology_linkine_gidilir_ve_radio_bill_alanındaki_basliklara_gore_siralama_yapildigi_dogrulanir() {
        doctorPage.radiologyLinki.click();
        ReusableMethods.wait(3);

        doctorPage.radiologyBillNo.click();
        ReusableMethods.wait(2);
        Assert.assertEquals("RADIOB1",doctorPage.billNoSiraIlkElement.getText());

        ReusableMethods.isEnabled(doctorPage.radiologyCaseId,
                "Radiology linkinde Case ID tiklanmiyor");
        ReusableMethods.isEnabled(doctorPage.radiologyReportingDate,
                "Radiology linkinde Reporting Date tiklanmiyor");
        ReusableMethods.isEnabled(doctorPage.radiologyPatientName,
                "Radiology linkinde Patient Name tiklanmiyor");
        ReusableMethods.isEnabled(doctorPage.radiologyReferenceDoctor,
                "Radiology linkinde Reference Doctor tiklanmiyor");
        ReusableMethods.isEnabled(doctorPage.radiologyNote,
                "Radiology linkinde Note tiklanmiyor");
        ReusableMethods.isEnabled(doctorPage.radiologyAmount$,
                "Radiology linkinde Amount ($) tiklanmiyor");
        ReusableMethods.isEnabled(doctorPage.radiologyPaidAmount$,
                "Radiology linkinde Paid Amount ($) tiklanmiyor");
        ReusableMethods.isEnabled(doctorPage.radiologyBalanceAmount$,
                "Radiology linkinde Balance Amount ($) tiklanmiyor");


    }
    @Given("Radiology linkine gidilir ve Radio Bill alanında search text box oldugu dogrulanir")
    public void radiology_linkine_gidilir_ve_radio_bill_alanında_search_text_box_oldugu_dogrulanir() {

        doctorPage.radiologyLinki.click();
        ReusableMethods.wait(3);

        ReusableMethods.isDisplayed(doctorPage.radiologySearchTextBox,
                "Radiology bölümündeki search text box görünmüyor");
        ReusableMethods.isEnabled(doctorPage.radiologySearchTextBox,
                "Radiology bölümündeki search text box aktif değil");
    }
    @Given("Radiology bolumunde Radio Bill List'in {int}'er veya All seklinde goruntuleme olanagi oldugu dogrulanir")
    public void radiology_bolumunde_radio_bill_list_in_er_veya_all_seklinde_goruntuleme_olanagi_oldugu_dogrulanir(Integer int1) {
        doctorPage.radiologyLinki.click();
        ReusableMethods.wait(3);
        Select select = new Select(doctorPage.radiologyDDM);
        select.selectByIndex(0);
        Assert.assertEquals("100",doctorPage.radiologyDDM100Text.getText());
        ReusableMethods.wait(2);
        Assert.assertEquals("All",doctorPage.radiologyDDMAllText.getText());
    }

}


