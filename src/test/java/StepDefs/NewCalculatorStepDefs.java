package StepDefs;

import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewCalculatorStepDefs {
	
	Map<String, Integer> prices;
	int totalbill=0;
	
	@Given("I want to buy below items")
	public void i_want_to_buy_below_items(Map<String, Integer> pricelist) {
		
		this.prices = pricelist;
	   
	}

	@When("I purchase them")
	public void i_purchase_them() {
		
		for(String key: prices.keySet()) {
			
			totalbill = totalbill+ prices.get(key);
		}
	}

	@Then("I should get the bill amount as {int}")
	public void i_should_get_the_bill_amount_as(int expResult) {
		
		Assert.assertEquals(expResult, totalbill);    
	}
	
	@Given("I want to buy below items in given quantity")
	public void i_want_to_buy_below_items_in_given_quantity(io.cucumber.datatable.DataTable dataTable) {
	   
		int rows = dataTable.height();
		for(int i=0; i<rows; i++) {
			
			String item=dataTable.cell(i, 0);
			int qnt=Integer.parseInt(dataTable.cell(i, 1));
			int val=Integer.parseInt(dataTable.cell(i, 2));
			
			totalbill = totalbill+ (qnt*val);
		}
	}
	
	


}
