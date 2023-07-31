import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/Homepage.feature",
                "src/test/resources/features/Header.feature",
                "src/test/resources/features/Footer.feature",
                "src/test/resources/features/Sidebar.feature",
                "src/test/resources/features/Register.feature",
                "src/test/resources/features/SignIn.feature",
                "src/test/resources/features/Order.feature",
                },
        glue = {"StepDefinitions",
                "DriverHook"})

public class TestRunner {

}