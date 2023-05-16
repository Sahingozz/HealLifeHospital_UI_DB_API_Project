package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.common.util.report.qual.ReportUse;
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

public class PatientStepdefinition {

    AdminPage adminPage = new AdminPage();
    DoctorPage doctorPage = new DoctorPage();
    HomePage homePage = new HomePage();
    PatientPage patientPage = new PatientPage();

    @When("Kullanici PATIENT olarak gecerli {string} ve {string} ile giris yapar")
    public void kullanici_PATIENT_olarak_gecerli_ve_ile_giris_yapar(String email, String password) {

        WebElement username = Driver.getDriver().findElement(By.id("email"));
        username.sendKeys(ConfigReader.getProperty(email));

        WebElement pass = Driver.getDriver().findElement(By.id("password"));
        pass.sendKeys(ConfigReader.getProperty(password));

        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
    }

    @Then("Kullanici PATIENT sidebar menuden {int}. secenege tiklar")
    public void kullanici_PATIENT_sidebar_menuden_secenege_tıklar(Integer index) {
        WebElement xpath = Driver.getDriver().findElement(By.xpath("(//ul[@class='sidebar-menu verttop2']//li)[" + index + "]"));
        xpath.click();
    }

    //---------------Zafer


    @And("Kullanici bilgilerini girerek hasta paneline giris yapar")
    public void kullaniciBilgileriniGirerekHastaPanelineGirisYapar() {
        patientPage.patientLoginUsername.sendKeys("pat967");
        patientPage.patientLoginPassword.sendKeys("t4ugfh");
        patientPage.patientSigninSubmit.click();

    }

    @Given("Blood Bank linkine tiklanir ve ilgili sayfaya yonlendirildigi dogrulanir")
    public void blood_bank_linkine_tiklanir_ve_ilgili_sayfaya_yonlendirildigi_dogrulanir() {
        patientPage.patientBloodBankLink.click();
        ReusableMethods.isDisplayed(patientPage.patientBloodIssueLink,"Blood Issue bölümüne geçilemedi");

    }

    @Given("Hasta profil bilgilerinin bulundugu dogrulanir")
    public void hasta_profil_bilgilerinin_bulundugu_dogrulanir() {
        patientPage.patientBloodBankLink.click();
        patientPage.WebElementVisibility();
    }

    @Given("Blood Issue ve Component Issue sayfalarinin varligi ve bu sayfalara gecilebildigi dogrulanir")
    public void blood_issue_ve_component_issue_sayfalarinin_varligi_ve_bu_sayfalara_gecilebildigi_dogrulanir() {
       patientPage.patientBloodBankLink.click();
       ReusableMethods.wait(3);

        Assert.assertTrue("Blood Issue bölümüne ulaşılamıyor", patientPage.patientBloodIssueLink.isDisplayed()
                && patientPage.patientBloodIssueLink.isEnabled());
        Assert.assertTrue("Blood Component Issue bölümüne ulaşılamıyor", patientPage.componentIssueLink.isDisplayed()
                && patientPage.componentIssueLink.isEnabled());
    }

    @Given("Blood Issue List basliklarinin gorulur oldugu dogrulanir")
    public void blood_issue_list_basliklarinin_gorulur_oldugu_dogrulanir() {
        patientPage.patientBloodBankLink.click();
        ReusableMethods.wait(3);

        ReusableMethods.isDisplayed(patientPage.billNo, "Blood Issue bölümünde Bill No görünmüyor");
        ReusableMethods.isDisplayed(patientPage.issueDate, "Blood Issue bölümünde Issue Date görünmüyor");
        ReusableMethods.isDisplayed(patientPage.receivedTo, "Blood Issue bölümünde Received To görünmüyor");
        ReusableMethods.isDisplayed(patientPage.bloodGroup, "Blood Issue bölümünde Blood Group görünmüyor");
        ReusableMethods.isDisplayed(patientPage.Gender, "Blood Issue bölümünde Gender görünmüyor");
        ReusableMethods.isDisplayed(patientPage.donorName, "Blood Issue bölümünde Donor Name görünmüyor");
        ReusableMethods.isDisplayed(patientPage.amount$, "Blood Issue bölümünde Amount ($) görünmüyor");
        ReusableMethods.isDisplayed(patientPage.paidAmount$, "Blood Issue bölümünde Paid Amount ($) görünmüyor");
        ReusableMethods.isDisplayed(patientPage.balanceAmount$, "Blood Issue bölümünde Balance Amount ($) görünmüyor");
        ReusableMethods.isDisplayed(patientPage.action,  "Blood Issue bölümünde Action görünmüyor");


    }

