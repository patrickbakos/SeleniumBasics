import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.border.EmptyBorder;

public class Selenium {


    public String navigation () {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/");

        driver.findElement(By.cssSelector("div.container-fluid.text-center:nth-child(3) div.row div.col-md-3.sidenav:nth-child(1) div.panel.panel-default div.panel-body ul.treeview.treeview-tree li.tree-branch ul:nth-child(3) li.tree-branch:nth-child(1) > a:nth-child(2)")).click();
        driver.findElement(By.cssSelector("div.container-fluid.text-center:nth-child(3) div.row div.col-md-3.sidenav:nth-child(1) div.panel.panel-default div.panel-body ul.treeview.treeview-tree li.tree-branch ul:nth-child(3) li.tree-branch:nth-child(1) ul:nth-child(3) li:nth-child(1) > a:nth-child(1)")).click();

        String finalUrl = driver.getCurrentUrl();
        driver.close();
        return finalUrl;
    }

    public String singleField () {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/");

        driver.findElement(By.cssSelector("div.container-fluid.text-center:nth-child(3) div.row div.col-md-3.sidenav:nth-child(1) div.panel.panel-default div.panel-body ul.treeview.treeview-tree li.tree-branch ul:nth-child(3) li.tree-branch:nth-child(1) > a:nth-child(2)")).click();
        driver.findElement(By.cssSelector("div.container-fluid.text-center:nth-child(3) div.row div.col-md-3.sidenav:nth-child(1) div.panel.panel-default div.panel-body ul.treeview.treeview-tree li.tree-branch ul:nth-child(3) li.tree-branch:nth-child(1) ul:nth-child(3) li:nth-child(1) > a:nth-child(1)")).click();

        driver.findElement(By.cssSelector("#user-message")).sendKeys("lobab represent");
        driver.findElement(By.cssSelector("div.container-fluid.text-center:nth-child(2) div.row div.col-md-6.text-left:nth-child(2) div.panel.panel-default:nth-child(4) div.panel-body form:nth-child(3) > button.btn.btn-default")).click();

        String resultString = driver.findElement(By.cssSelector("#display")).getText();
        driver.close();

        return resultString;
    }

    public String twoInputFields () {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/");

        driver.findElement(By.cssSelector("div.container-fluid.text-center:nth-child(3) div.row div.col-md-3.sidenav:nth-child(1) div.panel.panel-default div.panel-body ul.treeview.treeview-tree li.tree-branch ul:nth-child(3) li.tree-branch:nth-child(1) > a:nth-child(2)")).click();
        driver.findElement(By.cssSelector("div.container-fluid.text-center:nth-child(3) div.row div.col-md-3.sidenav:nth-child(1) div.panel.panel-default div.panel-body ul.treeview.treeview-tree li.tree-branch ul:nth-child(3) li.tree-branch:nth-child(1) ul:nth-child(3) li:nth-child(1) > a:nth-child(1)")).click();


        driver.findElement(By.cssSelector("#sum1")).sendKeys("-10");
        driver.findElement(By.cssSelector("#sum2")).sendKeys("3");


        driver.findElement(By.cssSelector("div.container-fluid.text-center:nth-child(2) div.row div.col-md-6.text-left:nth-child(2) div.panel.panel-default:nth-child(5) div.panel-body form:nth-child(3) > button.btn.btn-default:nth-child(3)")).click();

        String resultString = driver.findElement(By.cssSelector("#displayvalue")).getText();
        driver.close();

        return resultString;
    }

    public String checkbox () {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/");

        driver.findElement(By.cssSelector("div.container-fluid.text-center:nth-child(3) div.row div.col-md-3.sidenav:nth-child(1) div.panel.panel-default div.panel-body ul.treeview.treeview-tree li.tree-branch ul:nth-child(3) li.tree-branch:nth-child(1) > a:nth-child(2)")).click();
        driver.findElement(By.cssSelector("div.container-fluid.text-center:nth-child(3) div.row div.col-md-3.sidenav:nth-child(1) div.panel.panel-default div.panel-body ul.treeview.treeview-tree li.tree-branch ul:nth-child(3) li.tree-branch:nth-child(1) ul:nth-child(3) li:nth-child(2) > a:nth-child(1)")).click();
        driver.findElement(By.id("isAgeSelected")).click();

        String validationMessage = driver.findElement(By.cssSelector("#txtAge")).getText();
        driver.close();

        return validationMessage;
    }

    public String selectDropdown () {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/");

        driver.findElement(By.cssSelector("div.container-fluid.text-center:nth-child(3) div.row div.col-md-3.sidenav:nth-child(1) div.panel.panel-default div.panel-body ul.treeview.treeview-tree li.tree-branch ul:nth-child(3) li.tree-branch:nth-child(1) > a:nth-child(2)")).click();
        driver.findElement(By.cssSelector("div.container-fluid.text-center:nth-child(3) div.row div.col-md-3.sidenav:nth-child(1) div.panel.panel-default div.panel-body ul.treeview.treeview-tree li.tree-branch ul:nth-child(3) li.tree-branch:nth-child(1) ul:nth-child(3) li:nth-child(4) > a:nth-child(1)")).click();
        driver.findElement(By.cssSelector("div.container-fluid.text-center:nth-child(2) div.row div.col-md-6.text-left:nth-child(2) div.panel.panel-default:nth-child(4) div.panel-body select.form-control:nth-child(3) > option:nth-child(3)")).click();

        String validationMessage = driver.findElement(By.cssSelector("div.container-fluid.text-center:nth-child(2) div.row div.col-md-6.text-left:nth-child(2) div.panel.panel-default:nth-child(4) div.panel-body > p.selected-value:nth-child(5)")).getText();
        driver.close();

        return validationMessage;
    }

    public String radioButtons () {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/");

        driver.findElement(By.cssSelector("div.container-fluid.text-center:nth-child(3) div.row div.col-md-3.sidenav:nth-child(1) div.panel.panel-default div.panel-body ul.treeview.treeview-tree li.tree-branch ul:nth-child(3) li.tree-branch:nth-child(1) > a:nth-child(2)")).click();
        driver.findElement(By.cssSelector("div.container-fluid.text-center:nth-child(3) div.row div.col-md-3.sidenav:nth-child(1) div.panel.panel-default div.panel-body ul.treeview.treeview-tree li.tree-branch ul:nth-child(3) li.tree-branch:nth-child(1) ul:nth-child(3) li:nth-child(3) > a:nth-child(1)")).click();
        driver.findElement(By.cssSelector("div.container-fluid.text-center:nth-child(2) div.row div.col-md-6.text-left:nth-child(2) div.panel.panel-default:nth-child(5) div.panel-body div:nth-child(2) label.radio-inline:nth-child(3) > input:nth-child(1)")).click();
        driver.findElement(By.cssSelector("div.container-fluid.text-center:nth-child(2) div.row div.col-md-6.text-left:nth-child(2) div.panel.panel-default:nth-child(5) div.panel-body div:nth-child(3) label.radio-inline:nth-child(2) > input:nth-child(1)")).click();
        driver.findElement(By.cssSelector("div.container-fluid.text-center:nth-child(2) div.row div.col-md-6.text-left:nth-child(2) div.panel.panel-default:nth-child(5) div.panel-body > button.btn.btn-default:nth-child(5)")).click();

        String validationMessage = driver.findElement(By.cssSelector("div.container-fluid.text-center:nth-child(2) div.row div.col-md-6.text-left:nth-child(2) div.panel.panel-default:nth-child(5) div.panel-body > p.groupradiobutton:nth-child(8)")).getText();
        driver.close();

        return validationMessage;
    }

}
