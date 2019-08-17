import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {


    public String navigation () {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/");

        WebElement inputForms = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"));
        inputForms.click();

        WebElement simpleFormDemo = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"));
        simpleFormDemo.click();

        String finalUrl = driver.getCurrentUrl();
        driver.close();
        return finalUrl;
    }

    public String singleField () {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/");

        WebElement inputForms = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"));
        inputForms.click();

        WebElement simpleFormDemo = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"));
        simpleFormDemo.click();

        WebElement inputField = driver.findElement(By.cssSelector("#user-message"));
        inputField.sendKeys("lobab represent");
        driver.findElement(By.cssSelector("div.container-fluid.text-center:nth-child(2) div.row div.col-md-6.text-left:nth-child(2) div.panel.panel-default:nth-child(4) div.panel-body form:nth-child(3) > button.btn.btn-default")).click();

        String resultString = driver.findElement(By.cssSelector("#display")).getText();
        driver.close();

        return resultString;

    }


}
