package automationfc.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_06_Web_Element {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void TC_01_Current_Url() {
		driver.get("https://automationfc.github.io/basic-form/index.html");
		//Email Textbox
		WebElement emailTextbox = driver.findElement(By.xpath("//div[@class='container']//input[@name='user_email']"));
		
		if(emailTextbox.isDisplayed()) {
			emailTextbox.sendKeys("Automation Testing");
			System.out.println("Email is displayed");
		}else {
			System.out.println("Email is not displayed");
		}
		System.out.println(emailTextbox.isDisplayed());
		
		//Age under 18 
		WebElement ageUnder18Radio = driver.findElement(By.cssSelector("input#under_18"));
		
		if(ageUnder18Radio.isDisplayed()) {
			ageUnder18Radio.click();
			System.out.println("Under 18 is displayed");
		}else {
			System.out.println("Under 18 is not displayed");
		}
		System.out.println(ageUnder18Radio.isDisplayed());

		//Education
		
		WebElement educationTextArea = driver.findElement(By.cssSelector("textarea#edu"));
		
		if(educationTextArea.isDisplayed()) {
			educationTextArea.sendKeys("Automation FC");
			System.out.println("Education Text Area is displayed");
		}else {
			System.out.println("Education Text Area is not displayed");
		}
		System.out.println(educationTextArea.isDisplayed());

		//Image 5 
		WebElement image5 = driver.findElement(By.xpath("//h5[text()='Name: User5']"));
		
		if(image5.isDisplayed()) {
			System.out.println("Image 5 is displayed");
		}else {
			System.out.println("Image 5 is not displayed");
		}
		System.out.println(image5.isDisplayed());

	}

	@Test
	public void TC_02_Element_Enable_Disable() {
		driver.get("https://automationfc.github.io/basic-form/index.html");
		
		//Email
		WebElement txtEmail = driver.findElement(By.xpath("//div[@class='container']//input[@id='mail']"));
		if(txtEmail.isEnabled()) {
			System.out.println("Element email is enable");
		}else {
			System.out.println("Element email is disable");
		}
		
		//Age under 18
		WebElement ageUnder18 = driver.findElement(By.xpath("//div[@class='container']//input[@id='under_18']"));
		if(ageUnder18.isEnabled()) {
			System.out.println("Element Age under 18 is enable");
		}else {
			System.out.println("Element Age under 18 is disable");
		}
		
		//education
		WebElement txtEdu = driver.findElement(By.xpath("//div[@class='container']//textarea[@id='edu']"));
		if(txtEdu.isEnabled()) {
			System.out.println("Element Education is enable");
		}else {
			System.out.println("Element Education is disable");
		}
		
		//Job Role 01, Job Role 02
		WebElement ddJobRole01 = driver.findElement(By.xpath("//div[@class='container']//select[@id='job1']"));
		WebElement ddJobRole02 = driver.findElement(By.xpath("//div[@class='container']//select[@id='job2']"));
		if(ddJobRole01.isEnabled() && ddJobRole02.isEnabled() ) {
			System.out.println("Element Job Role 01 & Job Role 02 is enable");
		}else {
			System.out.println("Element Job Role 01 & Job Role 02 is disable");
		}
		
		//Interest Development Checkbox
		WebElement cBoxInterest = driver.findElement(By.xpath("//div[@class='container']//input[@id='development']"));
		if(cBoxInterest.isEnabled()) {
			System.out.println("Element Interest Development Checkbox is enable");
		}else {
			System.out.println("Element Interest Development Checkbox is disable");
		}

		//Slider 01
		WebElement slider01 = driver.findElement(By.xpath("//div[@class='container']//input[@id='slider-1']"));
		if(slider01.isEnabled()) {
			System.out.println("Element Slider 01 is enable");
		}else {
			System.out.println("Element Slider 01 is disable");
		}
		
		// txtPassword is Disable
		WebElement txtPassword = driver.findElement(By.xpath("//div[@class='container']//input[@id='disable_password']"));
		if(txtPassword.isEnabled()) {
			System.out.println("Element Password is enable");
		}else {
			System.out.println("Element Password is disable");
		}
		
		// Age Radio button is disable
		WebElement ageRadioBtt = driver.findElement(By.xpath("//div[@class='container']//input[@id='radio-disabled']"));
		if(ageRadioBtt.isEnabled()) {
			System.out.println("Element Age Radio Button is enable");
		}else {
			System.out.println("Element Age Radio Button is disable");
		}
		
		//Biography
		WebElement txtBio = driver.findElement(By.xpath("//div[@class='container']//textarea[@id='bio']"));
		if(txtBio.isEnabled()) {
			System.out.println("Element Biography is enable");
		}else {
			System.out.println("Element Biography is disable");
		}
		
		//Job Role 3
		WebElement ddJobRole3 = driver.findElement(By.xpath("//div[@class='container']//select[@id='job3']"));
		if(ddJobRole3.isEnabled()) {
			System.out.println("Element Job Role 3 is enable");
		}else {
			System.out.println("Element Job Role 3 is disable");
		}
		
		//Interest checkbox is disable
		WebElement cbInterest = driver.findElement(By.xpath("//div[@class='container']//input[@id='check-disbaled']"));
		if(cbInterest.isEnabled()) {
			System.out.println("Element Job Role 3 is enable");
		}else {
			System.out.println("Element Job Role 3 is disable");
		}
		
		//Slider 02
		WebElement sld02 = driver.findElement(By.xpath("//div[@class='container']//input[@id='slider-2']"));
		if(sld02.isEnabled()) {
			System.out.println("Element Job Role 3 is enable");
		}else {
			System.out.println("Element Job Role 3 is disable");
		}


	}

	@Test
	public void TC_03_Element_Is_Selected() {
		driver.get("https://automationfc.github.io/basic-form/index.html");
		
		WebElement rbttAgeUnder18 = driver.findElement(By.xpath("//div[@class='container']//input[@id='under_18']"));
		rbttAgeUnder18.click();
		
		WebElement cbLanguageJava = driver.findElement(By.xpath("//div[@class='container']//input[@id='java']"));
		cbLanguageJava.click();
		
		if(rbttAgeUnder18.isSelected()) {
			System.out.println("Element Age Under 18 is selected");
		}else {
			System.out.println("Element Age Under 18 is de-selected");
		}
		if(cbLanguageJava.isSelected()) {
			System.out.println("Element CheckBox Language Java is selected");
		}else {
			System.out.println("Element CheckBox Language Java is de-selected");
		}
		
		cbLanguageJava.click();
		if(cbLanguageJava.isSelected()) {
			System.out.println("Element CheckBox Language Java is selected");
		}else {
			System.out.println("Element CheckBox Language Java is de-selected");
		}

		

	}
	
	@Test
	public void TC_04_Register_Function_At_MailChimp() {
		driver.get("https://login.mailchimp.com/signup/");
		WebElement txtEmail = driver.findElement(By.xpath("//div//input[@id='email']"));
		txtEmail.sendKeys("toan.dn2611@gmail.com");
		sleepInSecond(3);
		
		WebElement txtPassword = driver.findElement(By.cssSelector("input#new_password"));
		// Check lower case
		txtPassword.sendKeys("aaa");
		sleepInSecond(3);
		
		Assert.assertTrue(driver.findElement(By.cssSelector("li.lowercase-char.completed")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.cssSelector("li.uppercase-char.not-completed")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.cssSelector("li.number-char.not-completed")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.cssSelector("li.special-char.not-completed")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//li[@class='8-char not-completed']")).isDisplayed());
		
		//Check upper case
		txtPassword.clear();
		txtPassword.sendKeys("AAA");
		sleepInSecond(3);
		
		Assert.assertTrue(driver.findElement(By.cssSelector("li.lowercase-char.not-completed")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.cssSelector("li.uppercase-char.completed")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.cssSelector("li.number-char.not-completed")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.cssSelector("li.special-char.not-completed")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//li[@class='8-char not-completed']")).isDisplayed());

		//Check number
		txtPassword.clear();
		txtPassword.sendKeys("123");
		sleepInSecond(3);
		
		Assert.assertTrue(driver.findElement(By.cssSelector("li.lowercase-char.not-completed")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.cssSelector("li.uppercase-char.not-completed")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.cssSelector("li.number-char.completed")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.cssSelector("li.special-char.not-completed")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//li[@class='8-char not-completed']")).isDisplayed());
		
		//Check Special char
		txtPassword.clear();
		txtPassword.sendKeys("$%#@");
		sleepInSecond(3);
		
		Assert.assertTrue(driver.findElement(By.cssSelector("li.lowercase-char.not-completed")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.cssSelector("li.uppercase-char.not-completed")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.cssSelector("li.number-char.not-completed")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.cssSelector("li.special-char.completed")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//li[@class='8-char not-completed']")).isDisplayed());

		//Check 8 char
		txtPassword.clear();
		txtPassword.sendKeys("acdfsaws");
		sleepInSecond(3);
		
		Assert.assertTrue(driver.findElement(By.cssSelector("li.lowercase-char.completed")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.cssSelector("li.uppercase-char.not-completed")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.cssSelector("li.number-char.not-completed")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.cssSelector("li.special-char.not-completed")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//li[@class='8-char completed']")).isDisplayed());

		//Du lieu hople

		txtPassword.clear();
		txtPassword.sendKeys("abcABC@@@123");
		sleepInSecond(3);
		
		Assert.assertTrue(driver.findElement(By.xpath("//div//input[@class='av-password success-check']")).isDisplayed());

	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}
	
	public void sleepInSecond(long timeInSecond) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}