    @Given("Blood Issue List bolumunde search text box oldugu dogrulanir")
    public void blood_issue_list_bolumunde_search_text_box_oldugu_dogrulanir() {
       patientPage.patientBloodBankLink.click();
       ReusableMethods.wait(3);

       Assert.assertTrue("Search Text Box yok veya text girişi yapilamiyor",
               patientPage.bloodIssueSearchTextBox.isDisplayed() && patientPage.bloodIssueSearchTextBox.isEnabled());


    }
    @Given("Blood Issue List bolumunde {int}'erli veya hepsi birden listeleme secenekleri oldugu dogrulanir")
    public void blood_issue_list_bolumunde_erli_veya_hepsi_birden_listeleme_secenekleri_oldugu_dogrulanir(Integer int1) {
        patientPage.patientBloodBankLink.click();
        ReusableMethods.wait(3);

        Select select = new Select(patientPage.listeGorunumSecenek);
        select.selectByIndex(0);
        Assert.assertTrue("Liste görünümü için 100 seçeneği bulunmuyor",patientPage.liste100.getText().equals("100"));
        select.selectByIndex(1);
        Assert.assertTrue("Liste görünümü için All seçeneği bulunmuyor",patientPage.listeAll.getText().equals("All"));


    }

    @Given("Blood Issue List bolumunde liste basliklarina tiklanarak listeleme yapilabildigi dogrulanir")
    public void blood_issue_list_bolumunde_liste_basliklarina_tiklanarak_listeleme_yapilabildigi_dogrulanir() {

        patientPage.patientBloodBankLink.click();
        ReusableMethods.wait(3);

        ReusableMethods.isEnabled(patientPage.billNo, "Blood Issue bölümünde Bill No tiklanamiyor");
        ReusableMethods.isEnabled(patientPage.issueDate, "Blood Issue bölümünde Issue Date tiklanamiyor");
        ReusableMethods.isEnabled(patientPage.receivedTo, "Blood Issue bölümünde Received To tiklanamiyor");
        ReusableMethods.isEnabled(patientPage.bloodGroup, "Blood Issue bölümünde Blood Group tiklanamiyor");
        ReusableMethods.isEnabled(patientPage.Gender, "Blood Issue bölümünde Gender tiklanamiyor");
        ReusableMethods.isEnabled(patientPage.donorName, "Blood Issue bölümünde Donor Name tiklanamiyor");
        ReusableMethods.isEnabled(patientPage.amount$, "Blood Issue bölümünde Amount ($) tiklanamiyor");
        ReusableMethods.isEnabled(patientPage.paidAmount$, "Blood Issue bölümünde Paid Amount ($) tiklanamiyor");
        ReusableMethods.isEnabled(patientPage.balanceAmount$, "Blood Issue bölümünde Balance Amount ($) tiklanamiyor");
        ReusableMethods.isEnabled(patientPage.action,  "Blood Issue bölümünde Action tiklanamiyor");
    }

    @Given("Blood Issue List kisminda Action basligindaki view,show ve pay butonlarinin calistigi dogrulanmali")
    public void blood_issue_list_kisminda_action_basligindaki_view_show_ve_pay_butonlarinin_calistigi_dogrulanmali() {
        patientPage.patientBloodBankLink.click();
        ReusableMethods.wait(3);

        Assert.assertTrue("View Payments butonu çalışmıyor, işlem yapılamıyor",
                patientPage.viewPaymentLink.isDisplayed()&&patientPage.viewPaymentLink.isEnabled());

        Assert.assertTrue("Show butonu çalışmıyor, işlem yapılamıyor",
                patientPage.ShowLink.isDisplayed()&&patientPage.ShowLink.isEnabled());

        Assert.assertTrue("Pay butonu çalışmıyor, işlem yapılamıyor",
                patientPage.PayLink.isDisplayed()&&patientPage.PayLink.isEnabled());


    }
    @Given("Component Issue List kisminda tum basliklarin oldugu dogrulanmali")
    public void component_issue_list_kisminda_tum_basliklarin_oldugu_dogrulanmali() {
        patientPage.patientBloodBankLink.click();
        ReusableMethods.wait(3);

        patientPage.componentIssueLink.click();
        ReusableMethods.wait(3);

        ReusableMethods.isDisplayed(patientPage.billNo, "Component Issue bölümünde Bill No görünmüyor");
        ReusableMethods.isDisplayed(patientPage.issueDate, "Component Issue bölümünde Issue Date görünmüyor");
        ReusableMethods.isDisplayed(patientPage.receivedTo, "Component Issue bölümünde Received To görünmüyor");
        ReusableMethods.isDisplayed(patientPage.bloodGroup, "Component Issue bölümünde Blood Group görünmüyor");
        ReusableMethods.isDisplayed(patientPage.Gender, "Component Issue bölümünde Gender görünmüyor");
        ReusableMethods.isDisplayed(patientPage.donorName, "Component Issue bölümünde Donor Name görünmüyor");
        ReusableMethods.isDisplayed(patientPage.amount$, "Component Issue bölümünde Amount ($) görünmüyor");
        ReusableMethods.isDisplayed(patientPage.paidAmount$, "Component Issue bölümünde Paid Amount ($) görünmüyor");
        ReusableMethods.isDisplayed(patientPage.balanceAmount$, "Component Issue bölümünde Balance Amount ($) görünmüyor");
        ReusableMethods.isDisplayed(patientPage.action,  "Component Issue bölümünde Action görünmüyor");


    }

