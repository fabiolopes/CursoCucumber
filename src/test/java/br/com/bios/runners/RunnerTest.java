package br.com.bios.runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/alugar_filme.feature",
		glue = "br.com.bios.steps",
		plugin = {"pretty", "html:target/report-html", "json:target/reports.json"},
		monochrome = false,
		snippets = SnippetType.CAMELCASE,
		strict = true)
public class RunnerTest {

}
