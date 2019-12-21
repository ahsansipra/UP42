package POM_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectCreation_Objects {
	
	WebDriver driver;
//	By start_project=By.xpath("/html/body/div[2]/section/main/div/div[1]/div/button");
	
	By start_project=By.xpath("//button[@class='upButton_1ISuKq9p alternate_1UbXIHJa muted_1s4p0_3v']");
	By project_name=By.id("name");
	By project_desc=By.id("description");
	By project_save=By.xpath("//BUTTON[@class='upButton_1ISuKq9p']");

	
	public ProjectCreation_Objects(WebDriver driver) 
	{
		this.driver=driver;
		
	}
	
	public void projectStart_Click()
	{
		driver.findElement(start_project).click();
	}
	
	public void setProjectName(String projName)
	{
		driver.findElement(project_name).sendKeys(projName);
	}
	
	public void setProjectDescription(String projDes)
	{
		driver.findElement(project_desc).sendKeys(projDes);
	}
	
	public void projectSave_Click()
	{
		driver.findElement(project_save).click();
	}
	
}
