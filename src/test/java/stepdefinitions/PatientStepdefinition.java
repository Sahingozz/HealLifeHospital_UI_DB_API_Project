package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AdminPage;
import pages.DoctorPage;
import pages.HomePage;
import pages.PatientPage;
import utilities.ConfigReader;
import utilities.Driver;

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
        WebElement xpath = Driver.getDriver().findElement(By.xpath("(//ul[@class='sidebar-menu verttop2']//li)["+index+"]"));
        xpath.click();
    }

    //---------------Zafer


    @And("Kullanici bilgilerini girerek hasta paneline giris yapar")
    public void kullaniciBilgileriniGirerekHastaPanelineGirisYapar() {

    }


}
