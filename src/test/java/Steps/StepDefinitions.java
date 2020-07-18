package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	@Given("List of menu from the hotels")
	public void list_of_menu_from_the_hotels() {
	    System.out.println("Inside Step - List of Menu is Shown");
	}

	@When("customer choose show room availability")
	public void customer_choose_show_room_availability() {
		System.out.println("Inside Step - User choose show room availability");
	}

	@Then("Room availability is printed")
	public void room_availability_is_printed() {
		System.out.println("Room availability is printed");
	}
	
	@When("customer choose show room details")
	public void customer_choose_show_room_details() {
		System.out.println("Inside Step - User choose show room details");
	}

	@Then("Room details is printed")
	public void room_details_is_printed() {
		System.out.println("Room availability is printed");
	}
	
	@Given("List of rooms")
	public void list_of_rooms() {
		System.out.println("Inside Step - List of Rooms Printed");
	}

	@When("customer choose a room type")
	public void customer_choose_a_room_type() {
		System.out.println("Customer choose a room type");
	}

	@When("empty room si available")
	public void empty_room_si_available() {
		System.out.println("Empty Room Availability is checked");
	}

	@Then("Room is booked by customer")
	public void room_is_booked_with() {
		System.out.println("Room is Booked with Customer Information");
	}
	
	@Given("Room booked by some customer")
	public void room_booked_by_some_customer() {
		System.out.println("Room is Booked by customer");
	}

	@When("customer choose checkout")
	public void customer_choose_checkout() {
		System.out.println("Customer choose checkout");
	}

	@Then("Room is empty and bill is printed")
	public void room_is_empty_and_bill_is_printed() {
		System.out.println("Room empty and bill printed");
	}
	
	@Given("List of foods")
	public void list_of_foods() {
		System.out.println("Customer showed foods list");
	}

	@When("Customer choose a food")
	public void customer_choose_a_food() {
		System.out.println("Customer choose a food");
	}

	@Then("Food is ordered and added to room's bill")
	public void food_is_ordered_and_added_to_room_s_bill() {
		System.out.println("Food is ordered and added to room's bill");
	}
	
	@Given("List of spa packages")
	public void list_of_spa_packages() {
		System.out.println("Customer showed spa packages list");
	}

	@When("Customer choose spa package")
	public void customer_choose_spa_package() {
		System.out.println("Customer choose spa package");
	}

	@Then("Spa is added to the bill")
	public void spa_is_added_to_the_bill() {
		System.out.println("Spa package is added to room's bill");
	}
}
