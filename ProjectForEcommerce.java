package com.launch;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectForEcommerce {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokul\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
        driver.get("https://www.flipkart.com/");
        
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("hemanthch001@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("9100298789.A");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
	    Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("Iphone");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
       
        String parentHandle = driver.getWindowHandle();
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[4]/div/div/div/a/div[1]/div[1]/div/div/img")).click();
        Thread.sleep(2000);
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles) {
        	System.out.println(handle);
        	if (!handle.equals(parentHandle)) {
        		driver.switchTo().window(handle);
        		Thread.sleep(2000);
        		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
        		Thread.sleep(2000);
        		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[3]/div/form/button")).click();
        		Thread.sleep(2000);
        		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[2]/div/div/div/div[3]/div[2]")).click();
        		//Address
        		driver.findElement(By.name("name")).sendKeys("Hemanth Kumar");
        		driver.findElement(By.name("phone")).sendKeys("9234567890");
        		driver.findElement(By.name("pincode")).sendKeys("517590");
        		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[2]/div/div/div/div[3]/div[2]/label/div[2]/div/form/div/div[3]/div[2]/input")).sendKeys("Nagari,Chittoor dist,Andhra Pradesh");
        		driver.findElement(By.name("addressLine1")).sendKeys("1/86, temple street, nagari");
        		//driver.findElement(By.name("city")).sendKeys("Nagari");
        		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[2]/div/div/div/div[3]/div[2]/label/div[2]/div/form/div/div[7]/div/div/label[1]/div[1]")).click();
        		Thread.sleep(2000);
        		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[2]/div/div/div/div[3]/div[2]/label/div[2]/div/form/div/div[8]/button[1]")).click();
        		Thread.sleep(2000);
        		driver.findElement(By.xpath("//*[@id=\"to-payment\"]/button")).click();
        	}
       //driver.switchTo().window(parentHandle);
       //Actions act = new Actions(driver);
       //act.moveToElement(driver.findElement(By.className("_28p97w")));  
       //driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/svg")).click();
       
        	
        }
	  }
	}
