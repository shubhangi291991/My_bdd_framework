package Hooks;

import LibraryFile.DriverFactory;
import LibraryFile.UtilityClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class SwagLabHooks
{

    @Before
    public void openbroswer()
    {
        DriverFactory.initializebrowswer("chrome");
    }
    @After
    public  void closebroswer(Scenario sce) throws IOException {
        if(sce.isFailed())
        {
            UtilityClass.capturescreenshot(sce);

        }

        DriverFactory.driver.quit();
    }
}
