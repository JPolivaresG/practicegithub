package com.miprimeravez.app.automatizacion;
//PIANO JUAN PABLO OLIVARES
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class piano {

	static WebDriver driver;
	String url="https://teclado-pianovirtual.online/";


	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1813180\\eclipse-workspace\\automatizacion\\src\\test\\resources\\chromedriver.exe");//añade las librerias
		driver = new ChromeDriver(); //llama el driver
		driver.get(url);	//llama la url al objeto
		Thread.sleep(500); //retardo
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		
		for(int i=0;i<=1;i++) {
			//LOS POLLITOS DICEN
		WebElement notaDO =driver.findElement(By.xpath("//button[@id='klawisz48']"));
		notaDO.click();
		Thread.sleep(250);
		WebElement notaRE =driver.findElement(By.xpath("//button[@id='klawisz50']"));
		notaRE.click();
		Thread.sleep(250);
		WebElement notaMI =driver.findElement(By.xpath("//button[@id='klawisz52']"));
		notaMI.click();
		Thread.sleep(250);
		WebElement notaFA =driver.findElement(By.xpath("//button[@id='klawisz53']"));
		notaFA.click();
		Thread.sleep(250);
		WebElement notaSOL =driver.findElement(By.xpath("//button[@id='klawisz55']"));
		notaSOL.click();
		Thread.sleep(500);
		notaSOL.click();
		WebElement notaLA =driver.findElement(By.xpath("//button[@id='klawisz57']"));
		Thread.sleep(500);
		notaLA.click();
		Thread.sleep (250);
		notaLA.click();
		Thread.sleep(250);
		notaLA.click();
		Thread.sleep(250);
		notaLA.click();
		Thread.sleep(500);
		notaSOL.click();
		Thread.sleep(500);
		notaSOL.click();
		Thread.sleep(500);
		notaFA.click();
		Thread.sleep(250);
		notaFA.click();
		Thread.sleep(250);
		notaFA.click();
		Thread.sleep(250);
		notaFA.click();
		Thread.sleep(500);
		notaMI.click();
		Thread.sleep(500);
		notaMI.click();
		Thread.sleep(250);
		notaRE.click();
		Thread.sleep(250);
		notaRE.click();
		Thread.sleep(250);
		notaRE.click();
		Thread.sleep(250);
		notaRE.click();
		Thread.sleep(500);
		notaDO.click();
		Thread.sleep(500);
		notaDO.click();
		Thread.sleep(600);
		
		}
		
	}

}
