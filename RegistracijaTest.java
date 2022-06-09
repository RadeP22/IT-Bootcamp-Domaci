import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RegistracijaTest {

    private static WebDriverManager wdm = new ChromeDriverManager();
    private static WebDriver driver;

    @BeforeTest
    public void priprema(){
        wdm.setup();
        driver = new ChromeDriver();
        driver.navigate().to("http://localhost:3001/signup");
    }

    @Test(priority = 1)
    public void testUnesiIme() {
        assertEquals(Selenium1.unesiIme(driver,"Rade"),"Rade");
    }

    @Test(priority = 2)
    public void testUnesiPrezime() {
        assertEquals(Selenium1.unesiPrezime(driver,"Petrovic"),"Petrovic");
    }

    @Test(priority = 3)
    public void testUnesiEmail() {
        assertEquals(Selenium1.unesiEmail(driver,"bbbbb@bbb.com"),"bbbbb@bbb.com");
    }

    @Test(priority = 4)
    public void testUnesiSifru(){
        assertEquals(Selenium1.unesiSifru(driver,"asdfg#$@1234"),"asdfg#$@1234");
    }

    @Test(priority = 5)
    public void testUnesiUsername() {
        assertEquals(Selenium1.unesiUsername(driver,"asdfg#1234"),"asdfg#1234");
    }


    @Test(priority = 6)
    public void testKlikniDugme() {
        assertEquals(Selenium1.klikniDugme(driver),"http://localhost:3001/");
    }

}