package utils;

import core.DriverFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.nio.file.Files;

public class ScreenshotUtils {

    public static void capture(String testName) {
        try {
            File src = ((TakesScreenshot) DriverFactory.getDriver())
                    .getScreenshotAs(OutputType.FILE);

            Files.copy(src.toPath(),
                    new File("screenshots/" + testName + ".png").toPath());
        } catch (Exception ignored) {}
    }
}
