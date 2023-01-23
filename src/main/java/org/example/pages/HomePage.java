package org.example.pages;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepsDefinition.Hooks.driver;

public class HomePage {
    private static final By MENU_ITEMS = By.cssSelector("div > div.card-body h5");

    public List<String> getListOfMenuItems() {
        List<String> menuItemsList = driver.findElements(MENU_ITEMS)
                                            .stream()
                                            .map(WebElement::getText)
                                            .collect(Collectors.toList());

        System.out.println("List of the Menu Items: " + menuItemsList);
        return menuItemsList;
    }
}
