import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;

import java.sql.Time;

public class Initial {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

        // defined web driver
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();

        // created web element named Ticket Booking to locate and click on train booking menu

        WebElement TicketBooking = driver.findElement(By.className("menu_Trains"));
        TicketBooking.click();

       // created web element named departure to locate and click on departure city
        WebElement Departure = driver.findElement(By.id("fromCity"));
        Departure.click();

       //created web element city1 to locate and type the departure city and select it
       WebElement city1 = driver.findElement(By.xpath("//input[@placeholder='From']"));
        Thread.sleep(2000);
       city1.sendKeys("Delhi");
       Thread.sleep(2000);
        city1.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        city1.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

     //created another web element city2 to locate and type the destination city and select it
        WebElement city2 = driver.findElement(By.xpath("//input[@placeholder='To']"));
        Thread.sleep(2000);
        city2.sendKeys("Lucknow");
        Thread.sleep(2000);
        city2.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        city2.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        //created a web element Date to select date of the journey
       WebElement Date = driver.findElement(By.xpath("//div[@class=\"DayPicker-Day\"][contains(@aria-label,'Sat Aug 20 2022')]"));
       Date.click();

       // created a web element Class to select the class of the compartment
       WebElement Class = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div/div[2]/div/div[4]/ul/li[3]"));
       Thread.sleep(1000);
       Class.click();

      //created a web element Search to locate and click on the search button to search the required trains
       WebElement Search = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/p/a"));
       Search.click();












    }
}
