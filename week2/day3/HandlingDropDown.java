package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
		
		//Launch the web application
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//code to maximize the window
		driver.manage().window().maximize();
		
	
		
		driver.findElement(By.xpath("(//input[@class=\"inputLogin\"])[1]")).sendKeys("demoSalesManager");
		driver.findElement(By.xpath("(//input[@class=\"inputLogin\"])[2]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestCompany");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Prathi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thiru");
		
		//Find the dropdown webelement - DD must have <select> tag in DOM
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourcedd = new Select(source);
		sourcedd.selectByIndex(6);
		
		WebElement market = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select mc = new Select(market);
		mc.selectByVisibleText("Automobile");
		
		WebElement owner = driver.findElement(By.name("ownershipEnumId"));
		Select ow = new Select(owner);
		ow.selectByValue("OWN_SCORP");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		 String t = driver.getTitle();
		System.out.println(t);
			
		//code to close the window
		//driver.close();
		
	}

}
