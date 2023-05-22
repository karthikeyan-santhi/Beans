package org.task;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task {
	public static void main(String[] args) {
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProjecrt\\Browser\\msedgedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement srchbx = driver.findElement(By.id("twotabsearchtextbox"));
		srchbx.sendKeys("mobiles");
		WebElement srchbtn = driver.findElement(By.id("nav-search-submit-button"));
		srchbtn.click();
		List<WebElement> items = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		for(int i=0;i<22;i++) {
		WebElement text = items.get(i);
		String sss = text.getText();
		System.out.println(sss);
	}
		driver.quit();

}
}