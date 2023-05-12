package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HealLifeMethods {


    public static void navbarMenu(Integer index){

        WebElement xpath = Driver.getDriver().findElement(By.xpath("(//ul[@class='nav navbar-nav navbar-right']//li)["+index+"]"));
        xpath.click();

    }


    public static void adminSidebarMenu(Integer index){
        WebElement xpath = Driver.getDriver().findElement(By.xpath("(//ul[@class='sidebar-menu verttop']//li)["+index+"]"));
        xpath.click();
    }

    public static void patientSidebarMenu(Integer index){
        WebElement xpath = Driver.getDriver().findElement(By.xpath("(//ul[@class='sidebar-menu verttop2']//li)["+index+"]"));
        xpath.click();
    }

    public static void filterBarMenu(Integer index){
        WebElement xpath = Driver.getDriver().findElement(By.xpath("(//tr[@role='row']//th)["+index+"]"));
        xpath.click();
    }

    public static void footerSocialMediaBarMenu(Integer index){
        WebElement xpath = Driver.getDriver().findElement(By.xpath("(//ul[@class='company-social']//li)["+index+"]"));
        xpath.click();
    }

    public static void footerSayfaYonlendirmeMenu(Integer index){
        WebElement xpath = Driver.getDriver().findElement(By.xpath("(//ul[@class='f1-list']//li)["+index+"]"));
        xpath.click();
    }

    public static void searchBox(String SearchWord){
        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//input[@type='search']"));
        searchBox.sendKeys(SearchWord);
    }

    public static void galleryBaslik(Integer index){
        WebElement baslik = Driver.getDriver().findElement(By.xpath("(//div[@class='evcontentfix']//h3)["+index+"]"));
        baslik.isDisplayed();
    }

    public static void galleryBaslikClick(Integer index){
        WebElement baslik = Driver.getDriver().findElement(By.xpath("(//div[@class='evcontentfix']//h3)["+index+"]"));
        baslik.click();
    }


    public static void galleryResim(Integer index){
        WebElement baslik = Driver.getDriver().findElement(By.xpath("(//div[@class='content-overlay'])["+index+"]"));
        baslik.isDisplayed();
    }














}
