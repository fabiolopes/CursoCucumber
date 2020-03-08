package br.com.bios.runners;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/inserir_conta.feature",
		glue = "br.com.bios.steps",
		tags = {"~@ignore"},
		plugin = {"pretty", "html:target/report-html", "json:target/reports.json"},
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		strict = true,
		dryRun = false)
public class RunnerTest {

	@BeforeClass
	public static void reset() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://srbarriga.herokuapp.com/");
		driver.findElement(By.id("email")).sendKeys("a@a");
		driver.findElement(By.id("senha")).sendKeys("a");
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.linkText("reset")).click();
		driver.quit();
	}
}
