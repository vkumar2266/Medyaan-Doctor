package Doctor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoctorScheduledConsultation {
	public static void main(String[] args) throws InterruptedException {
		//Chrome_Browser Launch
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
		//driver.findElement(By.xpath("(//*[@role='button'])[1]")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("(//*[@role='presentation'])[6]")).click();
		//Thread.sleep(3000);

		//Scheduled Consultation: 
		driver.findElement(By.xpath("(//div[@class='card consult-typecard'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='text-center mt-2'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn primary-btn continue-btn-size btn-secondary'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='EHR']")).click();
		Thread.sleep(2000);

		//Click vitals
		driver.findElement(By.xpath("(//div[@class='row emraccordionrow'])[1]")).click();
		Thread.sleep(2000);
		//Click Edit button
		driver.findElement(By.xpath("(//button[@class='btn primary-btn edit-btn-size btn-secondary'])[1]")).click();
		Thread.sleep(2000);
		//Click Blood pressure systolic (mm Hg)
		driver.findElement(By.xpath("(//input[@class='profile-input  form-control'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='profile-input  form-control'])[1]")).sendKeys("110");
		Thread.sleep(2000);
		//Click Blood pressure diastolic (mm Hg)
		driver.findElement(By.xpath("(//input[@class='profile-input  form-control'])[2]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='profile-input  form-control'])[2]")).sendKeys("90");
		Thread.sleep(2000);
		//Height
		driver.findElement(By.xpath("(//input[@class='profile-input form-control'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='profile-input form-control'])[1]")).sendKeys("130");
		Thread.sleep(2000);
		//Weight
		driver.findElement(By.xpath("(//input[@class='profile-input form-control'])[2]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='profile-input form-control'])[2]")).sendKeys("40");
		Thread.sleep(2000);
		
		//Temperature
		driver.findElement(By.xpath("(//input[@class='profile-input form-control'])[3]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='profile-input form-control'])[3]")).sendKeys("86");
		Thread.sleep(2000);
		//Pulse Rate(BPM)
		driver.findElement(By.xpath("(//input[@class='profile-input  form-control'])[3]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='profile-input  form-control'])[3]")).sendKeys("60");
		Thread.sleep(2000);
		//BMI
		driver.findElement(By.xpath("(//input[@class='profile-input form-control'])[4]")).sendKeys("");
		Thread.sleep(2000);
		//Waist circumference >40 inches
		driver.findElement(By.id("infowaistcircumference")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='Yes'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='No'])[1]")).click();
		Thread.sleep(2000);
		//Triglycerides >150
		driver.findElement(By.id("infotriglycerides")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='Yes'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='No'])[2]")).click();
		Thread.sleep(2000);
		//Fast blood glucose >100
		driver.findElement(By.id("infobloodglucose")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='Yes'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='No'])[3]")).click();
		Thread.sleep(2000);
		//SPO2 level
		driver.findElement(By.xpath("(//input[@class='profile-input  form-control'])[4]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='profile-input  form-control'])[4]")).sendKeys("40");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn primary-btn submit-btn-size btn-secondary'])[1]")).click();
		Thread.sleep(2000);
		//Scroll up
		JavascriptExecutor Scroll = (JavascriptExecutor) driver;
		Scroll.executeScript("window.scrollBy(1000,0)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[normalize-space(text())='Vital']")).click();
		Thread.sleep(2000);


		//Medical History
		driver.findElement(By.xpath("(//div[@class='row emraccordionrow'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn primary-btn edit-btn-size btn-secondary'])[2]")).click();
		Thread.sleep(2000);
		//Heart Diseases-Stents in heart
		driver.findElement(By.xpath("//*[text()='Stents in heart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Stents in heart']")).click();
		Thread.sleep(2000);
		//Heart Diseases-Heart murmurs
		driver.findElement(By.xpath("//*[text()='Heart murmurs']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Heart murmurs']")).click();
		Thread.sleep(2000);
		//Heart Diseases-Irregular heart beat problem
		driver.findElement(By.xpath("//*[text()='Irregular heart beat problem']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Irregular heart beat problem']")).click();
		Thread.sleep(2000);
		//Heart Diseases-Hospitalized for heart attack
		driver.findElement(By.xpath("//*[text()='Hospitalized for heart attack']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Hospitalized for heart attack']")).click();
		Thread.sleep(2000);
		//Heart Diseases-Others
		driver.findElement(By.xpath("(//*[text()='Others'])[1]")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//p[@id='validation']/preceding-sibling::input")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@id='validation']/preceding-sibling::input")).sendKeys("Heart123@#$");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='Others'])[1]")).click();
		Thread.sleep(2000);

		//Respiratory problems
		//Respiratory problems-COPD
		driver.findElement(By.xpath("//*[text()='COPD']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='COPD']")).click();
		Thread.sleep(2000);
		//Respiratory problems-Asthma
		driver.findElement(By.xpath("//*[text()='Asthma']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Asthma']")).click();
		Thread.sleep(2000);
		//Respiratory problems-Sinus allergies
		driver.findElement(By.xpath("//*[text()='Sinus allergies']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Sinus allergies']")).click();
		Thread.sleep(2000);
		//Respiratory problems-Home oxygen use
		driver.findElement(By.xpath("//*[text()='Home oxygen use']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Home oxygen use']")).click();
		Thread.sleep(2000);
		//Respiratory problems-Sleep apnea
		driver.findElement(By.xpath("//*[text()='Sleep apnea']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Sleep apnea']")).click();
		Thread.sleep(2000);
		//Respiratory problems-Others
		driver.findElement(By.xpath("(//*[text()='Others'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@id='validation']/preceding-sibling::input")).clear(); //pending
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@id='validation']/preceding-sibling::input")).sendKeys("Res@123"); //pending
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='Others'])[2]")).click();
		Thread.sleep(2000);

		//Liver disease
		//Liver disease-Hepatitis A
		driver.findElement(By.xpath("//*[text()='Hepatitis A']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Hepatitis A']")).click();
		Thread.sleep(2000);
		//Liver disease-Hepatitis B
		driver.findElement(By.xpath("//*[text()='Hepatitis B']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Hepatitis B']")).click();
		Thread.sleep(2000);
		//Liver disease-Hepatitis C
		driver.findElement(By.xpath("//*[text()='Hepatitis C']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Hepatitis C']")).click();
		Thread.sleep(2000);
		//Liver disease-Liver failure
		driver.findElement(By.xpath("//*[text()='Liver failure']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Liver failure']")).click();
		Thread.sleep(2000);
		//Liver disease-Liver transplant
		driver.findElement(By.xpath("//*[text()='Liver transplant']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Liver transplant']")).click();
		Thread.sleep(2000);
		//Liver disease-Others
		driver.findElement(By.xpath("(//*[text()='Others'])[3]")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//p[@id='validation']/preceding-sibling::input")).clear();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//p[@id='validation']/preceding-sibling::input")).sendKeys("Liver@123");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("(//*[text()='Others'])[3]")).click();
		Thread.sleep(2000);

		//Kidney disease
		//Kidney disease-Dialysis
		driver.findElement(By.xpath("//*[text()='Dialysis']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Dialysis']")).click();
		Thread.sleep(2000);
		//Kidney disease-Kidney stones
		driver.findElement(By.xpath("//*[text()='Kidney stones']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Kidney stones']")).click();
		Thread.sleep(2000);
		//Kidney disease-Others
		driver.findElement(By.xpath("(//*[text()='Others'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@id='validation']/preceding-sibling::input")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@id='validation']/preceding-sibling::input")).sendKeys("Kidney@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='Others'])[4]")).click();
		Thread.sleep(2000);

		//Gastrointestinal problems
		//Gastrointestinal problems-Bleeding in stool
		driver.findElement(By.xpath("//*[text()='Bleeding in stool']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Bleeding in stool']")).click();
		Thread.sleep(2000);
		//Gastrointestinal problems-Blood vomiting
		driver.findElement(By.xpath("//*[text()='Blood vomiting']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Blood vomiting']")).click();
		Thread.sleep(2000);
		//Gastrointestinal problems-Chronic diarrhea
		driver.findElement(By.xpath("//*[text()='Chronic diarrhea']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Chronic diarrhea']")).click();
		Thread.sleep(2000);
		//Gastrointestinal problems-Constipation
		driver.findElement(By.xpath("//*[text()='Constipation']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Constipation']")).click();
		Thread.sleep(2000);
		//Gastrointestinal problems-Others
		driver.findElement(By.xpath("(//*[text()='Others'])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@id='validation']/preceding-sibling::input")).clear();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//p[@id='validation']/preceding-sibling::input")).sendKeys("heart@@123");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("(//*[text()='Others'])[5]")).click();
		Thread.sleep(2000);

		//Brain Stroke
		driver.findElement(By.xpath("(//*[text()=\"Yes\"])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()=\"No\"])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()=\"Yes\"])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()=\"No\"])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()=\"Yes\"])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()=\"No\"])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()=\"Yes\"])[7]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()=\"No\"])[7]")).click();
		Thread.sleep(2000);
		WebElement diabetes=driver.findElement(By.xpath("(//*[@class='profile-input  form-control'])[5]"));
		diabetes.clear();
		Thread.sleep(2000);
		diabetes.sendKeys("Diabetes Mellitus - Details");
		Thread.sleep(2000);
		WebElement subclinic=driver.findElement(By.xpath("(//*[@class='profile-input  form-control'])[6]"));
		subclinic.clear();
		Thread.sleep(2000);
		subclinic.sendKeys("Subclinical Hypothyroidism");
		Thread.sleep(2000);
		WebElement asthma=driver.findElement(By.xpath("(//*[@class='profile-input  form-control'])[7]"));
		asthma.clear();
		Thread.sleep(2000);
		asthma.sendKeys("Asthma");
		Thread.sleep(2000);
		WebElement dys=driver.findElement(By.xpath("(//*[@class='profile-input  form-control'])[8]"));
		dys.clear();
		Thread.sleep(2000);
		dys.sendKeys("Dyslipidemia");
		Thread.sleep(2000);
		WebElement coronary=driver.findElement(By.xpath("(//*[@class='profile-input  form-control'])[9]"));
		coronary.clear();
		Thread.sleep(2000);
		coronary.sendKeys("Coronary Artery Disease");
		Thread.sleep(2000);
		WebElement tuber=driver.findElement(By.xpath("(//*[@class='profile-input  form-control'])[10]"));
		tuber.clear();
		Thread.sleep(2000);
		tuber.sendKeys("Tuberculosis");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='custom-control-input'])[39]")).sendKeys("Absd123@");
		Thread.sleep(2000);
		//Submit
		driver.findElement(By.xpath("(//*[@class='submit_btn primary_btn submitbtn-color'])[2]")).click();
		Thread.sleep(2000);
		//Scroll up
		WebElement scrl1=driver.findElement(By.xpath("(//div[@class='row emraccordionrow'])[2]"));
		JavascriptExecutor jsE1=(JavascriptExecutor)driver;
		jsE1.executeScript("arguments[0].scrollIntoView();",scrl1);
		driver.findElement(By.xpath("(//div[@class='row emraccordionrow'])[2]")).click();
		Thread.sleep(2000);

		//Surgery History
		driver.findElement(By.xpath("(//div[@class='row emraccordionrow'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='btn submitbtn-color btn-secondary'])[3]")).click();
		Thread.sleep(2000);
		//Surgery History-Tonsils removal
		driver.findElement(By.xpath("//*[text()='Tonsils removal']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Tonsils removal']")).click();
		Thread.sleep(2000);
		//Surgery History-Thyroid surgery
		driver.findElement(By.xpath("//*[text()='Thyroid surgery']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Thyroid surgery']")).click();
		Thread.sleep(2000);
		//Surgery History-Heart surgery
		driver.findElement(By.xpath("//*[text()='Heart surgery']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Heart surgery']")).click();
		Thread.sleep(2000);
		//Surgery History-Gall bladder removal
		driver.findElement(By.xpath("//*[text()='Gall bladder removal']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Gall bladder removal']")).click();
		Thread.sleep(2000);
		//Surgery History-Appendix surgery
		driver.findElement(By.xpath("//*[text()='Appendix surgery']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Appendix surgery']")).click();
		Thread.sleep(2000);
		//Surgery History-Knee/hip Replacement
		driver.findElement(By.xpath("//*[text()='Knee/hip Replacement']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Knee/hip Replacement']")).click();
		Thread.sleep(2000);
		//Surgery History-Others
		driver.findElement(By.xpath("(//*[text()='Others'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@id='validation']/preceding-sibling::input")).sendKeys("Surgery");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='Others'])[6]")).click();
		Thread.sleep(2000);
		//submit button
		driver.findElement(By.xpath("(//*[@class='submit_btn primary_btn submitbtn-color'])[3]")).click();
		Thread.sleep(2000);
		//Scroll up
		WebElement scrol=driver.findElement(By.xpath("(//div[@class='row emraccordionrow'])[3]"));
		JavascriptExecutor jsEx=(JavascriptExecutor)driver;
		jsEx.executeScript("arguments[0].scrollIntoView();",scrol);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='row emraccordionrow'])[3]")).click();
		Thread.sleep(2000);

		//Family History
		driver.findElement(By.xpath("(//div[@class='row emraccordionrow'])[4]")).click();
		Thread.sleep(2000);
		//Click Edit button
		driver.findElement(By.xpath("(//button[@class='btn submitbtn-color btn-secondary'])[4]")).click();
		Thread.sleep(2000);
		//Bleeding disorder
		driver.findElement(By.xpath("//*[text()='Bleeding disorder']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Bleeding disorder']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Stroke']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Stroke']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Cancer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Cancer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Diabetes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Diabetes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Heart disease']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Heart disease']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='Others'])[7]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@id='validation']/preceding-sibling::input")).sendKeys("Surgery");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='Others'])[7]")).click();
		Thread.sleep(2000);
		//submit button
		driver.findElement(By.xpath("(//*[@class='submit_btn primary_btn submitbtn-color'])[4]")).click();
		Thread.sleep(2000);
		//Scroll up
		WebElement scr=driver.findElement(By.xpath("(//div[@class='row emraccordionrow'])[3]"));
		JavascriptExecutor JS=(JavascriptExecutor)driver;
		JS.executeScript("arguments[0].scrollIntoView();",scr);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='row emraccordionrow'])[4]")).click();
		Thread.sleep(2000);

		//Allergies
		driver.findElement(By.xpath("(//div[@class='row emraccordionrow'])[5]")).click();
		Thread.sleep(2000);
		//Edit button
		driver.findElement(By.xpath("(//button[@class='btn submitbtn-color btn-secondary'])[5]")).click();
		Thread.sleep(2000);
		//Drug allergy
		driver.findElement(By.xpath("//*[text()='Penicillin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Penicillin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Bactrim']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Bactrim']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Tetracycline']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Tetracycline']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='Others'])[8]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@id='validation']/preceding-sibling::input")).sendKeys("Drug Allergy");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='Others'])[8]")).click();
		Thread.sleep(2000);

		//Allergies
		driver.findElement(By.xpath("//*[text()='Pollen']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Pollen']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Dust mites']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Dust mites']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Mold']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Mold']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Animal dander and Cockroaches']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Animal dander and Cockroaches']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Insect sting']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Insect sting']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Latex']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Latex']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='Others'])[9]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@id='validation']/preceding-sibling::input")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@id='validation']/preceding-sibling::input")).sendKeys("Allergies");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='Others'])[9]")).click();
		Thread.sleep(2000);
		//submit button
		driver.findElement(By.xpath("(//*[@class='submit_btn primary_btn submitbtn-color'])[5]")).click();
		Thread.sleep(2000);
		//scroll
		WebElement alergyscroll=driver.findElement(By.xpath("(//div[@class='row emraccordionrow'])[4]"));
		JavascriptExecutor JSE=(JavascriptExecutor)driver;
		JSE.executeScript("arguments[0].scrollIntoView();",alergyscroll);
		driver.findElement(By.xpath("(//div[@class='row emraccordionrow'])[5]")).click();
		Thread.sleep(2000);

		//OnExamination
		driver.findElement(By.xpath("(//div[@class='row emraccordionrow'])[6]")).click();
		Thread.sleep(2000);
		//Edit button
		driver.findElement(By.xpath("(//button[@class='btn submitbtn-color btn-secondary'])[6]")).click();
		Thread.sleep(2000);
		//Per Abdomen
		WebElement PerAbdomen=driver.findElement(By.xpath("(//*[@class='profile-input  form-control'])[11]"));
		PerAbdomen.clear();
		Thread.sleep(2000);
		PerAbdomen.sendKeys("Per Abdomen");
		Thread.sleep(2000);
		//Chorionic Villus Sampling
		WebElement Chorionic=driver.findElement(By.xpath("(//*[@class='profile-input  form-control'])[12]"));
		Chorionic.clear();
		Thread.sleep(2000);
		Chorionic.sendKeys("Chorionic Villus Sampling");
		Thread.sleep(2000);
		//Central Nervous System
		WebElement Central=driver.findElement(By.xpath("(//*[@class='profile-input  form-control'])[13]"));
		Central.clear();
		Thread.sleep(2000);
		Central.sendKeys("Central Nervous System");
		Thread.sleep(2000);
		//Reed Sternberg
		WebElement Reed=driver.findElement(By.xpath("(//*[@class='profile-input  form-control'])[14]"));
		Reed.clear();
		Thread.sleep(2000);
		Reed.sendKeys("Reed Sternberg");
		//Submit
		driver.findElement(By.xpath("(//*[@class='submit_btn primary_btn submitbtn-color'])[6]")).click();
		Thread.sleep(2000);
		//scroll
		WebElement OE_scr=driver.findElement(By.xpath("(//div[@class='row emraccordionrow'])[5]"));
		Thread.sleep(2000);
		JavascriptExecutor OE_js=(JavascriptExecutor)driver;
		OE_js.executeScript("arguments[0].scrollIntoView();",OE_scr);
		driver.findElement(By.xpath("(//div[@class='row emraccordionrow'])[6]")).click();
		Thread.sleep(2000);
		//Medications
		driver.findElement(By.xpath("(//div[@class='row emraccordionrow'])[7]")).click();
		Thread.sleep(2000);
		//Click Add button
		driver.findElement(By.xpath("(//*[@class='btn submitbtn-color btn-secondary'])[7]")).click();
		Thread.sleep(3000);
		WebElement Medbox=driver.findElement(By.xpath("//div[@id='scrolltoviewId']"));
		JavascriptExecutor m_js=(JavascriptExecutor)driver;
		m_js.executeScript("arguments[0].scrollIntoView();",Medbox);
		Thread.sleep(1000);
		//Search Medicine
		WebElement SearchMedicine=driver.findElement(By.xpath("//*[@id='searchInput']"));
		Thread.sleep(2000);
		SearchMedicine.sendKeys("dolo");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//li[text()[normalize-space()='Dolo|Tablet|dolo']]")).click();
		driver.findElement(By.xpath("//div[@id='suggestions']//li[4]")).click();
		//Intake
		WebElement Intake=driver.findElement(By.xpath("//*[@id='intake']"));
		Intake.click();
		Thread.sleep(1000);
		Intake.sendKeys("Before food");
		//Number of days
		WebElement number=driver.findElement(By.xpath("//*[@id='medicinecount']"));
		number.clear();
		Thread.sleep(1000);
		number.sendKeys("8");
		//Morning
		WebElement morning=driver.findElement(By.xpath("//*[@id='medmorn']"));
		morning.click();
		Thread.sleep(1000);
		morning.sendKeys("2");
		//Afternoon
		WebElement afternoon=driver.findElement(By.xpath("//*[@id='medafter']"));
		afternoon.click();
		Thread.sleep(1000);
		afternoon.sendKeys("1");
		//Night
		WebElement night=driver.findElement(By.xpath("//*[@id='mednight']"));
		night.click();
		Thread.sleep(1000);
		night.sendKeys("3");
		//Additional comments
		WebElement addcomnt=driver.findElement(By.xpath("//*[@id='notes']"));
		addcomnt.clear();
		Thread.sleep(1000);
		addcomnt.sendKeys("Additional comments@1234%*");
		//Submit
		driver.findElement(By.xpath("//*[@class='btn submit_btn primary_btn submitbtn-color ml-3 btn-secondary']")).click();
		Thread.sleep(1000);
		//Edit button
		//driver.findElement(By.xpath("//*[@id='svg-inline--fa-title-9VL511ZMU5DA']")).click();
		WebElement sd=driver.findElement(By.xpath("(//div[@class='row emraccordionrow'])[6]"));
		JavascriptExecutor JiS=(JavascriptExecutor)driver;
		JiS.executeScript("arguments[0].scrollIntoView();", sd);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='row emraccordionrow'])[7]")).click();
		Thread.sleep(2000);

		//Lifestyle
		driver.findElement(By.xpath("(//div[@class='row emraccordionrow'])[8]")).click();
		Thread.sleep(2000);
		//Edit button
		driver.findElement(By.xpath("(//button[@class='btn submitbtn-color btn-secondary'])[8]")).click();
		Thread.sleep(2000);
		//Scroll up
		WebElement lifeScroll=driver.findElement(By.xpath("(//div[@class='row emraccordionrow'])[7]"));
		JavascriptExecutor lifeJS=(JavascriptExecutor)driver;
		lifeJS.executeScript("arguments[0].scrollIntoView();",lifeScroll);
		Thread.sleep(2000);
		//Lives alone
		driver.findElement(By.xpath("//*[text()='Lives alone']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Lives alone']")).click();
		Thread.sleep(2000);
		//Private residence
		driver.findElement(By.xpath("//*[text()='Private residence']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Private residence']")).click();
		Thread.sleep(2000);
		//Lives with family
		driver.findElement(By.xpath("//*[text()='Lives with family']")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//*[text()='Lives with family']")).click();
		Thread.sleep(2000);
		//Assisted living
		driver.findElement(By.xpath("//*[text()='Assisted living']")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//*[text()='Assisted living']")).click();
		Thread.sleep(2000);
		//Nursing home
		driver.findElement(By.xpath("//*[text()='Nursing home']")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//*[text()='Nursing home']")).click();
		Thread.sleep(2000);
		//Submit button
		driver.findElement(By.xpath("(//*[@class='submit_btn primary_btn submitbtn-color'])[7]")).click();
		Thread.sleep(2000);




		//driver.findElement(By.xpath("(//*[@class=\"btn mr-3 primary-btn view-btn-size btn-secondary\"])[1]")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("(//*[@class=\"form-control form-control\"])[1]")).clear();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("(//*[@class=\"form-control form-control\"])[1]")).sendKeys("Test");
		//Thread.sleep(2000);







	}

}
