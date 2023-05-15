package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",plugin={"pretty", "html: target/testReport/report.html"}, glue=("stepDefination"),tags="@Reg")

public class TestRunner {
	//features=  path of feature file
	//glue =  name or path of stepdefination file
} 
