/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavencentralrepositorydemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class ApplicationTesting {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","C:\\\\software\\geckodriver-v0.19.1-win64\\geckodriver.exe");
       WebDriver driver = new FirefoxDriver();
       // WebDriver driver = new FirefoxDriver();	
	driver.get("https://www.nwmissouri.edu/online/index.htm");
	driver.findElement(By.xpath("//*[@id=\"pseudonym_session_unique_id\"]")).sendKeys("s528744");
	driver.findElement(By.xpath("//*[@id=\"pseudonym_session_password\"]")).sendKeys("BeHappy77");
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/table/tbody/tr[2]/td/table/tbody/tr/td/form/button")).click();
	Thread.sleep(1000);		
	}

}
