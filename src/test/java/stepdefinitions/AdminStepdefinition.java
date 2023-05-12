package stepdefinitions;

import io.cucumber.java.en.Given;
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
import utilities.ReusableMethods;

public class AdminStepdefinition {

    AdminPage adminPage = new AdminPage();
    DoctorPage doctorPage = new DoctorPage();
    HomePage homePage = new HomePage();
    PatientPage patientPage = new PatientPage();

    @When("Kullanici ADMIN olarak gecerli {string} ve {string} ile giris yapar")
    public void kullanici_ADMIN_olarak_gecerli_ve_ile_giris_yapar(String email, String password) {

        Driver.getDriver().get("https://qa.heallifehospital.com/site/login");

        WebElement username = Driver.getDriver().findElement(By.id("email"));
        username.sendKeys(ConfigReader.getProperty(email));

        WebElement pass = Driver.getDriver().findElement(By.id("password"));
        pass.sendKeys(ConfigReader.getProperty(password));

        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
    }

    @Then("Kullanici ADMIN sidebar menuden {int}. secenege tiklar")
    public void kullanici_ADMİN_sidebar_menuden_secenege_tıklar(Integer index) {
        WebElement xpath = Driver.getDriver().findElement(By.xpath("(//ul[@class='sidebar-menu verttop']//li)["+index+"]"));
        xpath.click();
    }

    @When("Kullanici filter basliklardan {int}. secenege tiklar")
    public void kullanici_filter_basliklardan_secenege_tıklar(Integer index) {
        WebElement xpath = Driver.getDriver().findElement(By.xpath("(//tr[@role='row']//th)["+index+"]"));
        xpath.click();
    }

    @When("Kullanici {int} saniye bekler")
    public void kullanici_saniye_bekler(Integer wait) {
        ReusableMethods.wait(wait);
    }

    @Given("Kullanici searchBox'a {string} yazip aratir")
    public void kullanici_search_boxa_yazip_aratir(String SearchWord) {
        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//input[@type='search']"));
        searchBox.sendKeys(SearchWord);
    }

    @Given("Kullanici browseri kapatir")
    public void kullanici_browseri_kapatir() {
        Driver.closeDriver();
    }



}
