package org.example.StepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.ShoppingCart;

public class ShoppingCartStepDefinition
{
    ShoppingCart SC = new ShoppingCart();
    @When("User click on shopping cart button")
    public void clickonAddtoCartButton(){
        SC.ClickOnShoppingCartbutton();
    }
    @Then("User see success message for shopping cart")
    public void SuccessMessage(){
        SC.SuccessMessageForShoppingCart();
    }
    @And("user see background color green for shopping cart")
    public void BackgroundColorForShoppingCart(){
        SC.BackgroundColorForShoppingCart();
    }
    @And("User click on shopping cart tab")
    public void ClickOnshoppingCartTab(){
        SC.ClickOnShoppingCartTab();
    }
    @Then("Verify Qty value is bigger than 0 for shopping cart")
    public void CheckQuantity(){
        SC.CheckQuantityValue();
    }
    @Then("Message appears your shopping cart is empty")
    public void MessageIsEmpty(){
        SC.MessageAppearsIsEmptyForShoppingCart();
    }
}
