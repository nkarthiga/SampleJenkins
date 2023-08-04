package sampleTryJenkin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opengoogle {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
	//	driver.manage().window().setPosition(new Point(2000,0));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");

	}

}
