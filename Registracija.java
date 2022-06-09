import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.SafariDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class Registracija {

    public static String unesiIme(WebDriver driver, String ime){
        WebElement a = driver.findElement(By.id("firstName"));
        a.sendKeys(ime);
        return a.getAttribute("value");
    }

    public static String unesiPrezime(WebDriver driver, String prezime){
        WebElement a = driver.findElement(By.id("lastName"));
        a.sendKeys(prezime);
        return a.getAttribute("value");
    }

    public static String unesiEmail(WebDriver driver, String email){
        WebElement a = driver.findElement(By.id("email"));
        a.sendKeys(email);
        return a.getAttribute("value");
    }

    public static String unesiUsername(WebDriver driver, String username){
        WebElement a = driver.findElement(By.id("uniqueId"));
        a.sendKeys(username);
        return a.getAttribute("value");
    }

    public static String unesiSifru(WebDriver driver, String sifra){
        WebElement a = driver.findElement(By.name("pwdPlaintext"));
        a.sendKeys(sifra);
        return a.getAttribute("value");
    }

    public static String klikniDugme(WebDriver driver){
        WebElement a = driver.findElement(By.className("btn"));
        a.sendKeys(Keys.ENTER);
        return driver.getCurrentUrl();
    }

}
