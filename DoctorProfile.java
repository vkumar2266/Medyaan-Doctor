package Doctor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DoctorProfile {

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



		driver.findElement(By.xpath("//*[normalize-space(text())='Rajeshkumar S']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@role='menuitem'])[6]")).click();
		Thread.sleep(2000);

		//Profile
		/*driver.findElement(By.xpath("//*[normalize-space(text())='Basic Information']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='Click here, to edit the form']")).click();

		//First Name 
		WebElement Firstname=driver.findElement(By.xpath("//*[normalize-space(text())='First Name']/following-sibling::input"));
		Firstname.clear();		
		driver.findElement(By.xpath("//*[normalize-space(text())='First Name']/following-sibling::input")).sendKeys("Rajesh Kumar");
		Thread.sleep(2000);
		//Last Name
		WebElement Secondname=driver.findElement(By.xpath("//*[normalize-space(text())='Last Name']/following-sibling::input"));
		Secondname.clear();
		driver.findElement(By.xpath("//*[normalize-space(text())='Last Name']/following-sibling::input")).sendKeys("S");
		Thread.sleep(2000);
		//Gender
		driver.findElement(By.name("radioInline")).click();
		Thread.sleep(2000);
		WebElement dropdownElement=driver.findElement(By.name("radioInline"));
		Select dropdown =new Select(dropdownElement);
		dropdown.selectByValue("Male");
		driver.findElement(By.name("radioInline")).click();
		//Email
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.xpath("//*[normalize-space(text())='Email']/following-sibling::input"));
		email.clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[normalize-space(text())='Email']/following-sibling::input")).sendKeys("rajesh.mio.o.hj@gmail.com");	
		Thread.sleep(2000);
		//Marital Status
		driver.findElement(By.xpath("(//*[normalize-space(text())='Marital Status']/following::Select)[1]")).click();
		WebElement maritialStatus=driver.findElement(By.xpath("(//*[normalize-space(text())='Marital Status']/following::Select)[1]"));
		Select Staus =new Select(maritialStatus);
		Staus.selectByValue("married");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[normalize-space(text())='Marital Status']/following::Select)[1]")).click();

		//Date Picker clearance
		//WebElement Dateclose=driver.findElement(By.xpath("//span[@class='el-input__suffix-inner']//i[1]"));
		//Actions MoveOn = new Actions(driver);
		//hread.sleep(2000);
		//MoveOn.moveToElement(Dateclose).perform();
		//Dateclose.click();
		WebElement Calender=driver.findElement(By.xpath("(//*[normalize-space(text())='Date of Birth']//following::div)[1]"));
		Thread.sleep(2000);
		Calender.click();
		WebElement Year=driver.findElement(By.xpath("//span[text()='1997 ']"));
		Year.click();
		Thread.sleep(5000);
		WebElement PreviousButton=driver.findElement(By.xpath("//*[@class='el-picker-panel__icon-btn el-date-picker__prev-btn el-icon-d-arrow-left']"));
		PreviousButton.click();
		Thread.sleep(2000);
		int numberofClick=3;
		for (int i = 0; i < numberofClick; i++)
			PreviousButton.click();
		Thread.sleep(2000);
		WebElement SelectYear=driver.findElement(By.xpath("//a[contains(text(),'1955')]"));
		SelectYear.click();
		Thread.sleep(2000);
		WebElement SelectMonth=driver.findElement(By.xpath("//a[contains(text(),'Jul')]"));
		SelectMonth.click();
		Thread.sleep(2000);
		WebElement SelectDate=driver.findElement(By.xpath("//span[text()[normalize-space()='20']]"));
		SelectDate.click();
		Thread.sleep(2000); 
		JavascriptExecutor Scroll = (JavascriptExecutor) driver;
		Scroll.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000); 

		//Language:
		driver.findElement(By.id("language")).click();
		WebElement language=driver.findElement(By.id("language"));
		Select Lang=new Select(language);
		Lang.selectByValue("Tamil");
		driver.findElement(By.id("phonenumber")).sendKeys("phonenumber");
		WebElement Econtact=driver.findElement(By.xpath("//*[@class=\"form-control\"]"));
		Econtact.clear();
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//*[@class=\"form-control\"]")).sendKeys("8072393160");
		WebElement Company=driver.findElement(By.xpath("//*[@class=\"profile-input mb-0 form-control\"]"));
		Company.clear();
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//*[@class=\"profile-input mb-0 form-control\"]")).sendKeys("Datayaan");
		Thread.sleep(3000);
		WebElement Element1 = driver.findElement(By.xpath("(//a[@role='button'])[3]"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView();", Element1);
		Thread.sleep(3000);*/

		//Awards
		/*driver.findElement(By.xpath("//*[normalize-space(text())='Awards']")).click();
		Thread.sleep(2000); 

	driver.findElement(By.xpath("//*[@title=\"Add New Award\"]")).click();
	Thread.sleep(2000); 
		driver.findElement(By.xpath("(//*[normalize-space(text())='Award Name']//following::input)[1]")).sendKeys("Test");
		Thread.sleep(2000); 
		driver.findElement(By.xpath("(//*[normalize-space(text())='Provider By']//following::input)[1]")).sendKeys("Test");
		Thread.sleep(2000); 
		driver.findElement(By.xpath("(//*[normalize-space(text())='Awarded Year']//following::input)[1]")).click();
		Thread.sleep(2000); 
			driver.findElement(By.xpath("//*[text()='2022']")).click();
			Thread.sleep(2000); 
		driver.findElement(By.xpath("(//*[@class='col']//following::button)[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='action svg-inline--fa fa-edit fa-w-18'])[1]")).click();
		Thread.sleep(2000); 
		driver.findElement(By.xpath("(//*[normalize-space(text())='Award Name']//following::input)[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[normalize-space(text())='Award Name']//following::input)[1]")).sendKeys("Test1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='col']//following::button)[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='action svg-inline--fa fa-trash fa-w-14'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[normalize-space(text())='Yes']")).click();


		//Address
		driver.findElement(By.xpath("(//*[text()='Address'])[1]")).click();

		driver.findElement(By.xpath("//button[@title='Add address details']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("address1")).sendKeys("5/172");
		Thread.sleep(2000);
		driver.findElement(By.id("address2")).sendKeys("Tambaram");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Chennai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@class='autocomplete__results__item']/following-sibling::li)[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("mobilenumber")).sendKeys("7868851212");
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("medyaan@gmail.com");
		Thread.sleep(5000);
		WebElement AddressType=driver.findElement(By.id("addresstype"));
		Select Type=new Select(AddressType);
		Thread.sleep(5000);
		Type.selectByValue("Commercial");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class=\"custom-control-label\"][1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='btn primary-btn submit-btn-size btn-secondary']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"action svg-inline--fa fa-edit fa-w-18\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("Datayaan@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btn primary-btn submit-btn-size btn-secondary']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"action svg-inline--fa fa-trash fa-w-14\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()[normalize-space()='Yes']]")).click();

		//Education 


		driver.findElement(By.xpath("(//*[text()='Education'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@title='Add Education Details']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[normalize-space(text())='Graduation Type']//following::input)[1]")).sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[normalize-space(text())='Qualification']//following::input)[1]")).sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[normalize-space(text())='Specialization']//following::input)[1]")).sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[normalize-space(text())='College']//following::input)[1]")).sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btn primary-btn submit-btn-size btn-secondary']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='action svg-inline--fa fa-edit fa-w-18'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[normalize-space(text())='Graduation Type']//following::input)[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[normalize-space(text())='Graduation Type']//following::input)[1]")).sendKeys("Test2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btn primary-btn submit-btn-size btn-secondary']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='action svg-inline--fa fa-trash fa-w-14'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()[normalize-space()='Yes']]")).click();*/

		//Professional Info
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='Professional Info'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@title='Click here, to edit the form']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[normalize-space(text())='Professional Title']//following::input)[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[normalize-space(text())='Professional Title']//following::input)[1]")).sendKeys("Text");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[normalize-space(text())='Speciality']//following::input)[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[normalize-space(text())='Speciality']//following::input)[1]")).sendKeys("Text");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[normalize-space(text())='Board']//following::input)[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[normalize-space(text())='Board']//following::input)[1]")).sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[normalize-space(text())='Registration Number']//following::input)[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[normalize-space(text())='Registration Number']//following::input)[1]")).sendKeys("8130121042000");
		Thread.sleep(2000);
		WebElement RegistrationCouncil =driver.findElement(By.id("prof_style_id"));
		Select Type=new Select(RegistrationCouncil);
		Thread.sleep(2000);
		Type.selectByIndex(3);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//*[normalize-space(text())='Registration Year']//following::input)[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='2000']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"eyeicon svg-inline--fa fa-check fa-w-16\"]")).click();
		
		

	}

}
