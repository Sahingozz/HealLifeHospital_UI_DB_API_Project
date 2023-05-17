package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AdminPage;
import pages.DoctorPage;
import pages.HomePage;
import pages.PatientPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.Set;

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
        select.selectByIndex(1);
        ReusableMethods.wait(3);
        Assert.assertEquals("All",doctorPage.radiologyDDMAllText.getText());
    }
    @Given("Radio Bill List'te Balance Amount'da bulunan view Reports tiklanir ve detay sayfasi acildigi dogrulanir")
    public void radio_bill_list_te_balance_Amount_da_bulunan_view_reports_tiklanir_ve_detay_sayfasi_acildigi_dogrulanir() {

        doctorPage.radiologyLinki.click();
        ReusableMethods.wait(3);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(doctorPage.bilgiDetayLinkAlani).perform();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(4));
        wait.until(ExpectedConditions.visibilityOf(doctorPage.viewReportsLink));

        doctorPage.viewReportsLink.click();

        ReusableMethods.wait(2);

        ReusableMethods.isDisplayed(doctorPage.viewReportsDetay,"View Reports'a tıklanınca Bill Details kısmı açılıyor");
    }
    @Given("Radio Bill List'te Bill Details bolumune gecilip, addEdit person kisminda bilgiler duzenlenebilmeli")
    public void radio_bill_list_te_bill_details_bolumune_gecilip_addEdit_person_kisminda_bilgiler_duzenlenebilmeli() {
        doctorPage.radiologyLinki.click();
        ReusableMethods.wait(3);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(doctorPage.bilgiDetayLinkAlani).perform();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(4));
        wait.until(ExpectedConditions.visibilityOf(doctorPage.viewReportsLink));

        doctorPage.viewReportsLink.click();

        ReusableMethods.wait(2);
        doctorPage.addEditPerson.click();
        ReusableMethods.wait(4);

        ReusableMethods.isEnabled(doctorPage.sampleCollectedPerson,"Sample Collected Person alanına giriş yapılamıyor");
        ReusableMethods.isEnabled(doctorPage.sampleCollectedDate,"Sample Collected Date alanına giriş yapılamıyor");
        ReusableMethods.isEnabled(doctorPage.sampleCollectedDate,"Sample Collected Lab alanına giriş yapılamıyor");
        ReusableMethods.isEnabled(doctorPage.sampleCollectedSaveButonu,"Sample Collection alanındaki save butonu aktif değil");


        }
    @Given("Radio Bill List bolumunden Radiology Test bolumune gecilebildigi dogrulanmalidir")
    public void radio_bill_list_bolumunden_radiology_test_bolumune_gecilebildigi_dogrulanmalidir() {
        doctorPage.radiologyLinki.click();
        ReusableMethods.wait(3);

        doctorPage.radiologyTestLink.click();
        ReusableMethods.wait(3);

        ReusableMethods.isDisplayed(doctorPage.radiologyTestText,"Radiology Test bolumune gecis yapilamamaktadir");
        }
    @Given("Radiology Test bolumunde test liste basliklarinin gorunurlugu dogrulanmalidir")
    public void radiology_test_bolumunde_test_liste_basliklarinin_gorunurlugu_dogrulanmalidir() {
        doctorPage.radiologyLinki.click();
        ReusableMethods.wait(3);

        doctorPage.radiologyTestLink.click();
        ReusableMethods.wait(3);

        ReusableMethods.isDisplayed(doctorPage.radiologyTestName,
                "Radiology Test Name görünmüyor");
        ReusableMethods.isDisplayed(doctorPage.radiologyShortName,
                "Radiology Short Name görünmüyor");
        ReusableMethods.isDisplayed(doctorPage.radiologyTestType,
                "Radiology Test Type görünmüyor");
        ReusableMethods.isDisplayed(doctorPage.radiologyCategory,
                "Radiology Test Category görünmüyor");
        ReusableMethods.isDisplayed(doctorPage.radiologySubCategory,
                "Radiology Test Sub Category görünmüyor");
        ReusableMethods.isDisplayed(doctorPage.radiologyReportDays,
                "Radiology Test Report Days görünmüyor");
        ReusableMethods.isDisplayed(doctorPage.radiologyTestTax,
                "Radiology Test Tax (%) görünmüyor");
        ReusableMethods.isDisplayed(doctorPage.radiologyTestCharge,
                "Radiology Test Charge görünmüyor");
        ReusableMethods.isDisplayed(doctorPage.radiologyTestAmount,
                "Radiology Test Amount ($) görünmüyor");

    }
    @Given("Radiology linkinden Radiology Test sayfasina gidilip, sutun basliklarina gore siralama yapildigi dogrulanmali")
    public void radiology_linkinden_radiology_test_sayfasina_gidilip_sutun_basliklarina_gore_siralama_yapildigi_dogrulanmali() {
        doctorPage.radiologyLinki.click();
        ReusableMethods.wait(3);

        doctorPage.radiologyTestLink.click();
        ReusableMethods.wait(3);

        doctorPage.radiologyTestName.click();
        ReusableMethods.wait(3);

        Assert.assertEquals("aaaaa",doctorPage.radiologyTestListIlkBilgiText.getText());

        ReusableMethods.isEnabled(doctorPage.radiologyShortName,
                "Radiology Short Name elementi etkin değil");
        ReusableMethods.isEnabled(doctorPage.radiologyTestType,
                "Radiology Test Type elementi etkin değil");
        ReusableMethods.isEnabled(doctorPage.radiologyCategory,
                "Radiology Test Category elementi etkin değil");
        ReusableMethods.isEnabled(doctorPage.radiologySubCategory,
                "Radiology Test Sub Category elementi etkin değil");
        ReusableMethods.isEnabled(doctorPage.radiologyReportDays,
                "Radiology Test Report Days elementi etkin değil");
        ReusableMethods.isEnabled(doctorPage.radiologyTestTax,
                "Radiology Test Tax (%) elementi etkin değil");
        ReusableMethods.isEnabled(doctorPage.radiologyTestCharge,
                "Radiology Test Charge elementi etkin değil");
        ReusableMethods.isEnabled(doctorPage.radiologyTestAmount,
                "Radiology Test Amount ($) elementi etkin değil");


    }

    @Given("Radiology linkine gidilir, Radiology Test linki tiklanir ve Test List alaninda search text box oldugu dogrulanir")
    public void radiology_linkine_gidilir_radiology_test_linki_tiklanir_ve_test_list_alaninda_search_text_box_oldugu_dogrulanir() {

        doctorPage.radiologyLinki.click();
        ReusableMethods.wait(3);

        doctorPage.radiologyTestLink.click();
        ReusableMethods.wait(3);

        ReusableMethods.isEnabled(doctorPage.radiologyTestListSearchTextBox,"Radiology Test List search text box aktif degil");
    }
    @Given("Radiology Test List bolumunde listenin {int}'er veya All seklinde goruntuleme olanagi oldugu dogrulanir")
    public void radiology_test_list_bolumunde_listenin_er_veya_all_seklinde_goruntuleme_olanagi_oldugu_dogrulanir(Integer int1) {
        doctorPage.radiologyLinki.click();
        ReusableMethods.wait(3);

        Assert.assertEquals("100",doctorPage.radiologyTestDDM100Text.getText());
        ReusableMethods.wait(2);

        Assert.assertEquals("All",doctorPage.radiologyTestDDMAllText.getText());
    }

    @Given("Radiology Test List bolumunde show details linki tiklandiginda detaylarin gosterildigi dogrulanmali")
    public void radiology_test_list_bolumunde_show_details_linki_tiklandiginda_detaylarin_gosterildigi_dogrulanmali() {
        doctorPage.radiologyLinki.click();
        ReusableMethods.wait(3);
        doctorPage.radiologyTestLink.click();
        ReusableMethods.wait(3);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(doctorPage.radiologyTestListIlkBilgiElementi);
        ReusableMethods.wait(3);
        doctorPage.radiologyTestListIlkBilgiElementi.click();
        ReusableMethods.wait(3);
        ReusableMethods.isDisplayed(doctorPage.radiologyTestDetailsText,
                "Radiology Test List'te show butonuna basinca detay sayfasi acilmiyor");



    }
}








