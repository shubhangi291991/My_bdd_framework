package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\dhira\\IdeaProjects\\my_bdd_framework\\src\\test\\java\\Features\\Ex1_SwaglabLogin.feature",
        glue = {"Steps","Hooks"},
        publish = true,
        plugin = {"pretty","html:target/cucumber-report/SwagLabsReports.html"}
)

public class SwagLabRunner extends AbstractTestNGCucumberTests {
}
