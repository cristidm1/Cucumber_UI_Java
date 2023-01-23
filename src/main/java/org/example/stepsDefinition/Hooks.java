package org.example.stepsDefinition;

import java.io.IOException;
import java.time.Duration;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.example.utils.ReadProperty;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    public static WebDriver driver;

    @Before(order = 0)
    public void setup() throws IOException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ReadProperty.getProperty("browserUrl"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Before(order = 1)
    public void setup2() {
        System.out.println("This one will run after the first setup() method!");
    }

    @After(order = 0)
    public void tearDown() {
        driver.quit();
    }

    @Before(order = 1)
    public void tearDown2() {
        System.out.println("This one will run after the first tearDown() method!");
    }

}
