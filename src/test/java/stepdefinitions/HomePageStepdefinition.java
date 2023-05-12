package stepdefinitions;


import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AdminPage;
import pages.DoctorPage;
import pages.HomePage;
import pages.PatientPage;
import utilities.*;

public class HomePageStepdefinition {

    AdminPage adminPage = new AdminPage();
    DoctorPage doctorPage = new DoctorPage();
    HomePage homePage = new HomePage();
    PatientPage patientPage = new PatientPage();
    Faker faker = new Faker();

    @Given("Kullanici tarayicida {string}e gider")
    public void kullanici_tarayicida_e_gider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Given("Kullanici footerda social mediadan {int}. secenege tiklar")
    public void kullanici_footerda_social_mediadan_secenege_tiklar(Integer index) {
        WebElement xpath = Driver.getDriver().findElement(By.xpath("(//ul[@class='company-social']//li)["+index+"]"));
        xpath.click();
    }

    @Given("Kullanici appointment'e tiklar ve appointment sayfasina gittigini dogrular")
    public void kullanici_appointment_e_tiklar_ve_appointment_sayfasina_gittigini_dogrular() {
        ReusableMethods.isDisplayed(homePage.specialistText,"Specialist Text Gorunur Degil");
    }


    @When("Kullanici appointment dropdown {int}. menuden {string} secer")
    public void kullaniciAppointmentDropdownMenudenSecer(int menu, String metin) {

        ReusableMethods.wait(1);
        WebElement xpath = Driver.getDriver().findElement(By.xpath("(//span[@class='selection'])["+menu+"]"));
        xpath.click();
        WebElement drop = Driver.getDriver().findElement(By.xpath("//li[text()='"+metin+"']"));
        ReusableMethods.wait(1);
        drop.click();
    }

    @Then("Kullanici appointment dropdown menulerinin gorunur oldugunu dogrular")
    public void kullaniciAppointmentDropdownMenulerininGorunurOldugunuDogrular() {
        ReusableMethods.isDisplayed(homePage.specialistTextBox,"Specialist TextBox Gorunur Degil");
        ReusableMethods.isDisplayed(homePage.doctorTextBox,"Doctor TextBox Gorunur Degil");
        ReusableMethods.isDisplayed(homePage.shiftTextBox,"Shift TextBox Gorunur Degil");
        ReusableMethods.isDisplayed(homePage.dateTextBox,"Date TextBox Gorunur Degil");
        ReusableMethods.isDisplayed(homePage.messageTextBox,"Message TextBox Gorunur Degil");

    }




    @Given("Kullanici navbar menuden {int}. secenege tiklar")
    public void kullanici_navbar_menuden_secenege_tiklar(Integer index) {
        WebElement xpath = Driver.getDriver().findElement(By.xpath("(//ul[@class='nav navbar-nav navbar-right']//li)["+index+"]"));
        xpath.click();
    }



    @Given("Acilan sayfanin dogru url ye gittigi dogrulanır")
    public void acilan_sayfanin_dogru_url_ye_gittigi_dogrulanır() {
        ReusableMethods.verifyAssertTrue("https://qa.heallifehospital.com/", Driver.getDriver().getCurrentUrl(), "Urle gidilemedi");
    }

    @Given("Acilan sayfanin homepage oldugu dogrulanır")
    public void acilan_sayfanin_homepage_oldugu_dogrulanır() {

        ReusableMethods.isDisplayed(homePage.homepageLogo,"Logo gorunur degil");

    }

    @Given("kullanici gallery linkine tiklar ve gallery sayfasina gittigini dogrular")
    public void kullanici_gallery_linkine_tiklar_ve_gallery_sayfasina_gittigini_dogrular() {
        HealLifeMethods.navbarMenu(9);
        ReusableMethods.isDisplayed(homePage.galleryText,"gallery text gorunur degil");
    }



    @When("Kullanici Gallery sayfasindaki basliklarin gorunur oldugunu dogrular")
    public void kullanici_gallery_sayfasindaki_basliklarin_gorunur_oldugunu_dogrular() {
        HealLifeMethods.galleryBaslik(1);
        HealLifeMethods.galleryBaslik(2);
        HealLifeMethods.galleryBaslik(3);
        ReusableMethods.wait(1);
        JSMethods.scrollToBottom(Driver.getDriver());
        HealLifeMethods.galleryBaslik(4);
        HealLifeMethods.galleryBaslik(5);
        HealLifeMethods.galleryBaslik(6);

    }



