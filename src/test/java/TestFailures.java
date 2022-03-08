import org.testng.annotations.Test;

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
}