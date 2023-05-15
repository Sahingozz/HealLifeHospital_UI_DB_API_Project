package stepdefinitions;


import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AdminPage;
import pages.DoctorPage;
import pages.HomePage;
import pages.PatientPage;
import utilities.*;

import java.time.Duration;

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
    //-------------------------------------- zafer
    @Given("Anasayfada Latest News bilgilerinin kayan yazi seklinde ve gorunur oldugu dogrulanir")
    public void anasayfada_latest_news_bilgilerinin_kayan_yazi_seklinde_ve_gorunur_oldugu_dogrulanir() {
        boolean isScrolling = homePage.latestNewsAlani.getAttribute("behavior").contains("scroll");
        Assert.assertTrue("Latest News alani kaymıyor !", isScrolling);
        ReusableMethods.isDisplayed(homePage.latestNewsText,"Latest News Text görünmüyor");

    }

    @Given("Browser kapatilir")
    public void browserKapatilir() {
        Driver.closeDriver();
    }

    @Given("Anasayfada logo ve ust bardaki menu basliklarinin varligi dogrulanir")
    public void anasayfada_logo_ve_ust_bardaki_menu_basliklarinin_varligi_dogrulanir() {
        ReusableMethods.isDisplayed(homePage.homepageLogo, "HomePage Logo Gorunur Degil");
        ReusableMethods.isDisplayed(homePage.homeLinkUst, "HomePage üst bar'da Home Link Gorunur Degil");
        ReusableMethods.isDisplayed(homePage.latestNewsText, "HomePage üst bar'da Latest News (Events) Link Gorunur Degil");
        ReusableMethods.isDisplayed(homePage.aboutUsLink, "HomePage üst bar'da About us Link Gorunur Degil");
        ReusableMethods.isDisplayed(homePage.GalleryLink, "HomePage üst bar'da Gallery Link Gorunur Degil");
        ReusableMethods.isDisplayed(homePage.contactUsLinkUst, "HomePage üst bar'da Contact Us Link Gorunur Degil");

    }
    @Given("Anasayfada logo tiklanir ve sayfanin yeniden cagrildigi \\(refresh) dogrulanir")
    public void anasayfada_logo_tiklanir_ve_sayfanin_yeniden_cagrildigi_refresh_dogrulanir() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        homePage.homepageLogo.click();
        WebElement refreshKontrol = wait.until(ExpectedConditions.visibilityOf(homePage.latestNews1stElement));
        boolean isRefreshed;
        if(refreshKontrol !=null){
            isRefreshed=true;
        }else{
            isRefreshed=false;
        }
        Assert.assertTrue("Sayfa yenilenemedi", isRefreshed);


    }

    @Given("Anasayfada ust barda bulunan home linki tiklanir ve anasayfada kaldigi dogrulanir")
    public void anasayfada_ust_barda_bulunan_home_linki_tiklanir_ve_anasayfada_kaldigi_dogrulanir() {
        String expectedHomeUrl ="https://qa.heallifehospital.com/";
        homePage.homeLinkUst.click();
        String actualHomeUrl = Driver.getDriver().getCurrentUrl();
        ReusableMethods.verifyAssertTrue(expectedHomeUrl,actualHomeUrl,"ilgili sayfaya yönlendirmiyor");
    }
    @Given("Anasayfada ust barda Appointment linki tiklanir ve ilgili sayfanin acildigi dogrulanir")
    public void anasayfada_ust_barda_appointment_linki_tiklanir_ve_ilgili_sayfanin_acildigi_dogrulanir() {
        String expAppointmentUrl ="https://qa.heallifehospital.com/form/appointment";
                homePage.appointmentLink.click();
        String actualAppointmentUrl = Driver.getDriver().getCurrentUrl();
        ReusableMethods.verifyAssertTrue(expAppointmentUrl,actualAppointmentUrl,"ilgili sayfaya yönlendirmiyor");
    }
    @Given("Anasayfada ust barda Latest News linki tiklanir ve ilgili sayfanin acildigi dogrulanir")
    public void anasayfada_ust_barda_latest_news_linki_tiklanir_ve_ilgili_sayfanin_acildigi_dogrulanir() {
        String expLatestNewsUrl = "https://qa.heallifehospital.com/read/from-the-harvard-university-cell-science-course-prof-dr-alexander-smith-will-attend-the-cell-science-panel-to-be-held-in-our-hospital-as-a-speaker";
        ReusableMethods.wait(3);
        homePage.latestNews1stElement.click();
        String actualLatestNewsUrl = Driver.getDriver().getCurrentUrl();
        ReusableMethods.verifyAssertTrue(expLatestNewsUrl, actualLatestNewsUrl, "ilgili sayfaya yönlendirilmedi");
    }
    @Given("Anasayfada About Us linki tiklanir ve ilgili sayfanin acildigi dogrulanir")
    public void anasayfada_about_us_linki_tiklanir_ve_ilgili_sayfanin_acildigi_dogrulanir() {
        homePage.aboutUsLink.click();
        boolean isAboutUsLink ;
        if(homePage.aboutHospitalsLink.isDisplayed()){
            isAboutUsLink=true;
        }else{
            isAboutUsLink=false;
        }
        Assert.assertTrue("About Us linki calismiyor", isAboutUsLink);
    }
    @Given("Anasayfada Gallery linki tiklanir ve ilgili sayfanin acildigi dogrulanir")
    public void anasayfada_gallery_linki_tiklanir_ve_ilgili_sayfanin_acildigi_dogrulanir() {
        String expGalleryUrl = "https://qa.heallifehospital.com/page/gallery";
        homePage.GalleryLink.click();
        String actualGalleryUrl = Driver.getDriver().getCurrentUrl();
        ReusableMethods.verifyAssertTrue(expGalleryUrl, actualGalleryUrl, "ilgili sayfaya yönlendirilmedi");
    }
    @Given("Anasayfada Contact Us linki tiklanir ve ilgili sayfanin acildigi dogrulanir")
    public void anasayfada_contact_us_linki_tiklanir_ve_ilgili_sayfanin_acildigi_dogrulanir() {
        String expContactUsUrl = "https://qa.heallifehospital.com/page/contact-us";
        homePage.contactUsLinkUst.click();
        String actualContactUsUrl = Driver.getDriver().getCurrentUrl();
        ReusableMethods.verifyAssertTrue(expContactUsUrl, actualContactUsUrl, "ilgili sayfaya yönlendirilmedi");
    }


}
