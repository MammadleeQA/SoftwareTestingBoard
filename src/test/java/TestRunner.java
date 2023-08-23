import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/Category.feature",
                "src/test/resources/features/Compare.feature",
                "src/test/resources/features/Filter.feature",
                "src/test/resources/features/HomePage.feature",
                "src/test/resources/features/Order.feature",
                "src/test/resources/features/WishList.feature"},

        glue = {"StepDefinitions",
                "DriverHook"})

public class TestRunner {

}