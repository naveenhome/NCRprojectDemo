package code.rpn;

import junit.framework.TestCase;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckOutSteps extends TestCase{
	String prodname;
	int rate, qty;
	@Given("^The price of a \"([^\"]*)\" is \\$(\\d+)$")
	public void inputMethop(String productName, int rate) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		prodname= productName;
		this.rate = rate;
	}

	@When("^I checkout (\\d+) \"([^\"]*)\"$")
	public void I_checkout(int arg1, String arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		qty = arg1;
	}

	@Then("^the total price should be \\$(\\d+)$")
	public void the_total_price_should_be_$(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		assertEquals(arg1, rate*qty);
	}

	@Given("^The price for a \"([^\"]*)\" is \\$(\\d+)$")
	public void The_price_for_a_is_$(String arg1, int arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^Also (\\d+) \"([^\"]*)\"$")
	public void Also(int arg1, String arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}



}