    @Given("Component Issue List bolumunde search text box oldugu dogrulanir")
    public void component_issue_list_bolumunde_search_text_box_oldugu_dogrulanir() {
        patientPage.patientBloodBankLink.click();
        ReusableMethods.wait(3);
        patientPage.componentIssueLink.click();
        ReusableMethods.wait(3);

        Assert.assertTrue("Search Text Box yok veya text girişi yapilamiyor",
                patientPage.componentIssueSearchTextBox.isDisplayed() && patientPage.componentIssueSearchTextBox.isEnabled());


        }

    @Given("Component Issue List bolumunde {int}'erli veya hepsi birden listeleme secenekleri oldugu dogrulanir")
    public void component_issue_list_bolumunde_erli_veya_hepsi_birden_listeleme_secenekleri_oldugu_dogrulanir(Integer int1) {
        patientPage.patientBloodBankLink.click();
        ReusableMethods.wait(3);

        Select select = new Select(patientPage.listeGorunumSecenek);
        select.selectByIndex(0);
        Assert.assertTrue("Liste görünümü için 100 seçeneği bulunmuyor",patientPage.liste100.getText().equals("100"));
        select.selectByIndex(1);
        Assert.assertTrue("Liste görünümü için All seçeneği bulunmuyor",patientPage.listeAll.getText().equals("All"));


    }
    @Given("Component Issue List bolumunde liste basliklarina tiklanarak listeleme yapilabildigi dogrulanir")
    public void component_issue_list_bolumunde_liste_basliklarina_tiklanarak_listeleme_yapilabildigi_dogrulanir() {

        patientPage.patientBloodBankLink.click();
        ReusableMethods.wait(3);
        patientPage.componentIssueLink.click();
        ReusableMethods.wait(3);

        ReusableMethods.isEnabled(patientPage.billNo, "Component Issue bölümünde Bill No tiklanamiyor");
        ReusableMethods.isEnabled(patientPage.issueDate, "Component Issue bölümünde Issue Date tiklanamiyor");
        ReusableMethods.isEnabled(patientPage.receivedTo, "Component Issue bölümünde Received To tiklanamiyor");
        ReusableMethods.isEnabled(patientPage.bloodGroup, "Component Issue bölümünde Blood Group tiklanamiyor");
        ReusableMethods.isEnabled(patientPage.Gender, "Component Issue bölümünde Gender tiklanamiyor");
        ReusableMethods.isEnabled(patientPage.donorName, "Component Issue bölümünde Donor Name tiklanamiyor");
        ReusableMethods.isEnabled(patientPage.amount$, "Component Issue bölümünde Amount ($) tiklanamiyor");
        ReusableMethods.isEnabled(patientPage.paidAmount$, "Component Issue bölümünde Paid Amount ($) tiklanamiyor");
        ReusableMethods.isEnabled(patientPage.balanceAmount$, "Component Issue bölümünde Balance Amount ($) tiklanamiyor");
        ReusableMethods.isEnabled(patientPage.action,  "Component Issue bölümünde Action tiklanamiyor");
    }

    @Given("Component Issue List bolumunde Action bolumunun bos oldugu dogrulanmali")
    public void component_issue_list_bolumunde_action_bolumunun_bos_oldugu_dogrulanmali() {

        patientPage.patientBloodBankLink.click();
        ReusableMethods.wait(3);
        patientPage.componentIssueLink.click();
        ReusableMethods.wait(3);

        Assert.assertTrue(patientPage.action.isDisplayed());

          }



}
