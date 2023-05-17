package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
}
