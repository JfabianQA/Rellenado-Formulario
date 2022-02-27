package com.selenium.formulario1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PruebaFormulario {
	private WebDriver driver;
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jotform.com/build/220557907665869/publish/");
	}
		@Test
		public void pruebaformulario() throws InterruptedException {
			
			WebElement Nombre = driver.findElement(By.id("first_3"));
			WebElement Apellido = driver.findElement(By.id("last_3"));
			WebElement Direccion = driver.findElement(By.id("input_4_addr_line1"));
			WebElement SubDireccion = driver.findElement(By.id("input_4_addr_line2"));
			WebElement Ciudad = driver.findElement(By.id("input_4_city"));
			WebElement Provincia = driver.findElement(By.id("input_4_state"));
			WebElement CodigoPostal = driver.findElement(By.id("input_4_postal"));
			WebElement Telefono = driver.findElement(By.id("input_5_full"));
			WebElement Email = driver.findElement(By.id("input_6"));
			WebElement SobreMi = driver.findElement(By.id("input_11"));
			WebElement Sugerencias = driver.findElement(By.id("input_12"));
			WebElement BtnSubmit = driver.findElement(By.id("input_2"));
			
			Nombre.click(); Nombre.sendKeys("Elian Ezequiel"); Thread.sleep(2000);
			Apellido.click(); Apellido.sendKeys("Martinez Hernandez");Thread.sleep(2000);
			Direccion.click(); Direccion.sendKeys("Calle Pedro Mir/ Manz 40/ Guachupita");Thread.sleep(2000);
			SubDireccion.click(); SubDireccion.sendKeys("Entrando por la calle C/ Frente a la empanada Alexis");Thread.sleep(2000);
			Ciudad.click(); Ciudad.sendKeys("Santo Domingo");Thread.sleep(2000);
			Provincia.click(); Provincia.sendKeys("Distrito Nacional");Thread.sleep(2000);
			CodigoPostal.click(); CodigoPostal.sendKeys("11809");Thread.sleep(2000);
			Telefono.click(); Telefono.sendKeys("tel:8098789900");Thread.sleep(2000);
			Email.click(); Email.sendKeys("elianmartinez@gmail.com");Thread.sleep(2000);
			SobreMi.click(); SobreMi.sendKeys("Ingeniero Industrial con 2 años de experiencia en Desarrollo de Software de I+D, en el sector Bancario. Cumplimiento de objetivos financieros, empresariales y técnicos, en mas de 3 proyectos para empresas del sector de fintech, usando Metodologias Agiles.");Thread.sleep(3000);
			Sugerencias.click(); Sugerencias.sendKeys("Ningunas");Thread.sleep(5000);
			BtnSubmit.click();Thread.sleep(3000);
			
		}
		
		@After
		public void tearDown() {
			
			driver.quit();
		}
		
		}
	

