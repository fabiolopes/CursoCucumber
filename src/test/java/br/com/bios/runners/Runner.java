package br.com.bios.runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/alugar_filme.feature",
		glue = "br.com.bios.steps",
		plugin = "pretty",
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		strict = true)
public class Runner {

}
