package Stepsdefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
plugin = {"pretty" },
monochrome=true,
features = {"src/test/resources/features"},
glue={"Stepsdefinitions"})
public class TestRunner {

}
