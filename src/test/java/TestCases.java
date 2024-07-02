import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import javax.xml.transform.Source;
import java.util.Set;
import java.util.concurrent.Executor;

public class TestCases {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("file:C:\\Users\\pc2\\IdeaProjects\\SeleniumLearning\\src\\main\\resources\\index.html");

        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(By.xpath("//*[@id=\"inputEmail\"]"))).contextClick().perform();





}}









