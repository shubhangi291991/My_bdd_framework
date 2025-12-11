package LibraryFile;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class UtilityClass {

public static void capturescreenshot(Scenario sce) throws IOException {
    //capturescreenshot
    File srcfilepath= ((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.FILE);

    //settimeand date
    String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

    String ScenarioName=sce.getName().replaceAll(" ","_");

    //destination path

    String Destpath="Screenshot/"+ScenarioName+"_"+timestamp+".png";
    File destfile=new File(Destpath);
    FileHandler.copy(srcfilepath,destfile);

}

public static String GetPFData(String Key) throws IOException {
    FileInputStream file=new FileInputStream("C:\\Users\\dhira\\IdeaProjects\\my_bdd_framework\\src\\main\\java\\LibraryFile\\Propertyfile.properties");
    Properties prop=new Properties();
    prop.load(file);
    String value=prop.getProperty(Key);
    return value;


}
}
