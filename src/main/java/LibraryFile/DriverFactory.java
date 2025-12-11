package LibraryFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverFactory
{
    public static WebDriver driver;


    public static void initializebrowswer(String browsername)
    {

        if(browsername.equalsIgnoreCase("chrome"))
        {
            driver = new ChromeDriver();
        }
        else if(browsername.equalsIgnoreCase("firefox"))
        {
            driver = new FirefoxDriver();
        }
        else if (browsername.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
    }
}
