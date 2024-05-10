package Doctor;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DoctorInpatient {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://development.medyaan.in/");
		driver.manage().window().maximize();

		//Login to Dotor's Dashboard
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//ul[@class='dropdown-menu show']//a)[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("phone")).sendKeys("8148528062");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Admin@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"btn login-button btn-secondary btn-block\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[normalize-space(text())='In-patient']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Manage'])[2]")).click();
		Thread.sleep(2000);

		//Vital History:
		/*driver.findElement(By.xpath("//*[text()='Vital history']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("datepicker")).click();
		WebElement PreviousButton = driver.findElement(By.xpath("(//*[@class='vd-icon'])[2]"));
		Thread.sleep(2000);
		PreviousButton.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[normalize-space(text())='7']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[normalize-space(text())='15']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[normalize-space(text())='Ok']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Height']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Weight']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Pulse rate']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Temperature']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='BP Diastolic']")).click();
		Thread.sleep(2000);*/
		//Case Sheet:
		driver.findElement(By.xpath("//*[text()='Case Sheet']")).click();
		Thread.sleep(2000);
		/*driver.findElement(By.id("searchInput")).sendKeys("Montel");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='suggestions']//li[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("custom-select")).click();
		WebElement Intake=driver.findElement(By.xpath("//*[@id=\"intakefield\"]"));
		driver.findElement(By.xpath("(//*[@class=\"custom-select rx-input\"])[1]")).click();
		Select Type1=new Select(Intake);
		Type1.selectByValue("Just before food");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"input-strength\"]")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type=\"text\"])[4]")).sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(By.id("daysfield")).sendKeys("10");
		Thread.sleep(2000);

		WebElement Tablet=driver.findElement(By.xpath("(//*[@class=\"custom-select rx-input\"])[2]"));
		Select Morning=new Select(Tablet);
		Morning.selectByValue("4");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"custom-select rx-input\"])[2]")).click();
		Thread.sleep(2000);
		WebElement Tablet1=driver.findElement(By.xpath("(//*[@class=\"custom-select rx-input\"])[3]"));
		Select Afternoon=new Select(Tablet1);
		Afternoon.selectByValue("3");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"custom-select rx-input\"])[3]")).click();
		Thread.sleep(2000);
		WebElement Tablet2=driver.findElement(By.xpath("(//*[@class=\"custom-select rx-input\"])[4]"));
		Select Night=new Select(Tablet2);
		Night.selectByValue("2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"custom-select rx-input\"])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[normalize-space(text())='Additional comments/Instructions']/following::textarea")).sendKeys("Take Rest");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"btn add-btn-size primary-btn btn-secondary\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@title='Edit Rx']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("input-strength")).sendKeys("20ml");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[normalize-space(text())='Add']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btn primary-btn save-btn-size btn-secondary']")).click();*/

		//Lab 
		driver.findElement(By.xpath("(//*[@class='v-tab'])[1]")).click();
		Thread.sleep(2000);
		WebElement LabTest=driver.findElement(By.xpath("//*[@class='custom-select']"));
		Select Lab =new Select(LabTest);
		Lab.selectByIndex(2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='form-control']")).sendKeys("X-RAY_CHEST_PA : XCPA_");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='X-RAY_CHEST_PA : XCPA_01'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[normalize-space(text())='Add']")).click();
		
	}

}
