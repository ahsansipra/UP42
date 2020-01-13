package Tests;

import org.testng.annotations.Test;

import POM_Actions.Login_Objects;
import POM_Actions.ProjectCreation_Objects;
import POM_Actions.WorkFlow_Objects;

import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;

public class Login_Test {
	WebDriver driver;
	Login_Objects login;
	ProjectCreation_Objects project;
	
  @Test
  public void login_test() {
	  
	  login=new Login_Objects(driver);
	  
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  login.signIn_Click();
	  login.setUserName("abc");
	  login.setPassword("abc");
	  login.click_SignIn();
  }
  
  @Test
  public void project_Creation_Test()
  {
	  project=new ProjectCreation_Objects(driver);
	  project.projectStart_Click();
	  project.setProjectName("abc");
	  project.setProjectDescription("description");
//	  project.projectSave_Click();   save is commented
	  
	  //cancel save project
	  driver.findElement(By.xpath("/html/body/div[2]/section/main/div/div[2]/div[2]/div/div/div[2]/form/div[2]/div[2]/button[1]")).click();
	  
  
  }
  
 @Test
  public void workFlows_Definition() throws InterruptedException
  {
	  
	  
	  WorkFlow_Objects workflow=new WorkFlow_Objects(driver);
	  
	  workflow.projectDetails_View();   //to view project details
	  workflow.create_WorkFlow_Click(); //to create workflow
	  workflow.setWorkFlow_Name("flowname");  //set workflow name
	  workflow.setFlowDescription("workflow description"); //set workflow description
	  workflow.workFlow_Next_Click(); //click next in workflow
	  workflow.addWrokFlow_Block(); //to add blocks/data in workflow
	  workflow.searchWorkFlow_Block("Sentinel-2 L1C MSI Aoi Clipped"); //1st block to search
	  workflow.selectSearched_Block(); //select searched block 
	  workflow.addBlock_Click();  //add selected block to workflow
	  
	  //adding 2nd block in workflow
	  
	  workflow.workFlow_SecondBlock();
	  workflow.searchWorkFlow_Block("sharpening filter"); //1st block to search
	  workflow.selectSearched_Block(); //select searched block 
	  workflow.addBlock_Click();  //add selected block to workflow
	  
	  workflow.workFlow_Blocks_Next();  //after adding blocks to workflow, click next
	  
	  
	  workflow.configure_Job();
	  
	    }
  
  	@BeforeSuite
  	public void beforeSuite() {
	  
 	  System.setProperty("webdriver.gecko.driver",".//geckodriver.exe");
  	  driver=new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("https://up42.com/");
  		}
  

  	@AfterSuite
  	public void afterSuite() {
	//  driver.close();
  	}

}
