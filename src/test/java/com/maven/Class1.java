package com.maven;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class1 {
	@Test
	public void setup() throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		RemoteWebDriver driver=new EdgeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
		
	}

}
