package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\dhira\\IdeaProjects\\my_bdd_framework\\src\\test\\java\\Features\\Ex6_LoginToAppusingHooks.feature",
      //  tags="@performane or @sanity",
      //  plugin = "pretty",
        glue ={"Steps","Hooks"}

        //if you want multiple feature file give path upto feature  folder











)
public class sample_runner extends AbstractTestNGCucumberTests {


}
