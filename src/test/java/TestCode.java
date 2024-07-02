import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class TestCode {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/FileDownload.html");
        driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/a")).click();
        driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/a")).click();





        //driver.quit();

    }}

