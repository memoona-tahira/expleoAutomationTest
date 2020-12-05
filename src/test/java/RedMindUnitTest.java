import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedMindUnitTest {

   @Test

    public void TestInvestmentLink(){

       System.setProperty("webdriver.chrome.driver", "/Users/memoonatahira/Downloads/chromedriverMoona");

       WebDriver driver = new ChromeDriver();
       driver.get("https://redmind.se/");
       waitHere(2000);
       driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/a[1]")).click();
                         waitHere(2000);

       driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div/nav/div/ul/li[11]/a/span")).click();
        waitHere(2000);
       driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div/nav/div/div/div[1]/div/ul/li[2]/a")).click();
       waitHere(2000);







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
