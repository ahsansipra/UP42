package POM_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkFlow_Objects {
	
	WebDriver driver;
	WebDriverWait wait;

	By project_details=By.xpath("//H3[@class='heading_2cTvVfzL'][text()='abc']");
	By create_workflow=By.xpath("//BUTTON[@class='upButton_1ISuKq9p']");
	
	By workflow_name=By.id("name");
	By workflow_desc=By.id("description");
	By workflow_next=By.xpath("//BUTTON[@class='upButton_1ISuKq9p']");
	By workflow_addblock=By.xpath("(//BUTTON[@class='upButton_1ISuKq9p alternate_1UbXIHJa'])[1]");
	By searchblock=By.xpath("(//INPUT[@type='text'])[3]");
	By selectblock=By.xpath("//DIV[@class='vueCardHeader_2iDre_jZ withImage_3WP-XxqE header_3uP5h2TY']");
	By addblock=By.xpath("(//BUTTON[@class='upButton_1ISuKq9p'])[3]");
	
	By workflow_2ndblock=By.xpath("//BUTTON[@class='upButton_1ISuKq9p alternate_1UbXIHJa']");
	By workflow_blocks_next=By.xpath("(//BUTTON[@class='upButton_1ISuKq9p'])[2]");
	By configure_job=By.xpath("(//BUTTON[@class='upButton_1ISuKq9p'])[3]");
	

			
	
	public WorkFlow_Objects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void projectDetails_View()
	{
		//to view project details
		try {
			cookies_Click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		driver.findElement(project_details).click();
		
	}
	
	public void create_WorkFlow_Click()
	{
	//	WebElement mainclass=driver.findElement(By.className("main__Upx2MSG"));
	//	mainclass.findElement(create_workflow).click();
		driver.findElement(create_workflow).click();
	}
	public void setWorkFlow_Name(String flowname)
	{
		driver.findElement(workflow_name).sendKeys(flowname);
	}
	
	public void setFlowDescription(String flowdesc)
	{
		driver.findElement(workflow_desc).sendKeys(flowdesc);
	}
	
	public void workFlow_Next_Click() 
	{
		driver.findElement(workflow_next).click();
	}
	
	public void addWrokFlow_Block() throws InterruptedException
	{
//		wait=new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(workflow_addblock));
	Thread.sleep(2000);
		driver.findElement(workflow_addblock).click();
	}
	
	public void searchWorkFlow_Block(String srchblock)
	{
		driver.findElement(searchblock).sendKeys(srchblock);
	}
	
	public void selectSearched_Block()
	{
		driver.findElement(selectblock).click();
	}
	
	public void addBlock_Click()
	{
	//	wait.until(ExpectedConditions.elementToBeClickable(addblock));
		driver.findElement(addblock).click();
	}
	
	public void workFlow_SecondBlock()
	{
		driver.findElement(workflow_2ndblock).click();
	}
	
	public void workFlow_Blocks_Next()
	{
		driver.findElement(workflow_blocks_next).click();
	}
	
	public void configure_Job() throws InterruptedException
	{
	//	Thread.sleep(3000);
		
			driver.findElement(configure_job).click();
	}
	
	public void cookies_Click()
	{
		
		WebElement cookies=driver.findElement(By.xpath("/html/body/div[1]/div/a"));
		if (cookies.isEnabled())
		{
			cookies.click();
		}
		else
		{
			System.out.println("no cookies popup");
		}
	}
	
}
