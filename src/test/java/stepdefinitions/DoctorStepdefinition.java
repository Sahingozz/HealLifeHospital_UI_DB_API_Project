package stepdefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AdminPage;
import pages.DoctorPage;
import pages.HomePage;
import pages.PatientPage;
import utilities.ConfigReader;
import utilities.Driver;

public class DoctorStepdefinition {

    AdminPage adminPage = new AdminPage();
    DoctorPage doctorPage = new DoctorPage();
    HomePage homePage = new HomePage();
    PatientPage patientPage = new PatientPage();

}
