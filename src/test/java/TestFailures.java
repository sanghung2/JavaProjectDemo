import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class TestFailures extends BaseTest {

   Utilities utilities = new Utilities();

    @Test
    public void RandomTest() {
       utilities.NavigateToURL("www.google.com");
       System.out.println("Navigated to page");
    }

    @Test
    public void RandomTest2() {
        utilities.NavigateToURL("www.ebay.com");
        System.out.println("Navigated to page");
    }

   @Test
   public void RandomTest3() {
       utilities.NavigateToURL("www.google.com");
       System.out.println("Navigated to page");
   }

   @Test
   public void RandomTest4() {
       utilities.NavigateToURL("www.google.com");
       System.out.println("Navigated to page");
   }

   @Test
   public void RandomTest5() {
       utilities.NavigateToURL("www.google.com");
       System.out.println("Navigated to page");
   }

   @Test
   public void RandomTest6() {
       utilities.NavigateToURL("www.google.com");
       System.out.println("Navigated to page");
   }

   @Test
   public void RandomTest7() {
       utilities.NavigateToURL("www.google.com");
       System.out.println("Navigated to page");
   }

   @Test
   public void RandomTest8() {
       utilities.NavigateToURL("www.google.com");
       System.out.println("Navigated to page");
   }

   @Test
   public void RandomTest9() {
       utilities.NavigateToURL("www.google.com");
       System.out.println("Navigated to page");
   }

   @Test
   //This test will fail
   public void RandomTest10() {
       utilities.NavigateToURL("www.yahoo.com");
       utilities.ClickElementByID("hello fail");
   }

   @AfterMethod
   public void tearDown(ITestResult result) {

    // Here will compare if test is failing then only it will enter into if condition
        if(ITestResult.FAILURE==result.getStatus()) {
            try {
                // Create refernce of TakesScreenshot
                String dir = System.getProperty("user.dir");
                String pathDir = dir + "/" + result.getName() + ".png";
                //System.out.println(pathDir);
                File screenshotFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
                System.out.println(screenshotFile);
                FileHandler.copy(screenshotFile, new File(pathDir));
                System.out.println("Screenshot taken");
            } catch (Exception e) {
                System.out.println("Exception while taking screenshot "+e.getMessage());
            }
        } 
    // close application
        getDriver().quit();
    }
}
