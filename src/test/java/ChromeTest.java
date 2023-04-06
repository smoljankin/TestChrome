import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

    @Test
    public <var> void FindPriceiMac() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.opencart.com/");

        driver.findElement(By.cssSelector("span.d-none.d-md-inline")).click();
        driver.findElement(By.linkText("€ Euro")).click();
        driver.findElement(By.linkText("Desktops")).click();

        WebElement iMac = driver.findElement(By.linkText("Mac (1)"));

        Thread.sleep(5000);

        Assert.assertTrue(iMac.isDisplayed());
        iMac.click();

        WebElement price2 =  driver.findElement(By.xpath("//*[@id='product-list']/div/form/div/div[2]/div[1]/div/span[1]"));

        Assert.assertEquals(price2.getText(), "111.55€");

        driver.quit();
    }


}
