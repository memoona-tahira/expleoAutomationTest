import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZauqUnitTest {

    @Test
    public void testContactForm() {
        System.setProperty("webdriver.chrome.driver", "/Users/memoonatahira/Downloads/chromedriverMoona");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.zauq.com");
        waitHere(2000);
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div/nav/ul/li[7]/a")).click();
        waitHere(2000);
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div/nav/ul/li[7]/ul/li[2]/a")).click();
        waitHere(4000);
        driver.findElement(By.id("template-contactform-name")).sendKeys("Test");
        waitHere(1000);
        driver.findElement(By.id("template-contactform-email")).sendKeys("test@selenium.com");
        waitHere(1000);
        driver.findElement(By.id("template-contactform-phone")).sendKeys("0736754330");
        waitHere(1000);
        driver.findElement(By.id("template-contactform-subject")).sendKeys("Test Contact Me");
        waitHere(1000);
        driver.findElement(By.id("template-contactform-message")).sendKeys("Hi, Please ignore the message.");
        waitHere(2000);
        driver.findElement(By.id("submit-button")).click();
        waitHere(5000);
        driver.close();
    }


    void waitHere(long timemillis) {
        try {
            Thread.sleep(timemillis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
