import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/SignIn.feature",
                "src/test/resources/features/Register.feature"},
        glue = {"StepDefinitions",
                "DriverHook"})

public class TestRunner {

}