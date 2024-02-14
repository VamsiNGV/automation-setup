import courgette.api.*;
import courgette.api.junit.Courgette;
import io.cucumber.java.After;
import org.junit.runner.RunWith;
import ui_tests.utilities.UIHelperMethods;

@RunWith(Courgette.class)
@CourgetteOptions(
        threads = 2,
        runLevel = CourgetteRunLevel.FEATURE,
        rerunFailedScenarios = true,
        rerunAttempts = 1,
        testOutput = CourgetteTestOutput.CONSOLE,
        reportTitle = "Courgette-JVM Example",
        reportTargetDir = "build",
        plugin = { CourgettePlugin.EXTENT_REPORTS },
      //  classPath = {"build/libs/*", "build/classes/java/test"},
//        environmentInfo = "browser=chrome; git_branch=master",
        cucumberOptions = @CucumberOptions(
                features = "src/test/resources/features",
                glue = "ui_tests.step_defs",
                tags = "@LoginTest",
                publish = true,
                plugin = {
                        "pretty",
                        "json:build/cucumber-report/cucumber.json",
                        "html:build/cucumber-report/cucumber.html",
                        "junit:build/cucumber-report/cucumber.xml"}
        ))
public class ParallelRunner  {




}

