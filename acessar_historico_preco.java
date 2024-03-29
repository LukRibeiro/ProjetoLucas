package MVP;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import suporte.Generator;
import suporte.Screenshot;

public class acessar_historico_preco {

	static WebDriver driver; 
	
	@Rule
	public TestName test = new TestName();
	
	static JavascriptExecutor js;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\p-lucribeiro\\Drivers\\chromedriver.exe");
		
	driver = new ChromeDriver();
	js = (JavascriptExecutor) driver;
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	}
	
	@Test
	public void login1() throws InterruptedException {
		driver.get("https://energia-qaa.internalenv.corp/Login/index.fcc?TYPE=33554433&REALMOID=06-0005719e-805a-1ecd-995d-69db0a020000&GUID=&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=-SM-EK0WfBhPptl3Q1XeY0mIZgvHozHSf%2bq1E01p3O0cerru1Ap6G9KqpIF7MXEzNk2V&TARGET=-SM-https%3a%2f%2fenergia--qaa%2einternalenv%2ecorp%2fmle%2f#/");
		driver.manage().window().setSize(new Dimension(1936, 1056));
		driver.findElement(By.id("USER")).sendKeys("U-FOX");
	    driver.findElement(By.id("PASSWORD")).sendKeys("jfkywvAi3#");
	    driver.findElement(By.id("btnSubmit")).click();
	    
	    Thread.sleep(4000);
	    
	    driver.findElement(By.xpath("/html/body/app-root/div[2]/app-dashboard/div[1]/div[3]/div[1]/app-curva-forward/div/div[4]/button")).click();
	    js.executeScript("window.scrollTo(0,0)");
	    
	    Thread.sleep(3000);
	   	      	           
	    
	    String screenshotArquivo = "C:\\Users\\p-lucribeiro\\TestReport\\" + Generator.dataHoraparaArquivo() + test.getMethodName() + "png" ;
	    Screenshot.tirar(driver, screenshotArquivo );
	    
	    	    			
	}


    @AfterClass
	public static void tearDownAfterClass() throws Exception {
	driver.quit();
	
	
}
    
}
		
	
	
	
	
	
	
	
	
	
