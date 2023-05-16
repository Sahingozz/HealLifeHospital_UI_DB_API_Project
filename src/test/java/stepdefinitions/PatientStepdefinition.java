package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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


}
