package org.example.stepsDefinition;

import org.example.pages.DropdownPage;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class BaseStepsClass {

    protected HomePage homePage = new HomePage();
    protected LoginPage loginPage = new LoginPage();
    protected DropdownPage dropdownPage = new DropdownPage();

}
