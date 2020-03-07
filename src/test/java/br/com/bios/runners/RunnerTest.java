package br.com.bios.runners;
import org.junit.runner.RunWith;

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

}