    @Then("Kullanici Gallery sayfasindaki bolumlerde aciklama yazdigi dogrulanir")
    public void kullanici_gallery_sayfasindaki_bolumlerde_aciklama_yazdigi_dogrulanir() {
        HealLifeMethods.galleryBaslikClick(1);
        ReusableMethods.isDisplayed(homePage.galleryAciklama,"aciklama gorunur degil");
        HealLifeMethods.galleryResim(1);
        HealLifeMethods.galleryResim(2);
        HealLifeMethods.galleryResim(3);
        HealLifeMethods.galleryResim(4);
        HealLifeMethods.galleryResim(5);
        HealLifeMethods.galleryResim(6);
        ReusableMethods.wait(1);
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);

        HealLifeMethods.galleryBaslikClick(2);
        ReusableMethods.isDisplayed(homePage.galleryAciklama,"aciklama gorunur degil");
        HealLifeMethods.galleryResim(1);
        HealLifeMethods.galleryResim(2);
        HealLifeMethods.galleryResim(3);
        ReusableMethods.wait(1);
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);

        HealLifeMethods.galleryBaslikClick(3);
        ReusableMethods.isDisplayed(homePage.galleryAciklama,"aciklama gorunur degil");
        HealLifeMethods.galleryResim(1);
        HealLifeMethods.galleryResim(2);
        HealLifeMethods.galleryResim(3);
        HealLifeMethods.galleryResim(4);
        HealLifeMethods.galleryResim(5);
        ReusableMethods.wait(1);
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);
        JSMethods.scrollToBottom(Driver.getDriver());

        HealLifeMethods.galleryBaslikClick(4);
        ReusableMethods.isDisplayed(homePage.galleryAciklama,"aciklama gorunur degil");
        HealLifeMethods.galleryResim(1);
        HealLifeMethods.galleryResim(2);
        HealLifeMethods.galleryResim(3);
        ReusableMethods.wait(1);
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);

        HealLifeMethods.galleryBaslikClick(5);
        ReusableMethods.isDisplayed(homePage.galleryAciklama,"aciklama gorunur degil");
        HealLifeMethods.galleryResim(1);
        HealLifeMethods.galleryResim(2);
        HealLifeMethods.galleryResim(3);
        HealLifeMethods.galleryResim(4);
        ReusableMethods.wait(1);
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);

        HealLifeMethods.galleryBaslikClick(6);
        ReusableMethods.isDisplayed(homePage.galleryAciklama,"aciklama gorunur degil");
        HealLifeMethods.galleryResim(1);
        HealLifeMethods.galleryResim(2);
        HealLifeMethods.galleryResim(3);
        HealLifeMethods.galleryResim(4);
        ReusableMethods.wait(1);
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);

    }


    @Then("Kullanici appointment Message'a {string} yazar")
    public void kullaniciAppointmentMessageAYazar(String message) {
        homePage.messageTextBox.sendKeys(message);
    }

    @Then("Kullanici appointment Slot'a tiklar. Uygun zaman secilip, randevu olusturulur")
    public void kullaniciAppointmentSlotATiklarUygunZamanSecilipRandevuOlusturulur() {
        homePage.slotButton.click();
        WebElement slot = Driver.getDriver().findElement(By.xpath("(//span[@class=' row badge badge-pill badge-success-soft'])[4]"));
        slot.click();
        ReusableMethods.wait(1);
        homePage.patientNameTextBox.sendKeys("bektas");
        homePage.emailTextBox.sendKeys(faker.internet().emailAddress());
        homePage.phoneTextBox.sendKeys("+14082267529");
        ReusableMethods.wait(1);
        homePage.submitButton.click();
        ReusableMethods.wait(1);
    }

    @Then("Kullanici randevu odemelerini gerceklestirir")
    public void kullaniciRandevuOdemeleriniGerceklestirir() {

        homePage.payButton.click();
        homePage.payWithCardButton.click();
        Driver.getDriver().switchTo().frame(homePage.iframe);
        ReusableMethods.wait(1);
        homePage.iframeEmailBox.sendKeys(faker.internet().emailAddress());
        homePage.iframeCardNumberTextbox.sendKeys("4242424242424242");
        homePage.iframeCardCC.sendKeys("042028");
        homePage.iframeCardCVC.sendKeys("4242");
        Driver.getDriver().switchTo().parentFrame();
        ReusableMethods.wait(1);
        homePage.iframeCardPayButton.click();


    }
}
