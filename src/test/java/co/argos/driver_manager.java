package co.argos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class driver_manager {
    public WebDriver driver;
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();
    }
    public void tearDown(){
        driver.quit();
    }
    public void sleep(int ms){
        try {
            Thread.sleep(ms);
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }
    public int randomNumber(int size){
        Random random =new Random();
        return random.nextInt(size-1);
    }
}
