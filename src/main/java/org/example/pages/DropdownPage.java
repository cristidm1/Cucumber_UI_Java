package org.example.pages;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.example.stepsDefinition.Hooks.driver;

public class DropdownPage extends BasePageClass {

    private static final WebElement DROPDOWN_BTN = driver.findElement(By.name("employees_c"));

    public void selectDropdownValue(String dayValue) {
        Select dropdown = new Select(DROPDOWN_BTN);

        dropdown.selectByValue(dayValue);

        List<String> days = dropdown.getOptions().stream().map(value -> value.getText()).collect(Collectors.toList());
        System.out.println(days);
    }

}
