import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class TestNG {
	WebDriver driver;
	
  @Test(priority=1)
  public void booking() throws IOException, InterruptedException {
	  String url="https://in.bookmyshow.com/";
	  driver.get(url);
	  System.out.println("do QT");
	  Set <String> se = driver.getWindowHandles();
	  Iterator <String> it = se.iterator();
	  driver.switchTo().window(it.next());
	  Thread.sleep(4000);
      driver.findElement(By.id("wzrk-confirm")).click();
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div[2]/ul/li[8]/div/div/img")).click();
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/div[3]/div[1]/div[2]/div/div/div/div[1]/div/div[2]/a/div")).click();
	  Thread.sleep(4000); 
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  Thread.sleep(4000);
	  js.executeScript("window.scrollTo(0,800)");
	  driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/div[4]/div[2]/div[5]/div/div/div[2]/a[2]/div/div[3]/div[1]/div")).click();
	  Thread.sleep(5000);
	  File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(scrFile, new File("/home/akash/Documents/Placement/testingProject/req/test.jpg"), true);
      driver.findElement(By.xpath("//*[@id=\"page-cta-container\"]/button")).click();
      Thread.sleep(4000);
      JavascriptExecutor js1 = (JavascriptExecutor)driver;
	  Thread.sleep(4000);
	  js1.executeScript("window.scrollTo(0,400)");
	  driver.findElement(By.xpath("//*[@id=\"venuelist\"]/li[7]/div[2]/div[2]/div/a")).click();
	  driver.findElement(By.id("btnPopupAccept")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("pop_5")).click();
	  driver.findElement(By.xpath("//*[@id=\"proceed-Qty\"]")).click();
	  Thread.sleep(3000);
	  Scanner row = new Scanner(System.in);
	  System.out.println("enter the row Number start with 1");
	  int num = row.nextInt();
	  Scanner ob = new Scanner(System.in);
	  System.out.println("enter a site  number start with 3");
	  int st = ob.nextInt();
	  driver.findElement(By.xpath("//*[@id=\"layout\"]/table/tbody/tr["+num+"]/td[2]/div["+st+"]")).click();
	  Thread.sleep(6000);
	  driver.findElement(By.xpath("//*[@id=\"btmcntbook\"]")).click();
	  Thread.sleep(6000);
	  driver.findElement(By.xpath("//*[@id=\"prePay\"]")).click();
	  Thread.sleep(10000);
  }
  @Test(priority=2)
  public void about() throws InterruptedException { 
	  String url ="https://in.bookmyshow.com/";
	  driver.get(url);
	  Set <String> se = driver.getWindowHandles();
	  Iterator <String> it = se.iterator();
	  driver.switchTo().window(it.next());
	  Thread.sleep(4000);
      driver.findElement(By.id("wzrk-confirm")).click();
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div[2]/ul/li[8]/div/div/img")).click();
	  Thread.sleep(4000);
	  Scanner ob = new Scanner(System.in);
	  System.out.println("select your options ( Movies , Stream , Events , Plays , Sports , Activities , Buzz )");
	  String st = ob.nextLine();
	  Thread.sleep(4000);
      driver.findElement(By.linkText(st)).click();
      Thread.sleep(4000);
      if(st=="Movies") {
    	  Scanner mo = new Scanner(System.in);
    	  System.out.println("select your language ( Hindi , English , Marathi , Malayalam , Tamil , Telugu , Gujarati , Punjabi , Tulu )");
    	  String ty = mo.nextLine();
    	  Thread.sleep(4000);
          driver.findElement(By.linkText(ty)).click();
          Thread.sleep(4000);
          JavascriptExecutor js1 = (JavascriptExecutor)driver;
    	  Thread.sleep(4000);
    	  js1.executeScript("window.scrollTo(0,400)");
          Scanner na = new Scanner(System.in);
    	  System.out.println(" enter your movie name ");
    	  String me = na.nextLine();
    	  Thread.sleep(4000);
    	  driver.findElement(By.linkText(me)).click();
    	  JavascriptExecutor js2 = (JavascriptExecutor)driver;
    	  Thread.sleep(4000);
    	  js2.executeScript("window.scrollTo(0,600)"); 
    	  System.out.println(" Enter your Cast OR Crew for  About ");
    	  Scanner ab = new Scanner(System.in);
    	  System.out.println(" enter your movie name ");
    	  String out = ab.nextLine();
    	  driver.findElement(By.linkText(out)).click();
    	  Thread.sleep(6000);
    	  driver.close();
      }
      else if (st=="Stream"){
    	  
    	  
      }
      else if (st=="Events"){
    	  
    	  
      }
      else if (st=="Plays"){
	  
	  
      }
      else if (st=="Sports"){
	  
	  
      }
      else if (st=="Activities"){
    	  
    	  
      }
      else if (st=="Buzz"){
    	  
    	  
      }
      else {
    	  System.out.println(" kya hora re baba ");
      }
      
	  
  }
  
  @Test(priority=3)
  public void stream() { 
	  System.out.println("karunga bro");
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  Scanner ft = new Scanner(System.in);
	  System.out.println("which driver you use 1) Chrome 2) FierFox 3) Opera 4) Edge ");
	  int num = ft.nextInt();
	  if(num==1) {
		  System.out.println("not found");
	  }
	  else if (num==2) {
		  System.out.println("not found");
	  }
	  else if (num==3) {
		  System.out.println("not found");
	  }
	  System.setProperty("webdriver.edge.driver","/home/akash/Documents/Placement/testingProject/req/webDriver/msedgedriver");
	  driver = new EdgeDriver();  
  }

  @AfterTest
  public void afterMethod() throws InterruptedException {
	  System.out.println("band kar rha hu");
	  Thread.sleep(6000);
	  driver.quit();
  }

}
