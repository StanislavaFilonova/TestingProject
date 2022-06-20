package net.wordwall;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources",
        glue = "net.wordwall.test",
        tags = "@all",
        dryRun = false,
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunnerTest {
}