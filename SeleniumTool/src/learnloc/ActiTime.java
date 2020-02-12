package learnloc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://admin-pc/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);
		String actualTitle = driver.getTitle();
		String expectedTitle="actiTIME - Enter Time-Track";
		if(actualTitle.equals(expectedTitle))
		
			{
				System.out.println("displayed--->"+expectedTitle);
			}
			else
			{
				System.out.println("not displayed--->"+actualTitle);
			}
		
		
		
		driver.findElement(By.xpath("//div[text()='Settings']/..")).click();
		driver.findElement(By.xpath("//a[text()=' Licenses ']")).click();
		String actualProductEdition  = driver.findElement(By.xpath("//nobr[text()='Product Edition:']/../../td[2]/b[1]")).getText();
		Thread.sleep(2000);
		
		
		String expectedProductEdition = "actiTIME v3.1";
		
		if(actualProductEdition.equals(expectedProductEdition))
		{
			System.out.println("displayed--->"+expectedProductEdition);
		}
		else
		{
			System.out.println("not displayed--->"+actualProductEdition);
		}
		
		String actualIssueDate = driver.findElement(By.xpath("//nobr[text()='Issue Date:']/../../td[2]")).getText();
	    String expectedIssueDate="Aug 04, 2011";
	    if(actualIssueDate.equals(expectedIssueDate))
	    {
			System.out.println("displayed--->"+expectedIssueDate);
		}
		else
		{
			System.out.println("not displayed--->"+actualIssueDate);
		}
				
		
	}

}
