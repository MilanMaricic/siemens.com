import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AppTest {
    private String siteURL ="https://new.siemens.com/global/en.html";
    private String projectLocation = System.getProperty("user.dir");
    private WebDriver driver;

    @BeforeClass
    public void testSetup(){
        //If geckodriver not defined on system path uncomment bellow part and navigate to exact location of geckodriver.exe file
        /*
         System.setProperty("webdriver.gecko.driver", projectLocation +"\\lib\\geckodriver\\geckodriver.exe");
         System.setProperty("webdriver.firefox.bin","path to geckodriver.exe");
         */
        driver = new FirefoxDriver();
    }

    @Test
    public void loadHomePageTest(){
        driver.get(siteURL);
        Assert.assertEquals(driver.getTitle(), "Home | Siemens Global Website | Siemens Siemens Global Website");
        driver.quit();
    }

}
