import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinations {
    WebDriver driver;

    @Given("I am on main page")
    public void i_am_on_main_page() {
        System.setProperty("webdriver.chrome.driver", "/Users/memoonatahira/Downloads/chromedriverMoona");
        driver = new ChromeDriver();
        driver.get("https://expleogroup.se/");
        waitHere();
    }

    @When("I click on Hem")
    public void i_click_on_hem() {
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div/div/ul/li[1]/a")).click();
        waitHere();
    }

    @When("I am on other page")
    public void i_am_on_other_page() {
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div/div/ul/li[5]/a")).click();
        waitHere();
    }


    @Then("I should be at home page")
    public void i_should_be_at_home_page() {
        Assert.assertEquals("https://expleogroup.se/", driver.getCurrentUrl());
        driver.close();
    }

    @When("I click on Tjanster button")
    public void i_click_on_nyheter_button() {
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div/div/ul/li[2]/a")).click();
        waitHere();
    }


    @Then("I should be at services page")
    public void i_should_be_at_news_page() {
        Assert.assertEquals("https://expleogroup.se/services", driver.getCurrentUrl());
        driver.close();
    }

    @When("I click on Utbildningar button")
    public void i_click_on_Utbildningar_button() {
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div/div/ul/li[4]/a")).click();
        waitHere();
    }

    @Then("I should be at Utbildningar page")
    public void i_should_be_at_Utbildningar_page() {
        Assert.assertEquals("https://expleogroup.se/courses", driver.getCurrentUrl());

        driver.close();

    }

    @When("I click on Blogg")
    public void i_click_on_blogg() {
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div/div/ul/li[5]/a")).click();
        waitHere();
    }


    @Then("I should be at blogg page")
    public void i_should_be_at_blogg_page() {
        Assert.assertEquals("https://expleogroup.se/blogg", driver.getCurrentUrl());
        driver.close();
    }

    @When("I click on Tjänster button")
    public void i_click_on_tjänster_button() {
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div/div/ul/li[3]/a")).click();
        waitHere();
    }

    @Then("I should be at tjänster page")
    public void i_should_be_at_tjänster_page() {
        Assert.assertEquals("https://expleogroup.se/tj%C3%A4nster", driver.getCurrentUrl());
        driver.close();
    }

    void waitHere() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
