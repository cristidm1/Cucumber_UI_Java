package org.example.stepsDefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DropdownSteps extends BaseStepsClass {

    @Given("User it's on the Complete Form page")
    public void completeForm() {
        System.out.println("User it's on the Complete Form page");
    }

    @When("User it's selecting the Company size")
    public void goToSelectCmpSize() {
        System.out.println("User it's selecting the Company size");
    }

    @Then("Should be able to select company size {string} from Dropdown list using String")
    public void shouldBeAbleToSelectCmpSizeFromDropdownList(String compSize) throws InterruptedException {
        dropdownPage.selectDropdownValue(compSize);
        Thread.sleep(5000);
    }

    @Then("Should be able to select company size from Dropdown list using DataTable without header")
    public void shouldBeAbleToSelectCmpSizeFromDropdownList(DataTable dataTable) throws InterruptedException {

        List<String> tableValues = dataTable.asList();
        String cmpSizeValue = tableValues.get(0);
        System.out.println(cmpSizeValue);
        dropdownPage.selectDropdownValue(cmpSizeValue);
        Thread.sleep(5000);
    }

    @Then("Should be able to select company size from Dropdown list using DataTable with header and single row")
    public void shouldBeAbleToSelectCmpSizeFromDropdownListUsingHeaderAndOneRow(DataTable dataTable) throws InterruptedException {

        List<Map<String, String>> tableValues = dataTable.asMaps(String.class, String.class);
        String cmpSizeValue = tableValues.get(0).get("company size");
        System.out.println("Value: " + cmpSizeValue);
        dropdownPage.selectDropdownValue(cmpSizeValue);
        Thread.sleep(5000);
    }

    @Then("Should be able to select company size from Dropdown list using DataTable with header and multiple rows")
    public void shouldBeAbleToSelectCmpSizeFromDropdownListUsingHeaderAndRows(DataTable dataTable) throws InterruptedException {

        List<Map<String, String>> tableValues = dataTable.asMaps(String.class, String.class);
        for(Map<String, String> item : tableValues) {
            String cmpSizeValue = item.get("company size");
            System.out.println("Value Company size: " + cmpSizeValue);
            dropdownPage.selectDropdownValue(cmpSizeValue);

            String cmpName = item.get("company name");
            System.out.println("Value Company Name: " + cmpName);
        }

        Thread.sleep(5000);
    }
}
