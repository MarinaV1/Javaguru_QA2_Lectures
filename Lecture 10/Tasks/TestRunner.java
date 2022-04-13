package lecture10;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty",
        features = {"C:\\Users\\user\\Downloads\\testathon102018-master\\MyFirstGradleProject\\src\\test\\resources\\features"},
        glue = {"lecture10\\steps"},
        tags = "@SsLv"
)
public class TestRunner {

}